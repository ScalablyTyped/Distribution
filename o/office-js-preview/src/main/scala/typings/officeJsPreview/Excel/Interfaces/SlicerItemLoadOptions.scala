package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a slicer item in a slicer.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait SlicerItemLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if the slicer item has data.
    *
    * [Api set: ExcelApi 1.10]
    */
  var hasData: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if the slicer item is selected.
    Setting this value will not clear other SlicerItems' selected state.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
    *
    * [Api set: ExcelApi 1.10]
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the unique value representing the slicer item.
    *
    * [Api set: ExcelApi 1.10]
    */
  var key: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the title displayed in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[Boolean] = js.native
}

