package typings.ol.clusterMod

import typings.ol.pluggableMapMod.FrameState
import typings.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var distance: js.UndefOr[Double] = js.native
  var geometryFunction: js.UndefOr[
    js.Function1[
      /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], 
      typings.ol.pointMod.default
    ]
  ] = js.native
  var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAttributionsVarargs(value: String*): Self = this.set("attributions", js.Array(value :_*))
    @scala.inline
    def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = this.set("attributions", js.Any.fromFunction1(value))
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setGeometryFunction(
      value: /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] => typings.ol.pointMod.default
    ): Self = this.set("geometryFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGeometryFunction: Self = this.set("geometryFunction", js.undefined)
    @scala.inline
    def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
  
}

