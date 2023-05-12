package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunCommandOptions
  extends StObject
     with BSONSerializeOptions {
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var authdb: js.UndefOr[Any] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var collation: js.UndefOr[Any] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var comment: js.UndefOr[Any] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var dbName: js.UndefOr[Any] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var explain: js.UndefOr[Any] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var maxTimeMS: js.UndefOr[Any] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var noResponse: js.UndefOr[Any] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var omitReadPreference: js.UndefOr[Any] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var readConcern: js.UndefOr[Any] = js.undefined
  
  /** The read preference */
  var readPreference: js.UndefOr[ReadPreferenceLike] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var retryWrites: js.UndefOr[Any] = js.undefined
  
  /** Specify ClientSession for this command */
  var session: js.UndefOr[ClientSession] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var willRetryWrite: js.UndefOr[Any] = js.undefined
  
  /** @deprecated This is an internal option that has undefined behavior for this API */
  var writeConcern: js.UndefOr[Any] = js.undefined
}
object RunCommandOptions {
  
  inline def apply(): RunCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunCommandOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunCommandOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthdb(value: Any): Self = StObject.set(x, "authdb", value.asInstanceOf[js.Any])
    
    inline def setAuthdbUndefined: Self = StObject.set(x, "authdb", js.undefined)
    
    inline def setCollation(value: Any): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setComment(value: Any): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDbName(value: Any): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    inline def setExplain(value: Any): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setMaxTimeMS(value: Any): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setNoResponse(value: Any): Self = StObject.set(x, "noResponse", value.asInstanceOf[js.Any])
    
    inline def setNoResponseUndefined: Self = StObject.set(x, "noResponse", js.undefined)
    
    inline def setOmitReadPreference(value: Any): Self = StObject.set(x, "omitReadPreference", value.asInstanceOf[js.Any])
    
    inline def setOmitReadPreferenceUndefined: Self = StObject.set(x, "omitReadPreference", js.undefined)
    
    inline def setReadConcern(value: Any): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceLike): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setRetryWrites(value: Any): Self = StObject.set(x, "retryWrites", value.asInstanceOf[js.Any])
    
    inline def setRetryWritesUndefined: Self = StObject.set(x, "retryWrites", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setWillRetryWrite(value: Any): Self = StObject.set(x, "willRetryWrite", value.asInstanceOf[js.Any])
    
    inline def setWillRetryWriteUndefined: Self = StObject.set(x, "willRetryWrite", js.undefined)
    
    inline def setWriteConcern(value: Any): Self = StObject.set(x, "writeConcern", value.asInstanceOf[js.Any])
    
    inline def setWriteConcernUndefined: Self = StObject.set(x, "writeConcern", js.undefined)
  }
}
