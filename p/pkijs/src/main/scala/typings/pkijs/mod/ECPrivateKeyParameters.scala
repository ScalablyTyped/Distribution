package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IECPrivateKey> & {  json :pkijs.pkijs.ECPrivateKeyJson | undefined} */
trait ECPrivateKeyParameters extends StObject {
  
  var json: js.UndefOr[ECPrivateKeyJson] = js.undefined
  
  var namedCurve: js.UndefOr[String] = js.undefined
  
  var privateKey: js.UndefOr[OctetString] = js.undefined
  
  var publicKey: js.UndefOr[ECPublicKey] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object ECPrivateKeyParameters {
  
  inline def apply(): ECPrivateKeyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECPrivateKeyParameters]
  }
  
  extension [Self <: ECPrivateKeyParameters](x: Self) {
    
    inline def setJson(value: ECPrivateKeyJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
    
    inline def setNamedCurveUndefined: Self = StObject.set(x, "namedCurve", js.undefined)
    
    inline def setPrivateKey(value: OctetString): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setPublicKey(value: ECPublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
