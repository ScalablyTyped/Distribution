package typings.pixiDotJs.PIXI.glCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  /**
    * Boolean that indicates if the canvas contains an alpha buffer.
    */
  var alpha: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean that indicates whether or not to perform anti-aliasing.
    */
  var antialias: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean that indicates that the drawing buffer has a depth buffer of at least 16 bits.
    */
  var depth: js.UndefOr[Boolean] = js.undefined
  /**
    *  Boolean that indicates if a context will be created if the system performance is low.
    */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean that indicates that the page compositor will assume the drawing buffer contains colors with pre-multiplied alpha.
    */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
  /**
    * If the value is true the buffers will not be cleared and will preserve their values until cleared or overwritten by the author.
    */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean that indicates that the drawing buffer has a stencil buffer of at least 8 bits.
    */
  var stencil: js.UndefOr[Boolean] = js.undefined
}

object ContextOptions {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Boolean] = js.undefined,
    antialias: js.UndefOr[Boolean] = js.undefined,
    depth: js.UndefOr[Boolean] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    stencil: js.UndefOr[Boolean] = js.undefined
  ): ContextOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth)
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat)
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil)
    __obj.asInstanceOf[ContextOptions]
  }
}

