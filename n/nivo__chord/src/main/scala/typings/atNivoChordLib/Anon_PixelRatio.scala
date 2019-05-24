package typings
package atNivoChordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PixelRatio extends js.Object {
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
}

object Anon_PixelRatio {
  @scala.inline
  def apply(pixelRatio: scala.Int | scala.Double = null): Anon_PixelRatio = {
    val __obj = js.Dynamic.literal()
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PixelRatio]
  }
}

