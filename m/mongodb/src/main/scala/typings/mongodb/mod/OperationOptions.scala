package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationOptions
  extends StObject
     with BSONSerializeOptions {
  
  /* Excluded from this release type: bypassPinningCheck */
  var omitReadPreference: js.UndefOr[Boolean] = js.undefined
  
  /** The preferred read preference (ReadPreference.primary, ReadPreference.primary_preferred, ReadPreference.secondary, ReadPreference.secondary_preferred, ReadPreference.nearest). */
  var readPreference: js.UndefOr[ReadPreferenceLike] = js.undefined
  
  /** Specify ClientSession for this command */
  var session: js.UndefOr[ClientSession] = js.undefined
  
  var willRetryWrite: js.UndefOr[Boolean] = js.undefined
}
object OperationOptions {
  
  inline def apply(): OperationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationOptions] (val x: Self) extends AnyVal {
    
    inline def setOmitReadPreference(value: Boolean): Self = StObject.set(x, "omitReadPreference", value.asInstanceOf[js.Any])
    
    inline def setOmitReadPreferenceUndefined: Self = StObject.set(x, "omitReadPreference", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceLike): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setWillRetryWrite(value: Boolean): Self = StObject.set(x, "willRetryWrite", value.asInstanceOf[js.Any])
    
    inline def setWillRetryWriteUndefined: Self = StObject.set(x, "willRetryWrite", js.undefined)
  }
}
