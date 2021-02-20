package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardSelectionList extends StObject {
  
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
  implicit class IMetadataCardSelectionListMutableBuilder[Self <: IMetadataCardSelectionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSelect(value: String => Unit): Self = StObject.set(x, "AutoSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteringValue(value: String): Self = StObject.set(x, "FilteringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFilter(value: (String, Double, Double) => Unit): Self = StObject.set(x, "SetFilter", js.Any.fromFunction3(value))
  }
}
