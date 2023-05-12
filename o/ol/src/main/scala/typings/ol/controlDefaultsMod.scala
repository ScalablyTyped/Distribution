package typings.ol

import typings.ol.controlAttributionMod.Options
import typings.ol.controlControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlDefaultsMod {
  
  @JSImport("ol/control/defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults(): typings.ol.collectionMod.default[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[typings.ol.collectionMod.default[default]]
  inline def defaults(options: DefaultsOptions): typings.ol.collectionMod.default[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[typings.ol.collectionMod.default[default]]
  
  trait DefaultsOptions extends StObject {
    
    /**
      * Include
      * {@link module :ol/control/Attribution~Attribution}.
      */
    var attribution: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options for {@link module :ol/control/Attribution~Attribution}.
      */
    var attributionOptions: js.UndefOr[Options] = js.undefined
    
    /**
      * Include
      * {@link module :ol/control/Rotate~Rotate}.
      */
    var rotate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options
      * for {@link module :ol/control/Rotate~Rotate}.
      */
    var rotateOptions: js.UndefOr[typings.ol.controlRotateMod.Options] = js.undefined
    
    /**
      * Include {@link module :ol/control/Zoom~Zoom}.
      */
    var zoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options for
      * {@link module :ol/control/Zoom~Zoom}.
      */
    var zoomOptions: js.UndefOr[typings.ol.controlZoomMod.Options] = js.undefined
  }
  object DefaultsOptions {
    
    inline def apply(): DefaultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: Boolean): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionOptions(value: Options): Self = StObject.set(x, "attributionOptions", value.asInstanceOf[js.Any])
      
      inline def setAttributionOptionsUndefined: Self = StObject.set(x, "attributionOptions", js.undefined)
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateOptions(value: typings.ol.controlRotateMod.Options): Self = StObject.set(x, "rotateOptions", value.asInstanceOf[js.Any])
      
      inline def setRotateOptionsUndefined: Self = StObject.set(x, "rotateOptions", js.undefined)
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomOptions(value: typings.ol.controlZoomMod.Options): Self = StObject.set(x, "zoomOptions", value.asInstanceOf[js.Any])
      
      inline def setZoomOptionsUndefined: Self = StObject.set(x, "zoomOptions", js.undefined)
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
