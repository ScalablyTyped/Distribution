package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexInformationOptions extends StObject {
  
  var full: js.UndefOr[Boolean] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreference] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object IndexInformationOptions {
  
  inline def apply(): IndexInformationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexInformationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexInformationOptions] (val x: Self) extends AnyVal {
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setReadPreference(value: ReadPreference): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
