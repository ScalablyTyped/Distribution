package typings.mongodb.anon

import typings.mongodb.mod.ReadPreferenceOrMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxTimeMS extends StObject {
  
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
}
object MaxTimeMS {
  
  inline def apply(): MaxTimeMS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimeMS]
  }
  
  extension [Self <: MaxTimeMS](x: Self) {
    
    inline def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
