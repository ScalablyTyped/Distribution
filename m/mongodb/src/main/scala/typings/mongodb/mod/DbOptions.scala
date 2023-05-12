package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbOptions
  extends StObject
     with BSONSerializeOptions
     with WriteConcernOptions {
  
  /** If the database authentication is dependent on another databaseName. */
  var authSource: js.UndefOr[String] = js.undefined
  
  /** Force server to assign _id values instead of driver. */
  var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
  
  /** A primary key factory object for generation of custom _id keys. */
  var pkFactory: js.UndefOr[PkFactory] = js.undefined
  
  /** Specify a read concern for the collection. (only MongoDB 3.2 or higher supported) */
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  
  /** The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED, ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST). */
  var readPreference: js.UndefOr[ReadPreferenceLike] = js.undefined
  
  /** Should retry failed writes */
  var retryWrites: js.UndefOr[Boolean] = js.undefined
}
object DbOptions {
  
  inline def apply(): DbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DbOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
    
    inline def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
    
    inline def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
    
    inline def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
    
    inline def setPkFactory(value: PkFactory): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
    
    inline def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
    
    inline def setReadConcern(value: ReadConcern): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceLike): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setRetryWrites(value: Boolean): Self = StObject.set(x, "retryWrites", value.asInstanceOf[js.Any])
    
    inline def setRetryWritesUndefined: Self = StObject.set(x, "retryWrites", js.undefined)
  }
}
