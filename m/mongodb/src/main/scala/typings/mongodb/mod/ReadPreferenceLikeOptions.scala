package typings.mongodb.mod

import typings.mongodb.anon.MaxStalenessSeconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPreferenceLikeOptions
  extends StObject
     with ReadPreferenceOptions {
  
  var readPreference: js.UndefOr[ReadPreferenceLike | MaxStalenessSeconds] = js.undefined
}
object ReadPreferenceLikeOptions {
  
  inline def apply(): ReadPreferenceLikeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPreferenceLikeOptions]
  }
  
  extension [Self <: ReadPreferenceLikeOptions](x: Self) {
    
    inline def setReadPreference(value: ReadPreferenceLike | MaxStalenessSeconds): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
