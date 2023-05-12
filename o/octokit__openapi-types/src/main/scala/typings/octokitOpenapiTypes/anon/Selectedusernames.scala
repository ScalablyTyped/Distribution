package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all_members
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all_members_and_outside_collaborators
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected_members
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectedusernames extends StObject {
  
  /** @description The usernames of the organization members who should have access to codespaces in the organization. Required when `visibility` is `selected_members`. The provided list of usernames will replace any existing value. */
  var selected_usernames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @description Which users can access codespaces in the organization. `disabled` means that no users can access codespaces in the organization.
    * @enum {string}
    */
  var visibility: disabled | selected_members | all_members | all_members_and_outside_collaborators
}
object Selectedusernames {
  
  inline def apply(visibility: disabled | selected_members | all_members | all_members_and_outside_collaborators): Selectedusernames = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectedusernames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selectedusernames] (val x: Self) extends AnyVal {
    
    inline def setSelected_usernames(value: js.Array[String]): Self = StObject.set(x, "selected_usernames", value.asInstanceOf[js.Any])
    
    inline def setSelected_usernamesUndefined: Self = StObject.set(x, "selected_usernames", js.undefined)
    
    inline def setSelected_usernamesVarargs(value: String*): Self = StObject.set(x, "selected_usernames", js.Array(value*))
    
    inline def setVisibility(value: disabled | selected_members | all_members | all_members_and_outside_collaborators): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
