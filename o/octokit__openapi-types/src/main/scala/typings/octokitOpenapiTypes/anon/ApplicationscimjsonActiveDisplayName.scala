package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationscimjsonActiveDisplayName extends StObject {
  
  @JSName("application/scim+json")
  var applicationSlashscimPlussignjson: ActiveDisplayName
}
object ApplicationscimjsonActiveDisplayName {
  
  inline def apply(applicationSlashscimPlussignjson: ActiveDisplayName): ApplicationscimjsonActiveDisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/scim+json")(applicationSlashscimPlussignjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationscimjsonActiveDisplayName]
  }
  
  extension [Self <: ApplicationscimjsonActiveDisplayName](x: Self) {
    
    inline def setApplicationSlashscimPlussignjson(value: ActiveDisplayName): Self = StObject.set(x, "application/scim+json", value.asInstanceOf[js.Any])
  }
}
