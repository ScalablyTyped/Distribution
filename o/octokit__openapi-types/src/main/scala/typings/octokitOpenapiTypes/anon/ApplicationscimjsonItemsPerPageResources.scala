package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationscimjsonItemsPerPageResources extends StObject {
  
  @JSName("application/scim+json")
  var applicationSlashscimPlussignjson: ItemsPerPageResources
}
object ApplicationscimjsonItemsPerPageResources {
  
  inline def apply(applicationSlashscimPlussignjson: ItemsPerPageResources): ApplicationscimjsonItemsPerPageResources = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/scim+json")(applicationSlashscimPlussignjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationscimjsonItemsPerPageResources]
  }
  
  extension [Self <: ApplicationscimjsonItemsPerPageResources](x: Self) {
    
    inline def setApplicationSlashscimPlussignjson(value: ItemsPerPageResources): Self = StObject.set(x, "application/scim+json", value.asInstanceOf[js.Any])
  }
}
