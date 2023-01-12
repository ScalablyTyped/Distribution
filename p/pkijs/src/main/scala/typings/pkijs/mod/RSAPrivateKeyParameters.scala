package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRSAPrivateKey> & {  json :pkijs.pkijs.RSAPrivateKeyJson | undefined} */
trait RSAPrivateKeyParameters extends StObject {
  
  var coefficient: js.UndefOr[Integer] = js.undefined
  
  var exponent1: js.UndefOr[Integer] = js.undefined
  
  var exponent2: js.UndefOr[Integer] = js.undefined
  
  var json: js.UndefOr[RSAPrivateKeyJson] = js.undefined
  
  var modulus: js.UndefOr[Integer] = js.undefined
  
  var otherPrimeInfos: js.UndefOr[js.Array[OtherPrimeInfo]] = js.undefined
  
  var prime1: js.UndefOr[Integer] = js.undefined
  
  var prime2: js.UndefOr[Integer] = js.undefined
  
  var privateExponent: js.UndefOr[Integer] = js.undefined
  
  var publicExponent: js.UndefOr[Integer] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object RSAPrivateKeyParameters {
  
  inline def apply(): RSAPrivateKeyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RSAPrivateKeyParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RSAPrivateKeyParameters] (val x: Self) extends AnyVal {
    
    inline def setCoefficient(value: Integer): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
    
    inline def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
    
    inline def setExponent1(value: Integer): Self = StObject.set(x, "exponent1", value.asInstanceOf[js.Any])
    
    inline def setExponent1Undefined: Self = StObject.set(x, "exponent1", js.undefined)
    
    inline def setExponent2(value: Integer): Self = StObject.set(x, "exponent2", value.asInstanceOf[js.Any])
    
    inline def setExponent2Undefined: Self = StObject.set(x, "exponent2", js.undefined)
    
    inline def setJson(value: RSAPrivateKeyJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setModulus(value: Integer): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setModulusUndefined: Self = StObject.set(x, "modulus", js.undefined)
    
    inline def setOtherPrimeInfos(value: js.Array[OtherPrimeInfo]): Self = StObject.set(x, "otherPrimeInfos", value.asInstanceOf[js.Any])
    
    inline def setOtherPrimeInfosUndefined: Self = StObject.set(x, "otherPrimeInfos", js.undefined)
    
    inline def setOtherPrimeInfosVarargs(value: OtherPrimeInfo*): Self = StObject.set(x, "otherPrimeInfos", js.Array(value*))
    
    inline def setPrime1(value: Integer): Self = StObject.set(x, "prime1", value.asInstanceOf[js.Any])
    
    inline def setPrime1Undefined: Self = StObject.set(x, "prime1", js.undefined)
    
    inline def setPrime2(value: Integer): Self = StObject.set(x, "prime2", value.asInstanceOf[js.Any])
    
    inline def setPrime2Undefined: Self = StObject.set(x, "prime2", js.undefined)
    
    inline def setPrivateExponent(value: Integer): Self = StObject.set(x, "privateExponent", value.asInstanceOf[js.Any])
    
    inline def setPrivateExponentUndefined: Self = StObject.set(x, "privateExponent", js.undefined)
    
    inline def setPublicExponent(value: Integer): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
