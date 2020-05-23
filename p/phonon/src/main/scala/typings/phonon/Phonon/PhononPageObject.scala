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
    content: js.UndefOr[Null | String] = js.undefined,
    preventClose: js.UndefOr[Boolean] = js.undefined,
    readyDelay: js.UndefOr[Double] = js.undefined
  ): PhononPageObject = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(preventClose)) __obj.updateDynamic("preventClose")(preventClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readyDelay)) __obj.updateDynamic("readyDelay")(readyDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononPageObject]
  }
}

