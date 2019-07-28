package typings.playcanvas

import typings.playcanvas.pcNs.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoResolve extends js.Object {
  var autoResolve: js.UndefOr[Boolean] = js.undefined
  var colorBuffer: js.UndefOr[Texture] = js.undefined
  var depth: js.UndefOr[Boolean] = js.undefined
  var depthBuffer: js.UndefOr[Texture] = js.undefined
  var face: js.UndefOr[Double] = js.undefined
  var samples: js.UndefOr[Double] = js.undefined
  var stencil: js.UndefOr[Boolean] = js.undefined
}

object Anon_AutoResolve {
  @scala.inline
  def apply(
    autoResolve: js.UndefOr[Boolean] = js.undefined,
    colorBuffer: Texture = null,
    depth: js.UndefOr[Boolean] = js.undefined,
    depthBuffer: Texture = null,
    face: Int | Double = null,
    samples: Int | Double = null,
    stencil: js.UndefOr[Boolean] = js.undefined
  ): Anon_AutoResolve = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResolve)) __obj.updateDynamic("autoResolve")(autoResolve)
    if (colorBuffer != null) __obj.updateDynamic("colorBuffer")(colorBuffer)
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth)
    if (depthBuffer != null) __obj.updateDynamic("depthBuffer")(depthBuffer)
    if (face != null) __obj.updateDynamic("face")(face.asInstanceOf[js.Any])
    if (samples != null) __obj.updateDynamic("samples")(samples.asInstanceOf[js.Any])
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil)
    __obj.asInstanceOf[Anon_AutoResolve]
  }
}

