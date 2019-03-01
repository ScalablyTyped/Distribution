package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: scala.Boolean
  var antiAlias: js.UndefOr[scala.Boolean] = js.undefined
  var premultipliedAlpha: scala.Boolean
  var preseveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var stencil: scala.Boolean
}

object Anon_Alpha {
  @scala.inline
  def apply(
    alpha: scala.Boolean,
    premultipliedAlpha: scala.Boolean,
    stencil: scala.Boolean,
    antiAlias: js.UndefOr[scala.Boolean] = js.undefined,
    preseveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    __obj.updateDynamic("stencil")(stencil)
    if (!js.isUndefined(antiAlias)) __obj.updateDynamic("antiAlias")(antiAlias)
    if (!js.isUndefined(preseveDrawingBuffer)) __obj.updateDynamic("preseveDrawingBuffer")(preseveDrawingBuffer)
    __obj.asInstanceOf[Anon_Alpha]
  }
}

