package typings.nivoGeo.mod

import typings.nivoGeo.anon.PartialBox
import typings.nivoGeo.anon.PartialTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps extends js.Object {
  var enableGraticule: js.UndefOr[Boolean] = js.native
  var features: js.Array[_] = js.native
  var graticuleLineColor: js.UndefOr[String] = js.native
  var graticuleLineWidth: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[PartialBox] = js.native
  var projectionRotation: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  var projectionScale: js.UndefOr[Double] = js.native
  var projectionTranslation: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var projectionType: js.UndefOr[GeoProjectionType] = js.native
  var theme: js.UndefOr[PartialTheme] = js.native
}

object CommonProps {
  @scala.inline
  def apply(features: js.Array[_]): CommonProps = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
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
    def setFeaturesVarargs(value: js.Any*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[_]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableGraticule(value: Boolean): Self = this.set("enableGraticule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGraticule: Self = this.set("enableGraticule", js.undefined)
    @scala.inline
    def setGraticuleLineColor(value: String): Self = this.set("graticuleLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraticuleLineColor: Self = this.set("graticuleLineColor", js.undefined)
    @scala.inline
    def setGraticuleLineWidth(value: Double): Self = this.set("graticuleLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraticuleLineWidth: Self = this.set("graticuleLineWidth", js.undefined)
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    @scala.inline
    def setMargin(value: PartialBox): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setProjectionRotation(value: js.Tuple3[Double, Double, Double]): Self = this.set("projectionRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionRotation: Self = this.set("projectionRotation", js.undefined)
    @scala.inline
    def setProjectionScale(value: Double): Self = this.set("projectionScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionScale: Self = this.set("projectionScale", js.undefined)
    @scala.inline
    def setProjectionTranslation(value: js.Tuple2[Double, Double]): Self = this.set("projectionTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionTranslation: Self = this.set("projectionTranslation", js.undefined)
    @scala.inline
    def setProjectionType(value: GeoProjectionType): Self = this.set("projectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionType: Self = this.set("projectionType", js.undefined)
    @scala.inline
    def setTheme(value: PartialTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

