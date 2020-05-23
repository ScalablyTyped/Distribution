package typings.playcanvas.anon

import typings.playcanvas.pc.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoResolve extends js.Object {
  var autoResolve: js.UndefOr[Boolean] = js.undefined
  var colorBuffer: js.UndefOr[Texture] = js.undefined
  var depth: js.UndefOr[Boolean] = js.undefined
  var depthBuffer: js.UndefOr[Texture] = js.undefined
  var face: js.UndefOr[Double] = js.undefined
  var samples: js.UndefOr[Double] = js.undefined
  var stencil: js.UndefOr[Boolean] = js.undefined
}

object AutoResolve {
  @scala.inline
  def apply(
    autoResolve: js.UndefOr[Boolean] = js.undefined,
    colorBuffer: Texture = null,
    depth: js.UndefOr[Boolean] = js.undefined,
    depthBuffer: Texture = null,
    face: js.UndefOr[Double] = js.undefined,
    samples: js.UndefOr[Double] = js.undefined,
    stencil: js.UndefOr[Boolean] = js.undefined
  ): AutoResolve = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResolve)) __obj.updateDynamic("autoResolve")(autoResolve.get.asInstanceOf[js.Any])
    if (colorBuffer != null) __obj.updateDynamic("colorBuffer")(colorBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (depthBuffer != null) __obj.updateDynamic("depthBuffer")(depthBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(face)) __obj.updateDynamic("face")(face.get.asInstanceOf[js.Any])
    if (!js.isUndefined(samples)) __obj.updateDynamic("samples")(samples.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoResolve]
  }
}

