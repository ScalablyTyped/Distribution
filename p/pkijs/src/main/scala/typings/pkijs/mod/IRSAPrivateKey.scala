package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRSAPrivateKey extends StObject {
  
  var coefficient: Integer
  
  var exponent1: Integer
  
  var exponent2: Integer
  
  var modulus: Integer
  
  var otherPrimeInfos: js.UndefOr[js.Array[OtherPrimeInfo]] = js.undefined
  
  var prime1: Integer
  
  var prime2: Integer
  
  var privateExponent: Integer
  
  var publicExponent: Integer
  
  var version: Double
}
object IRSAPrivateKey {
  
  inline def apply(
    coefficient: Integer,
    exponent1: Integer,
    exponent2: Integer,
    modulus: Integer,
    prime1: Integer,
    prime2: Integer,
    privateExponent: Integer,
    publicExponent: Integer,
    version: Double
  ): IRSAPrivateKey = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent1 = exponent1.asInstanceOf[js.Any], exponent2 = exponent2.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any], prime1 = prime1.asInstanceOf[js.Any], prime2 = prime2.asInstanceOf[js.Any], privateExponent = privateExponent.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRSAPrivateKey]
  }
  
  extension [Self <: IRSAPrivateKey](x: Self) {
    
    inline def setCoefficient(value: Integer): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
    
    inline def setExponent1(value: Integer): Self = StObject.set(x, "exponent1", value.asInstanceOf[js.Any])
    
    inline def setExponent2(value: Integer): Self = StObject.set(x, "exponent2", value.asInstanceOf[js.Any])
    
    inline def setModulus(value: Integer): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setOtherPrimeInfos(value: js.Array[OtherPrimeInfo]): Self = StObject.set(x, "otherPrimeInfos", value.asInstanceOf[js.Any])
    
    inline def setOtherPrimeInfosUndefined: Self = StObject.set(x, "otherPrimeInfos", js.undefined)
    
    inline def setOtherPrimeInfosVarargs(value: OtherPrimeInfo*): Self = StObject.set(x, "otherPrimeInfos", js.Array(value*))
    
    inline def setPrime1(value: Integer): Self = StObject.set(x, "prime1", value.asInstanceOf[js.Any])
    
    inline def setPrime2(value: Integer): Self = StObject.set(x, "prime2", value.asInstanceOf[js.Any])
    
    inline def setPrivateExponent(value: Integer): Self = StObject.set(x, "privateExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponent(value: Integer): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
