package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathQueryOptions extends StObject {
  
  /** Custom Channel Groupings. */
  var channelGrouping: js.UndefOr[ChannelGrouping] = js.native
  
  /** Path Filters. There is a limit of 100 path filters that can be set per report. */
  var pathFilters: js.UndefOr[js.Array[PathFilter]] = js.native
}
object PathQueryOptions {
  
  @scala.inline
  def apply(): PathQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathQueryOptions]
  }
  
  @scala.inline
  implicit class PathQueryOptionsMutableBuilder[Self <: PathQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelGrouping(value: ChannelGrouping): Self = StObject.set(x, "channelGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelGroupingUndefined: Self = StObject.set(x, "channelGrouping", js.undefined)
    
    @scala.inline
    def setPathFilters(value: js.Array[PathFilter]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathFiltersUndefined: Self = StObject.set(x, "pathFilters", js.undefined)
    
    @scala.inline
    def setPathFiltersVarargs(value: PathFilter*): Self = StObject.set(x, "pathFilters", js.Array(value :_*))
  }
}
