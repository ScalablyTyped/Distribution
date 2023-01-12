package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coefficient extends StObject {
  
  var coefficient: js.UndefOr[String] = js.undefined
  
  var exponent: js.UndefOr[String] = js.undefined
  
  var prime: js.UndefOr[String] = js.undefined
}
object Coefficient {
  
  inline def apply(): Coefficient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coefficient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Coefficient] (val x: Self) extends AnyVal {
    
    inline def setCoefficient(value: String): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
    
    inline def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
    
    inline def setExponent(value: String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
    inline def setPrime(value: String): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
    
    inline def setPrimeUndefined: Self = StObject.set(x, "prime", js.undefined)
  }
}
