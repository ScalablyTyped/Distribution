package typings.openlayers.mod.olx

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Overlay
import typings.openlayers.mod.RendererType
import typings.openlayers.mod.View
import typings.openlayers.mod.control.Control
import typings.openlayers.mod.interaction.Interaction
import typings.openlayers.mod.layer.Base
import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the map.
  */
@js.native
trait MapOptions extends js.Object {
  var controls: js.UndefOr[Collection[Control] | js.Array[Control]] = js.native
  var interactions: js.UndefOr[Collection[Interaction] | js.Array[Interaction]] = js.native
  var keyboardEventTarget: js.UndefOr[Element | Document | String] = js.native
  var layers: js.UndefOr[js.Array[Base] | Collection[Base]] = js.native
  var loadTilesWhileAnimating: js.UndefOr[Boolean] = js.native
  var loadTilesWhileInteracting: js.UndefOr[Boolean] = js.native
  var logo: js.UndefOr[Boolean | String | LogoOptions | Element] = js.native
  var moveTolerance: js.UndefOr[Double] = js.native
  var overlays: js.UndefOr[Collection[Overlay] | js.Array[Overlay]] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var renderer: js.UndefOr[RendererType | (js.Array[RendererType | String]) | String] = js.native
  var target: js.UndefOr[Element | String] = js.native
  var view: js.UndefOr[View] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
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
    def setControlsVarargs(value: Control*): Self = this.set("controls", js.Array(value :_*))
    @scala.inline
    def setControls(value: Collection[Control] | js.Array[Control]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setInteractionsVarargs(value: Interaction*): Self = this.set("interactions", js.Array(value :_*))
    @scala.inline
    def setInteractions(value: Collection[Interaction] | js.Array[Interaction]): Self = this.set("interactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractions: Self = this.set("interactions", js.undefined)
    @scala.inline
    def setKeyboardEventTarget(value: Element | Document | String): Self = this.set("keyboardEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardEventTarget: Self = this.set("keyboardEventTarget", js.undefined)
    @scala.inline
    def setLayersVarargs(value: Base*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[Base] | Collection[Base]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setLoadTilesWhileAnimating(value: Boolean): Self = this.set("loadTilesWhileAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadTilesWhileAnimating: Self = this.set("loadTilesWhileAnimating", js.undefined)
    @scala.inline
    def setLoadTilesWhileInteracting(value: Boolean): Self = this.set("loadTilesWhileInteracting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadTilesWhileInteracting: Self = this.set("loadTilesWhileInteracting", js.undefined)
    @scala.inline
    def setLogo(value: Boolean | String | LogoOptions | Element): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setMoveTolerance(value: Double): Self = this.set("moveTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveTolerance: Self = this.set("moveTolerance", js.undefined)
    @scala.inline
    def setOverlaysVarargs(value: Overlay*): Self = this.set("overlays", js.Array(value :_*))
    @scala.inline
    def setOverlays(value: Collection[Overlay] | js.Array[Overlay]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setRendererVarargs(value: (RendererType | String)*): Self = this.set("renderer", js.Array(value :_*))
    @scala.inline
    def setRenderer(value: RendererType | (js.Array[RendererType | String]) | String): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setTarget(value: Element | String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

