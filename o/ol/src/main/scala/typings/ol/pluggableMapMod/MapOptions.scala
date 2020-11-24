package typings.ol.pluggableMapMod

import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends js.Object {
  
  var controls: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.controlControlMod.default] | js.Array[typings.ol.controlControlMod.default]
  ] = js.native
  
  var interactions: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] | js.Array[typings.ol.interactionInteractionMod.default]
  ] = js.native
  
  var keyboardEventTarget: js.UndefOr[HTMLElement | Document | String] = js.native
  
  var layers: js.UndefOr[
    js.Array[typings.ol.baseMod.default] | typings.ol.collectionMod.default[typings.ol.baseMod.default] | typings.ol.groupMod.default
  ] = js.native
  
  var maxTilesLoading: js.UndefOr[Double] = js.native
  
  var moveTolerance: js.UndefOr[Double] = js.native
  
  var overlays: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.overlayMod.default] | js.Array[typings.ol.overlayMod.default]
  ] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[HTMLElement | String] = js.native
  
  var view: js.UndefOr[typings.ol.viewMod.default] = js.native
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
    def setControlsVarargs(value: typings.ol.controlControlMod.default*): Self = this.set("controls", js.Array(value :_*))
    
    @scala.inline
    def setControls(
      value: typings.ol.collectionMod.default[typings.ol.controlControlMod.default] | js.Array[typings.ol.controlControlMod.default]
    ): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setInteractionsVarargs(value: typings.ol.interactionInteractionMod.default*): Self = this.set("interactions", js.Array(value :_*))
    
    @scala.inline
    def setInteractions(
      value: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] | js.Array[typings.ol.interactionInteractionMod.default]
    ): Self = this.set("interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractions: Self = this.set("interactions", js.undefined)
    
    @scala.inline
    def setKeyboardEventTarget(value: HTMLElement | Document | String): Self = this.set("keyboardEventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardEventTarget: Self = this.set("keyboardEventTarget", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: typings.ol.baseMod.default*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(
      value: js.Array[typings.ol.baseMod.default] | typings.ol.collectionMod.default[typings.ol.baseMod.default] | typings.ol.groupMod.default
    ): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setMaxTilesLoading(value: Double): Self = this.set("maxTilesLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTilesLoading: Self = this.set("maxTilesLoading", js.undefined)
    
    @scala.inline
    def setMoveTolerance(value: Double): Self = this.set("moveTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveTolerance: Self = this.set("moveTolerance", js.undefined)
    
    @scala.inline
    def setOverlaysVarargs(value: typings.ol.overlayMod.default*): Self = this.set("overlays", js.Array(value :_*))
    
    @scala.inline
    def setOverlays(
      value: typings.ol.collectionMod.default[typings.ol.overlayMod.default] | js.Array[typings.ol.overlayMod.default]
    ): Self = this.set("overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setView(value: typings.ol.viewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
