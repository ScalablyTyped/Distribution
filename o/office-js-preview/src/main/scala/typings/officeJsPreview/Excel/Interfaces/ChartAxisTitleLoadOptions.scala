package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the title of a chart axis.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAxisTitleLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the formatting of chart axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisTitleFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the angle to which the text is oriented for the chart axis title. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * A boolean that specifies the visibility of an axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartAxisTitleLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    format: ChartAxisTitleFormatLoadOptions = null,
    text: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartAxisTitleLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisTitleLoadOptions]
  }
}

