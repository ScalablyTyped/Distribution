package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoHaystackSearchOptions extends StObject {
  
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  var maxDistance: js.UndefOr[scala.Double] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var search: js.UndefOr[js.Object] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object GeoHaystackSearchOptions {
  
  inline def apply(): GeoHaystackSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoHaystackSearchOptions]
  }
  
  extension [Self <: GeoHaystackSearchOptions](x: Self) {
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMaxDistance(value: scala.Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSearch(value: js.Object): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
