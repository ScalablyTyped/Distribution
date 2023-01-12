package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPrivateKeyInfo> & {  json :std.JsonWebKey | undefined} */
trait PrivateKeyInfoParameters extends StObject {
  
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var json: js.UndefOr[JsonWebKey] = js.undefined
  
  var parsedKey: js.UndefOr[RSAPrivateKey | ECPrivateKey] = js.undefined
  
  var privateKey: js.UndefOr[OctetString] = js.undefined
  
  var privateKeyAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object PrivateKeyInfoParameters {
  
  inline def apply(): PrivateKeyInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateKeyInfoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivateKeyInfoParameters] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setJson(value: JsonWebKey): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setParsedKey(value: RSAPrivateKey | ECPrivateKey): Self = StObject.set(x, "parsedKey", value.asInstanceOf[js.Any])
    
    inline def setParsedKeyUndefined: Self = StObject.set(x, "parsedKey", js.undefined)
    
    inline def setPrivateKey(value: OctetString): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "privateKeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyAlgorithmUndefined: Self = StObject.set(x, "privateKeyAlgorithm", js.undefined)
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
