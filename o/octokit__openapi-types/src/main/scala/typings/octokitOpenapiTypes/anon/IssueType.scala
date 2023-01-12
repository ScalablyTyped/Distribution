package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueType extends StObject {
  
  var issue: js.UndefOr[Bodyhtml] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object IssueType {
  
  inline def apply(): IssueType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssueType] (val x: Self) extends AnyVal {
    
    inline def setIssue(value: Bodyhtml): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
