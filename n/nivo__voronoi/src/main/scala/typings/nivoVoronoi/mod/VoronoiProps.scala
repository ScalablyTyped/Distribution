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

@js.native
trait VoronoiProps extends js.Object {
  var cellLineColor: js.UndefOr[String] = js.native
  var cellLineWidth: js.UndefOr[Double] = js.native
  var data: js.Array[VoronoiDatum] = js.native
  var enableCells: js.UndefOr[Boolean] = js.native
  var enableLinks: js.UndefOr[Boolean] = js.native
  var enablePoints: js.UndefOr[Boolean] = js.native
  var layers: js.UndefOr[js.Array[links | cells | points | bounds | VoronoiCustomLayer]] = js.native
  var linkLineColor: js.UndefOr[String] = js.native
  var linkLineWidth: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Box] = js.native
  var pointColor: js.UndefOr[String] = js.native
  var pointSize: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var xDomain: js.UndefOr[VoronoiDomain] = js.native
  var yDomain: js.UndefOr[VoronoiDomain] = js.native
}

object VoronoiProps {
  @scala.inline
  def apply(data: js.Array[VoronoiDatum]): VoronoiProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiProps]
  }
  @scala.inline
  implicit class VoronoiPropsOps[Self <: VoronoiProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: VoronoiDatum*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[VoronoiDatum]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellLineColor(value: String): Self = this.set("cellLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellLineColor: Self = this.set("cellLineColor", js.undefined)
    @scala.inline
    def setCellLineWidth(value: Double): Self = this.set("cellLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellLineWidth: Self = this.set("cellLineWidth", js.undefined)
    @scala.inline
    def setEnableCells(value: Boolean): Self = this.set("enableCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCells: Self = this.set("enableCells", js.undefined)
    @scala.inline
    def setEnableLinks(value: Boolean): Self = this.set("enableLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLinks: Self = this.set("enableLinks", js.undefined)
    @scala.inline
    def setEnablePoints(value: Boolean): Self = this.set("enablePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePoints: Self = this.set("enablePoints", js.undefined)
    @scala.inline
    def setLayersVarargs(value: (links | cells | points | bounds | VoronoiCustomLayer)*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[links | cells | points | bounds | VoronoiCustomLayer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setLinkLineColor(value: String): Self = this.set("linkLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkLineColor: Self = this.set("linkLineColor", js.undefined)
    @scala.inline
    def setLinkLineWidth(value: Double): Self = this.set("linkLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkLineWidth: Self = this.set("linkLineWidth", js.undefined)
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPointColor(value: String): Self = this.set("pointColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointColor: Self = this.set("pointColor", js.undefined)
    @scala.inline
    def setPointSize(value: Double): Self = this.set("pointSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointSize: Self = this.set("pointSize", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setXDomain(value: VoronoiDomain): Self = this.set("xDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXDomain: Self = this.set("xDomain", js.undefined)
    @scala.inline
    def setYDomain(value: VoronoiDomain): Self = this.set("yDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYDomain: Self = this.set("yDomain", js.undefined)
  }
  
}

