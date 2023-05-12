package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oldissue extends StObject {
  
  /**
    * Issue
    * @description The [issue](https://docs.github.com/rest/reference/issues) itself.
    */
  var old_issue: CreatedatDraft | Null
  
  /**
    * Repository
    * @description A git repository
    */
  var old_repository: Disabled
}
object Oldissue {
  
  inline def apply(old_repository: Disabled): Oldissue = {
    val __obj = js.Dynamic.literal(old_repository = old_repository.asInstanceOf[js.Any], old_issue = null)
    __obj.asInstanceOf[Oldissue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Oldissue] (val x: Self) extends AnyVal {
    
    inline def setOld_issue(value: CreatedatDraft): Self = StObject.set(x, "old_issue", value.asInstanceOf[js.Any])
    
    inline def setOld_issueNull: Self = StObject.set(x, "old_issue", null)
    
    inline def setOld_repository(value: Disabled): Self = StObject.set(x, "old_repository", value.asInstanceOf[js.Any])
  }
}
