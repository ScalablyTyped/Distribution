package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.olStrings.postcompose
import typings.ol.olStrings.precompose
import typings.ol.olStrings.rendercomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graticuleMod {
  
  @JSImport("ol/layer/Graticule", JSImport.Default)
  @js.native
  class default () extends Graticule {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Graticule
    extends typings.ol.vectorMod.default {
    
    /**
      * Get the list of meridians.  Meridians are lines of equal longitude.
      */
    def getMeridians(): js.Array[typings.ol.lineStringMod.default] = js.native
    
    /**
      * Get the list of parallels.  Parallels are lines of equal latitude.
      */
    def getParallels(): js.Array[typings.ol.lineStringMod.default] = js.native
    
    /**
      * Update geometries in the source based on current view
      */
    def loaderFunction(extent: Extent, resolution: Double, projection: typings.ol.projectionMod.default): Unit = js.native
    
    @JSName("on")
    def on_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    
    /**
      * Strategy function for loading features based on the view's extent and
      * resolution.
      */
    def strategyFunction(extent: Extent, resolution: Double): js.Array[Extent] = js.native
    
    @JSName("un")
    def un_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  }
  
  @js.native
  trait GraticuleLabelDataType extends StObject {
    
    var geom: typings.ol.pointMod.default = js.native
    
    var text: String = js.native
  }
  object GraticuleLabelDataType {
    
    @scala.inline
    def apply(geom: typings.ol.pointMod.default, text: String): GraticuleLabelDataType = {
      val __obj = js.Dynamic.literal(geom = geom.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraticuleLabelDataType]
    }
    
    @scala.inline
    implicit class GraticuleLabelDataTypeMutableBuilder[Self <: GraticuleLabelDataType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeom(value: typings.ol.pointMod.default): Self = StObject.set(x, "geom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var extent: js.UndefOr[Extent] = js.native
    
    var intervals: js.UndefOr[js.Array[Double]] = js.native
    
    var latLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.native
    
    var latLabelPosition: js.UndefOr[Double] = js.native
    
    var latLabelStyle: js.UndefOr[typings.ol.textMod.default] = js.native
    
    var lonLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.native
    
    var lonLabelPosition: js.UndefOr[Double] = js.native
    
    var lonLabelStyle: js.UndefOr[typings.ol.textMod.default] = js.native
    
    var maxLines: js.UndefOr[Double] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var showLabels: js.UndefOr[Boolean] = js.native
    
    var strokeStyle: js.UndefOr[typings.ol.strokeMod.default] = js.native
    
    var targetSize: js.UndefOr[Double] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
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
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setIntervals(value: js.Array[Double]): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalsUndefined: Self = StObject.set(x, "intervals", js.undefined)
      
      @scala.inline
      def setIntervalsVarargs(value: Double*): Self = StObject.set(x, "intervals", js.Array(value :_*))
      
      @scala.inline
      def setLatLabelFormatter(value: /* p0 */ Double => String): Self = StObject.set(x, "latLabelFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLatLabelFormatterUndefined: Self = StObject.set(x, "latLabelFormatter", js.undefined)
      
      @scala.inline
      def setLatLabelPosition(value: Double): Self = StObject.set(x, "latLabelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatLabelPositionUndefined: Self = StObject.set(x, "latLabelPosition", js.undefined)
      
      @scala.inline
      def setLatLabelStyle(value: typings.ol.textMod.default): Self = StObject.set(x, "latLabelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatLabelStyleUndefined: Self = StObject.set(x, "latLabelStyle", js.undefined)
      
      @scala.inline
      def setLonLabelFormatter(value: /* p0 */ Double => String): Self = StObject.set(x, "lonLabelFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLonLabelFormatterUndefined: Self = StObject.set(x, "lonLabelFormatter", js.undefined)
      
      @scala.inline
      def setLonLabelPosition(value: Double): Self = StObject.set(x, "lonLabelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLonLabelPositionUndefined: Self = StObject.set(x, "lonLabelPosition", js.undefined)
      
      @scala.inline
      def setLonLabelStyle(value: typings.ol.textMod.default): Self = StObject.set(x, "lonLabelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLonLabelStyleUndefined: Self = StObject.set(x, "lonLabelStyle", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
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
      def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      @scala.inline
      def setStrokeStyle(value: typings.ol.strokeMod.default): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      @scala.inline
      def setTargetSize(value: Double): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
