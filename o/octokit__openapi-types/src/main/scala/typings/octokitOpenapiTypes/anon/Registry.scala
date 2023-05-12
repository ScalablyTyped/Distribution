package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registry extends StObject {
  
  var created_at: String | Null
  
  var description: String | Null
  
  var ecosystem: String
  
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var namespace: String
  
  var owner: Receivedeventsurl
  
  var package_type: String
  
  var package_version: Installationcommand | Null
  
  var registry: Vendor | Null
  
  var updated_at: String | Null
}
object Registry {
  
  inline def apply(
    ecosystem: String,
    html_url: String,
    id: Double,
    name: String,
    namespace: String,
    owner: Receivedeventsurl,
    package_type: String
  ): Registry = {
    val __obj = js.Dynamic.literal(ecosystem = ecosystem.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], package_type = package_type.asInstanceOf[js.Any], created_at = null, description = null, package_version = null, registry = null, updated_at = null)
    __obj.asInstanceOf[Registry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Registry] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEcosystem(value: String): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Receivedeventsurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPackage_type(value: String): Self = StObject.set(x, "package_type", value.asInstanceOf[js.Any])
    
    inline def setPackage_version(value: Installationcommand): Self = StObject.set(x, "package_version", value.asInstanceOf[js.Any])
    
    inline def setPackage_versionNull: Self = StObject.set(x, "package_version", null)
    
    inline def setRegistry(value: Vendor): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryNull: Self = StObject.set(x, "registry", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
  }
}
