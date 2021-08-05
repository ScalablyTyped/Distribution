package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathQueryOptions extends StObject {
  
  /** Custom Channel Groupings. */
  var channelGrouping: js.UndefOr[ChannelGrouping] = js.undefined
  
  /** Path Filters. There is a limit of 100 path filters that can be set per report. */
  var pathFilters: js.UndefOr[js.Array[PathFilter]] = js.undefined
}
object PathQueryOptions {
  
  inline def apply(): PathQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathQueryOptions]
  }
  
  extension [Self <: PathQueryOptions](x: Self) {
    
    inline def setChannelGrouping(value: ChannelGrouping): Self = StObject.set(x, "channelGrouping", value.asInstanceOf[js.Any])
    
    inline def setChannelGroupingUndefined: Self = StObject.set(x, "channelGrouping", js.undefined)
    
    inline def setPathFilters(value: js.Array[PathFilter]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    inline def setPathFiltersUndefined: Self = StObject.set(x, "pathFilters", js.undefined)
    
    inline def setPathFiltersVarargs(value: PathFilter*): Self = StObject.set(x, "pathFilters", js.Array(value :_*))
  }
}
