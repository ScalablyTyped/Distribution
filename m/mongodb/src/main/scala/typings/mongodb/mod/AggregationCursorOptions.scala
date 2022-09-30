package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mongodb.mod.BSONSerializeOptions because Already inherited
- typings.mongodb.mod.OperationOptions because var conflicts: bsonRegExp, checkKeys, enableUtf8Validation, fieldsAsRaw, ignoreUndefined, promoteBuffers, promoteLongs, promoteValues, raw, readPreference, serializeFunctions, session. Inlined willRetryWrite, omitReadPreference
- typings.mongodb.mod.CommandOperationOptions because var conflicts: bsonRegExp, checkKeys, collation, comment, enableUtf8Validation, fieldsAsRaw, ignoreUndefined, maxTimeMS, promoteBuffers, promoteLongs, promoteValues, raw, readConcern, readPreference, serializeFunctions, session. Inlined fullResponse, retryWrites, dbName, authdb, noResponse
- typings.mongodb.mod.AggregateOptions because var conflicts: batchSize, bsonRegExp, checkKeys, comment, enableUtf8Validation, fieldsAsRaw, ignoreUndefined, maxAwaitTimeMS, maxTimeMS, promoteBuffers, promoteLongs, promoteValues, raw, readConcern, readPreference, serializeFunctions, session. Inlined allowDiskUse, bypassDocumentValidation, cursor, collation, hint, let, out */ trait AggregationCursorOptions
  extends StObject
     with AbstractCursorOptions
     with WriteConcernOptions
     with ExplainOptions {
  
  /** allowDiskUse lets the server know if it can use disk to store temporary results for the aggregation (requires mongodb 2.6 \>). */
  var allowDiskUse: js.UndefOr[Boolean] = js.undefined
  
  var authdb: js.UndefOr[String] = js.undefined
  
  /** Allow driver to bypass schema validation in MongoDB 3.2 or higher. */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /** Specify collation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  /** Return the query as cursor, on 2.6 \> it returns as a real cursor on pre 2.6 it returns as an emulated cursor. */
  var cursor: js.UndefOr[Document] = js.undefined
  
  var dbName: js.UndefOr[String] = js.undefined
  
  /** @deprecated This option does nothing */
  var fullResponse: js.UndefOr[Boolean] = js.undefined
  
  /** Add an index selection hint to an aggregation command */
  var hint: js.UndefOr[Hint] = js.undefined
  
  /** Map of parameter names and values that can be accessed using $$var (requires MongoDB 5.0). */
  var let: js.UndefOr[Document] = js.undefined
  
  var noResponse: js.UndefOr[Boolean] = js.undefined
  
  /* Excluded from this release type: bypassPinningCheck */
  var omitReadPreference: js.UndefOr[Boolean] = js.undefined
  
  var out: js.UndefOr[String] = js.undefined
  
  /** Should retry failed writes */
  var retryWrites: js.UndefOr[Boolean] = js.undefined
  
  var willRetryWrite: js.UndefOr[Boolean] = js.undefined
}
object AggregationCursorOptions {
  
  inline def apply(): AggregationCursorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationCursorOptions]
  }
  
  extension [Self <: AggregationCursorOptions](x: Self) {
    
    inline def setAllowDiskUse(value: Boolean): Self = StObject.set(x, "allowDiskUse", value.asInstanceOf[js.Any])
    
    inline def setAllowDiskUseUndefined: Self = StObject.set(x, "allowDiskUse", js.undefined)
    
    inline def setAuthdb(value: String): Self = StObject.set(x, "authdb", value.asInstanceOf[js.Any])
    
    inline def setAuthdbUndefined: Self = StObject.set(x, "authdb", js.undefined)
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setCursor(value: Document): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    inline def setFullResponse(value: Boolean): Self = StObject.set(x, "fullResponse", value.asInstanceOf[js.Any])
    
    inline def setFullResponseUndefined: Self = StObject.set(x, "fullResponse", js.undefined)
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLet(value: Document): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setLetUndefined: Self = StObject.set(x, "let", js.undefined)
    
    inline def setNoResponse(value: Boolean): Self = StObject.set(x, "noResponse", value.asInstanceOf[js.Any])
    
    inline def setNoResponseUndefined: Self = StObject.set(x, "noResponse", js.undefined)
    
    inline def setOmitReadPreference(value: Boolean): Self = StObject.set(x, "omitReadPreference", value.asInstanceOf[js.Any])
    
    inline def setOmitReadPreferenceUndefined: Self = StObject.set(x, "omitReadPreference", js.undefined)
    
    inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    inline def setRetryWrites(value: Boolean): Self = StObject.set(x, "retryWrites", value.asInstanceOf[js.Any])
    
    inline def setRetryWritesUndefined: Self = StObject.set(x, "retryWrites", js.undefined)
    
    inline def setWillRetryWrite(value: Boolean): Self = StObject.set(x, "willRetryWrite", value.asInstanceOf[js.Any])
    
    inline def setWillRetryWriteUndefined: Self = StObject.set(x, "willRetryWrite", js.undefined)
  }
}
