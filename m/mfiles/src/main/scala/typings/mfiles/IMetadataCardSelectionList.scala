package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardSelectionList extends js.Object {
  
  def AutoSelect(identifier: String): Unit = js.native
  
  val Events: IEvents = js.native
  
  val Filter: String = js.native
  
  val FilteringValue: String = js.native
  
  val Items: js.Any = js.native
  
  val MoreResults: Boolean = js.native
  
  def SetFilter(Filter: String, token: Double, maxResults: Double): Unit = js.native
}
object IMetadataCardSelectionList {
  
  @scala.inline
  def apply(
    AutoSelect: String => Unit,
    Events: IEvents,
    Filter: String,
    FilteringValue: String,
    Items: js.Any,
    MoreResults: Boolean,
    SetFilter: (String, Double, Double) => Unit
  ): IMetadataCardSelectionList = {
    val __obj = js.Dynamic.literal(AutoSelect = js.Any.fromFunction1(AutoSelect), Events = Events.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FilteringValue = FilteringValue.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any], SetFilter = js.Any.fromFunction3(SetFilter))
    __obj.asInstanceOf[IMetadataCardSelectionList]
  }
  
  @scala.inline
  implicit class IMetadataCardSelectionListOps[Self <: IMetadataCardSelectionList] (val x: Self) extends AnyVal {
    
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
    def setAutoSelect(value: String => Unit): Self = this.set("AutoSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvents(value: IEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteringValue(value: String): Self = this.set("FilteringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Any): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreResults(value: Boolean): Self = this.set("MoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFilter(value: (String, Double, Double) => Unit): Self = this.set("SetFilter", js.Any.fromFunction3(value))
  }
}
