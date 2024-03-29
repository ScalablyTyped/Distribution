package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardSelectionList extends StObject {
  
  def AutoSelect(identifier: String): Unit
  
  val Events: IEvents
  
  val Filter: String
  
  val FilteringValue: String
  
  val Items: Any
  
  val MoreResults: Boolean
  
  def SetFilter(Filter: String, token: Double, maxResults: Double): Unit
}
object IMetadataCardSelectionList {
  
  inline def apply(
    AutoSelect: String => Unit,
    Events: IEvents,
    Filter: String,
    FilteringValue: String,
    Items: Any,
    MoreResults: Boolean,
    SetFilter: (String, Double, Double) => Unit
  ): IMetadataCardSelectionList = {
    val __obj = js.Dynamic.literal(AutoSelect = js.Any.fromFunction1(AutoSelect), Events = Events.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FilteringValue = FilteringValue.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any], SetFilter = js.Any.fromFunction3(SetFilter))
    __obj.asInstanceOf[IMetadataCardSelectionList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMetadataCardSelectionList] (val x: Self) extends AnyVal {
    
    inline def setAutoSelect(value: String => Unit): Self = StObject.set(x, "AutoSelect", js.Any.fromFunction1(value))
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilteringValue(value: String): Self = StObject.set(x, "FilteringValue", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Any): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    inline def setSetFilter(value: (String, Double, Double) => Unit): Self = StObject.set(x, "SetFilter", js.Any.fromFunction3(value))
  }
}
