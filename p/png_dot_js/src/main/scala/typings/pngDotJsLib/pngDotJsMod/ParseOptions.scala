package typings
package pngDotJsLib.pngDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var data: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(data: js.UndefOr[scala.Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ParseOptions]
  }
}

