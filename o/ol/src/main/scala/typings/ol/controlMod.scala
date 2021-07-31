package typings.ol

import typings.ol.attributionMod.Options
import typings.ol.attributionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod {
  
  @JSImport("ol/control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/control", "Attribution")
  @js.native
  class Attribution () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/control", "Control")
  @js.native
  class Control protected ()
    extends typings.ol.controlControlMod.default {
    def this(options: typings.ol.controlControlMod.Options) = this()
  }
  
  @JSImport("ol/control", "FullScreen")
  @js.native
  class FullScreen ()
    extends typings.ol.fullScreenMod.default {
    def this(opt_options: typings.ol.fullScreenMod.Options) = this()
  }
  
  @JSImport("ol/control", "MousePosition")
  @js.native
  class MousePosition ()
    extends typings.ol.mousePositionMod.default {
    def this(opt_options: typings.ol.mousePositionMod.Options) = this()
  }
  
  @JSImport("ol/control", "OverviewMap")
  @js.native
  class OverviewMap ()
    extends typings.ol.overviewMapMod.default {
    def this(opt_options: typings.ol.overviewMapMod.Options) = this()
  }
  
  @JSImport("ol/control", "Rotate")
  @js.native
  class Rotate ()
    extends typings.ol.rotateMod.default {
    def this(opt_options: typings.ol.rotateMod.Options) = this()
  }
  
  @JSImport("ol/control", "ScaleLine")
  @js.native
  class ScaleLine ()
    extends typings.ol.scaleLineMod.default {
    def this(opt_options: typings.ol.scaleLineMod.Options) = this()
  }
  
  @JSImport("ol/control", "Zoom")
  @js.native
  class Zoom ()
    extends typings.ol.zoomMod.default {
    def this(opt_options: typings.ol.zoomMod.Options) = this()
  }
  
  @JSImport("ol/control", "ZoomSlider")
  @js.native
  class ZoomSlider ()
    extends typings.ol.zoomSliderMod.default {
    def this(opt_options: typings.ol.zoomSliderMod.Options) = this()
  }
  
  @JSImport("ol/control", "ZoomToExtent")
  @js.native
  class ZoomToExtent ()
    extends typings.ol.zoomToExtentMod.default {
    def this(opt_options: typings.ol.zoomToExtentMod.Options) = this()
  }
  
  @scala.inline
  def defaults(): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[typings.ol.collectionMod.default[typings.ol.controlControlMod.default]]
  @scala.inline
  def defaults(opt_options: DefaultsOptions): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt_options.asInstanceOf[js.Any]).asInstanceOf[typings.ol.collectionMod.default[typings.ol.controlControlMod.default]]
  
  trait DefaultsOptions extends StObject {
    
    var attribution: js.UndefOr[Boolean] = js.undefined
    
    var attributionOptions: js.UndefOr[Options] = js.undefined
    
    var rotate: js.UndefOr[Boolean] = js.undefined
    
    var rotateOptions: js.UndefOr[typings.ol.rotateMod.Options] = js.undefined
    
    var zoom: js.UndefOr[Boolean] = js.undefined
    
    var zoomOptions: js.UndefOr[typings.ol.zoomMod.Options] = js.undefined
  }
  object DefaultsOptions {
    
    @scala.inline
    def apply(): DefaultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsOptions]
    }
    
    @scala.inline
    implicit class DefaultsOptionsMutableBuilder[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribution(value: Boolean): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionOptions(value: Options): Self = StObject.set(x, "attributionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionOptionsUndefined: Self = StObject.set(x, "attributionOptions", js.undefined)
      
      @scala.inline
      def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      @scala.inline
      def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateOptions(value: typings.ol.rotateMod.Options): Self = StObject.set(x, "rotateOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateOptionsUndefined: Self = StObject.set(x, "rotateOptions", js.undefined)
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOptions(value: typings.ol.zoomMod.Options): Self = StObject.set(x, "zoomOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOptionsUndefined: Self = StObject.set(x, "zoomOptions", js.undefined)
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
