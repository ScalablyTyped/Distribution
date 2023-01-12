package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagNumber extends StObject {
  
  var attributes: js.UndefOr[String] = js.undefined
  
  var tagNumber: js.UndefOr[Double] = js.undefined
}
object TagNumber {
  
  inline def apply(): TagNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagNumber] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setTagNumber(value: Double): Self = StObject.set(x, "tagNumber", value.asInstanceOf[js.Any])
    
    inline def setTagNumberUndefined: Self = StObject.set(x, "tagNumber", js.undefined)
  }
}
