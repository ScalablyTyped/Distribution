package typings.ol.selectMod

import typings.ol.conditionMod.Condition
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var addCondition: js.UndefOr[Condition] = js.native
  var condition: js.UndefOr[Condition] = js.native
  var features: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
  ] = js.native
  var filter: js.UndefOr[FilterFunction] = js.native
  var hitTolerance: js.UndefOr[Double] = js.native
  var layers: js.UndefOr[
    js.Array[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] | (js.Function1[
      /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
      Boolean
    ])
  ] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var removeCondition: js.UndefOr[Condition] = js.native
  var style: js.UndefOr[StyleLike] = js.native
  var toggleCondition: js.UndefOr[Condition] = js.native
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
    def setAddCondition(value: Condition): Self = this.set("addCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddCondition: Self = this.set("addCondition", js.undefined)
    @scala.inline
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setFeatures(
      value: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
    ): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setFilter(
      value: (/* p0 */ FeatureLike, /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]) => Boolean
    ): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setHitTolerance(value: Double): Self = this.set("hitTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitTolerance: Self = this.set("hitTolerance", js.undefined)
    @scala.inline
    def setLayersVarargs(value: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayersFunction1(value: /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] => Boolean): Self = this.set("layers", js.Any.fromFunction1(value))
    @scala.inline
    def setLayers(
      value: js.Array[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] | (js.Function1[
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          Boolean
        ])
    ): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setRemoveCondition(value: Condition): Self = this.set("removeCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveCondition: Self = this.set("removeCondition", js.undefined)
    @scala.inline
    def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style] | Unit): Self = this.set("style", js.Any.fromFunction2(value))
    @scala.inline
    def setStyleVarargs(value: Style*): Self = this.set("style", js.Array(value :_*))
    @scala.inline
    def setStyle(value: StyleLike): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setToggleCondition(value: Condition): Self = this.set("toggleCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleCondition: Self = this.set("toggleCondition", js.undefined)
  }
  
}

