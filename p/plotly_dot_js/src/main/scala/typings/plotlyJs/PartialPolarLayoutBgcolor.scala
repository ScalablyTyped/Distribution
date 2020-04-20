package typings.plotlyJs

import typings.plotlyJs.mod.Color
import typings.plotlyJs.mod.Domain
import typings.plotlyJs.mod.LayoutAxis
import typings.plotlyJs.plotlyJsStrings.circular
import typings.plotlyJs.plotlyJsStrings.linear
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.PolarLayout> */
trait PartialPolarLayoutBgcolor extends js.Object {
  var angularaxis: js.UndefOr[Partial[LayoutAxis]] = js.undefined
  var bgcolor: js.UndefOr[Color] = js.undefined
  var domain: js.UndefOr[Partial[Domain]] = js.undefined
  var gridshape: js.UndefOr[circular | linear] = js.undefined
  var hole: js.UndefOr[Double] = js.undefined
  var radialaxis: js.UndefOr[Partial[LayoutAxis]] = js.undefined
  var sector: js.UndefOr[js.Array[Double]] = js.undefined
  var uirevision: js.UndefOr[String | Double] = js.undefined
}

object PartialPolarLayoutBgcolor {
  @scala.inline
  def apply(
    angularaxis: Partial[LayoutAxis] = null,
    bgcolor: Color = null,
    domain: Partial[Domain] = null,
    gridshape: circular | linear = null,
    hole: Int | Double = null,
    radialaxis: Partial[LayoutAxis] = null,
    sector: js.Array[Double] = null,
    uirevision: String | Double = null
  ): PartialPolarLayoutBgcolor = {
    val __obj = js.Dynamic.literal()
    if (angularaxis != null) __obj.updateDynamic("angularaxis")(angularaxis.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (gridshape != null) __obj.updateDynamic("gridshape")(gridshape.asInstanceOf[js.Any])
    if (hole != null) __obj.updateDynamic("hole")(hole.asInstanceOf[js.Any])
    if (radialaxis != null) __obj.updateDynamic("radialaxis")(radialaxis.asInstanceOf[js.Any])
    if (sector != null) __obj.updateDynamic("sector")(sector.asInstanceOf[js.Any])
    if (uirevision != null) __obj.updateDynamic("uirevision")(uirevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPolarLayoutBgcolor]
  }
}

