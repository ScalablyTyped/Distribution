package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.organization_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.user_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accesslevel extends StObject {
  
  /**
    * @description Defines the level of access that workflows outside of the repository have to actions and reusable workflows within the
    * repository.
    *
    * `none` means the access is only possible from workflows in this repository. `user` level access allows sharing across user owned private repos only. `organization` level access allows sharing across the organization.
    * @enum {string}
    */
  var access_level: none_ | user_ | organization_
}
object Accesslevel {
  
  inline def apply(access_level: none_ | user_ | organization_): Accesslevel = {
    val __obj = js.Dynamic.literal(access_level = access_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesslevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accesslevel] (val x: Self) extends AnyVal {
    
    inline def setAccess_level(value: none_ | user_ | organization_): Self = StObject.set(x, "access_level", value.asInstanceOf[js.Any])
  }
}
