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

object RangeHyperlink {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    documentReference: java.lang.String = null,
    screenTip: java.lang.String = null,
    textToDisplay: java.lang.String = null
  ): RangeHyperlink = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (documentReference != null) __obj.updateDynamic("documentReference")(documentReference)
    if (screenTip != null) __obj.updateDynamic("screenTip")(screenTip)
    if (textToDisplay != null) __obj.updateDynamic("textToDisplay")(textToDisplay)
    __obj.asInstanceOf[RangeHyperlink]
  }
}

