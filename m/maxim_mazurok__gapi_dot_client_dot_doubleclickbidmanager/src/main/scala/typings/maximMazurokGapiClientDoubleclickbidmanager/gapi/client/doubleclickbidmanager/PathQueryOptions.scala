package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathQueryOptions extends js.Object {
  
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
  implicit class PathQueryOptionsOps[Self <: PathQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelGrouping(value: ChannelGrouping): Self = this.set("channelGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelGrouping: Self = this.set("channelGrouping", js.undefined)
    
    @scala.inline
    def setPathFiltersVarargs(value: PathFilter*): Self = this.set("pathFilters", js.Array(value :_*))
    
    @scala.inline
    def setPathFilters(value: js.Array[PathFilter]): Self = this.set("pathFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathFilters: Self = this.set("pathFilters", js.undefined)
  }
}
