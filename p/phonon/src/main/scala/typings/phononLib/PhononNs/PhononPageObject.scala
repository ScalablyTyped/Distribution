package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPageObject extends js.Object {
  var content: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var page: java.lang.String
  var preventClose: js.UndefOr[scala.Boolean] = js.undefined
  var readyDelay: js.UndefOr[scala.Double] = js.undefined
}

object PhononPageObject {
  @scala.inline
  def apply(
    page: java.lang.String,
    content: java.lang.String = null,
    preventClose: js.UndefOr[scala.Boolean] = js.undefined,
    readyDelay: scala.Int | scala.Double = null
  ): PhononPageObject = {
    val __obj = js.Dynamic.literal(page = page)
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(preventClose)) __obj.updateDynamic("preventClose")(preventClose)
    if (readyDelay != null) __obj.updateDynamic("readyDelay")(readyDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononPageObject]
  }
}

