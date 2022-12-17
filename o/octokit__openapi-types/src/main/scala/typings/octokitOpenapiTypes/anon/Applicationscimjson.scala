package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationscimjson extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DocumentationurlMessage
  
  @JSName("application/scim+json")
  var applicationSlashscimPlussignjson: Detail
}
object Applicationscimjson {
  
  inline def apply(applicationSlashjson: DocumentationurlMessage, applicationSlashscimPlussignjson: Detail): Applicationscimjson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/scim+json")(applicationSlashscimPlussignjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationscimjson]
  }
  
  extension [Self <: Applicationscimjson](x: Self) {
    
    inline def setApplicationSlashjson(value: DocumentationurlMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashscimPlussignjson(value: Detail): Self = StObject.set(x, "application/scim+json", value.asInstanceOf[js.Any])
  }
}
