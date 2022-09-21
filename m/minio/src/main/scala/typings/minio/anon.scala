package typings.minio

import typings.minio.minioStrings.DOCUMENT
import typings.minio.minioStrings.IGNORE
import typings.minio.minioStrings.LINES
import typings.minio.minioStrings.NONE
import typings.minio.minioStrings.USE
import typings.minio.mod.BucketItemWithMetadata
import typings.minio.mod.BucketStream
import typings.minio.mod.LegalHoldStatus
import typings.minio.mod.Mode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowQuotedRecordDelimiter extends StObject {
    
    var AllowQuotedRecordDelimiter: js.UndefOr[Boolean] = js.undefined
    
    var Comments: js.UndefOr[String] = js.undefined
    
    var FieldDelimiter: js.UndefOr[String] = js.undefined
    
    var FileHeaderInfo: js.UndefOr[NONE | IGNORE | USE] = js.undefined
    
    var QuoteCharacter: js.UndefOr[String] = js.undefined
    
    var QuoteEscapeCharacter: js.UndefOr[String] = js.undefined
    
    var RecordDelimiter: js.UndefOr[String] = js.undefined
  }
  object AllowQuotedRecordDelimiter {
    
    inline def apply(): AllowQuotedRecordDelimiter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowQuotedRecordDelimiter]
    }
    
    extension [Self <: AllowQuotedRecordDelimiter](x: Self) {
      
      inline def setAllowQuotedRecordDelimiter(value: Boolean): Self = StObject.set(x, "AllowQuotedRecordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setAllowQuotedRecordDelimiterUndefined: Self = StObject.set(x, "AllowQuotedRecordDelimiter", js.undefined)
      
      inline def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
      
      inline def setFieldDelimiter(value: String): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
      
      inline def setFieldDelimiterUndefined: Self = StObject.set(x, "FieldDelimiter", js.undefined)
      
      inline def setFileHeaderInfo(value: NONE | IGNORE | USE): Self = StObject.set(x, "FileHeaderInfo", value.asInstanceOf[js.Any])
      
      inline def setFileHeaderInfoUndefined: Self = StObject.set(x, "FileHeaderInfo", js.undefined)
      
      inline def setQuoteCharacter(value: String): Self = StObject.set(x, "QuoteCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteCharacterUndefined: Self = StObject.set(x, "QuoteCharacter", js.undefined)
      
      inline def setQuoteEscapeCharacter(value: String): Self = StObject.set(x, "QuoteEscapeCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteEscapeCharacterUndefined: Self = StObject.set(x, "QuoteEscapeCharacter", js.undefined)
      
      inline def setRecordDelimiter(value: String): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
    }
  }
  
  trait Bucket extends StObject {
    
    var Bucket: String
    
    var Encryption: js.UndefOr[KMSMasterKeyID] = js.undefined
    
    var End: js.UndefOr[Double] = js.undefined
    
    var MatchETag: js.UndefOr[String] = js.undefined
    
    var MatchModifiedSince: js.UndefOr[String] = js.undefined
    
    var MatchRange: js.UndefOr[Boolean] = js.undefined
    
    var MatchUnmodifiedSince: js.UndefOr[String] = js.undefined
    
    var NoMatchETag: js.UndefOr[String] = js.undefined
    
    var Object: String
    
    var Start: js.UndefOr[Double] = js.undefined
    
    var VersionID: js.UndefOr[String] = js.undefined
  }
  object Bucket {
    
    inline def apply(Bucket: String, Object: String): Bucket = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucket]
    }
    
    extension [Self <: Bucket](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: KMSMasterKeyID): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
      
      inline def setMatchETag(value: String): Self = StObject.set(x, "MatchETag", value.asInstanceOf[js.Any])
      
      inline def setMatchETagUndefined: Self = StObject.set(x, "MatchETag", js.undefined)
      
      inline def setMatchModifiedSince(value: String): Self = StObject.set(x, "MatchModifiedSince", value.asInstanceOf[js.Any])
      
      inline def setMatchModifiedSinceUndefined: Self = StObject.set(x, "MatchModifiedSince", js.undefined)
      
      inline def setMatchRange(value: Boolean): Self = StObject.set(x, "MatchRange", value.asInstanceOf[js.Any])
      
      inline def setMatchRangeUndefined: Self = StObject.set(x, "MatchRange", js.undefined)
      
      inline def setMatchUnmodifiedSince(value: String): Self = StObject.set(x, "MatchUnmodifiedSince", value.asInstanceOf[js.Any])
      
      inline def setMatchUnmodifiedSinceUndefined: Self = StObject.set(x, "MatchUnmodifiedSince", js.undefined)
      
      inline def setNoMatchETag(value: String): Self = StObject.set(x, "NoMatchETag", value.asInstanceOf[js.Any])
      
      inline def setNoMatchETagUndefined: Self = StObject.set(x, "NoMatchETag", js.undefined)
      
      inline def setObject(value: String): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
      
      inline def setVersionID(value: String): Self = StObject.set(x, "VersionID", value.asInstanceOf[js.Any])
      
      inline def setVersionIDUndefined: Self = StObject.set(x, "VersionID", js.undefined)
    }
  }
  
  trait Enabled extends StObject {
    
    var Enabled: Boolean
  }
  object Enabled {
    
    inline def apply(Enabled: Boolean): Enabled = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encryption extends StObject {
    
    var Bucket: String
    
    var Encryption: js.UndefOr[KMSMasterKeyID] = js.undefined
    
    var LegalHold: js.UndefOr[LegalHoldStatus] = js.undefined
    
    var Mode: js.UndefOr[typings.minio.mod.Mode] = js.undefined
    
    var Object: String
    
    var RetainUntilDate: js.UndefOr[String] = js.undefined
    
    var UserMetadata: js.UndefOr[Record[String, Any]] = js.undefined
    
    var UserTags: js.UndefOr[(Record[String, Any]) | String] = js.undefined
  }
  object Encryption {
    
    inline def apply(Bucket: String, Object: String): Encryption = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encryption]
    }
    
    extension [Self <: Encryption](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: KMSMasterKeyID): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      inline def setLegalHold(value: LegalHoldStatus): Self = StObject.set(x, "LegalHold", value.asInstanceOf[js.Any])
      
      inline def setLegalHoldUndefined: Self = StObject.set(x, "LegalHold", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
      
      inline def setObject(value: String): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setRetainUntilDate(value: String): Self = StObject.set(x, "RetainUntilDate", value.asInstanceOf[js.Any])
      
      inline def setRetainUntilDateUndefined: Self = StObject.set(x, "RetainUntilDate", js.undefined)
      
      inline def setUserMetadata(value: Record[String, Any]): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      inline def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
      
      inline def setUserTags(value: (Record[String, Any]) | String): Self = StObject.set(x, "UserTags", value.asInstanceOf[js.Any])
      
      inline def setUserTagsUndefined: Self = StObject.set(x, "UserTags", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    var End: Double
    
    var Start: Double
  }
  object End {
    
    inline def apply(End: Double, Start: Double): End = {
      val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldDelimiter extends StObject {
    
    var FieldDelimiter: js.UndefOr[String] = js.undefined
    
    var QuoteCharacter: js.UndefOr[String] = js.undefined
    
    var QuoteEscapeCharacter: js.UndefOr[String] = js.undefined
    
    var QuoteFields: js.UndefOr[String] = js.undefined
    
    var RecordDelimiter: js.UndefOr[String] = js.undefined
  }
  object FieldDelimiter {
    
    inline def apply(): FieldDelimiter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldDelimiter]
    }
    
    extension [Self <: FieldDelimiter](x: Self) {
      
      inline def setFieldDelimiter(value: String): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
      
      inline def setFieldDelimiterUndefined: Self = StObject.set(x, "FieldDelimiter", js.undefined)
      
      inline def setQuoteCharacter(value: String): Self = StObject.set(x, "QuoteCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteCharacterUndefined: Self = StObject.set(x, "QuoteCharacter", js.undefined)
      
      inline def setQuoteEscapeCharacter(value: String): Self = StObject.set(x, "QuoteEscapeCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteEscapeCharacterUndefined: Self = StObject.set(x, "QuoteEscapeCharacter", js.undefined)
      
      inline def setQuoteFields(value: String): Self = StObject.set(x, "QuoteFields", value.asInstanceOf[js.Any])
      
      inline def setQuoteFieldsUndefined: Self = StObject.set(x, "QuoteFields", js.undefined)
      
      inline def setRecordDelimiter(value: String): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
    }
  }
  
  trait KMSMasterKeyID extends StObject {
    
    var KMSMasterKeyID: js.UndefOr[String] = js.undefined
    
    var SSEAlgorithm: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object KMSMasterKeyID {
    
    inline def apply(`type`: String): KMSMasterKeyID = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KMSMasterKeyID]
    }
    
    extension [Self <: KMSMasterKeyID](x: Self) {
      
      inline def setKMSMasterKeyID(value: String): Self = StObject.set(x, "KMSMasterKeyID", value.asInstanceOf[js.Any])
      
      inline def setKMSMasterKeyIDUndefined: Self = StObject.set(x, "KMSMasterKeyID", js.undefined)
      
      inline def setSSEAlgorithm(value: String): Self = StObject.set(x, "SSEAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSSEAlgorithmUndefined: Self = StObject.set(x, "SSEAlgorithm", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListObjectsV2WithMetadata extends StObject {
    
    def listObjectsV2WithMetadata(bucketName: String): BucketStream[BucketItemWithMetadata] = js.native
    def listObjectsV2WithMetadata(bucketName: String, prefix: String): BucketStream[BucketItemWithMetadata] = js.native
    def listObjectsV2WithMetadata(bucketName: String, prefix: String, recursive: Boolean): BucketStream[BucketItemWithMetadata] = js.native
    def listObjectsV2WithMetadata(bucketName: String, prefix: String, recursive: Boolean, startAfter: String): BucketStream[BucketItemWithMetadata] = js.native
    def listObjectsV2WithMetadata(bucketName: String, prefix: String, recursive: Unit, startAfter: String): BucketStream[BucketItemWithMetadata] = js.native
    def listObjectsV2WithMetadata(bucketName: String, prefix: Unit, recursive: Boolean): BucketStream[BucketItemWithMetadata] = js.native
    def listObjectsV2WithMetadata(bucketName: String, prefix: Unit, recursive: Boolean, startAfter: String): BucketStream[BucketItemWithMetadata] = js.native
    def listObjectsV2WithMetadata(bucketName: String, prefix: Unit, recursive: Unit, startAfter: String): BucketStream[BucketItemWithMetadata] = js.native
  }
  
  trait RecordDelimiter extends StObject {
    
    var RecordDelimiter: js.UndefOr[String] = js.undefined
  }
  object RecordDelimiter {
    
    inline def apply(): RecordDelimiter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordDelimiter]
    }
    
    extension [Self <: RecordDelimiter](x: Self) {
      
      inline def setRecordDelimiter(value: String): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var Type: DOCUMENT | LINES
  }
  object Type {
    
    inline def apply(Type: DOCUMENT | LINES): Type = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: DOCUMENT | LINES): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
}
