package typings.poi.poiMod.Config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assets extends js.Object {
  var inlineImageMaxSize: js.UndefOr[Double] = js.undefined
}

object Assets {
  @scala.inline
  def apply(inlineImageMaxSize: Int | Double = null): Assets = {
    val __obj = js.Dynamic.literal()
    if (inlineImageMaxSize != null) __obj.updateDynamic("inlineImageMaxSize")(inlineImageMaxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
}

