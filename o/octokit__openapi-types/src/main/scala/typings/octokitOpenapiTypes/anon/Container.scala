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

trait Container extends StObject {
  
  /** Container Metadata */
  var container: js.UndefOr[Tags] = js.undefined
  
  /** Docker Metadata */
  var docker: js.UndefOr[Tag] = js.undefined
  
  /**
    * @example docker
    * @enum {string}
    */
  var package_type: npm | maven | rubygems | docker | nuget | container
}
object Container {
  
  inline def apply(package_type: npm | maven | rubygems | docker | nuget | container): Container = {
    val __obj = js.Dynamic.literal(package_type = package_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: Tags): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDocker(value: Tag): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
    
    inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
    
    inline def setPackage_type(value: npm | maven | rubygems | docker | nuget | container): Self = StObject.set(x, "package_type", value.asInstanceOf[js.Any])
  }
}
