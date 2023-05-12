package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Packageversion extends StObject {
  
  var created_at: String
  
  var description: String | Null
  
  var ecosystem: String
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var namespace: String
  
  /** User */
  var owner: Deleted | Null
  
  var package_type: String
  
  var package_version: Dockermetadata
  
  var registry: Abouturl | Null
  
  var updated_at: String
}
object Packageversion {
  
  inline def apply(
    created_at: String,
    ecosystem: String,
    html_url: String,
    id: Double,
    name: String,
    namespace: String,
    package_type: String,
    package_version: Dockermetadata,
    updated_at: String
  ): Packageversion = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ecosystem = ecosystem.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], package_type = package_type.asInstanceOf[js.Any], package_version = package_version.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], description = null, owner = null, registry = null)
    __obj.asInstanceOf[Packageversion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Packageversion] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEcosystem(value: String): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Deleted): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setPackage_type(value: String): Self = StObject.set(x, "package_type", value.asInstanceOf[js.Any])
    
    inline def setPackage_version(value: Dockermetadata): Self = StObject.set(x, "package_version", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Abouturl): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryNull: Self = StObject.set(x, "registry", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
