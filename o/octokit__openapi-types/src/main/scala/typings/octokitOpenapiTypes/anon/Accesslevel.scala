package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.enterprise
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.organization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accesslevel extends StObject {
  
  /**
    * @description Defines the level of access that workflows outside of the repository have to actions and reusable workflows within the
    * repository. `none` means access is only possible from workflows in this repository.
    * @enum {string}
    */
  var access_level: none_ | organization | enterprise
}
object Accesslevel {
  
  inline def apply(access_level: none_ | organization | enterprise): Accesslevel = {
    val __obj = js.Dynamic.literal(access_level = access_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesslevel]
  }
  
  extension [Self <: Accesslevel](x: Self) {
    
    inline def setAccess_level(value: none_ | organization | enterprise): Self = StObject.set(x, "access_level", value.asInstanceOf[js.Any])
  }
}
