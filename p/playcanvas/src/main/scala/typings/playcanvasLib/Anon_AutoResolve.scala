package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoResolve extends js.Object {
  var autoResolve: js.UndefOr[scala.Boolean] = js.undefined
  var colorBuffer: js.UndefOr[playcanvasLib.pcNs.Texture] = js.undefined
  var depth: js.UndefOr[scala.Boolean] = js.undefined
  var depthBuffer: js.UndefOr[playcanvasLib.pcNs.Texture] = js.undefined
  var face: js.UndefOr[scala.Double] = js.undefined
  var samples: js.UndefOr[scala.Double] = js.undefined
  var stencil: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AutoResolve {
  @scala.inline
  def apply(
    autoResolve: js.UndefOr[scala.Boolean] = js.undefined,
    colorBuffer: playcanvasLib.pcNs.Texture = null,
    depth: js.UndefOr[scala.Boolean] = js.undefined,
    depthBuffer: playcanvasLib.pcNs.Texture = null,
    face: scala.Int | scala.Double = null,
    samples: scala.Int | scala.Double = null,
    stencil: js.UndefOr[scala.Boolean] = js.undefined
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

