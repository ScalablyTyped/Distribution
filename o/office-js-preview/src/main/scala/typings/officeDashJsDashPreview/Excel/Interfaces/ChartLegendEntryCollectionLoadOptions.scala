package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of legendEntries.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait ChartLegendEntryCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the height of the legendEntry on the chart legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the index of the legendEntry in the chart legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  var index: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the left of a chart legendEntry.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the top of a chart legendEntry.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the visible of a chart legend entry.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the width of the legendEntry on the chart Legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.native
}

