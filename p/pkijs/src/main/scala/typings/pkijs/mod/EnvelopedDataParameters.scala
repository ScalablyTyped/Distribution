package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IEnvelopedData> */
trait EnvelopedDataParameters extends StObject {
  
  var encryptedContentInfo: js.UndefOr[EncryptedContentInfo] = js.undefined
  
  var originatorInfo: js.UndefOr[OriginatorInfo] = js.undefined
  
  var recipientInfos: js.UndefOr[js.Array[RecipientInfo]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var unprotectedAttrs: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object EnvelopedDataParameters {
  
  inline def apply(): EnvelopedDataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopedDataParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopedDataParameters] (val x: Self) extends AnyVal {
    
    inline def setEncryptedContentInfo(value: EncryptedContentInfo): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContentInfoUndefined: Self = StObject.set(x, "encryptedContentInfo", js.undefined)
    
    inline def setOriginatorInfo(value: OriginatorInfo): Self = StObject.set(x, "originatorInfo", value.asInstanceOf[js.Any])
    
    inline def setOriginatorInfoUndefined: Self = StObject.set(x, "originatorInfo", js.undefined)
    
    inline def setRecipientInfos(value: js.Array[RecipientInfo]): Self = StObject.set(x, "recipientInfos", value.asInstanceOf[js.Any])
    
    inline def setRecipientInfosUndefined: Self = StObject.set(x, "recipientInfos", js.undefined)
    
    inline def setRecipientInfosVarargs(value: RecipientInfo*): Self = StObject.set(x, "recipientInfos", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setUnprotectedAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "unprotectedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrsUndefined: Self = StObject.set(x, "unprotectedAttrs", js.undefined)
    
    inline def setUnprotectedAttrsVarargs(value: Attribute*): Self = StObject.set(x, "unprotectedAttrs", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
