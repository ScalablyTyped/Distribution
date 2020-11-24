package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFilter extends js.Object {
  
  /** Filter on a dimension. */
  var dimensionFilter: js.UndefOr[PathQueryOptionsFilter] = js.native
}
object EventFilter {
  
  @scala.inline
  def apply(): EventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFilter]
  }
  
  @scala.inline
  implicit class EventFilterOps[Self <: EventFilter] (val x: Self) extends AnyVal {
    
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
    def setDimensionFilter(value: PathQueryOptionsFilter): Self = this.set("dimensionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilter: Self = this.set("dimensionFilter", js.undefined)
  }
}
