package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectMod.ObjectEvent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olStrings.changeColonpreload
import typings.ol.olStrings.changeColonuseInterimTilesOnError
import typings.ol.renderMod.OrderFunction
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import typings.ol.vectorTileRenderTypeMod.VectorTileRenderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorTileMod {
  
  @JSImport("ol/layer/VectorTile", JSImport.Default)
  @js.native
  class default () extends VectorTileLayer {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var declutter: js.UndefOr[Boolean] = js.undefined
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var map: js.UndefOr[typings.ol.pluggableMapMod.default] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var preload: js.UndefOr[Double] = js.undefined
    
    var renderBuffer: js.UndefOr[Double] = js.undefined
    
    var renderMode: js.UndefOr[VectorTileRenderType | String] = js.undefined
    
    var renderOrder: js.UndefOr[OrderFunction] = js.undefined
    
    var source: js.UndefOr[typings.ol.sourceVectorTileMod.default] = js.undefined
    
    var style: js.UndefOr[StyleLike] = js.undefined
    
    var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
    
    var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
    
    var useInterimTilesOnError: js.UndefOr[Boolean] = js.undefined
    
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
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDeclutter(value: Boolean): Self = StObject.set(x, "declutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclutterUndefined: Self = StObject.set(x, "declutter", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMap(value: typings.ol.pluggableMapMod.default): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
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
      def setPreload(value: Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
      
      @scala.inline
      def setRenderMode(value: VectorTileRenderType | String): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      @scala.inline
      def setRenderOrder(value: (/* p0 */ FeatureLike, /* p1 */ FeatureLike) => Double): Self = StObject.set(x, "renderOrder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      @scala.inline
      def setSource(value: typings.ol.sourceVectorTileMod.default): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setUpdateWhileAnimating(value: Boolean): Self = StObject.set(x, "updateWhileAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhileAnimatingUndefined: Self = StObject.set(x, "updateWhileAnimating", js.undefined)
      
      @scala.inline
      def setUpdateWhileInteracting(value: Boolean): Self = StObject.set(x, "updateWhileInteracting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhileInteractingUndefined: Self = StObject.set(x, "updateWhileInteracting", js.undefined)
      
      @scala.inline
      def setUseInterimTilesOnError(value: Boolean): Self = StObject.set(x, "useInterimTilesOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseInterimTilesOnErrorUndefined: Self = StObject.set(x, "useInterimTilesOnError", js.undefined)
      
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
  
  @js.native
  trait VectorTileLayer
    extends typings.ol.baseVectorMod.default[typings.ol.sourceVectorTileMod.default] {
    
    /**
      * Return the level as number to which we will preload tiles up to.
      */
    def getPreload(): Double = js.native
    
    def getRenderMode(): VectorTileRenderType = js.native
    
    /**
      * Whether we use interim tiles on error.
      */
    def getUseInterimTilesOnError(): Boolean = js.native
    
    @JSName("on")
    def on_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the level as number to which we will preload tiles up to.
      */
    def setPreload(preload: Double): Unit = js.native
    
    /**
      * Set whether we use interim tiles on error.
      */
    def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
    
    @JSName("un")
    def un_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
}
