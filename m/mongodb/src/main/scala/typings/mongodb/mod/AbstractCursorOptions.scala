package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractCursorOptions
  extends StObject
     with BSONSerializeOptions {
  
  /**
    * If awaitData is set to true, when the cursor reaches the end of the capped collection,
    * MongoDB blocks the query thread for a period of time waiting for new data to arrive.
    * When new data is inserted into the capped collection, the blocked thread is signaled
    * to wake up and return the next batch to the client.
    */
  var awaitData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the number of documents to return in each response from MongoDB
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Comment to apply to the operation.
    *
    * In server versions pre-4.4, 'comment' must be string.  A server
    * error will be thrown if any other type is provided.
    *
    * In server versions 4.4 and above, 'comment' can be any valid BSON type.
    */
  var comment: js.UndefOr[Any] = js.undefined
  
  /**
    * When applicable `maxAwaitTimeMS` controls the amount of time subsequent getMores
    * that a cursor uses to fetch more data should take. (ex. cursor.next())
    */
  var maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * When applicable `maxTimeMS` controls the amount of time the initial command
    * that constructs a cursor should take. (ex. find, aggregate, listCollections)
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  var noCursorTimeout: js.UndefOr[Boolean] = js.undefined
  
  var readConcern: js.UndefOr[ReadConcernLike] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceLike] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  /**
    * By default, MongoDB will automatically close a cursor when the
    * client has exhausted all results in the cursor. However, for [capped collections](https://www.mongodb.com/docs/manual/core/capped-collections)
    * you may use a Tailable Cursor that remains open after the client exhausts
    * the results in the initial cursor.
    */
  var tailable: js.UndefOr[Boolean] = js.undefined
}
object AbstractCursorOptions {
  
  inline def apply(): AbstractCursorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractCursorOptions]
  }
  
  extension [Self <: AbstractCursorOptions](x: Self) {
    
    inline def setAwaitData(value: Boolean): Self = StObject.set(x, "awaitData", value.asInstanceOf[js.Any])
    
    inline def setAwaitDataUndefined: Self = StObject.set(x, "awaitData", js.undefined)
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setComment(value: Any): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setMaxAwaitTimeMS(value: scala.Double): Self = StObject.set(x, "maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxAwaitTimeMSUndefined: Self = StObject.set(x, "maxAwaitTimeMS", js.undefined)
    
    inline def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setNoCursorTimeout(value: Boolean): Self = StObject.set(x, "noCursorTimeout", value.asInstanceOf[js.Any])
    
    inline def setNoCursorTimeoutUndefined: Self = StObject.set(x, "noCursorTimeout", js.undefined)
    
    inline def setReadConcern(value: ReadConcernLike): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceLike): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setTailable(value: Boolean): Self = StObject.set(x, "tailable", value.asInstanceOf[js.Any])
    
    inline def setTailableUndefined: Self = StObject.set(x, "tailable", js.undefined)
  }
}
