package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOtherKeyAttribute extends StObject {
  
  var keyAttr: js.UndefOr[Any] = js.undefined
  
  var keyAttrId: String
}
object IOtherKeyAttribute {
  
  inline def apply(keyAttrId: String): IOtherKeyAttribute = {
    val __obj = js.Dynamic.literal(keyAttrId = keyAttrId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOtherKeyAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOtherKeyAttribute] (val x: Self) extends AnyVal {
    
    inline def setKeyAttr(value: Any): Self = StObject.set(x, "keyAttr", value.asInstanceOf[js.Any])
    
    inline def setKeyAttrId(value: String): Self = StObject.set(x, "keyAttrId", value.asInstanceOf[js.Any])
    
    inline def setKeyAttrUndefined: Self = StObject.set(x, "keyAttr", js.undefined)
  }
}
