package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Newissue extends StObject {
  
  /**
    * Issue
    * @description The [issue](https://docs.github.com/rest/reference/issues) itself.
    */
  var new_issue: CreatedatDraft
  
  /**
    * Repository
    * @description A git repository
    */
  var new_repository: Downloadsurl
}
object Newissue {
  
  inline def apply(new_issue: CreatedatDraft, new_repository: Downloadsurl): Newissue = {
    val __obj = js.Dynamic.literal(new_issue = new_issue.asInstanceOf[js.Any], new_repository = new_repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Newissue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Newissue] (val x: Self) extends AnyVal {
    
    inline def setNew_issue(value: CreatedatDraft): Self = StObject.set(x, "new_issue", value.asInstanceOf[js.Any])
    
    inline def setNew_repository(value: Downloadsurl): Self = StObject.set(x, "new_repository", value.asInstanceOf[js.Any])
  }
}
