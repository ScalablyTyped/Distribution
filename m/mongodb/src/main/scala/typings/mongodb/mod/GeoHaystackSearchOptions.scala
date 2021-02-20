package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoHaystackSearchOptions extends StObject {
  
  var limit: js.UndefOr[scala.Double] = js.native
  
  var maxDistance: js.UndefOr[scala.Double] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  var search: js.UndefOr[js.Object] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
}
object GeoHaystackSearchOptions {
  
  @scala.inline
  def apply(): GeoHaystackSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoHaystackSearchOptions]
  }
  
  @scala.inline
  implicit class GeoHaystackSearchOptionsMutableBuilder[Self <: GeoHaystackSearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMaxDistance(value: scala.Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSearch(value: js.Object): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
