package typings.pkijs.anon

import typings.pkijs.mod.OtherPrimeInfoSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exponent1 extends StObject {
  
  var coefficient: js.UndefOr[String] = js.undefined
  
  var exponent1: js.UndefOr[String] = js.undefined
  
  var exponent2: js.UndefOr[String] = js.undefined
  
  var modulus: js.UndefOr[String] = js.undefined
  
  var otherPrimeInfo: js.UndefOr[OtherPrimeInfoSchema] = js.undefined
  
  var otherPrimeInfosName: js.UndefOr[String] = js.undefined
  
  var prime1: js.UndefOr[String] = js.undefined
  
  var prime2: js.UndefOr[String] = js.undefined
  
  var privateExponent: js.UndefOr[String] = js.undefined
  
  var publicExponent: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Exponent1 {
  
  inline def apply(): Exponent1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exponent1]
  }
  
  extension [Self <: Exponent1](x: Self) {
    
    inline def setCoefficient(value: String): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
    
    inline def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
    
    inline def setExponent1(value: String): Self = StObject.set(x, "exponent1", value.asInstanceOf[js.Any])
    
    inline def setExponent1Undefined: Self = StObject.set(x, "exponent1", js.undefined)
    
    inline def setExponent2(value: String): Self = StObject.set(x, "exponent2", value.asInstanceOf[js.Any])
    
    inline def setExponent2Undefined: Self = StObject.set(x, "exponent2", js.undefined)
    
    inline def setModulus(value: String): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setModulusUndefined: Self = StObject.set(x, "modulus", js.undefined)
    
    inline def setOtherPrimeInfo(value: OtherPrimeInfoSchema): Self = StObject.set(x, "otherPrimeInfo", value.asInstanceOf[js.Any])
    
    inline def setOtherPrimeInfoUndefined: Self = StObject.set(x, "otherPrimeInfo", js.undefined)
    
    inline def setOtherPrimeInfosName(value: String): Self = StObject.set(x, "otherPrimeInfosName", value.asInstanceOf[js.Any])
    
    inline def setOtherPrimeInfosNameUndefined: Self = StObject.set(x, "otherPrimeInfosName", js.undefined)
    
    inline def setPrime1(value: String): Self = StObject.set(x, "prime1", value.asInstanceOf[js.Any])
    
    inline def setPrime1Undefined: Self = StObject.set(x, "prime1", js.undefined)
    
    inline def setPrime2(value: String): Self = StObject.set(x, "prime2", value.asInstanceOf[js.Any])
    
    inline def setPrime2Undefined: Self = StObject.set(x, "prime2", js.undefined)
    
    inline def setPrivateExponent(value: String): Self = StObject.set(x, "privateExponent", value.asInstanceOf[js.Any])
    
    inline def setPrivateExponentUndefined: Self = StObject.set(x, "privateExponent", js.undefined)
    
    inline def setPublicExponent(value: String): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
