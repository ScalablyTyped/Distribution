package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPageObject extends js.Object {
  var content: js.UndefOr[String | Null] = js.undefined
  var page: String
  var preventClose: js.UndefOr[Boolean] = js.undefined
  var readyDelay: js.UndefOr[Double] = js.undefined
}

object PhononPageObject {
  @scala.inline
  def apply(
    page: String,
    content: String = null,
    preventClose: js.UndefOr[Boolean] = js.undefined,
    readyDelay: Int | Double = null
  ): PhononPageObject = {
    val __obj = js.Dynamic.literal(page = page)
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(preventClose)) __obj.updateDynamic("preventClose")(preventClose)
    if (readyDelay != null) __obj.updateDynamic("readyDelay")(readyDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononPageObject]
  }
}

