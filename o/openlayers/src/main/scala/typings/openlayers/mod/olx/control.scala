package typings.openlayers.mod.olx

import typings.openlayers.mod.Collection
import typings.openlayers.mod.CoordinateFormatType
import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.MapEvent
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.View
import typings.openlayers.mod.control.ScaleLine.Units
import typings.openlayers.mod.layer.Layer
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  @js.native
  trait AttributionOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var collapseLabel: js.UndefOr[String | Node] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var collapsible: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String | Node] = js.native
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var tipLabel: js.UndefOr[String] = js.native
  }
  object AttributionOptions {
    
    @scala.inline
    def apply(): typings.openlayers.mod.olx.control.AttributionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.openlayers.mod.olx.control.AttributionOptions]
    }
    
    @scala.inline
    implicit class AttributionOptionsMutableBuilder[Self <: typings.openlayers.mod.olx.control.AttributionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapseLabel(value: String | Node): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRender(value: /* event */ MapEvent => _): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  @js.native
  trait ControlOptions extends StObject {
    
    var element: js.UndefOr[Element] = js.native
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
    
    var target: js.UndefOr[Element | String] = js.native
  }
  object ControlOptions {
    
    @scala.inline
    def apply(): ControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlOptions]
    }
    
    @scala.inline
    implicit class ControlOptionsMutableBuilder[Self <: ControlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setRender(value: /* event */ MapEvent => _): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTarget(value: Element | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait DefaultsOptions extends StObject {
    
    var attribution: js.UndefOr[Boolean] = js.native
    
    var attributionOptions: js.UndefOr[typings.openlayers.mod.olx.control.AttributionOptions] = js.native
    
    var rotate: js.UndefOr[Boolean] = js.native
    
    var rotateOptions: js.UndefOr[RotateOptions] = js.native
    
    var zoom: js.UndefOr[Boolean] = js.native
    
    var zoomOptions: js.UndefOr[ZoomOptions] = js.native
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
      def setAttributionOptions(value: typings.openlayers.mod.olx.control.AttributionOptions): Self = StObject.set(x, "attributionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionOptionsUndefined: Self = StObject.set(x, "attributionOptions", js.undefined)
      
      @scala.inline
      def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      @scala.inline
      def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateOptions(value: RotateOptions): Self = StObject.set(x, "rotateOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateOptionsUndefined: Self = StObject.set(x, "rotateOptions", js.undefined)
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOptions(value: ZoomOptions): Self = StObject.set(x, "zoomOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOptionsUndefined: Self = StObject.set(x, "zoomOptions", js.undefined)
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait FullScreenOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var keys: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String | Node] = js.native
    
    var labelActive: js.UndefOr[String | Node] = js.native
    
    var source: js.UndefOr[Element | String] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var tipLabel: js.UndefOr[String] = js.native
  }
  object FullScreenOptions {
    
    @scala.inline
    def apply(): FullScreenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullScreenOptions]
    }
    
    @scala.inline
    implicit class FullScreenOptionsMutableBuilder[Self <: FullScreenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelActive(value: String | Node): Self = StObject.set(x, "labelActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelActiveUndefined: Self = StObject.set(x, "labelActive", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSource(value: Element | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  @js.native
  trait MousePositionOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var coordinateFormat: js.UndefOr[CoordinateFormatType] = js.native
    
    var projection: ProjectionLike = js.native
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var undefinedHTML: js.UndefOr[String] = js.native
  }
  object MousePositionOptions {
    
    @scala.inline
    def apply(): MousePositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MousePositionOptions]
    }
    
    @scala.inline
    implicit class MousePositionOptionsMutableBuilder[Self <: MousePositionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCoordinateFormat(value: /* coords */ js.UndefOr[Coordinate_] => String): Self = StObject.set(x, "coordinateFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoordinateFormatUndefined: Self = StObject.set(x, "coordinateFormat", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setRender(value: /* event */ MapEvent => _): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setUndefinedHTML(value: String): Self = StObject.set(x, "undefinedHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndefinedHTMLUndefined: Self = StObject.set(x, "undefinedHTML", js.undefined)
    }
  }
  
  @js.native
  trait OverviewMapOptions extends StObject {
    
    var collapseLabel: js.UndefOr[String | Node] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var collapsible: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String | Node] = js.native
    
    var layers: js.UndefOr[js.Array[Layer] | Collection[Layer]] = js.native
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var tipLabel: js.UndefOr[String] = js.native
    
    var view: js.UndefOr[View] = js.native
  }
  object OverviewMapOptions {
    
    @scala.inline
    def apply(): OverviewMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverviewMapOptions]
    }
    
    @scala.inline
    implicit class OverviewMapOptionsMutableBuilder[Self <: OverviewMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseLabel(value: String | Node): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLayers(value: js.Array[Layer] | Collection[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setRender(value: /* event */ MapEvent => _): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
      
      @scala.inline
      def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  @js.native
  trait RotateOptions extends StObject {
    
    var autoHide: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var label: js.UndefOr[String | Element] = js.native
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
    
    var resetNorth: js.UndefOr[js.Function0[_]] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var tipLabel: js.UndefOr[String] = js.native
  }
  object RotateOptions {
    
    @scala.inline
    def apply(): RotateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateOptions]
    }
    
    @scala.inline
    implicit class RotateOptionsMutableBuilder[Self <: RotateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setLabel(value: String | Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRender(value: /* event */ MapEvent => _): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setResetNorth(value: () => _): Self = StObject.set(x, "resetNorth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetNorthUndefined: Self = StObject.set(x, "resetNorth", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  @js.native
  trait ScaleLineOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var units: js.UndefOr[Units | String] = js.native
  }
  object ScaleLineOptions {
    
    @scala.inline
    def apply(): ScaleLineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleLineOptions]
    }
    
    @scala.inline
    implicit class ScaleLineOptionsMutableBuilder[Self <: ScaleLineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setRender(value: /* event */ MapEvent => _): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setUnits(value: Units | String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  @js.native
  trait ZoomOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var delta: js.UndefOr[Double] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var zoomInLabel: js.UndefOr[String | Node] = js.native
    
    var zoomInTipLabel: js.UndefOr[String] = js.native
    
    var zoomOutLabel: js.UndefOr[String | Node] = js.native
    
    var zoomOutTipLabel: js.UndefOr[String] = js.native
  }
  object ZoomOptions {
    
    @scala.inline
    def apply(): ZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOptions]
    }
    
    @scala.inline
    implicit class ZoomOptionsMutableBuilder[Self <: ZoomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setZoomInLabel(value: String | Node): Self = StObject.set(x, "zoomInLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomInLabelUndefined: Self = StObject.set(x, "zoomInLabel", js.undefined)
      
      @scala.inline
      def setZoomInTipLabel(value: String): Self = StObject.set(x, "zoomInTipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomInTipLabelUndefined: Self = StObject.set(x, "zoomInTipLabel", js.undefined)
      
      @scala.inline
      def setZoomOutLabel(value: String | Node): Self = StObject.set(x, "zoomOutLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOutLabelUndefined: Self = StObject.set(x, "zoomOutLabel", js.undefined)
      
      @scala.inline
      def setZoomOutTipLabel(value: String): Self = StObject.set(x, "zoomOutTipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOutTipLabelUndefined: Self = StObject.set(x, "zoomOutTipLabel", js.undefined)
    }
  }
  
  @js.native
  trait ZoomSliderOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
  }
  object ZoomSliderOptions {
    
    @scala.inline
    def apply(): ZoomSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomSliderOptions]
    }
    
    @scala.inline
    implicit class ZoomSliderOptionsMutableBuilder[Self <: ZoomSliderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setRender(value: /* event */ MapEvent => _): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  @js.native
  trait ZoomToExtentOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var extent: js.UndefOr[Extent_] = js.native
    
    var label: js.UndefOr[String | Node] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var tipLabel: js.UndefOr[String] = js.native
  }
  object ZoomToExtentOptions {
    
    @scala.inline
    def apply(): ZoomToExtentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomToExtentOptions]
    }
    
    @scala.inline
    implicit class ZoomToExtentOptionsMutableBuilder[Self <: ZoomToExtentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
}
