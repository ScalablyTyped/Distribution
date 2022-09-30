package typings.mongodb.anon

import typings.mongodb.mod.ReadPreferenceMode
import typings.mongodb.mod.TagSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxStalenessSeconds extends StObject {
  
  var maxStalenessSeconds: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[ReadPreferenceMode] = js.undefined
  
  var preference: js.UndefOr[ReadPreferenceMode] = js.undefined
  
  var tags: js.UndefOr[js.Array[TagSet]] = js.undefined
}
object MaxStalenessSeconds {
  
  inline def apply(): MaxStalenessSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxStalenessSeconds]
  }
  
  extension [Self <: MaxStalenessSeconds](x: Self) {
    
    inline def setMaxStalenessSeconds(value: Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
    
    inline def setMode(value: ReadPreferenceMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPreference(value: ReadPreferenceMode): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setTags(value: js.Array[TagSet]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: TagSet*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
