package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonApplicationscimjson extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DocumentationurlMessage
  
  @JSName("application/scim+json")
  var applicationSlashscimPlussignjson: Detail
}
object ApplicationjsonApplicationscimjson {
  
  inline def apply(applicationSlashjson: DocumentationurlMessage, applicationSlashscimPlussignjson: Detail): ApplicationjsonApplicationscimjson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/scim+json")(applicationSlashscimPlussignjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonApplicationscimjson]
  }
  
  extension [Self <: ApplicationjsonApplicationscimjson](x: Self) {
    
    inline def setApplicationSlashjson(value: DocumentationurlMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashscimPlussignjson(value: Detail): Self = StObject.set(x, "application/scim+json", value.asInstanceOf[js.Any])
  }
}
