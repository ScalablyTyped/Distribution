package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the necessary strings to get/set a hyperlink (XHL) object.
  *
  * [Api set: ExcelApi 1.7]
  */
trait RangeHyperlink extends js.Object {
  /**
    *
    * Represents the url target for the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the document reference target for the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var documentReference: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the string displayed when hovering over the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var screenTip: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the string that is displayed in the top left most cell in the range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textToDisplay: js.UndefOr[java.lang.String] = js.undefined
}

