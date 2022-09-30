package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnvelopedData extends StObject {
  
  /**
    * Encrypted content information
    */
  var encryptedContentInfo: EncryptedContentInfo
  
  /**
    * Optionally provides information about the originator. It is present only if required by the key management algorithm.
    * It may contain certificates and CRLs.
    */
  var originatorInfo: js.UndefOr[OriginatorInfo] = js.undefined
  
  /**
    * Collection of per-recipient information. There MUST be at least one element in the collection.
    */
  var recipientInfos: js.Array[RecipientInfo]
  
  /**
    * Collection of attributes that are not encrypted
    */
  var unprotectedAttrs: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  /**
    * Version number.
    *
    * The appropriate value depends on `originatorInfo`, `RecipientInfo`, and `unprotectedAttrs`.
    *
    * The version MUST be assigned as follows:
    * ```
    * IF (originatorInfo is present) AND
    *    ((any certificates with a type of other are present) OR
    *    (any crls with a type of other are present))
    * THEN version is 4
    * ELSE
    *    IF ((originatorInfo is present) AND
    *       (any version 2 attribute certificates are present)) OR
    *       (any RecipientInfo structures include pwri) OR
    *       (any RecipientInfo structures include ori)
    *    THEN version is 3
    *    ELSE
    *       IF (originatorInfo is absent) AND
    *          (unprotectedAttrs is absent) AND
    *          (all RecipientInfo structures are version 0)
    *       THEN version is 0
    *       ELSE version is 2
    * ```
    */
  var version: Double
}
object IEnvelopedData {
  
  inline def apply(
    encryptedContentInfo: EncryptedContentInfo,
    recipientInfos: js.Array[RecipientInfo],
    version: Double
  ): IEnvelopedData = {
    val __obj = js.Dynamic.literal(encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], recipientInfos = recipientInfos.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvelopedData]
  }
  
  extension [Self <: IEnvelopedData](x: Self) {
    
    inline def setEncryptedContentInfo(value: EncryptedContentInfo): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
    
    inline def setOriginatorInfo(value: OriginatorInfo): Self = StObject.set(x, "originatorInfo", value.asInstanceOf[js.Any])
    
    inline def setOriginatorInfoUndefined: Self = StObject.set(x, "originatorInfo", js.undefined)
    
    inline def setRecipientInfos(value: js.Array[RecipientInfo]): Self = StObject.set(x, "recipientInfos", value.asInstanceOf[js.Any])
    
    inline def setRecipientInfosVarargs(value: RecipientInfo*): Self = StObject.set(x, "recipientInfos", js.Array(value*))
    
    inline def setUnprotectedAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "unprotectedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrsUndefined: Self = StObject.set(x, "unprotectedAttrs", js.undefined)
    
    inline def setUnprotectedAttrsVarargs(value: Attribute*): Self = StObject.set(x, "unprotectedAttrs", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
