package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.container
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.docker
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maven
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.npm
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.nuget
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rubygems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagenamePackagetypePackageversionidUsername extends StObject {
  
  var package_name: String
  
  var package_type: npm | maven | rubygems | docker | nuget | container
  
  var package_version_id: Double
  
  var username: String
}
object PackagenamePackagetypePackageversionidUsername {
  
  inline def apply(
    package_name: String,
    package_type: npm | maven | rubygems | docker | nuget | container,
    package_version_id: Double,
    username: String
  ): PackagenamePackagetypePackageversionidUsername = {
    val __obj = js.Dynamic.literal(package_name = package_name.asInstanceOf[js.Any], package_type = package_type.asInstanceOf[js.Any], package_version_id = package_version_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagenamePackagetypePackageversionidUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackagenamePackagetypePackageversionidUsername] (val x: Self) extends AnyVal {
    
    inline def setPackage_name(value: String): Self = StObject.set(x, "package_name", value.asInstanceOf[js.Any])
    
    inline def setPackage_type(value: npm | maven | rubygems | docker | nuget | container): Self = StObject.set(x, "package_type", value.asInstanceOf[js.Any])
    
    inline def setPackage_version_id(value: Double): Self = StObject.set(x, "package_version_id", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
