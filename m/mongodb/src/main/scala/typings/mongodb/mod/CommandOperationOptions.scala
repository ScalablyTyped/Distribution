package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandOperationOptions
  extends StObject
     with OperationOptions
     with WriteConcernOptions
     with ExplainOptions {
  
  var authdb: js.UndefOr[String] = js.undefined
  
  /** Collation */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  /**
    * Comment to apply to the operation.
    *
    * In server versions pre-4.4, 'comment' must be string.  A server
    * error will be thrown if any other type is provided.
    *
    * In server versions 4.4 and above, 'comment' can be any valid BSON type.
    */
  var comment: js.UndefOr[Any] = js.undefined
  
  var dbName: js.UndefOr[String] = js.undefined
  
  /** @deprecated This option does nothing */
  var fullResponse: js.UndefOr[Boolean] = js.undefined
  
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  var noResponse: js.UndefOr[Boolean] = js.undefined
  
  /** Specify a read concern and level for the collection. (only MongoDB 3.2 or higher supported) */
  var readConcern: js.UndefOr[ReadConcernLike] = js.undefined
  
  /** Should retry failed writes */
  var retryWrites: js.UndefOr[Boolean] = js.undefined
}
object CommandOperationOptions {
  
  inline def apply(): CommandOperationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandOperationOptions]
  }
  
  extension [Self <: CommandOperationOptions](x: Self) {
    
    inline def setAuthdb(value: String): Self = StObject.set(x, "authdb", value.asInstanceOf[js.Any])
    
    inline def setAuthdbUndefined: Self = StObject.set(x, "authdb", js.undefined)
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setComment(value: Any): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    inline def setFullResponse(value: Boolean): Self = StObject.set(x, "fullResponse", value.asInstanceOf[js.Any])
    
    inline def setFullResponseUndefined: Self = StObject.set(x, "fullResponse", js.undefined)
    
    inline def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setNoResponse(value: Boolean): Self = StObject.set(x, "noResponse", value.asInstanceOf[js.Any])
    
    inline def setNoResponseUndefined: Self = StObject.set(x, "noResponse", js.undefined)
    
    inline def setReadConcern(value: ReadConcernLike): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    inline def setRetryWrites(value: Boolean): Self = StObject.set(x, "retryWrites", value.asInstanceOf[js.Any])
    
    inline def setRetryWritesUndefined: Self = StObject.set(x, "retryWrites", js.undefined)
  }
}
