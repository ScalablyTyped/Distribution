package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Feature
import typings.openlayers.mod.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateOptions extends js.Object {
  var features: js.UndefOr[Collection[Feature]] = js.native
  var layers: js.UndefOr[js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])] = js.native
}

object TranslateOptions {
  @scala.inline
  def apply(): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateOptions]
  }
  @scala.inline
  implicit class TranslateOptionsOps[Self <: TranslateOptions] (val x: Self) extends AnyVal {
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
    def setFeatures(value: Collection[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayersFunction1(value: /* layer */ Layer => Boolean): Self = this.set("layers", js.Any.fromFunction1(value))
    @scala.inline
    def setLayers(value: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
  
}

