package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IMessageImprint> */
trait MessageImprintParameters extends StObject {
  
  var hashAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var hashedMessage: js.UndefOr[OctetString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object MessageImprintParameters {
  
  inline def apply(): MessageImprintParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageImprintParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageImprintParameters] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setHashedMessage(value: OctetString): Self = StObject.set(x, "hashedMessage", value.asInstanceOf[js.Any])
    
    inline def setHashedMessageUndefined: Self = StObject.set(x, "hashedMessage", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
