package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the properties of a box and whisker chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartBoxwhiskerOptionsLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the quartile calculation type of a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the inner points are shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the mean line is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the mean marker is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not outlier points are shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.native
}

