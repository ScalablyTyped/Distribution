package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait CultureInfoLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the culture name in the format languagecode2-country/regioncode2 (e.g. "zh-cn" or "en-us"). This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberFormatInfo: js.UndefOr[NumberFormatInfoLoadOptions] = js.native
}

