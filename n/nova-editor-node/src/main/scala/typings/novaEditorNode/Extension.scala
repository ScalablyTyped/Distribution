package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/extension/
trait Extension extends StObject {
  
  val globalStoragePath: String
  
  val identifier: String
  
  val name: String
  
  val path: String
  
  val vendor: String
  
  val version: String
  
  val workspaceStoragePath: String
}
object Extension {
  
  inline def apply(
    globalStoragePath: String,
    identifier: String,
    name: String,
    path: String,
    vendor: String,
    version: String,
    workspaceStoragePath: String
  ): Extension = {
    val __obj = js.Dynamic.literal(globalStoragePath = globalStoragePath.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], workspaceStoragePath = workspaceStoragePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
    
    inline def setGlobalStoragePath(value: String): Self = StObject.set(x, "globalStoragePath", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceStoragePath(value: String): Self = StObject.set(x, "workspaceStoragePath", value.asInstanceOf[js.Any])
  }
}
