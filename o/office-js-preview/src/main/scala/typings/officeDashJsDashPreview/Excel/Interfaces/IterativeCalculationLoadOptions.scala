package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Iterative Calculation settings.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait IterativeCalculationLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if Excel will use iteration to resolve circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the maximum amount of change between each iteration as Excel resolves circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxChange: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the maximum number of iterations that Excel can use to resolve a circular reference.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxIteration: js.UndefOr[Boolean] = js.native
}

