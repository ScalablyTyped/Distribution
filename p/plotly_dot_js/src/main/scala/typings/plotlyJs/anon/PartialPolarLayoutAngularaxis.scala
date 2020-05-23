package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.circular
import typings.plotlyJs.plotlyJsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.PolarLayout> */
trait PartialPolarLayoutAngularaxis extends js.Object {
  var angularaxis: js.UndefOr[PartialLayoutAxisAngle] = js.undefined
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var domain: js.UndefOr[PartialDomain] = js.undefined
  var gridshape: js.UndefOr[circular | linear] = js.undefined
  var hole: js.UndefOr[Double] = js.undefined
  var radialaxis: js.UndefOr[PartialLayoutAxisAngle] = js.undefined
  var sector: js.UndefOr[js.Array[Double]] = js.undefined
  var uirevision: js.UndefOr[String | Double] = js.undefined
}

object PartialPolarLayoutAngularaxis {
  @scala.inline
  def apply(
    angularaxis: PartialLayoutAxisAngle = null,
    bgcolor: typings.plotlyJs.mod.Color = null,
    domain: PartialDomain = null,
    gridshape: circular | linear = null,
    hole: js.UndefOr[Double] = js.undefined,
    radialaxis: PartialLayoutAxisAngle = null,
    sector: js.Array[Double] = null,
    uirevision: String | Double = null
  ): PartialPolarLayoutAngularaxis = {
    val __obj = js.Dynamic.literal()
    if (angularaxis != null) __obj.updateDynamic("angularaxis")(angularaxis.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (gridshape != null) __obj.updateDynamic("gridshape")(gridshape.asInstanceOf[js.Any])
    if (!js.isUndefined(hole)) __obj.updateDynamic("hole")(hole.get.asInstanceOf[js.Any])
    if (radialaxis != null) __obj.updateDynamic("radialaxis")(radialaxis.asInstanceOf[js.Any])
    if (sector != null) __obj.updateDynamic("sector")(sector.asInstanceOf[js.Any])
    if (uirevision != null) __obj.updateDynamic("uirevision")(uirevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPolarLayoutAngularaxis]
  }
}

