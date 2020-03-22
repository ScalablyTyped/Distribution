package typings.plotlyJs

import typings.plotlyJs.plotlyJsStrings.above
import typings.plotlyJs.plotlyJsStrings.below
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.contain
import typings.plotlyJs.plotlyJsStrings.fill
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.stretch
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.x
import typings.plotlyJs.plotlyJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Image> */
trait PartialImage extends js.Object {
  var layer: js.UndefOr[above | below] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var sizex: js.UndefOr[Double] = js.undefined
  var sizey: js.UndefOr[Double] = js.undefined
  var sizing: js.UndefOr[fill | contain | stretch] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double | String] = js.undefined
  var xanchor: js.UndefOr[left | center | right] = js.undefined
  var xref: js.UndefOr[paper | x] = js.undefined
  var y: js.UndefOr[Double | String] = js.undefined
  var yanchor: js.UndefOr[top | middle | bottom] = js.undefined
  var yref: js.UndefOr[paper | y] = js.undefined
}

object PartialImage {
  @scala.inline
  def apply(
    layer: above | below = null,
    opacity: Int | Double = null,
    sizex: Int | Double = null,
    sizey: Int | Double = null,
    sizing: fill | contain | stretch = null,
    source: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Double | String = null,
    xanchor: left | center | right = null,
    xref: paper | x = null,
    y: Double | String = null,
    yanchor: top | middle | bottom = null,
    yref: paper | y = null
  ): PartialImage = {
    val __obj = js.Dynamic.literal()
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (sizex != null) __obj.updateDynamic("sizex")(sizex.asInstanceOf[js.Any])
    if (sizey != null) __obj.updateDynamic("sizey")(sizey.asInstanceOf[js.Any])
    if (sizing != null) __obj.updateDynamic("sizing")(sizing.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (xref != null) __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    if (yref != null) __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialImage]
  }
}

