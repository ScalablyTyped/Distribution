package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPublicKeyInfo> & {  json :std.JsonWebKey | undefined} */
trait PublicKeyInfoParameters extends StObject {
  
  var algorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var json: js.UndefOr[JsonWebKey] = js.undefined
  
  var parsedKey: js.UndefOr[ECPublicKey | RSAPublicKey] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var subjectPublicKey: js.UndefOr[BitString] = js.undefined
}
object PublicKeyInfoParameters {
  
  inline def apply(): PublicKeyInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicKeyInfoParameters]
  }
  
  extension [Self <: PublicKeyInfoParameters](x: Self) {
    
    inline def setAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setJson(value: JsonWebKey): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setParsedKey(value: ECPublicKey | RSAPublicKey): Self = StObject.set(x, "parsedKey", value.asInstanceOf[js.Any])
    
    inline def setParsedKeyUndefined: Self = StObject.set(x, "parsedKey", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSubjectPublicKey(value: BitString): Self = StObject.set(x, "subjectPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyUndefined: Self = StObject.set(x, "subjectPublicKey", js.undefined)
  }
}
