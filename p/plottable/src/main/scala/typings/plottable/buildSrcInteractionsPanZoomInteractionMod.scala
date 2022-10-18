package typings.plottable

import typings.plottable.anon.CenterValue
import typings.plottable.anon.X
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcInteractionsInteractionMod.Interaction
import typings.plottable.buildSrcInteractionsMod.Drag
import typings.plottable.buildSrcScalesScaleMod.TransformableScale
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInteractionsPanZoomInteractionMod {
  
  @JSImport("plottable/build/src/interactions/panZoomInteraction", "PanZoom")
  @js.native
  /**
    * A PanZoom Interaction updates the domains of an x-scale and/or a y-scale
    * in response to the user panning or zooming.
    *
    * @constructor
    * @param {TransformableScale} [xScale] The x-scale to update on panning/zooming.
    * @param {TransformableScale} [yScale] The y-scale to update on panning/zooming.
    */
  open class PanZoom () extends Interaction {
    def this(xScale: TransformableScale[Any, Double]) = this()
    def this(xScale: Unit, yScale: TransformableScale[Any, Double]) = this()
    def this(xScale: TransformableScale[Any, Double], yScale: TransformableScale[Any, Double]) = this()
    
    /* private */ var _constrainedTranslation: Any = js.native
    
    /* private */ var _constrainedZoom: Any = js.native
    
    /* private */ var _dragInteraction: Any = js.native
    
    /* private */ var _handlePinch: Any = js.native
    
    /* private */ var _handleTouchEnd: Any = js.native
    
    /* private */ var _handleTouchStart: Any = js.native
    
    /* private */ var _handleWheelEvent: Any = js.native
    
    /* private */ var _maxDomainExtents: Any = js.native
    
    /* private */ var _maxDomainValues: Any = js.native
    
    /* private */ var _minDomainExtents: Any = js.native
    
    /* private */ var _minDomainValues: Any = js.native
    
    /* private */ var _mouseDispatcher: Any = js.native
    
    /* private */ var _nonLinearScaleWithExtents: Any = js.native
    
    /* private */ var _panEndCallbacks: Any = js.native
    
    /* private */ var _panZoomUpdateCallbacks: Any = js.native
    
    /* private */ var _setupDragInteraction: Any = js.native
    
    /* private */ var _touchCancelCallback: Any = js.native
    
    /* private */ var _touchDispatcher: Any = js.native
    
    /* private */ var _touchEndCallback: Any = js.native
    
    /* private */ var _touchIds: Any = js.native
    
    /* private */ var _touchMoveCallback: Any = js.native
    
    /* private */ var _touchStartCallback: Any = js.native
    
    /* private */ var _wheelCallback: Any = js.native
    
    /* private */ var _wheelFilter: Any = js.native
    
    /* private */ var _xScales: Any = js.native
    
    /* private */ var _yScales: Any = js.native
    
    /* private */ var _zoomEndCallbacks: Any = js.native
    
    /**
      * Adds an x scale to this PanZoom Interaction
      *
      * @param {TransformableScale} An x scale to add
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def addXScale(xScale: TransformableScale[Any, Double]): this.type = js.native
    
    /**
      * Adds a y scale to this PanZoom Interaction
      *
      * @param {TransformableScale} A y scale to add
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def addYScale(yScale: TransformableScale[Any, Double]): this.type = js.native
    
    /**
      * Get the backing drag interaction. Useful to customize the panzoom interaction.
      * @returns {Drag}
      */
    def dragInteraction(): Drag = js.native
    
    /**
      * Gets the maximum domain extent for the scale, specifying the maximum
      * allowable amount between the ends of the domain.
      *
      * Note that extents will mainly work on scales that work linearly like
      * Linear Scale and Time Scale
      *
      * @param {TransformableScale} scale The scale to query
      * @returns {number} The maximum numerical domain extent for the scale.
      */
    def maxDomainExtent(scale: TransformableScale[Any, Double]): Double = js.native
    /**
      * Sets the maximum domain extent for the scale, specifying the maximum
      * allowable amount between the ends of the domain.
      *
      * For example, if the scale's transformation domain is `[500, 600]` and the
      * `maxDomainExtent` is set to `50`, then the user will only be able to zoom
      * out to see an interval like `[500, 550]` or `[520, 570]`.
      *
      * Note that extents will mainly work on scales that work linearly like
      * Linear Scale and Time Scale
      *
      * @param {TransformableScale} scale The scale to query
      * @param {number} minDomainExtent The maximum numerical domain extent for
      * the scale.
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def maxDomainExtent(scale: TransformableScale[Any, Double], maxDomainExtent: Double): this.type = js.native
    
    /**
      * Gets the maximum domain value for the scale, constraining the pan/zoom
      * interaction to a maximum value in the domain.
      *
      * Note that this differs from minDomainExtent/maxDomainExtent, in that
      * those methods provide constraints such as showing at least 2 but no more
      * than 5 values at a time.
      *
      * By contrast, minDomainValue/maxDomainValue set a boundary beyond which
      * the user cannot pan/zoom.
      *
      * @param {TransformableScale} scale The scale to query
      * @returns {number} The maximum domain value for the scale.
      */
    def maxDomainValue(scale: TransformableScale[Any, Double]): Double = js.native
    /**
      * Sets the maximum domain value for the scale, constraining the pan/zoom
      * interaction to a maximum value in the domain.
      *
      * Note that this differs from minDomainExtent/maxDomainExtent, in that
      * those methods provide constraints such as showing at least 2 but no more
      * than 5 values at a time.
      *
      * By contrast, minDomainValue/maxDomainValue set a boundary beyond which
      * the user cannot pan/zoom.
      *
      * @param {TransformableScale} scale The scale to query
      * @param {number} maxDomainExtent The maximum domain value for the scale.
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def maxDomainValue(scale: TransformableScale[Any, Double], maxDomainValue: Double): this.type = js.native
    
    /**
      * Gets the minimum domain extent for the scale, specifying the minimum
      * allowable amount between the ends of the domain.
      *
      * Note that extents will mainly work on scales that work linearly like
      * Linear Scale and Time Scale
      *
      * @param {TransformableScale} scale The scale to query
      * @returns {number} The minimum numerical domain extent for the scale.
      */
    def minDomainExtent(scale: TransformableScale[Any, Double]): Double = js.native
    /**
      * Sets the minimum domain extent for the scale, specifying the minimum
      * allowable amount between the ends of the domain.
      *
      * Note that extents will mainly work on scales that work linearly like
      * Linear Scale and Time Scale
      *
      * @param {TransformableScale} scale The scale to query
      * @param {number} minDomainExtent The minimum numerical domain extent for
      * the scale.
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def minDomainExtent(scale: TransformableScale[Any, Double], minDomainExtent: Double): this.type = js.native
    
    /**
      * Gets the minimum domain value for the scale, constraining the pan/zoom
      * interaction to a minimum value in the domain.
      *
      * Note that this differs from minDomainExtent/maxDomainExtent, in that
      * those methods provide constraints such as showing at least 2 but no more
      * than 5 values at a time.
      *
      * By contrast, minDomainValue/maxDomainValue set a boundary beyond which
      * the user cannot pan/zoom.
      *
      * @param {TransformableScale} scale The scale to query
      * @returns {number} The minimum domain value for the scale.
      */
    def minDomainValue(scale: TransformableScale[Any, Double]): Double = js.native
    /**
      * Sets the minimum domain value for the scale, constraining the pan/zoom
      * interaction to a minimum value in the domain.
      *
      * Note that this differs from minDomainExtent/maxDomainExtent, in that
      * those methods provide constraints such as showing at least 2 but no more
      * than 5 values at a time.
      *
      * By contrast, minDomainValue/maxDomainValue set a boundary beyond which
      * the user cannot pan/zoom.
      *
      * @param {TransformableScale} scale The scale to query
      * @param {number} minDomainExtent The minimum domain value for the scale.
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def minDomainValue(scale: TransformableScale[Any, Double], minDomainValue: Double): this.type = js.native
    
    /**
      * Removes a callback that would be called when panning ends.
      *
      * @param {PanCallback} callback
      * @returns {this} The calling PanZoom Interaction.
      */
    def offPanEnd(callback: PanCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when any pan or zoom update occurs.
      *
      * @param {PanZoomUpdateCallback} callback
      * @returns {this} The calling PanZoom Interaction.
      */
    def offPanZoomUpdate(callback: PanZoomUpdateCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when zooming ends.
      *
      * @param {ZoomCallback} callback
      * @returns {this} The calling PanZoom Interaction.
      */
    def offZoomEnd(callback: ZoomCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when panning ends.
      *
      * @param {PanCallback} callback
      * @returns {this} The calling PanZoom Interaction.
      */
    def onPanEnd(callback: PanCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when any pan or zoom update occurs. This is
      * called on every frame, so be sure your callback is fast.
      *
      * @param {PanZoomUpdateCallback} callback
      * @returns {this} The calling PanZoom Interaction.
      */
    def onPanZoomUpdate(callback: PanZoomUpdateCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when zooming ends.
      *
      * @param {ZoomCallback} callback
      * @returns {this} The calling PanZoom Interaction.
      */
    def onZoomEnd(callback: ZoomCallback): this.type = js.native
    
    /**
      * Pans the chart by a specified amount
      *
      * @param {Plottable.Point} [translateAmount] The amount by which to translate the x and y scales.
      */
    def pan(translateAmount: Point): Unit = js.native
    
    /**
      * Removes an x scale from this PanZoom Interaction
      *
      * @param {TransformableScale} An x scale to remove
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def removeXScale(xScale: TransformableScale[Any, Double]): this.type = js.native
    
    /**
      * Removes a y scale from this PanZoom Interaction
      *
      * @param {TransformableScale} A y scale to remove
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def removeYScale(yScale: TransformableScale[Any, Double]): this.type = js.native
    
    /**
      * Uses the current domain of the scale to apply a minimum and maximum
      * domain value for that scale.
      *
      * This constrains the pan/zoom interaction to show no more than the domain
      * of the scale.
      */
    def setMinMaxDomainValuesTo(scale: TransformableScale[Any, Double]): this.type = js.native
    
    /**
      * Get the current mouse wheel filter.
      * @returns {WheelFilter}
      */
    def wheelFilter(): WheelFilter = js.native
    /** Set the current mouse wheel filter. PanZoomInteraction will only zoom
      * when the wheelFilter evaluates to true for the source wheel event. Use
      * this to define custom filters (e.g. requires shift to be held down.)
      */
    def wheelFilter(filter: WheelFilter): this.type = js.native
    
    /**
      * Gets the x scales for this PanZoom Interaction.
      */
    def xScales(): js.Array[TransformableScale[Any, Double]] = js.native
    /**
      * Sets the x scales for this PanZoom Interaction.
      *
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def xScales(xScales: js.Array[TransformableScale[Any, Double]]): this.type = js.native
    
    /**
      * Gets the y scales for this PanZoom Interaction.
      */
    def yScales(): js.Array[TransformableScale[Any, Double]] = js.native
    /**
      * Sets the y scales for this PanZoom Interaction.
      *
      * @returns {Interactions.PanZoom} The calling PanZoom Interaction.
      */
    def yScales(yScales: js.Array[TransformableScale[Any, Double]]): this.type = js.native
    
    /**
      * Zooms the chart by a specified amount around a specific point
      *
      * @param {number} [zoomAmount] The percentage by which to zoom the x and y scale.
      * A value of 0.9 zooms in by 10%. A value of 1.1 zooms out by 10%. A value of 1 has
      * no effect.
      * @param {Plottable.Point} [centerValue] The center in pixels around which to zoom.
      * By default, `centerValue` is the center of the x and y range of each scale.
      * @param {boolean} [constrained] Whether to respect the zoom extents and min/max
      * values. Default true.
      */
    def zoom(zoomAmount: Double): CenterValue = js.native
    def zoom(zoomAmount: Double, centerValue: Unit, constrained: Boolean): CenterValue = js.native
    def zoom(zoomAmount: Double, centerValue: Point): CenterValue = js.native
    def zoom(zoomAmount: Double, centerValue: Point, constrained: Boolean): CenterValue = js.native
  }
  /* static members */
  object PanZoom {
    
    @JSImport("plottable/build/src/interactions/panZoomInteraction", "PanZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of pixels occupied in a line.
      */
    @JSImport("plottable/build/src/interactions/panZoomInteraction", "PanZoom._PIXELS_PER_LINE")
    @js.native
    def _PIXELS_PER_LINE: Any = js.native
    inline def _PIXELS_PER_LINE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PIXELS_PER_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/interactions/panZoomInteraction", "PanZoom._pointDistance")
    @js.native
    def _pointDistance: Any = js.native
    inline def _pointDistance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointDistance")(x.asInstanceOf[js.Any])
    
    inline def centerPoint(point1: Point, point2: Point): X = (^.asInstanceOf[js.Dynamic].applyDynamic("centerPoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[X]
  }
  
  type PanCallback = js.Function0[Unit]
  
  type PanZoomUpdateCallback = js.Function0[Unit]
  
  type WheelFilter = js.Function1[/* wheelEvent */ WheelEvent, Boolean]
  
  type ZoomCallback = js.Function0[Unit]
}
