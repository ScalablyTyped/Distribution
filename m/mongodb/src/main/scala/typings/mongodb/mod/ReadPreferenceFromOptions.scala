package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPreferenceFromOptions
  extends StObject
     with ReadPreferenceLikeOptions {
  
  var readPreferenceTags: js.UndefOr[js.Array[TagSet]] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object ReadPreferenceFromOptions {
  
  inline def apply(): ReadPreferenceFromOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPreferenceFromOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadPreferenceFromOptions] (val x: Self) extends AnyVal {
    
    inline def setReadPreferenceTags(value: js.Array[TagSet]): Self = StObject.set(x, "readPreferenceTags", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceTagsUndefined: Self = StObject.set(x, "readPreferenceTags", js.undefined)
    
    inline def setReadPreferenceTagsVarargs(value: TagSet*): Self = StObject.set(x, "readPreferenceTags", js.Array(value*))
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
