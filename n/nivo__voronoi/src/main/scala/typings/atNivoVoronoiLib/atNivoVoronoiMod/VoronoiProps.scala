package typings
package atNivoVoronoiLib.atNivoVoronoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiProps extends js.Object {
  var cellLineColor: js.UndefOr[java.lang.String] = js.undefined
  var cellLineWidth: js.UndefOr[scala.Double] = js.undefined
  var data: js.Array[VoronoiDatum]
  var enableCells: js.UndefOr[scala.Boolean] = js.undefined
  var enableLinks: js.UndefOr[scala.Boolean] = js.undefined
  var enablePoints: js.UndefOr[scala.Boolean] = js.undefined
  var layers: js.UndefOr[
    js.Array[
      atNivoVoronoiLib.atNivoVoronoiLibStrings.links | atNivoVoronoiLib.atNivoVoronoiLibStrings.cells | atNivoVoronoiLib.atNivoVoronoiLibStrings.points | atNivoVoronoiLib.atNivoVoronoiLibStrings.bounds | VoronoiCustomLayer
    ]
  ] = js.undefined
  var linkLineColor: js.UndefOr[java.lang.String] = js.undefined
  var linkLineWidth: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Box] = js.undefined
  var pointColor: js.UndefOr[java.lang.String] = js.undefined
  var pointSize: js.UndefOr[scala.Double] = js.undefined
  var theme: js.UndefOr[atNivoCoreLib.atNivoCoreMod.Theme] = js.undefined
  var xDomain: js.UndefOr[VoronoiDomain] = js.undefined
  var yDomain: js.UndefOr[VoronoiDomain] = js.undefined
}

object VoronoiProps {
  @scala.inline
  def apply(
    data: js.Array[VoronoiDatum],
    cellLineColor: java.lang.String = null,
    cellLineWidth: scala.Int | scala.Double = null,
    enableCells: js.UndefOr[scala.Boolean] = js.undefined,
    enableLinks: js.UndefOr[scala.Boolean] = js.undefined,
    enablePoints: js.UndefOr[scala.Boolean] = js.undefined,
    layers: js.Array[
      atNivoVoronoiLib.atNivoVoronoiLibStrings.links | atNivoVoronoiLib.atNivoVoronoiLibStrings.cells | atNivoVoronoiLib.atNivoVoronoiLibStrings.points | atNivoVoronoiLib.atNivoVoronoiLibStrings.bounds | VoronoiCustomLayer
    ] = null,
    linkLineColor: java.lang.String = null,
    linkLineWidth: scala.Int | scala.Double = null,
    margin: atNivoCoreLib.atNivoCoreMod.Box = null,
    pointColor: java.lang.String = null,
    pointSize: scala.Int | scala.Double = null,
    theme: atNivoCoreLib.atNivoCoreMod.Theme = null,
    xDomain: VoronoiDomain = null,
    yDomain: VoronoiDomain = null
  ): VoronoiProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (cellLineColor != null) __obj.updateDynamic("cellLineColor")(cellLineColor)
    if (cellLineWidth != null) __obj.updateDynamic("cellLineWidth")(cellLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCells)) __obj.updateDynamic("enableCells")(enableCells)
    if (!js.isUndefined(enableLinks)) __obj.updateDynamic("enableLinks")(enableLinks)
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (linkLineColor != null) __obj.updateDynamic("linkLineColor")(linkLineColor)
    if (linkLineWidth != null) __obj.updateDynamic("linkLineWidth")(linkLineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor)
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (xDomain != null) __obj.updateDynamic("xDomain")(xDomain)
    if (yDomain != null) __obj.updateDynamic("yDomain")(yDomain)
    __obj.asInstanceOf[VoronoiProps]
  }
}

