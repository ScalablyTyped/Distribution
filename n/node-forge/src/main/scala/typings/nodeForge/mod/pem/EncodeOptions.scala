package typings.nodeForge.mod.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeOptions extends js.Object {
  var maxline: js.UndefOr[Double] = js.undefined
}

object EncodeOptions {
  @scala.inline
  def apply(maxline: Int | Double = null): EncodeOptions = {
    val __obj = js.Dynamic.literal()
    if (maxline != null) __obj.updateDynamic("maxline")(maxline.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeOptions]
  }
}

