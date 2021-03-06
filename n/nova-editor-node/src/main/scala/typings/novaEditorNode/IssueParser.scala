package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/issue-parser/
@js.native
trait IssueParser extends StObject {
  
  def clear(): Unit = js.native
  
  val issues: js.Array[Issue] = js.native
  
  def pushLine(line: String): Unit = js.native
}
object IssueParser {
  
  @scala.inline
  def apply(clear: () => Unit, issues: js.Array[Issue], pushLine: String => Unit): IssueParser = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), issues = issues.asInstanceOf[js.Any], pushLine = js.Any.fromFunction1(pushLine))
    __obj.asInstanceOf[IssueParser]
  }
  
  @scala.inline
  implicit class IssueParserMutableBuilder[Self <: IssueParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value :_*))
    
    @scala.inline
    def setPushLine(value: String => Unit): Self = StObject.set(x, "pushLine", js.Any.fromFunction1(value))
  }
}
