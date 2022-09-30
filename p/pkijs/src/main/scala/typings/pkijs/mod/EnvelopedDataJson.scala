package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON representation of {@link EnvelopedData}
  */
trait EnvelopedDataJson extends StObject {
  
  var encryptedContentInfo: EncryptedContentInfoJson
  
  var originatorInfo: js.UndefOr[OriginatorInfoJson] = js.undefined
  
  var recipientInfos: js.Array[RecipientInfoJson]
  
  var unprotectedAttrs: js.UndefOr[js.Array[AttributeJson]] = js.undefined
  
  var version: Double
}
object EnvelopedDataJson {
  
  inline def apply(
    encryptedContentInfo: EncryptedContentInfoJson,
    recipientInfos: js.Array[RecipientInfoJson],
    version: Double
  ): EnvelopedDataJson = {
    val __obj = js.Dynamic.literal(encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], recipientInfos = recipientInfos.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopedDataJson]
  }
  
  extension [Self <: EnvelopedDataJson](x: Self) {
    
    inline def setEncryptedContentInfo(value: EncryptedContentInfoJson): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
    
    inline def setOriginatorInfo(value: OriginatorInfoJson): Self = StObject.set(x, "originatorInfo", value.asInstanceOf[js.Any])
    
    inline def setOriginatorInfoUndefined: Self = StObject.set(x, "originatorInfo", js.undefined)
    
    inline def setRecipientInfos(value: js.Array[RecipientInfoJson]): Self = StObject.set(x, "recipientInfos", value.asInstanceOf[js.Any])
    
    inline def setRecipientInfosVarargs(value: RecipientInfoJson*): Self = StObject.set(x, "recipientInfos", js.Array(value*))
    
    inline def setUnprotectedAttrs(value: js.Array[AttributeJson]): Self = StObject.set(x, "unprotectedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrsUndefined: Self = StObject.set(x, "unprotectedAttrs", js.undefined)
    
    inline def setUnprotectedAttrsVarargs(value: AttributeJson*): Self = StObject.set(x, "unprotectedAttrs", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
