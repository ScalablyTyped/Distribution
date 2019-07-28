package typings.pixiDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: Boolean
  var antiAlias: js.UndefOr[Boolean] = js.undefined
  var premultipliedAlpha: Boolean
  var preseveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  var stencil: Boolean
}

object Anon_Alpha {
  @scala.inline
  def apply(
    alpha: Boolean,
    premultipliedAlpha: Boolean,
    stencil: Boolean,
    antiAlias: js.UndefOr[Boolean] = js.undefined,
    preseveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha, premultipliedAlpha = premultipliedAlpha, stencil = stencil)
    if (!js.isUndefined(antiAlias)) __obj.updateDynamic("antiAlias")(antiAlias)
    if (!js.isUndefined(preseveDrawingBuffer)) __obj.updateDynamic("preseveDrawingBuffer")(preseveDrawingBuffer)
    __obj.asInstanceOf[Anon_Alpha]
  }
}

