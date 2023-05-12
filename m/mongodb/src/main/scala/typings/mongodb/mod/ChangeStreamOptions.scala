package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<mongodb.mongodb.AggregateOptions, 'writeConcern'> */
trait ChangeStreamOptions extends StObject {
  
  var allowDiskUse: js.UndefOr[Boolean] = js.undefined
  
  var authdb: js.UndefOr[String] = js.undefined
  
  /**
    * The number of documents to return per batch.
    * @see https://www.mongodb.com/docs/manual/reference/command/aggregate
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  var bsonRegExp: js.UndefOr[Boolean] = js.undefined
  
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  var checkKeys: js.UndefOr[Boolean] = js.undefined
  
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  var comment: js.UndefOr[Any] = js.undefined
  
  var cursor: js.UndefOr[Document] = js.undefined
  
  var dbName: js.UndefOr[String] = js.undefined
  
  var enableUtf8Validation: js.UndefOr[Boolean] = js.undefined
  
  var explain: js.UndefOr[ExplainVerbosityLike] = js.undefined
  
  var fieldsAsRaw: js.UndefOr[Document] = js.undefined
  
  /**
    * Allowed values: 'updateLookup', 'whenAvailable', 'required'.
    *
    * When set to 'updateLookup', the change notification for partial updates
    * will include both a delta describing the changes to the document as well
    * as a copy of the entire document that was changed from some time after
    * the change occurred.
    *
    * When set to 'whenAvailable', configures the change stream to return the
    * post-image of the modified document for replace and update change events
    * if the post-image for this event is available.
    *
    * When set to 'required', the same behavior as 'whenAvailable' except that
    * an error is raised if the post-image is not available.
    */
  var fullDocument: js.UndefOr[String] = js.undefined
  
  /**
    * Allowed values: 'whenAvailable', 'required', 'off'.
    *
    * The default is to not send a value, which is equivalent to 'off'.
    *
    * When set to 'whenAvailable', configures the change stream to return the
    * pre-image of the modified document for replace, update, and delete change
    * events if it is available.
    *
    * When set to 'required', the same behavior as 'whenAvailable' except that
    * an error is raised if the pre-image is not available.
    */
  var fullDocumentBeforeChange: js.UndefOr[String] = js.undefined
  
  var hint: js.UndefOr[Hint] = js.undefined
  
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  
  var let: js.UndefOr[Document] = js.undefined
  
  /** The maximum amount of time for the server to wait on new documents to satisfy a change stream query. */
  var maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  var noResponse: js.UndefOr[Boolean] = js.undefined
  
  var omitReadPreference: js.UndefOr[Boolean] = js.undefined
  
  var out: js.UndefOr[String] = js.undefined
  
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  
  var promoteValues: js.UndefOr[Boolean] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var readConcern: js.UndefOr[ReadConcernLike] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceLike] = js.undefined
  
  /**
    * Allows you to start a changeStream after a specified event.
    * @see https://www.mongodb.com/docs/manual/changeStreams/#resumeafter-for-change-streams
    */
  var resumeAfter: js.UndefOr[ResumeToken] = js.undefined
  
  var retryWrites: js.UndefOr[Boolean] = js.undefined
  
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  /**
    * When enabled, configures the change stream to include extra change events.
    *
    * - createIndexes
    * - dropIndexes
    * - modify
    * - create
    * - shardCollection
    * - reshardCollection
    * - refineCollectionShardKey
    */
  var showExpandedEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Similar to resumeAfter, but will allow you to start after an invalidated event.
    * @see https://www.mongodb.com/docs/manual/changeStreams/#startafter-for-change-streams
    */
  var startAfter: js.UndefOr[ResumeToken] = js.undefined
  
  /** Will start the changeStream after the specified operationTime. */
  var startAtOperationTime: js.UndefOr[OperationTime] = js.undefined
  
  var useBigInt64: js.UndefOr[Boolean] = js.undefined
  
  var willRetryWrite: js.UndefOr[Boolean] = js.undefined
}
object ChangeStreamOptions {
  
  inline def apply(): ChangeStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeStreamOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowDiskUse(value: Boolean): Self = StObject.set(x, "allowDiskUse", value.asInstanceOf[js.Any])
    
    inline def setAllowDiskUseUndefined: Self = StObject.set(x, "allowDiskUse", js.undefined)
    
    inline def setAuthdb(value: String): Self = StObject.set(x, "authdb", value.asInstanceOf[js.Any])
    
    inline def setAuthdbUndefined: Self = StObject.set(x, "authdb", js.undefined)
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setBsonRegExp(value: Boolean): Self = StObject.set(x, "bsonRegExp", value.asInstanceOf[js.Any])
    
    inline def setBsonRegExpUndefined: Self = StObject.set(x, "bsonRegExp", js.undefined)
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setCheckKeys(value: Boolean): Self = StObject.set(x, "checkKeys", value.asInstanceOf[js.Any])
    
    inline def setCheckKeysUndefined: Self = StObject.set(x, "checkKeys", js.undefined)
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setComment(value: Any): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCursor(value: Document): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    inline def setEnableUtf8Validation(value: Boolean): Self = StObject.set(x, "enableUtf8Validation", value.asInstanceOf[js.Any])
    
    inline def setEnableUtf8ValidationUndefined: Self = StObject.set(x, "enableUtf8Validation", js.undefined)
    
    inline def setExplain(value: ExplainVerbosityLike): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setFieldsAsRaw(value: Document): Self = StObject.set(x, "fieldsAsRaw", value.asInstanceOf[js.Any])
    
    inline def setFieldsAsRawUndefined: Self = StObject.set(x, "fieldsAsRaw", js.undefined)
    
    inline def setFullDocument(value: String): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentBeforeChange(value: String): Self = StObject.set(x, "fullDocumentBeforeChange", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentBeforeChangeUndefined: Self = StObject.set(x, "fullDocumentBeforeChange", js.undefined)
    
    inline def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
    
    inline def setLet(value: Document): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setLetUndefined: Self = StObject.set(x, "let", js.undefined)
    
    inline def setMaxAwaitTimeMS(value: scala.Double): Self = StObject.set(x, "maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxAwaitTimeMSUndefined: Self = StObject.set(x, "maxAwaitTimeMS", js.undefined)
    
    inline def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setNoResponse(value: Boolean): Self = StObject.set(x, "noResponse", value.asInstanceOf[js.Any])
    
    inline def setNoResponseUndefined: Self = StObject.set(x, "noResponse", js.undefined)
    
    inline def setOmitReadPreference(value: Boolean): Self = StObject.set(x, "omitReadPreference", value.asInstanceOf[js.Any])
    
    inline def setOmitReadPreferenceUndefined: Self = StObject.set(x, "omitReadPreference", js.undefined)
    
    inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    inline def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
    
    inline def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
    
    inline def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
    
    inline def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
    
    inline def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
    
    inline def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReadConcern(value: ReadConcernLike): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceLike): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setResumeAfter(value: ResumeToken): Self = StObject.set(x, "resumeAfter", value.asInstanceOf[js.Any])
    
    inline def setResumeAfterUndefined: Self = StObject.set(x, "resumeAfter", js.undefined)
    
    inline def setRetryWrites(value: Boolean): Self = StObject.set(x, "retryWrites", value.asInstanceOf[js.Any])
    
    inline def setRetryWritesUndefined: Self = StObject.set(x, "retryWrites", js.undefined)
    
    inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setShowExpandedEvents(value: Boolean): Self = StObject.set(x, "showExpandedEvents", value.asInstanceOf[js.Any])
    
    inline def setShowExpandedEventsUndefined: Self = StObject.set(x, "showExpandedEvents", js.undefined)
    
    inline def setStartAfter(value: ResumeToken): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
    
    inline def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    
    inline def setStartAtOperationTime(value: OperationTime): Self = StObject.set(x, "startAtOperationTime", value.asInstanceOf[js.Any])
    
    inline def setStartAtOperationTimeUndefined: Self = StObject.set(x, "startAtOperationTime", js.undefined)
    
    inline def setUseBigInt64(value: Boolean): Self = StObject.set(x, "useBigInt64", value.asInstanceOf[js.Any])
    
    inline def setUseBigInt64Undefined: Self = StObject.set(x, "useBigInt64", js.undefined)
    
    inline def setWillRetryWrite(value: Boolean): Self = StObject.set(x, "willRetryWrite", value.asInstanceOf[js.Any])
    
    inline def setWillRetryWriteUndefined: Self = StObject.set(x, "willRetryWrite", js.undefined)
  }
}
