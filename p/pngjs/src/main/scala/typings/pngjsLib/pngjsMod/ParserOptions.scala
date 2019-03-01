package typings
package pngjsLib.pngjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var checkCRC: js.UndefOr[scala.Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(checkCRC: js.UndefOr[scala.Boolean] = js.undefined): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkCRC)) __obj.updateDynamic("checkCRC")(checkCRC)
    __obj.asInstanceOf[ParserOptions]
  }
}

