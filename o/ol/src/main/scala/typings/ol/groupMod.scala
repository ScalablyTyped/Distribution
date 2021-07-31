package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonlayers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  @JSImport("ol/layer/Group", JSImport.Default)
  @js.native
  class default () extends LayerGroup {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait LayerGroup
    extends typings.ol.baseMod.default {
    
    /**
      * Returns the {@link module:ol/Collection collection} of {@link module:ol/layer/Layer~Layer layers}
      * in this group.
      */
    def getLayers(): typings.ol.collectionMod.default[typings.ol.baseMod.default] = js.native
    
    @JSName("on")
    def on_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the {@link module:ol/Collection collection} of {@link module:ol/layer/Layer~Layer layers}
      * in this group.
      */
    def setLayers(layers: typings.ol.collectionMod.default[typings.ol.baseMod.default]): Unit = js.native
    
    @JSName("un")
    def un_changelayers(`type`: changeColonlayers, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var layers: js.UndefOr[
        js.Array[typings.ol.baseMod.default] | typings.ol.collectionMod.default[typings.ol.baseMod.default]
      ] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setLayers(
        value: js.Array[typings.ol.baseMod.default] | typings.ol.collectionMod.default[typings.ol.baseMod.default]
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: typings.ol.baseMod.default*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
