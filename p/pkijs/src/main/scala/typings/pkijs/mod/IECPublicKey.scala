package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IECPublicKey extends StObject {
  
  var namedCurve: String
  
  var x: js.typedarray.ArrayBuffer
  
  var y: js.typedarray.ArrayBuffer
}
object IECPublicKey {
  
  inline def apply(namedCurve: String, x: js.typedarray.ArrayBuffer, y: js.typedarray.ArrayBuffer): IECPublicKey = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IECPublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IECPublicKey] (val x: Self) extends AnyVal {
    
    inline def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
    
    inline def setX(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
