package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardSelectionList extends js.Object {
  val Events: IEvents
  val Filter: String
  val FilteringValue: String
  val Items: js.Any
  val MoreResults: Boolean
  def AutoSelect(identifier: String): Unit
  def SetFilter(Filter: String, token: Double, maxResults: Double): Unit
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
    val __obj = js.Dynamic.literal(AutoSelect = js.Any.fromFunction1(AutoSelect), Events = Events, Filter = Filter, FilteringValue = FilteringValue, Items = Items, MoreResults = MoreResults, SetFilter = js.Any.fromFunction3(SetFilter))
  
    __obj.asInstanceOf[IMetadataCardSelectionList]
  }
}

