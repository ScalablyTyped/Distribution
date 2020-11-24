package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathFilter extends js.Object {
  
  /** Filter on an event to be applied to some part of the path. */
  var eventFilters: js.UndefOr[js.Array[EventFilter]] = js.native
  
  /** Indicates the position of the path the filter should match to (first, last, or any event in path). */
  var pathMatchPosition: js.UndefOr[String] = js.native
}
object PathFilter {
  
  @scala.inline
  def apply(): PathFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFilter]
  }
  
  @scala.inline
  implicit class PathFilterOps[Self <: PathFilter] (val x: Self) extends AnyVal {
    
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
    def setEventFiltersVarargs(value: EventFilter*): Self = this.set("eventFilters", js.Array(value :_*))
    
    @scala.inline
    def setEventFilters(value: js.Array[EventFilter]): Self = this.set("eventFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventFilters: Self = this.set("eventFilters", js.undefined)
    
    @scala.inline
    def setPathMatchPosition(value: String): Self = this.set("pathMatchPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathMatchPosition: Self = this.set("pathMatchPosition", js.undefined)
  }
}
