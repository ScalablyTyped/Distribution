package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOriginatorPublicKey> */
trait OriginatorPublicKeyParameters extends StObject {
  
  var algorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var publicKey: js.UndefOr[BitString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object OriginatorPublicKeyParameters {
  
  inline def apply(): OriginatorPublicKeyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginatorPublicKeyParameters]
  }
  
  extension [Self <: OriginatorPublicKeyParameters](x: Self) {
    
    inline def setAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setPublicKey(value: BitString): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
