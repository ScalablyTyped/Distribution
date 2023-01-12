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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  trait AttributionOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapseLabel: js.UndefOr[String | Node] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String | Node] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, Any]] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var tipLabel: js.UndefOr[String] = js.undefined
  }
  object AttributionOptions {
    
    inline def apply(): typings.openlayers.mod.olx.control.AttributionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.openlayers.mod.olx.control.AttributionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.openlayers.mod.olx.control.AttributionOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapseLabel(value: String | Node): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      inline def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(value: /* event */ MapEvent => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  trait ControlOptions extends StObject {
    
    var element: js.UndefOr[Element] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, Any]] = js.undefined
    
    var target: js.UndefOr[Element | String] = js.undefined
  }
  object ControlOptions {
    
    inline def apply(): ControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlOptions] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setRender(value: /* event */ MapEvent => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: Element | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait DefaultsOptions extends StObject {
    
    var attribution: js.UndefOr[Boolean] = js.undefined
    
    var attributionOptions: js.UndefOr[typings.openlayers.mod.olx.control.AttributionOptions] = js.undefined
    
    var rotate: js.UndefOr[Boolean] = js.undefined
    
    var rotateOptions: js.UndefOr[RotateOptions] = js.undefined
    
    var zoom: js.UndefOr[Boolean] = js.undefined
    
    var zoomOptions: js.UndefOr[ZoomOptions] = js.undefined
  }
  object DefaultsOptions {
    
    inline def apply(): DefaultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: Boolean): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionOptions(value: typings.openlayers.mod.olx.control.AttributionOptions): Self = StObject.set(x, "attributionOptions", value.asInstanceOf[js.Any])
      
      inline def setAttributionOptionsUndefined: Self = StObject.set(x, "attributionOptions", js.undefined)
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateOptions(value: RotateOptions): Self = StObject.set(x, "rotateOptions", value.asInstanceOf[js.Any])
      
      inline def setRotateOptionsUndefined: Self = StObject.set(x, "rotateOptions", js.undefined)
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomOptions(value: ZoomOptions): Self = StObject.set(x, "zoomOptions", value.asInstanceOf[js.Any])
      
      inline def setZoomOptionsUndefined: Self = StObject.set(x, "zoomOptions", js.undefined)
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait FullScreenOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var keys: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String | Node] = js.undefined
    
    var labelActive: js.UndefOr[String | Node] = js.undefined
    
    var source: js.UndefOr[Element | String] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var tipLabel: js.UndefOr[String] = js.undefined
  }
  object FullScreenOptions {
    
    inline def apply(): FullScreenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullScreenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullScreenOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelActive(value: String | Node): Self = StObject.set(x, "labelActive", value.asInstanceOf[js.Any])
      
      inline def setLabelActiveUndefined: Self = StObject.set(x, "labelActive", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSource(value: Element | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  trait MousePositionOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var coordinateFormat: js.UndefOr[CoordinateFormatType] = js.undefined
    
    var projection: ProjectionLike
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, Any]] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var undefinedHTML: js.UndefOr[String] = js.undefined
  }
  object MousePositionOptions {
    
    inline def apply(): MousePositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MousePositionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MousePositionOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCoordinateFormat(value: /* coords */ js.UndefOr[Coordinate_] => String): Self = StObject.set(x, "coordinateFormat", js.Any.fromFunction1(value))
      
      inline def setCoordinateFormatUndefined: Self = StObject.set(x, "coordinateFormat", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRender(value: /* event */ MapEvent => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setUndefinedHTML(value: String): Self = StObject.set(x, "undefinedHTML", value.asInstanceOf[js.Any])
      
      inline def setUndefinedHTMLUndefined: Self = StObject.set(x, "undefinedHTML", js.undefined)
    }
  }
  
  trait OverviewMapOptions extends StObject {
    
    var collapseLabel: js.UndefOr[String | Node] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String | Node] = js.undefined
    
    var layers: js.UndefOr[js.Array[Layer] | Collection[Layer]] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, Any]] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var tipLabel: js.UndefOr[String] = js.undefined
    
    var view: js.UndefOr[View] = js.undefined
  }
  object OverviewMapOptions {
    
    inline def apply(): OverviewMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverviewMapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverviewMapOptions] (val x: Self) extends AnyVal {
      
      inline def setCollapseLabel(value: String | Node): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      inline def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayers(value: js.Array[Layer] | Collection[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setRender(value: /* event */ MapEvent => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait RotateOptions extends StObject {
    
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[String | Element] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, Any]] = js.undefined
    
    var resetNorth: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var tipLabel: js.UndefOr[String] = js.undefined
  }
  object RotateOptions {
    
    inline def apply(): RotateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RotateOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setLabel(value: String | Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(value: /* event */ MapEvent => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setResetNorth(value: () => Any): Self = StObject.set(x, "resetNorth", js.Any.fromFunction0(value))
      
      inline def setResetNorthUndefined: Self = StObject.set(x, "resetNorth", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  trait ScaleLineOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, Any]] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var units: js.UndefOr[Units | String] = js.undefined
  }
  object ScaleLineOptions {
    
    inline def apply(): ScaleLineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleLineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScaleLineOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setRender(value: /* event */ MapEvent => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setUnits(value: Units | String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  trait ZoomOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var delta: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var zoomInLabel: js.UndefOr[String | Node] = js.undefined
    
    var zoomInTipLabel: js.UndefOr[String] = js.undefined
    
    var zoomOutLabel: js.UndefOr[String | Node] = js.undefined
    
    var zoomOutTipLabel: js.UndefOr[String] = js.undefined
  }
  object ZoomOptions {
    
    inline def apply(): ZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setZoomInLabel(value: String | Node): Self = StObject.set(x, "zoomInLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomInLabelUndefined: Self = StObject.set(x, "zoomInLabel", js.undefined)
      
      inline def setZoomInTipLabel(value: String): Self = StObject.set(x, "zoomInTipLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomInTipLabelUndefined: Self = StObject.set(x, "zoomInTipLabel", js.undefined)
      
      inline def setZoomOutLabel(value: String | Node): Self = StObject.set(x, "zoomOutLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomOutLabelUndefined: Self = StObject.set(x, "zoomOutLabel", js.undefined)
      
      inline def setZoomOutTipLabel(value: String): Self = StObject.set(x, "zoomOutTipLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomOutTipLabelUndefined: Self = StObject.set(x, "zoomOutTipLabel", js.undefined)
    }
  }
  
  trait ZoomSliderOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* event */ MapEvent, Any]] = js.undefined
  }
  object ZoomSliderOptions {
    
    inline def apply(): ZoomSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomSliderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomSliderOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setRender(value: /* event */ MapEvent => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  trait ZoomToExtentOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var label: js.UndefOr[String | Node] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var tipLabel: js.UndefOr[String] = js.undefined
  }
  object ZoomToExtentOptions {
    
    inline def apply(): ZoomToExtentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomToExtentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomToExtentOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
}
