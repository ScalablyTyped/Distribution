package typings.poi.mod.Config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assets extends js.Object {
  var inlineImageMaxSize: js.UndefOr[Double] = js.undefined
}

object Assets {
  @scala.inline
  def apply(inlineImageMaxSize: js.UndefOr[Double] = js.undefined): Assets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inlineImageMaxSize)) __obj.updateDynamic("inlineImageMaxSize")(inlineImageMaxSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
}

