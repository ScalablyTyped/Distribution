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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for the map.
  */
trait MapOptions extends StObject {
  
  var controls: js.UndefOr[Collection[Control] | js.Array[Control]] = js.undefined
  
  var interactions: js.UndefOr[Collection[Interaction] | js.Array[Interaction]] = js.undefined
  
  var keyboardEventTarget: js.UndefOr[Element | Document | String] = js.undefined
  
  var layers: js.UndefOr[js.Array[Base] | Collection[Base]] = js.undefined
  
  var loadTilesWhileAnimating: js.UndefOr[Boolean] = js.undefined
  
  var loadTilesWhileInteracting: js.UndefOr[Boolean] = js.undefined
  
  var logo: js.UndefOr[Boolean | String | LogoOptions | Element] = js.undefined
  
  var moveTolerance: js.UndefOr[Double] = js.undefined
  
  var overlays: js.UndefOr[Collection[Overlay] | js.Array[Overlay]] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var renderer: js.UndefOr[RendererType | (js.Array[RendererType | String]) | String] = js.undefined
  
  var target: js.UndefOr[Element | String] = js.undefined
  
  var view: js.UndefOr[View] = js.undefined
}
object MapOptions {
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  extension [Self <: MapOptions](x: Self) {
    
    inline def setControls(value: Collection[Control] | js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value :_*))
    
    inline def setInteractions(value: Collection[Interaction] | js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value :_*))
    
    inline def setKeyboardEventTarget(value: Element | Document | String): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
    
    inline def setKeyboardEventTargetUndefined: Self = StObject.set(x, "keyboardEventTarget", js.undefined)
    
    inline def setLayers(value: js.Array[Base] | Collection[Base]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: Base*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    inline def setLoadTilesWhileAnimating(value: Boolean): Self = StObject.set(x, "loadTilesWhileAnimating", value.asInstanceOf[js.Any])
    
    inline def setLoadTilesWhileAnimatingUndefined: Self = StObject.set(x, "loadTilesWhileAnimating", js.undefined)
    
    inline def setLoadTilesWhileInteracting(value: Boolean): Self = StObject.set(x, "loadTilesWhileInteracting", value.asInstanceOf[js.Any])
    
    inline def setLoadTilesWhileInteractingUndefined: Self = StObject.set(x, "loadTilesWhileInteracting", js.undefined)
    
    inline def setLogo(value: Boolean | String | LogoOptions | Element): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setMoveTolerance(value: Double): Self = StObject.set(x, "moveTolerance", value.asInstanceOf[js.Any])
    
    inline def setMoveToleranceUndefined: Self = StObject.set(x, "moveTolerance", js.undefined)
    
    inline def setOverlays(value: Collection[Overlay] | js.Array[Overlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    inline def setOverlaysVarargs(value: Overlay*): Self = StObject.set(x, "overlays", js.Array(value :_*))
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setRenderer(value: RendererType | (js.Array[RendererType | String]) | String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setRendererVarargs(value: (RendererType | String)*): Self = StObject.set(x, "renderer", js.Array(value :_*))
    
    inline def setTarget(value: Element | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
