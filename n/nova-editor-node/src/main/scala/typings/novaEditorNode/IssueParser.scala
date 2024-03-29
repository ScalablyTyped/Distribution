package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/issue-parser/
trait IssueParser extends StObject {
  
  def clear(): Unit
  
  val issues: js.Array[Issue]
  
  def pushLine(line: String): Unit
}
object IssueParser {
  
  inline def apply(clear: () => Unit, issues: js.Array[Issue], pushLine: String => Unit): IssueParser = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), issues = issues.asInstanceOf[js.Any], pushLine = js.Any.fromFunction1(pushLine))
    __obj.asInstanceOf[IssueParser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssueParser] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setPushLine(value: String => Unit): Self = StObject.set(x, "pushLine", js.Any.fromFunction1(value))
  }
}
