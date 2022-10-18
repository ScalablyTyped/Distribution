package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
  
  var spdx_id: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Key {
  
  inline def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setSpdx_id(value: String): Self = StObject.set(x, "spdx_id", value.asInstanceOf[js.Any])
    
    inline def setSpdx_idUndefined: Self = StObject.set(x, "spdx_id", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
