package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsymmetricKeyDetails extends StObject {
  
  /**
    * Size of q in bits (DSA).
    */
  var divisorLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the message digest (RSA-PSS).
    */
  var hashAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the message digest used by MGF1 (RSA-PSS).
    */
  var mgf1HashAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Key size in bits (RSA, DSA).
    */
  var modulusLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the curve (EC).
    */
  var namedCurve: js.UndefOr[String] = js.undefined
  
  /**
    * Public exponent (RSA).
    */
  var publicExponent: js.UndefOr[js.BigInt] = js.undefined
  
  /**
    * Minimal salt length in bytes (RSA-PSS).
    */
  var saltLength: js.UndefOr[Double] = js.undefined
}
object AsymmetricKeyDetails {
  
  inline def apply(): AsymmetricKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsymmetricKeyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsymmetricKeyDetails] (val x: Self) extends AnyVal {
    
    inline def setDivisorLength(value: Double): Self = StObject.set(x, "divisorLength", value.asInstanceOf[js.Any])
    
    inline def setDivisorLengthUndefined: Self = StObject.set(x, "divisorLength", js.undefined)
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setMgf1HashAlgorithm(value: String): Self = StObject.set(x, "mgf1HashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMgf1HashAlgorithmUndefined: Self = StObject.set(x, "mgf1HashAlgorithm", js.undefined)
    
    inline def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    inline def setModulusLengthUndefined: Self = StObject.set(x, "modulusLength", js.undefined)
    
    inline def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
    
    inline def setNamedCurveUndefined: Self = StObject.set(x, "namedCurve", js.undefined)
    
    inline def setPublicExponent(value: js.BigInt): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    
    inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
  }
}
