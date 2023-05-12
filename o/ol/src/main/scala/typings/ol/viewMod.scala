package typings.ol

import typings.ol.anon.Constraint
import typings.ol.centerconstraintMod.Type
import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.pixelMod.Pixel
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("ol/View", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {import("./ObjectEventType").Types|'change:center'|'change:resolution'|'change:rotation'} ViewObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<ViewObjectEventTypes, import("./Object").ObjectEvent, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|ViewObjectEventTypes, Return>} ViewOnSignature
    */
  /**
    * @classdesc
    * A View object represents a simple 2D view of the map.
    *
    * This is the object to act upon to change the center, resolution,
    * and rotation of the map.
    *
    * A View has a `projection`. The projection determines the
    * coordinate system of the center, and its units determine the units of the
    * resolution (projection units per pixel). The default projection is
    * Web Mercator (EPSG:3857).
    *
    * ### The view states
    *
    * A View is determined by three states: `center`, `resolution`,
    * and `rotation`. Each state has a corresponding getter and setter, e.g.
    * `getCenter` and `setCenter` for the `center` state.
    *
    * The `zoom` state is actually not saved on the view: all computations
    * internally use the `resolution` state. Still, the `setZoom` and `getZoom`
    * methods are available, as well as `getResolutionForZoom` and
    * `getZoomForResolution` to switch from one system to the other.
    *
    * ### The constraints
    *
    * `setCenter`, `setResolution` and `setRotation` can be used to change the
    * states of the view, but any constraint defined in the constructor will
    * be applied along the way.
    *
    * A View object can have a *resolution constraint*, a *rotation constraint*
    * and a *center constraint*.
    *
    * The *resolution constraint* typically restricts min/max values and
    * snaps to specific resolutions. It is determined by the following
    * options: `resolutions`, `maxResolution`, `maxZoom` and `zoomFactor`.
    * If `resolutions` is set, the other three options are ignored. See
    * documentation for each option for more information. By default, the view
    * only has a min/max restriction and allow intermediary zoom levels when
    * pinch-zooming for example.
    *
    * The *rotation constraint* snaps to specific angles. It is determined
    * by the following options: `enableRotation` and `constrainRotation`.
    * By default rotation is allowed and its value is snapped to zero when approaching the
    * horizontal.
    *
    * The *center constraint* is determined by the `extent` option. By
    * default the view center is not constrained at all.
    *
    * ### Changing the view state
    *
    * It is important to note that `setZoom`, `setResolution`, `setCenter` and
    * `setRotation` are subject to the above mentioned constraints. As such, it
    * may sometimes not be possible to know in advance the resulting state of the
    * View. For example, calling `setResolution(10)` does not guarantee that
    * `getResolution()` will return `10`.
    *
    * A consequence of this is that, when applying a delta on the view state, one
    * should use `adjustCenter`, `adjustRotation`, `adjustZoom` and `adjustResolution`
    * rather than the corresponding setters. This will let view do its internal
    * computations. Besides, the `adjust*` methods also take an `anchor`
    * argument which allows specifying an origin for the transformation.
    *
    * ### Interacting with the view
    *
    * View constraints are usually only applied when the view is *at rest*, meaning that
    * no interaction or animation is ongoing. As such, if the user puts the view in a
    * state that is not equivalent to a constrained one (e.g. rotating the view when
    * the snap angle is 0), an animation will be triggered at the interaction end to
    * put back the view to a stable state;
    *
    * @api
    */
  @JSImport("ol/View", JSImport.Default)
  @js.native
  /**
    * @param {ViewOptions} [options] View options.
    */
  open class default () extends View {
    def this(options: ViewOptions) = this()
  }
  
  inline def createCenterConstraint(options: ViewOptions): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("createCenterConstraint")(options.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def createResolutionConstraint(options: ViewOptions): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createResolutionConstraint")(options.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  inline def createRotationConstraint(options: ViewOptions): typings.ol.rotationconstraintMod.Type = ^.asInstanceOf[js.Dynamic].applyDynamic("createRotationConstraint")(options.asInstanceOf[js.Any]).asInstanceOf[typings.ol.rotationconstraintMod.Type]
  
  inline def isNoopAnimation(animation: Animation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoopAnimation")(animation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Animation extends StObject {
    
    /**
      * Anchor.
      */
    var anchor: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * Callback.
      */
    def callback(arg0: Boolean): Unit
    
    /**
      * Complete.
      */
    var complete: Boolean
    
    /**
      * Duration.
      */
    var duration: Double
    
    /**
      * Easing.
      */
    def easing(arg0: Double): Double
    
    /**
      * Source center.
      */
    var sourceCenter: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * Source resolution.
      */
    var sourceResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * Source rotation.
      */
    var sourceRotation: js.UndefOr[Double] = js.undefined
    
    /**
      * Start.
      */
    var start: Double
    
    /**
      * Target center.
      */
    var targetCenter: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * Target resolution.
      */
    var targetResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * Target rotation.
      */
    var targetRotation: js.UndefOr[Double] = js.undefined
  }
  object Animation {
    
    inline def apply(
      callback: Boolean => Unit,
      complete: Boolean,
      duration: Double,
      easing: Double => Double,
      start: Double
    ): Animation = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), complete = complete.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: Coordinate): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAnchorVarargs(value: Double*): Self = StObject.set(x, "anchor", js.Array(value*))
      
      inline def setCallback(value: Boolean => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setSourceCenter(value: Coordinate): Self = StObject.set(x, "sourceCenter", value.asInstanceOf[js.Any])
      
      inline def setSourceCenterUndefined: Self = StObject.set(x, "sourceCenter", js.undefined)
      
      inline def setSourceCenterVarargs(value: Double*): Self = StObject.set(x, "sourceCenter", js.Array(value*))
      
      inline def setSourceResolution(value: Double): Self = StObject.set(x, "sourceResolution", value.asInstanceOf[js.Any])
      
      inline def setSourceResolutionUndefined: Self = StObject.set(x, "sourceResolution", js.undefined)
      
      inline def setSourceRotation(value: Double): Self = StObject.set(x, "sourceRotation", value.asInstanceOf[js.Any])
      
      inline def setSourceRotationUndefined: Self = StObject.set(x, "sourceRotation", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTargetCenter(value: Coordinate): Self = StObject.set(x, "targetCenter", value.asInstanceOf[js.Any])
      
      inline def setTargetCenterUndefined: Self = StObject.set(x, "targetCenter", js.undefined)
      
      inline def setTargetCenterVarargs(value: Double*): Self = StObject.set(x, "targetCenter", js.Array(value*))
      
      inline def setTargetResolution(value: Double): Self = StObject.set(x, "targetResolution", value.asInstanceOf[js.Any])
      
      inline def setTargetResolutionUndefined: Self = StObject.set(x, "targetResolution", js.undefined)
      
      inline def setTargetRotation(value: Double): Self = StObject.set(x, "targetRotation", value.asInstanceOf[js.Any])
      
      inline def setTargetRotationUndefined: Self = StObject.set(x, "targetRotation", js.undefined)
    }
  }
  
  trait AnimationOptions extends StObject {
    
    /**
      * Optional anchor to remain fixed
      * during a rotation or resolution animation.
      */
    var anchor: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * The center of the view at the end of
      * the animation.
      */
    var center: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * The duration of the animation in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The easing function used
      * during the animation (defaults to {@link module :ol/easing.inAndOut}).
      * The function will be called for each frame with a number representing a
      * fraction of the animation's duration.  The function should return a number
      * between 0 and 1 representing the progress toward the destination state.
      */
    var easing: js.UndefOr[js.Function1[/* arg0 */ Double, Double]] = js.undefined
    
    /**
      * The resolution of the view at the end
      * of the animation.  If `zoom` is also provided, this option will be ignored.
      */
    var resolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The rotation of the view at the end of
      * the animation.
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * The zoom level of the view at the end of the
      * animation. This takes precedence over `resolution`.
      */
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object AnimationOptions {
    
    inline def apply(): AnimationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: Coordinate): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAnchorVarargs(value: Double*): Self = StObject.set(x, "anchor", js.Array(value*))
      
      inline def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* arg0 */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait Constraints extends StObject {
    
    def center(arg0: Unit, arg1: Double, arg2: Size): js.UndefOr[Coordinate]
    def center(arg0: Unit, arg1: Double, arg2: Size, arg3: Boolean): js.UndefOr[Coordinate]
    def center(arg0: Unit, arg1: Double, arg2: Size, arg3: Boolean, arg4: js.Array[Double]): js.UndefOr[Coordinate]
    def center(arg0: Unit, arg1: Double, arg2: Size, arg3: Unit, arg4: js.Array[Double]): js.UndefOr[Coordinate]
    /**
      * Center.
      */
    def center(arg0: Coordinate, arg1: Double, arg2: Size): js.UndefOr[Coordinate]
    def center(arg0: Coordinate, arg1: Double, arg2: Size, arg3: Boolean): js.UndefOr[Coordinate]
    def center(arg0: Coordinate, arg1: Double, arg2: Size, arg3: Boolean, arg4: js.Array[Double]): js.UndefOr[Coordinate]
    def center(arg0: Coordinate, arg1: Double, arg2: Size, arg3: Unit, arg4: js.Array[Double]): js.UndefOr[Coordinate]
    /**
      * Center.
      */
    @JSName("center")
    var center_Original: Type
    
    /**
      * Resolution.
      */
    def resolution(arg0: Double, arg1: Double, arg2: Size): js.UndefOr[Double]
    def resolution(arg0: Double, arg1: Double, arg2: Size, arg3: Boolean): js.UndefOr[Double]
    def resolution(arg0: Unit, arg1: Double, arg2: Size): js.UndefOr[Double]
    def resolution(arg0: Unit, arg1: Double, arg2: Size, arg3: Boolean): js.UndefOr[Double]
    /**
      * Resolution.
      */
    @JSName("resolution")
    var resolution_Original: typings.ol.resolutionconstraintMod.Type
    
    /**
      * Rotation.
      */
    def rotation(): js.UndefOr[Double]
    def rotation(arg0: Double): js.UndefOr[Double]
    def rotation(arg0: Double, arg1: Boolean): js.UndefOr[Double]
    def rotation(arg0: Unit, arg1: Boolean): js.UndefOr[Double]
    /**
      * Rotation.
      */
    @JSName("rotation")
    var rotation_Original: typings.ol.rotationconstraintMod.Type
  }
  object Constraints {
    
    inline def apply(
      center: (/* arg0 */ js.UndefOr[Coordinate], /* arg1 */ Double, /* arg2 */ Size, /* arg3 */ js.UndefOr[Boolean], /* arg4 */ js.UndefOr[js.Array[Double]]) => js.UndefOr[Coordinate],
      resolution: (/* arg0 */ js.UndefOr[Double], /* arg1 */ Double, /* arg2 */ Size, /* arg3 */ js.UndefOr[Boolean]) => js.UndefOr[Double],
      rotation: (/* arg0 */ js.UndefOr[Double], /* arg1 */ js.UndefOr[Boolean]) => js.UndefOr[Double]
    ): Constraints = {
      val __obj = js.Dynamic.literal(center = js.Any.fromFunction5(center), resolution = js.Any.fromFunction4(resolution), rotation = js.Any.fromFunction2(rotation))
      __obj.asInstanceOf[Constraints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constraints] (val x: Self) extends AnyVal {
      
      inline def setCenter(
        value: (/* arg0 */ js.UndefOr[Coordinate], /* arg1 */ Double, /* arg2 */ Size, /* arg3 */ js.UndefOr[Boolean], /* arg4 */ js.UndefOr[js.Array[Double]]) => js.UndefOr[Coordinate]
      ): Self = StObject.set(x, "center", js.Any.fromFunction5(value))
      
      inline def setResolution(
        value: (/* arg0 */ js.UndefOr[Double], /* arg1 */ Double, /* arg2 */ Size, /* arg3 */ js.UndefOr[Boolean]) => js.UndefOr[Double]
      ): Self = StObject.set(x, "resolution", js.Any.fromFunction4(value))
      
      inline def setRotation(value: (/* arg0 */ js.UndefOr[Double], /* arg1 */ js.UndefOr[Boolean]) => js.UndefOr[Double]): Self = StObject.set(x, "rotation", js.Any.fromFunction2(value))
    }
  }
  
  trait FitOptions extends StObject {
    
    /**
      * Function called when the view is in
      * its final position. The callback will be called with `true` if the animation
      * series completed on its own or `false` if it was cancelled.
      */
    var callback: js.UndefOr[js.Function1[/* arg0 */ Boolean, Unit]] = js.undefined
    
    /**
      * The duration of the animation in milliseconds.
      * By default, there is no animation to the target extent.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The easing function used during
      * the animation (defaults to {@link module :ol/easing.inAndOut}).
      * The function will be called for each frame with a number representing a
      * fraction of the animation's duration.  The function should return a number
      * between 0 and 1 representing the progress toward the destination state.
      */
    var easing: js.UndefOr[js.Function1[/* arg0 */ Double, Double]] = js.undefined
    
    /**
      * Maximum zoom level that we zoom to. If
      * `minResolution` is given, this property is ignored.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum resolution that we zoom to.
      */
    var minResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * If the view `constrainResolution` option is `true`,
      * get the nearest extent instead of the closest that actually fits the view.
      */
    var nearest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Padding (in pixels) to be
      * cleared inside the view. Values in the array are top, right, bottom and left
      * padding.
      */
    var padding: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The size in pixels of the box to fit
      * the extent into. Default is the current size of the first map in the DOM that
      * uses this view, or `[100, 100]` if no such map is found.
      */
    var size: js.UndefOr[Size] = js.undefined
  }
  object FitOptions {
    
    inline def apply(): FitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FitOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: /* arg0 */ Boolean => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* arg0 */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setNearest(value: Boolean): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      inline def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
    }
  }
  
  trait State extends StObject {
    
    /**
      * Center.
      */
    var center: Coordinate
    
    /**
      * The next center during an animation series.
      */
    var nextCenter: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * The next resolution during an animation series.
      */
    var nextResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The next rotation during an animation series.
      */
    var nextRotation: js.UndefOr[Double] = js.undefined
    
    /**
      * Projection.
      */
    var projection: typings.ol.projProjectionMod.default
    
    /**
      * Resolution.
      */
    var resolution: Double
    
    /**
      * Rotation.
      */
    var rotation: Double
    
    /**
      * Zoom.
      */
    var zoom: Double
  }
  object State {
    
    inline def apply(
      center: Coordinate,
      projection: typings.ol.projProjectionMod.default,
      resolution: Double,
      rotation: Double,
      zoom: Double
    ): State = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setNextCenter(value: Coordinate): Self = StObject.set(x, "nextCenter", value.asInstanceOf[js.Any])
      
      inline def setNextCenterUndefined: Self = StObject.set(x, "nextCenter", js.undefined)
      
      inline def setNextCenterVarargs(value: Double*): Self = StObject.set(x, "nextCenter", js.Array(value*))
      
      inline def setNextResolution(value: Double): Self = StObject.set(x, "nextResolution", value.asInstanceOf[js.Any])
      
      inline def setNextResolutionUndefined: Self = StObject.set(x, "nextResolution", js.undefined)
      
      inline def setNextRotation(value: Double): Self = StObject.set(x, "nextRotation", value.asInstanceOf[js.Any])
      
      inline def setNextRotationUndefined: Self = StObject.set(x, "nextRotation", js.undefined)
      
      inline def setProjection(value: typings.ol.projProjectionMod.default): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @typedef {import("./ObjectEventType").Types|'change:center'|'change:resolution'|'change:rotation'} ViewObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<ViewObjectEventTypes, import("./Object").ObjectEvent, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|ViewObjectEventTypes, Return>} ViewOnSignature
    */
  /**
    * @classdesc
    * A View object represents a simple 2D view of the map.
    *
    * This is the object to act upon to change the center, resolution,
    * and rotation of the map.
    *
    * A View has a `projection`. The projection determines the
    * coordinate system of the center, and its units determine the units of the
    * resolution (projection units per pixel). The default projection is
    * Web Mercator (EPSG:3857).
    *
    * ### The view states
    *
    * A View is determined by three states: `center`, `resolution`,
    * and `rotation`. Each state has a corresponding getter and setter, e.g.
    * `getCenter` and `setCenter` for the `center` state.
    *
    * The `zoom` state is actually not saved on the view: all computations
    * internally use the `resolution` state. Still, the `setZoom` and `getZoom`
    * methods are available, as well as `getResolutionForZoom` and
    * `getZoomForResolution` to switch from one system to the other.
    *
    * ### The constraints
    *
    * `setCenter`, `setResolution` and `setRotation` can be used to change the
    * states of the view, but any constraint defined in the constructor will
    * be applied along the way.
    *
    * A View object can have a *resolution constraint*, a *rotation constraint*
    * and a *center constraint*.
    *
    * The *resolution constraint* typically restricts min/max values and
    * snaps to specific resolutions. It is determined by the following
    * options: `resolutions`, `maxResolution`, `maxZoom` and `zoomFactor`.
    * If `resolutions` is set, the other three options are ignored. See
    * documentation for each option for more information. By default, the view
    * only has a min/max restriction and allow intermediary zoom levels when
    * pinch-zooming for example.
    *
    * The *rotation constraint* snaps to specific angles. It is determined
    * by the following options: `enableRotation` and `constrainRotation`.
    * By default rotation is allowed and its value is snapped to zero when approaching the
    * horizontal.
    *
    * The *center constraint* is determined by the `extent` option. By
    * default the view center is not constrained at all.
    *
    * ### Changing the view state
    *
    * It is important to note that `setZoom`, `setResolution`, `setCenter` and
    * `setRotation` are subject to the above mentioned constraints. As such, it
    * may sometimes not be possible to know in advance the resulting state of the
    * View. For example, calling `setResolution(10)` does not guarantee that
    * `getResolution()` will return `10`.
    *
    * A consequence of this is that, when applying a delta on the view state, one
    * should use `adjustCenter`, `adjustRotation`, `adjustZoom` and `adjustResolution`
    * rather than the corresponding setters. This will let view do its internal
    * computations. Besides, the `adjust*` methods also take an `anchor`
    * argument which allows specifying an origin for the transformation.
    *
    * ### Interacting with the view
    *
    * View constraints are usually only applied when the view is *at rest*, meaning that
    * no interaction or animation is ongoing. As such, if the user puts the view in a
    * state that is not equivalent to a constrained one (e.g. rotating the view when
    * the snap angle is 0), an animation will be triggered at the interaction end to
    * put back the view to a stable state;
    *
    * @api
    */
  @js.native
  trait View
    extends typings.ol.objectMod.default {
    
    /**
      * Adds relative coordinates to the center of the view. Any extent constraint will apply.
      * @param {import("./coordinate.js").Coordinate} deltaCoordinates Relative value to add.
      * @api
      */
    def adjustCenter(deltaCoordinates: Coordinate): Unit = js.native
    
    /**
      * Adds relative coordinates to the center of the view. Any extent constraint will apply.
      * @param {import("./coordinate.js").Coordinate} deltaCoordinates Relative value to add.
      */
    def adjustCenterInternal(deltaCoordinates: Coordinate): Unit = js.native
    
    /**
      * Multiply the view resolution by a ratio, optionally using an anchor. Any resolution
      * constraint will apply.
      * @param {number} ratio The ratio to apply on the view resolution.
      * @param {import("./coordinate.js").Coordinate} [anchor] The origin of the transformation.
      * @api
      */
    def adjustResolution(ratio: Double): Unit = js.native
    def adjustResolution(ratio: Double, anchor: Coordinate): Unit = js.native
    
    /**
      * Multiply the view resolution by a ratio, optionally using an anchor. Any resolution
      * constraint will apply.
      * @param {number} ratio The ratio to apply on the view resolution.
      * @param {import("./coordinate.js").Coordinate} [anchor] The origin of the transformation.
      */
    def adjustResolutionInternal(ratio: Double): Unit = js.native
    def adjustResolutionInternal(ratio: Double, anchor: Coordinate): Unit = js.native
    
    /**
      * Adds a value to the view rotation, optionally using an anchor. Any rotation
      * constraint will apply.
      * @param {number} delta Relative value to add to the zoom rotation, in radians.
      * @param {import("./coordinate.js").Coordinate} [anchor] The rotation center.
      * @api
      */
    def adjustRotation(delta: Double): Unit = js.native
    def adjustRotation(delta: Double, anchor: Coordinate): Unit = js.native
    
    /**
      * @param {number} delta Relative value to add to the zoom rotation, in radians.
      * @param {import("./coordinate.js").Coordinate} [anchor] The rotation center.
      */
    def adjustRotationInternal(delta: Double): Unit = js.native
    def adjustRotationInternal(delta: Double, anchor: Coordinate): Unit = js.native
    
    /**
      * Adds a value to the view zoom level, optionally using an anchor. Any resolution
      * constraint will apply.
      * @param {number} delta Relative value to add to the zoom level.
      * @param {import("./coordinate.js").Coordinate} [anchor] The origin of the transformation.
      * @api
      */
    def adjustZoom(delta: Double): Unit = js.native
    def adjustZoom(delta: Double, anchor: Coordinate): Unit = js.native
    
    /**
      * Animate the view.  The view's center, zoom (or resolution), and rotation
      * can be animated for smooth transitions between view states.  For example,
      * to animate the view to a new zoom level:
      *
      *     view.animate({zoom: view.getZoom() + 1});
      *
      * By default, the animation lasts one second and uses in-and-out easing.  You
      * can customize this behavior by including `duration` (in milliseconds) and
      * `easing` options (see {@link module:ol/easing}).
      *
      * To chain together multiple animations, call the method with multiple
      * animation objects.  For example, to first zoom and then pan:
      *
      *     view.animate({zoom: 10}, {center: [0, 0]});
      *
      * If you provide a function as the last argument to the animate method, it
      * will get called at the end of an animation series.  The callback will be
      * called with `true` if the animation series completed on its own or `false`
      * if it was cancelled.
      *
      * Animations are cancelled by user interactions (e.g. dragging the map) or by
      * calling `view.setCenter()`, `view.setResolution()`, or `view.setRotation()`
      * (or another method that calls one of these).
      *
      * @param {...(AnimationOptions|function(boolean): void)} var_args Animation
      *     options.  Multiple animations can be run in series by passing multiple
      *     options objects.  To run multiple animations in parallel, call the method
      *     multiple times.  An optional callback can be provided as a final
      *     argument.  The callback will be called with a boolean indicating whether
      *     the animation completed without being cancelled.
      * @api
      */
    def animate(args: (AnimationOptions | (js.Function1[/* arg0 */ Boolean, Unit]))*): Unit = js.native
    
    /**
      * @param {...(AnimationOptions|function(boolean): void)} var_args Animation options.
      */
    def animateInternal(args: (AnimationOptions | (js.Function1[/* arg0 */ Boolean, Unit]))*): Unit = js.native
    
    /**
      * @private
      * @type {Array<Array<Animation>>}
      */
    /* private */ var animations_ : Any = js.native
    
    /**
      * Set up the view with the given options.
      * @param {ViewOptions} options View options.
      */
    def applyOptions_(options: ViewOptions): Unit = js.native
    
    /**
      * Recompute rotation/resolution/center based on target values.
      * Note: we have to compute rotation first, then resolution and center considering that
      * parameters can influence one another in case a view extent constraint is present.
      * @param {boolean} [doNotCancelAnims] Do not cancel animations.
      * @param {boolean} [forceMoving] Apply constraints as if the view is moving.
      * @private
      */
    /* private */ var applyTargetState_ : Any = js.native
    
    /**
      * Notify the View that an interaction has started.
      * The view state will be resolved to a stable one if needed
      * (depending on its constraints).
      * @api
      */
    def beginInteraction(): Unit = js.native
    
    /**
      * @param {number} rotation Target rotation.
      * @param {import("./coordinate.js").Coordinate} anchor Rotation anchor.
      * @return {import("./coordinate.js").Coordinate|undefined} Center for rotation and anchor.
      */
    def calculateCenterRotate(rotation: Double, anchor: Coordinate): js.UndefOr[Coordinate] = js.native
    
    /**
      * Calculates the shift between map and viewport center.
      * @param {import("./coordinate.js").Coordinate} center Center.
      * @param {number} resolution Resolution.
      * @param {number} rotation Rotation.
      * @param {import("./size.js").Size} size Size.
      * @return {Array<number>|undefined} Center shift.
      */
    def calculateCenterShift(center: Coordinate, resolution: Double, rotation: Double, size: Size): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @param {number} resolution Target resolution.
      * @param {import("./coordinate.js").Coordinate} anchor Zoom anchor.
      * @return {import("./coordinate.js").Coordinate|undefined} Center for resolution and anchor.
      */
    def calculateCenterZoom(resolution: Double, anchor: Coordinate): js.UndefOr[Coordinate] = js.native
    
    /**
      * Calculate the extent for the current view state and the passed size.
      * The size is the pixel dimensions of the box into which the calculated extent
      * should fit. In most cases you want to get the extent of the entire map,
      * that is `map.getSize()`.
      * @param {import("./size.js").Size} [size] Box pixel size. If not provided, the size
      * of the map that uses this view will be used.
      * @return {import("./extent.js").Extent} Extent.
      * @api
      */
    def calculateExtent(): Extent = js.native
    def calculateExtent(size: Size): Extent = js.native
    
    /**
      * @param {import("./size.js").Size} [size] Box pixel size. If not provided,
      * the map's last known viewport size will be used.
      * @return {import("./extent.js").Extent} Extent.
      */
    def calculateExtentInternal(): Extent = js.native
    def calculateExtentInternal(size: Size): Extent = js.native
    
    /**
      * @private
      * @type {import("./coordinate.js").Coordinate|undefined}
      */
    /* private */ var cancelAnchor_ : Any = js.native
    
    /**
      * Cancel any ongoing animations.
      * @api
      */
    def cancelAnimations(): Unit = js.native
    
    /**
      * Center on coordinate and view position.
      * @param {import("./coordinate.js").Coordinate} coordinate Coordinate.
      * @param {import("./size.js").Size} size Box pixel size.
      * @param {import("./pixel.js").Pixel} position Position on the view to center on.
      * @api
      */
    def centerOn(coordinate: Coordinate, size: Size, position: Pixel): Unit = js.native
    
    /**
      * @param {import("./coordinate.js").Coordinate} coordinate Coordinate.
      * @param {import("./size.js").Size} size Box pixel size.
      * @param {import("./pixel.js").Pixel} position Position on the view to center on.
      */
    def centerOnInternal(coordinate: Coordinate, size: Size, position: Pixel): Unit = js.native
    
    /**
      * @private
      * @type {Constraints}
      */
    /* private */ var constraints_ : Any = js.native
    
    /**
      * Notify the View that an interaction has ended. The view state will be resolved
      * to a stable one if needed (depending on its constraints).
      * @param {number} [duration] Animation duration in ms.
      * @param {number} [resolutionDirection] Which direction to zoom.
      * @param {import("./coordinate.js").Coordinate} [anchor] The origin of the transformation.
      * @api
      */
    def endInteraction(): Unit = js.native
    def endInteraction(duration: Double): Unit = js.native
    def endInteraction(duration: Double, resolutionDirection: Double): Unit = js.native
    def endInteraction(duration: Double, resolutionDirection: Double, anchor: Coordinate): Unit = js.native
    def endInteraction(duration: Double, resolutionDirection: Unit, anchor: Coordinate): Unit = js.native
    def endInteraction(duration: Unit, resolutionDirection: Double): Unit = js.native
    def endInteraction(duration: Unit, resolutionDirection: Double, anchor: Coordinate): Unit = js.native
    def endInteraction(duration: Unit, resolutionDirection: Unit, anchor: Coordinate): Unit = js.native
    
    /**
      * Notify the View that an interaction has ended. The view state will be resolved
      * to a stable one if needed (depending on its constraints).
      * @param {number} [duration] Animation duration in ms.
      * @param {number} [resolutionDirection] Which direction to zoom.
      * @param {import("./coordinate.js").Coordinate} [anchor] The origin of the transformation.
      */
    def endInteractionInternal(): Unit = js.native
    def endInteractionInternal(duration: Double): Unit = js.native
    def endInteractionInternal(duration: Double, resolutionDirection: Double): Unit = js.native
    def endInteractionInternal(duration: Double, resolutionDirection: Double, anchor: Coordinate): Unit = js.native
    def endInteractionInternal(duration: Double, resolutionDirection: Unit, anchor: Coordinate): Unit = js.native
    def endInteractionInternal(duration: Unit, resolutionDirection: Double): Unit = js.native
    def endInteractionInternal(duration: Unit, resolutionDirection: Double, anchor: Coordinate): Unit = js.native
    def endInteractionInternal(duration: Unit, resolutionDirection: Unit, anchor: Coordinate): Unit = js.native
    
    def fit(geometryOrExtent: Extent): Unit = js.native
    def fit(geometryOrExtent: Extent, options: FitOptions): Unit = js.native
    /**
      * Fit the given geometry or extent based on the given map size and border.
      * The size is pixel dimensions of the box to fit the extent into.
      * In most cases you will want to use the map size, that is `map.getSize()`.
      * Takes care of the map angle.
      * @param {import("./geom/SimpleGeometry.js").default|import("./extent.js").Extent} geometryOrExtent The geometry or
      *     extent to fit the view to.
      * @param {FitOptions} [options] Options.
      * @api
      */
    def fit(geometryOrExtent: typings.ol.geomSimpleGeometryMod.default): Unit = js.native
    def fit(geometryOrExtent: typings.ol.geomSimpleGeometryMod.default, options: FitOptions): Unit = js.native
    
    /**
      * @param {import("./geom/SimpleGeometry.js").default} geometry The geometry.
      * @param {FitOptions} [options] Options.
      */
    def fitInternal(geometry: typings.ol.geomSimpleGeometryMod.default): Unit = js.native
    def fitInternal(geometry: typings.ol.geomSimpleGeometryMod.default, options: FitOptions): Unit = js.native
    
    /**
      * Determine if the view is being animated.
      * @return {boolean} The view is being animated.
      * @api
      */
    def getAnimating(): Boolean = js.native
    
    /**
      * Get the view center.
      * @return {import("./coordinate.js").Coordinate|undefined} The center of the view.
      * @observable
      * @api
      */
    def getCenter(): js.UndefOr[Coordinate] = js.native
    
    /**
      * Get the view center without transforming to user projection.
      * @return {import("./coordinate.js").Coordinate|undefined} The center of the view.
      */
    def getCenterInternal(): js.UndefOr[Coordinate] = js.native
    
    /**
      * @return {boolean} Resolution constraint is set
      */
    def getConstrainResolution(): Boolean = js.native
    
    /**
      * Get a valid position for the view center according to the current constraints.
      * @param {import("./coordinate.js").Coordinate|undefined} targetCenter Target center position.
      * @param {number} [targetResolution] Target resolution. If not supplied, the current one will be used.
      * This is useful to guess a valid center position at a different zoom level.
      * @return {import("./coordinate.js").Coordinate|undefined} Valid center position.
      */
    def getConstrainedCenter(): js.UndefOr[Coordinate] = js.native
    def getConstrainedCenter(targetCenter: Unit, targetResolution: Double): js.UndefOr[Coordinate] = js.native
    def getConstrainedCenter(targetCenter: Coordinate): js.UndefOr[Coordinate] = js.native
    def getConstrainedCenter(targetCenter: Coordinate, targetResolution: Double): js.UndefOr[Coordinate] = js.native
    
    /**
      * Get a valid resolution according to the current view constraints.
      * @param {number|undefined} targetResolution Target resolution.
      * @param {number} [direction=0] Indicate which resolution should be used
      * by a renderer if the view resolution does not match any resolution of the tile source.
      * If 0, the nearest resolution will be used. If 1, the nearest lower resolution
      * will be used. If -1, the nearest higher resolution will be used.
      * @return {number|undefined} Valid resolution.
      */
    def getConstrainedResolution(): js.UndefOr[Double] = js.native
    def getConstrainedResolution(targetResolution: Double): js.UndefOr[Double] = js.native
    def getConstrainedResolution(targetResolution: Double, direction: Double): js.UndefOr[Double] = js.native
    def getConstrainedResolution(targetResolution: Unit, direction: Double): js.UndefOr[Double] = js.native
    
    /**
      * Get a valid zoom level according to the current view constraints.
      * @param {number|undefined} targetZoom Target zoom.
      * @param {number} [direction=0] Indicate which resolution should be used
      * by a renderer if the view resolution does not match any resolution of the tile source.
      * If 0, the nearest resolution will be used. If 1, the nearest lower resolution
      * will be used. If -1, the nearest higher resolution will be used.
      * @return {number|undefined} Valid zoom level.
      */
    def getConstrainedZoom(): js.UndefOr[Double] = js.native
    def getConstrainedZoom(targetZoom: Double): js.UndefOr[Double] = js.native
    def getConstrainedZoom(targetZoom: Double, direction: Double): js.UndefOr[Double] = js.native
    def getConstrainedZoom(targetZoom: Unit, direction: Double): js.UndefOr[Double] = js.native
    
    /**
      * @return {Constraints} Constraints.
      */
    def getConstraints(): Constraints = js.native
    
    /**
      * @param {Array<number>} [hints] Destination array.
      * @return {Array<number>} Hint.
      */
    def getHints(): js.Array[Double] = js.native
    def getHints(hints: js.Array[Double]): js.Array[Double] = js.native
    
    /**
      * Determine if the user is interacting with the view, such as panning or zooming.
      * @return {boolean} The view is being interacted with.
      * @api
      */
    def getInteracting(): Boolean = js.native
    
    /**
      * Get the maximum resolution of the view.
      * @return {number} The maximum resolution of the view.
      * @api
      */
    def getMaxResolution(): Double = js.native
    
    /**
      * Get the maximum zoom level for the view.
      * @return {number} The maximum zoom level.
      * @api
      */
    def getMaxZoom(): Double = js.native
    
    /**
      * Get the minimum resolution of the view.
      * @return {number} The minimum resolution of the view.
      * @api
      */
    def getMinResolution(): Double = js.native
    
    /**
      * Get the minimum zoom level for the view.
      * @return {number} The minimum zoom level.
      * @api
      */
    def getMinZoom(): Double = js.native
    
    /**
      * Get the view projection.
      * @return {import("./proj/Projection.js").default} The projection of the view.
      * @api
      */
    def getProjection(): typings.ol.projProjectionMod.default = js.native
    
    /**
      * Get the view resolution.
      * @return {number|undefined} The resolution of the view.
      * @observable
      * @api
      */
    def getResolution(): js.UndefOr[Double] = js.native
    
    /**
      * Get the resolution for a provided extent (in map units) and size (in pixels).
      * @param {import("./extent.js").Extent} extent Extent.
      * @param {import("./size.js").Size} [size] Box pixel size.
      * @return {number} The resolution at which the provided extent will render at
      *     the given size.
      * @api
      */
    def getResolutionForExtent(extent: Extent): Double = js.native
    def getResolutionForExtent(extent: Extent, size: Size): Double = js.native
    
    /**
      * Get the resolution for a provided extent (in map units) and size (in pixels).
      * @param {import("./extent.js").Extent} extent Extent.
      * @param {import("./size.js").Size} [size] Box pixel size.
      * @return {number} The resolution at which the provided extent will render at
      *     the given size.
      */
    def getResolutionForExtentInternal(extent: Extent): Double = js.native
    def getResolutionForExtentInternal(extent: Extent, size: Size): Double = js.native
    
    /**
      * Return a function that returns a value between 0 and 1 for a
      * resolution. Exponential scaling is assumed.
      * @param {number} [power] Power.
      * @return {function(number): number} Resolution for value function.
      */
    def getResolutionForValueFunction(): js.Function1[/* arg0 */ Double, Double] = js.native
    def getResolutionForValueFunction(power: Double): js.Function1[/* arg0 */ Double, Double] = js.native
    
    /**
      * Get the resolution for a zoom level.
      * @param {number} zoom Zoom level.
      * @return {number} The view resolution for the provided zoom level.
      * @api
      */
    def getResolutionForZoom(zoom: Double): Double = js.native
    
    /**
      * Get the resolutions for the view. This returns the array of resolutions
      * passed to the constructor of the View, or undefined if none were given.
      * @return {Array<number>|undefined} The resolutions of the view.
      * @api
      */
    def getResolutions(): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * Get the view rotation.
      * @return {number} The rotation of the view in radians.
      * @observable
      * @api
      */
    def getRotation(): Double = js.native
    
    /**
      * @return {State} View state.
      */
    def getState(): State = js.native
    
    /**
      * Get an updated version of the view options used to construct the view.  The
      * current resolution (or zoom), center, and rotation are applied to any stored
      * options.  The provided options can be used to apply new min/max zoom or
      * resolution limits.
      * @param {ViewOptions} newOptions New options to be applied.
      * @return {ViewOptions} New options updated with the current view state.
      */
    def getUpdatedOptions_(newOptions: ViewOptions): ViewOptions = js.native
    
    /**
      * Return a function that returns a resolution for a value between
      * 0 and 1. Exponential scaling is assumed.
      * @param {number} [power] Power.
      * @return {function(number): number} Value for resolution function.
      */
    def getValueForResolutionFunction(): js.Function1[/* arg0 */ Double, Double] = js.native
    def getValueForResolutionFunction(power: Double): js.Function1[/* arg0 */ Double, Double] = js.native
    
    /**
      * @return {ViewStateAndExtent} Like `FrameState`, but just `viewState` and `extent`.
      */
    def getViewStateAndExtent(): ViewStateAndExtent = js.native
    
    /**
      * Returns the size of the viewport minus padding.
      * @private
      * @param {number} [rotation] Take into account the rotation of the viewport when giving the size
      * @return {import("./size.js").Size} Viewport size reduced by the padding.
      */
    /* private */ var getViewportSizeMinusPadding_ : Any = js.native
    
    /**
      * Returns the current viewport size.
      * @private
      * @param {number} [rotation] Take into account the rotation of the viewport when giving the size
      * @return {import("./size.js").Size} Viewport size or `[100, 100]` when no viewport is found.
      */
    /* private */ var getViewportSize_ : Any = js.native
    
    /**
      * Get the current zoom level. This method may return non-integer zoom levels
      * if the view does not constrain the resolution, or if an interaction or
      * animation is underway.
      * @return {number|undefined} Zoom.
      * @api
      */
    def getZoom(): js.UndefOr[Double] = js.native
    
    /**
      * Get the zoom level for a resolution.
      * @param {number} resolution The resolution.
      * @return {number|undefined} The zoom level for the provided resolution.
      * @api
      */
    def getZoomForResolution(resolution: Double): js.UndefOr[Double] = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var hints_ : Any = js.native
    
    /**
      * @return {boolean} Is defined.
      */
    def isDef(): Boolean = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxResolution_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var minResolution_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var minZoom_ : Any = js.native
    
    /**
      * @private
      * @type {import("./coordinate.js").Coordinate}
      */
    /* private */ var nextCenter_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var nextResolution_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var nextRotation_ : Any = js.native
    
    /***
      * @type {ViewOnSignature<import("./events").EventsKey>}
      */
    @JSName("on")
    var on_View: ViewOnSignature[EventsKey] = js.native
    
    /***
      * @type {ViewOnSignature<import("./events").EventsKey>}
      */
    @JSName("once")
    var once_View: ViewOnSignature[EventsKey] = js.native
    
    /**
      * Padding (in css pixels).
      * If the map viewport is partially covered with other content (overlays) along
      * its edges, this setting allows to shift the center of the viewport away from that
      * content. The order of the values in the array is top, right, bottom, left.
      * The default is no padding, which is equivalent to `[0, 0, 0, 0]`.
      * @type {Array<number>|undefined}
      * @api
      */
    def padding: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @type {Array<number>|undefined}
      * @private
      */
    /* private */ var padding_ : Any = js.native
    
    def padding_=(arg: js.UndefOr[js.Array[Double]]): Unit = js.native
    
    /**
      * @private
      * @const
      * @type {import("./proj/Projection.js").default}
      */
    /* private */ var projection_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>|undefined}
      */
    /* private */ var resolutions_ : Any = js.native
    
    /**
      * If any constraints need to be applied, an animation will be triggered.
      * This is typically done on interaction end.
      * Note: calling this with a duration of 0 will apply the constrained values straight away,
      * without animation.
      * @param {number} [duration] The animation duration in ms.
      * @param {number} [resolutionDirection] Which direction to zoom.
      * @param {import("./coordinate.js").Coordinate} [anchor] The origin of the transformation.
      */
    def resolveConstraints(): Unit = js.native
    def resolveConstraints(duration: Double): Unit = js.native
    def resolveConstraints(duration: Double, resolutionDirection: Double): Unit = js.native
    def resolveConstraints(duration: Double, resolutionDirection: Double, anchor: Coordinate): Unit = js.native
    def resolveConstraints(duration: Double, resolutionDirection: Unit, anchor: Coordinate): Unit = js.native
    def resolveConstraints(duration: Unit, resolutionDirection: Double): Unit = js.native
    def resolveConstraints(duration: Unit, resolutionDirection: Double, anchor: Coordinate): Unit = js.native
    def resolveConstraints(duration: Unit, resolutionDirection: Unit, anchor: Coordinate): Unit = js.native
    
    /**
      * Calculate rotated extent
      * @param {import("./geom/SimpleGeometry.js").default} geometry The geometry.
      * @return {import("./extent").Extent} The rotated extent for the geometry.
      */
    def rotatedExtentForGeometry(geometry: typings.ol.geomSimpleGeometryMod.default): Extent = js.native
    
    /**
      * Set the center of the current view. Any extent constraint will apply.
      * @param {import("./coordinate.js").Coordinate|undefined} center The center of the view.
      * @observable
      * @api
      */
    def setCenter(): Unit = js.native
    def setCenter(center: Coordinate): Unit = js.native
    
    /**
      * Set the center using the view projection (not the user projection).
      * @param {import("./coordinate.js").Coordinate|undefined} center The center of the view.
      */
    def setCenterInternal(): Unit = js.native
    def setCenterInternal(center: Coordinate): Unit = js.native
    
    /**
      * Set whether the view should allow intermediary zoom levels.
      * @param {boolean} enabled Whether the resolution is constrained.
      * @api
      */
    def setConstrainResolution(enabled: Boolean): Unit = js.native
    
    /**
      * @param {import("./ViewHint.js").default} hint Hint.
      * @param {number} delta Delta.
      * @return {number} New value.
      */
    def setHint(hint: Any, delta: Double): Double = js.native
    
    /**
      * Set a new maximum zoom level for the view.
      * @param {number} zoom The maximum zoom level.
      * @api
      */
    def setMaxZoom(zoom: Double): Unit = js.native
    
    /**
      * Set a new minimum zoom level for the view.
      * @param {number} zoom The minimum zoom level.
      * @api
      */
    def setMinZoom(zoom: Double): Unit = js.native
    
    /**
      * Set the resolution for this view. Any resolution constraint will apply.
      * @param {number|undefined} resolution The resolution of the view.
      * @observable
      * @api
      */
    def setResolution(): Unit = js.native
    def setResolution(resolution: Double): Unit = js.native
    
    /**
      * Set the rotation for this view. Any rotation constraint will apply.
      * @param {number} rotation The rotation of the view in radians.
      * @observable
      * @api
      */
    def setRotation(rotation: Double): Unit = js.native
    
    /**
      * Stores the viewport size on the view. The viewport size is not read every time from the DOM
      * to avoid performance hit and layout reflow.
      * This should be done on map size change.
      * Note: the constraints are not resolved during an animation to avoid stopping it
      * @param {import("./size.js").Size} [size] Viewport size; if undefined, [100, 100] is assumed
      */
    def setViewportSize(): Unit = js.native
    def setViewportSize(size: Size): Unit = js.native
    
    /**
      * Zoom to a specific zoom level. Any resolution constrain will apply.
      * @param {number} zoom Zoom level.
      * @api
      */
    def setZoom(zoom: Double): Unit = js.native
    
    /**
      * @private
      * @type {import("./coordinate.js").Coordinate|undefined}
      */
    /* private */ var targetCenter_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var targetResolution_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var targetRotation_ : Any = js.native
    
    /***
      * @type {ViewOnSignature<void>}
      */
    @JSName("un")
    var un_View: ViewOnSignature[Unit] = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var updateAnimationKey_ : Any = js.native
    
    /**
      * Update all animations.
      */
    def updateAnimations_(): Unit = js.native
    
    /**
      * @private
      * @type {import("./size.js").Size}
      */
    /* private */ var viewportSize_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var zoomFactor_ : Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.objectEventTypeMod.Types
    - typings.ol.olStrings.changeColoncenter
    - typings.ol.olStrings.changeColonresolution
    - typings.ol.olStrings.changeColonrotation
  */
  type ViewObjectEventTypes = _ViewObjectEventTypes | Types
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait ViewOnSignature[Return]
    extends OnSignature[
          EventTypes | ViewObjectEventTypes, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait ViewOptions extends StObject {
    
    /**
      * The initial center for
      * the view. If a user projection is not set, the coordinate system for the center is
      * specified with the `projection` option. Layer sources will not be fetched if this
      * is not set, but the center can be set later with {@link  #setCenter}.
      */
    var center: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * If true, the extent
      * constraint will only apply to the view center and not the whole extent.
      */
    var constrainOnlyCenter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the view will always
      * animate to the closest zoom level after an interaction; false means
      * intermediary zoom levels are allowed.
      */
    var constrainResolution: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rotation constraint.
      * `false` means no constraint. `true` means no constraint, but snap to zero
      * near zero. A number constrains the rotation to that number of values. For
      * example, `4` will constrain the rotation to 0, 90, 180, and 270 degrees.
      */
    var constrainRotation: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * Enable rotation.
      * If `false`, a rotation constraint that always sets the rotation to zero is
      * used. The `constrainRotation` option has no effect if `enableRotation` is
      * `false`.
      */
    var enableRotation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The extent that constrains the
      * view, in other words, nothing outside of this extent can be visible on the map.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * The maximum resolution used to determine
      * the resolution constraint. It is used together with `minResolution` (or
      * `maxZoom`) and `zoomFactor`. If unspecified it is calculated in such a way
      * that the projection's validity extent fits in a 256x256 px tile. If the
      * projection is Spherical Mercator (the default) then `maxResolution` defaults
      * to `40075016.68557849 / 256 = 156543.03392804097`.
      */
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum zoom level used to determine the
      * resolution constraint. It is used together with `minZoom` (or
      * `maxResolution`) and `zoomFactor`.  Note that if `minResolution` is also
      * provided, it is given precedence over `maxZoom`.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum resolution used to determine
      * the resolution constraint.  It is used together with `maxResolution` (or
      * `minZoom`) and `zoomFactor`.  If unspecified it is calculated assuming 29
      * zoom levels (with a factor of 2). If the projection is Spherical Mercator
      * (the default) then `minResolution` defaults to
      * `40075016.68557849 / 256 / Math.pow(2, 28) = 0.0005831682455839253`.
      */
    var minResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum zoom level used to determine the
      * resolution constraint. It is used together with `maxZoom` (or
      * `minResolution`) and `zoomFactor`.  Note that if `maxResolution` is also
      * provided, it is given precedence over `minZoom`.
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * If `false` the view is constrained so
      * only one world is visible, and you cannot pan off the edge.  If `true` the map
      * may show multiple worlds at low zoom levels.  Only used if the `projection` is
      * global.  Note that if `extent` is also provided it is given precedence.
      */
    var multiWorld: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Padding (in css pixels).
      * If the map viewport is partially covered with other content (overlays) along
      * its edges, this setting allows to shift the center of the viewport away from
      * that content. The order of the values is top, right, bottom, left.
      */
    var padding: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The
      * projection. The default is Spherical Mercator.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * The initial resolution for the view. The
      * units are `projection` units per pixel (e.g. meters per pixel). An
      * alternative to setting this is to set `zoom`. Layer sources will not be
      * fetched if neither this nor `zoom` are defined, but they can be set later
      * with {@link  #setZoom} or {@link  #setResolution}.
      */
    var resolution: js.UndefOr[Double] = js.undefined
    
    /**
      * Resolutions that determine the
      * zoom levels if specified. The index in the array corresponds to the zoom level,
      * therefore the resolution values have to be in descending order. It also constrains
      * the resolution by the minimum and maximum value. If set the `maxResolution`,
      * `minResolution`, `minZoom`, `maxZoom`, and `zoomFactor` options are ignored.
      */
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The initial rotation for the view in radians
      * (positive rotation clockwise, 0 means North).
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * Allow the view to be zoomed out to
      * show the full configured extent. By default, when a view is configured with an
      * extent, users will not be able to zoom out so the viewport exceeds the extent in
      * either dimension. This means the full extent may not be visible if the viewport
      * is taller or wider than the aspect ratio of the configured extent. If
      * showFullExtent is true, the user will be able to zoom out so that the viewport
      * exceeds the height or width of the configured extent, but not both, allowing the
      * full extent to be shown.
      */
    var showFullExtent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the extent
      * constraint will be applied smoothly, i.e. allow the view to go slightly outside
      * of the given `extent`.
      */
    var smoothExtentConstraint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the resolution
      * min/max values will be applied smoothly, i. e. allow the view to exceed slightly
      * the given resolution or zoom bounds.
      */
    var smoothResolutionConstraint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only used if `resolution` is not defined. Zoom
      * level used to calculate the initial resolution for the view.
      */
    var zoom: js.UndefOr[Double] = js.undefined
    
    /**
      * The zoom factor used to compute the
      * corresponding resolution.
      */
    var zoomFactor: js.UndefOr[Double] = js.undefined
  }
  object ViewOptions {
    
    inline def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setConstrainOnlyCenter(value: Boolean): Self = StObject.set(x, "constrainOnlyCenter", value.asInstanceOf[js.Any])
      
      inline def setConstrainOnlyCenterUndefined: Self = StObject.set(x, "constrainOnlyCenter", js.undefined)
      
      inline def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
      
      inline def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
      
      inline def setConstrainRotation(value: Double | Boolean): Self = StObject.set(x, "constrainRotation", value.asInstanceOf[js.Any])
      
      inline def setConstrainRotationUndefined: Self = StObject.set(x, "constrainRotation", js.undefined)
      
      inline def setEnableRotation(value: Boolean): Self = StObject.set(x, "enableRotation", value.asInstanceOf[js.Any])
      
      inline def setEnableRotationUndefined: Self = StObject.set(x, "enableRotation", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setMultiWorld(value: Boolean): Self = StObject.set(x, "multiWorld", value.asInstanceOf[js.Any])
      
      inline def setMultiWorldUndefined: Self = StObject.set(x, "multiWorld", js.undefined)
      
      inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setShowFullExtent(value: Boolean): Self = StObject.set(x, "showFullExtent", value.asInstanceOf[js.Any])
      
      inline def setShowFullExtentUndefined: Self = StObject.set(x, "showFullExtent", js.undefined)
      
      inline def setSmoothExtentConstraint(value: Boolean): Self = StObject.set(x, "smoothExtentConstraint", value.asInstanceOf[js.Any])
      
      inline def setSmoothExtentConstraintUndefined: Self = StObject.set(x, "smoothExtentConstraint", js.undefined)
      
      inline def setSmoothResolutionConstraint(value: Boolean): Self = StObject.set(x, "smoothResolutionConstraint", value.asInstanceOf[js.Any])
      
      inline def setSmoothResolutionConstraintUndefined: Self = StObject.set(x, "smoothResolutionConstraint", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait ViewStateAndExtent extends StObject {
    
    /**
      * Extent.
      */
    var extent: Extent
    
    /**
      * View state.
      */
    var viewState: State
  }
  object ViewStateAndExtent {
    
    inline def apply(extent: Extent, viewState: State): ViewStateAndExtent = {
      val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewStateAndExtent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewStateAndExtent] (val x: Self) extends AnyVal {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setViewState(value: State): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ViewObjectEventTypes extends StObject
}
