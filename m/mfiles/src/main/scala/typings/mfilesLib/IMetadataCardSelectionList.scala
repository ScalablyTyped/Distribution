package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardSelectionList extends js.Object {
  val Events: IEvents
  val Filter: java.lang.String
  val FilteringValue: java.lang.String
  val Items: js.Any
  val MoreResults: scala.Boolean
  def AutoSelect(identifier: java.lang.String): scala.Unit
  def SetFilter(Filter: java.lang.String, token: scala.Double, maxResults: scala.Double): scala.Unit
}

object IMetadataCardSelectionList {
  @scala.inline
  def apply(
    AutoSelect: js.Function1[java.lang.String, scala.Unit],
    Events: IEvents,
    Filter: java.lang.String,
    FilteringValue: java.lang.String,
    Items: js.Any,
    MoreResults: scala.Boolean,
    SetFilter: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit]
  ): IMetadataCardSelectionList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutoSelect")(AutoSelect)
    __obj.updateDynamic("Events")(Events)
    __obj.updateDynamic("Filter")(Filter)
    __obj.updateDynamic("FilteringValue")(FilteringValue)
    __obj.updateDynamic("Items")(Items)
    __obj.updateDynamic("MoreResults")(MoreResults)
    __obj.updateDynamic("SetFilter")(SetFilter)
    __obj.asInstanceOf[IMetadataCardSelectionList]
  }
}

