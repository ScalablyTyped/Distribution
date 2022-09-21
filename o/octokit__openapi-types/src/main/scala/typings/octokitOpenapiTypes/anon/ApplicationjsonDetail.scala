package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDetail extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Detail
  
  @JSName("application/scim+json")
  var applicationSlashscimPlussignjson: Detail
}
object ApplicationjsonDetail {
  
  inline def apply(applicationSlashjson: Detail, applicationSlashscimPlussignjson: Detail): ApplicationjsonDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/scim+json")(applicationSlashscimPlussignjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDetail]
  }
  
  extension [Self <: ApplicationjsonDetail](x: Self) {
    
    inline def setApplicationSlashjson(value: Detail): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashscimPlussignjson(value: Detail): Self = StObject.set(x, "application/scim+json", value.asInstanceOf[js.Any])
  }
}
