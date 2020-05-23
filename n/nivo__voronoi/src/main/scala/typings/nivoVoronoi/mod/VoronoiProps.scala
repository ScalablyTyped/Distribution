package typings.nivoVoronoi.mod

import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Theme
import typings.nivoVoronoi.nivoVoronoiStrings.bounds
import typings.nivoVoronoi.nivoVoronoiStrings.cells
import typings.nivoVoronoi.nivoVoronoiStrings.links
import typings.nivoVoronoi.nivoVoronoiStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiProps extends js.Object {
  var cellLineColor: js.UndefOr[String] = js.undefined
  var cellLineWidth: js.UndefOr[Double] = js.undefined
  var data: js.Array[VoronoiDatum]
  var enableCells: js.UndefOr[Boolean] = js.undefined
  var enableLinks: js.UndefOr[Boolean] = js.undefined
  var enablePoints: js.UndefOr[Boolean] = js.undefined
  var layers: js.UndefOr[js.Array[links | cells | points | bounds | VoronoiCustomLayer]] = js.undefined
  var linkLineColor: js.UndefOr[String] = js.undefined
  var linkLineWidth: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var pointColor: js.UndefOr[String] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var xDomain: js.UndefOr[VoronoiDomain] = js.undefined
  var yDomain: js.UndefOr[VoronoiDomain] = js.undefined
}

object VoronoiProps {
  @scala.inline
  def apply(
    data: js.Array[VoronoiDatum],
    cellLineColor: String = null,
    cellLineWidth: js.UndefOr[Double] = js.undefined,
    enableCells: js.UndefOr[Boolean] = js.undefined,
    enableLinks: js.UndefOr[Boolean] = js.undefined,
    enablePoints: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[links | cells | points | bounds | VoronoiCustomLayer] = null,
    linkLineColor: String = null,
    linkLineWidth: js.UndefOr[Double] = js.undefined,
    margin: Box = null,
    pointColor: String = null,
    pointSize: js.UndefOr[Double] = js.undefined,
    theme: Theme = null,
    xDomain: VoronoiDomain = null,
    yDomain: VoronoiDomain = null
  ): VoronoiProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (cellLineColor != null) __obj.updateDynamic("cellLineColor")(cellLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(cellLineWidth)) __obj.updateDynamic("cellLineWidth")(cellLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCells)) __obj.updateDynamic("enableCells")(enableCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinks)) __obj.updateDynamic("enableLinks")(enableLinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints.get.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (linkLineColor != null) __obj.updateDynamic("linkLineColor")(linkLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(linkLineWidth)) __obj.updateDynamic("linkLineWidth")(linkLineWidth.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (!js.isUndefined(pointSize)) __obj.updateDynamic("pointSize")(pointSize.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (xDomain != null) __obj.updateDynamic("xDomain")(xDomain.asInstanceOf[js.Any])
    if (yDomain != null) __obj.updateDynamic("yDomain")(yDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiProps]
  }
}

