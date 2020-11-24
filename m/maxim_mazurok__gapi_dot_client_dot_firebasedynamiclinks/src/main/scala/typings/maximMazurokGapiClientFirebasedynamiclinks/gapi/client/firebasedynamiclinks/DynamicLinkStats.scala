package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicLinkStats extends js.Object {
  
  /** Dynamic Link event stats. */
  var linkEventStats: js.UndefOr[js.Array[DynamicLinkEventStat]] = js.native
}
object DynamicLinkStats {
  
  @scala.inline
  def apply(): DynamicLinkStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkStats]
  }
  
  @scala.inline
  implicit class DynamicLinkStatsOps[Self <: DynamicLinkStats] (val x: Self) extends AnyVal {
    
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
    def setLinkEventStatsVarargs(value: DynamicLinkEventStat*): Self = this.set("linkEventStats", js.Array(value :_*))
    
    @scala.inline
    def setLinkEventStats(value: js.Array[DynamicLinkEventStat]): Self = this.set("linkEventStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkEventStats: Self = this.set("linkEventStats", js.undefined)
  }
}
