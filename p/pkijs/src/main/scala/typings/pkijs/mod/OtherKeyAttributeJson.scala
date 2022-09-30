package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherKeyAttributeJson extends StObject {
  
  var keyAttr: js.UndefOr[Any] = js.undefined
  
  var keyAttrId: String
}
object OtherKeyAttributeJson {
  
  inline def apply(keyAttrId: String): OtherKeyAttributeJson = {
    val __obj = js.Dynamic.literal(keyAttrId = keyAttrId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherKeyAttributeJson]
  }
  
  extension [Self <: OtherKeyAttributeJson](x: Self) {
    
    inline def setKeyAttr(value: Any): Self = StObject.set(x, "keyAttr", value.asInstanceOf[js.Any])
    
    inline def setKeyAttrId(value: String): Self = StObject.set(x, "keyAttrId", value.asInstanceOf[js.Any])
    
    inline def setKeyAttrUndefined: Self = StObject.set(x, "keyAttr", js.undefined)
  }
}
