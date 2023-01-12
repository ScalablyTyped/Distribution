package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRSAPublicKey> & {  json :pkijs.pkijs.RSAPublicKeyJson | undefined} */
trait RSAPublicKeyParameters extends StObject {
  
  var json: js.UndefOr[RSAPublicKeyJson] = js.undefined
  
  var modulus: js.UndefOr[Integer] = js.undefined
  
  var publicExponent: js.UndefOr[Integer] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object RSAPublicKeyParameters {
  
  inline def apply(): RSAPublicKeyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RSAPublicKeyParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RSAPublicKeyParameters] (val x: Self) extends AnyVal {
    
    inline def setJson(value: RSAPublicKeyJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setModulus(value: Integer): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setModulusUndefined: Self = StObject.set(x, "modulus", js.undefined)
    
    inline def setPublicExponent(value: Integer): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
