package typings.nodeForge.mod.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeOptions extends js.Object {
  var maxline: js.UndefOr[Double] = js.undefined
}

object EncodeOptions {
  @scala.inline
  def apply(maxline: js.UndefOr[Double] = js.undefined): EncodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxline)) __obj.updateDynamic("maxline")(maxline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeOptions]
  }
}

