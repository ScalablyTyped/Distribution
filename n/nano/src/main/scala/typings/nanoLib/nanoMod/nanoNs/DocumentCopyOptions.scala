package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentCopyOptions extends js.Object {
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

object DocumentCopyOptions {
  @scala.inline
  def apply(overwrite: js.UndefOr[scala.Boolean] = js.undefined): DocumentCopyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[DocumentCopyOptions]
  }
}

