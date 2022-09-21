package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyName extends StObject {
  
  var key: String
  
  var name: String
  
  var node_id: String
  
  var spdx_id: String | Null
  
  /** Format: uri */
  var url: String | Null
}
object KeyName {
  
  inline def apply(key: String, name: String, node_id: String): KeyName = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], spdx_id = null, url = null)
    __obj.asInstanceOf[KeyName]
  }
  
  extension [Self <: KeyName](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setSpdx_id(value: String): Self = StObject.set(x, "spdx_id", value.asInstanceOf[js.Any])
    
    inline def setSpdx_idNull: Self = StObject.set(x, "spdx_id", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
