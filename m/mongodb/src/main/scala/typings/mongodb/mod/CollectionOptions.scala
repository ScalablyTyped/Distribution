package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptions
  extends StObject
     with BSONSerializeOptions
     with WriteConcernOptions
     with LoggerOptions {
  
  /** Specify a read concern for the collection. (only MongoDB 3.2 or higher supported) */
  var readConcern: js.UndefOr[ReadConcernLike] = js.undefined
  
  /** The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED, ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST). */
  var readPreference: js.UndefOr[ReadPreferenceLike] = js.undefined
  
  /**
    * @deprecated Use readPreference instead
    */
  var slaveOk: js.UndefOr[Boolean] = js.undefined
}
object CollectionOptions {
  
  inline def apply(): CollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptions]
  }
  
  extension [Self <: CollectionOptions](x: Self) {
    
    inline def setReadConcern(value: ReadConcernLike): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceLike): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSlaveOk(value: Boolean): Self = StObject.set(x, "slaveOk", value.asInstanceOf[js.Any])
    
    inline def setSlaveOkUndefined: Self = StObject.set(x, "slaveOk", js.undefined)
  }
}
