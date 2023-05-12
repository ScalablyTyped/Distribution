package typings.mongodbClientEncryption

import typings.mongodbClientEncryption.mod.ClientEncryptionDataKeyProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongodbClientEncryptionStrings {
  
  @js.native
  sealed trait `AEAD_AES_256_CBC_HMAC_SHA_512-Deterministic` extends StObject
  inline def `AEAD_AES_256_CBC_HMAC_SHA_512-Deterministic`: `AEAD_AES_256_CBC_HMAC_SHA_512-Deterministic` = "AEAD_AES_256_CBC_HMAC_SHA_512-Deterministic".asInstanceOf[`AEAD_AES_256_CBC_HMAC_SHA_512-Deterministic`]
  
  @js.native
  sealed trait `AEAD_AES_256_CBC_HMAC_SHA_512-Random` extends StObject
  inline def `AEAD_AES_256_CBC_HMAC_SHA_512-Random`: `AEAD_AES_256_CBC_HMAC_SHA_512-Random` = "AEAD_AES_256_CBC_HMAC_SHA_512-Random".asInstanceOf[`AEAD_AES_256_CBC_HMAC_SHA_512-Random`]
  
  @js.native
  sealed trait Indexed extends StObject
  inline def Indexed: Indexed = "Indexed".asInstanceOf[Indexed]
  
  @js.native
  sealed trait RangePreview extends StObject
  inline def RangePreview: RangePreview = "RangePreview".asInstanceOf[RangePreview]
  
  @js.native
  sealed trait Unindexed extends StObject
  inline def Unindexed: Unindexed = "Unindexed".asInstanceOf[Unindexed]
  
  @js.native
  sealed trait aws
    extends StObject
       with ClientEncryptionDataKeyProvider
  inline def aws: aws = "aws".asInstanceOf[aws]
  
  @js.native
  sealed trait azure
    extends StObject
       with ClientEncryptionDataKeyProvider
  inline def azure: azure = "azure".asInstanceOf[azure]
  
  @js.native
  sealed trait encryptedFields extends StObject
  inline def encryptedFields: encryptedFields = "encryptedFields".asInstanceOf[encryptedFields]
  
  @js.native
  sealed trait equality extends StObject
  inline def equality: equality = "equality".asInstanceOf[equality]
  
  @js.native
  sealed trait gcp
    extends StObject
       with ClientEncryptionDataKeyProvider
  inline def gcp: gcp = "gcp".asInstanceOf[gcp]
  
  @js.native
  sealed trait kmip
    extends StObject
       with ClientEncryptionDataKeyProvider
  inline def kmip: kmip = "kmip".asInstanceOf[kmip]
  
  @js.native
  sealed trait local
    extends StObject
       with ClientEncryptionDataKeyProvider
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait rangePreview_ extends StObject
  inline def rangePreview_ : rangePreview_ = "rangePreview".asInstanceOf[rangePreview_]
}
