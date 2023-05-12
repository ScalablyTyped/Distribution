package typings.ol

import typings.ol.coordinateMod.CoordinateFormat
import typings.ol.eventsMod.EventsKey
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.changeColoncoordinateFormat
import typings.ol.olStrings.changeColonprojection
import typings.ol.projMod.ProjectionLike
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMousePositionMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:coordinateFormat'|'change:projection', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:coordinateFormat'|'change:projection', Return>} MousePositionOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-mouse-position'] CSS class name.
    * @property {import("../coordinate.js").CoordinateFormat} [coordinateFormat] Coordinate format.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the
    * control should be re-rendered. This is called in a `requestAnimationFrame`
    * callback.
    * @property {HTMLElement|string} [target] Specify a target if you want the
    * control to be rendered outside of the map's viewport.
    * @property {string} [placeholder] Markup to show when the mouse position is not
    * available (e.g. when the pointer leaves the map viewport).  By default, a non-breaking space is rendered
    * initially and the last position is retained when the mouse leaves the viewport.
    * When a string is provided (e.g. `'no position'` or `''` for an empty string) it is used as a
    * placeholder.
    * @property {boolean} [wrapX=true] Wrap the world horizontally on the projection's antimeridian, if it
    * is a global projection.
    */
  /**
    * @classdesc
    * A control to show the 2D coordinates of the mouse cursor. By default, these
    * are in the view projection, but can be in any supported projection.
    * By default the control is shown in the top right corner of the map, but this
    * can be changed by using the css selector `.ol-mouse-position`.
    *
    * On touch devices, which usually do not have a mouse cursor, the coordinates
    * of the currently touched position are shown.
    *
    * @api
    */
  @JSImport("ol/control/MousePosition", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Mouse position options.
    */
  open class default () extends MousePosition {
    def this(options: Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:coordinateFormat'|'change:projection', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:coordinateFormat'|'change:projection', Return>} MousePositionOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-mouse-position'] CSS class name.
    * @property {import("../coordinate.js").CoordinateFormat} [coordinateFormat] Coordinate format.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the
    * control should be re-rendered. This is called in a `requestAnimationFrame`
    * callback.
    * @property {HTMLElement|string} [target] Specify a target if you want the
    * control to be rendered outside of the map's viewport.
    * @property {string} [placeholder] Markup to show when the mouse position is not
    * available (e.g. when the pointer leaves the map viewport).  By default, a non-breaking space is rendered
    * initially and the last position is retained when the mouse leaves the viewport.
    * When a string is provided (e.g. `'no position'` or `''` for an empty string) it is used as a
    * placeholder.
    * @property {boolean} [wrapX=true] Wrap the world horizontally on the projection's antimeridian, if it
    * is a global projection.
    */
  /**
    * @classdesc
    * A control to show the 2D coordinates of the mouse cursor. By default, these
    * are in the view projection, but can be in any supported projection.
    * By default the control is shown in the top right corner of the map, but this
    * can be changed by using the css selector `.ol-mouse-position`.
    *
    * On touch devices, which usually do not have a mouse cursor, the coordinates
    * of the currently touched position are shown.
    *
    * @api
    */
  @js.native
  trait MousePosition
    extends typings.ol.controlControlMod.default {
    
    /**
      * Return the coordinate format type used to render the current position or
      * undefined.
      * @return {import("../coordinate.js").CoordinateFormat|undefined} The format to render the current
      *     position in.
      * @observable
      * @api
      */
    def getCoordinateFormat(): js.UndefOr[CoordinateFormat] = js.native
    
    /**
      * Return the projection that is used to report the mouse position.
      * @return {import("../proj/Projection.js").default|undefined} The projection to report mouse
      *     position in.
      * @observable
      * @api
      */
    def getProjection(): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    
    /**
      * @param {MouseEvent} event Browser event.
      * @protected
      */
    /* protected */ def handleMouseMove(event: MouseEvent): Unit = js.native
    
    /**
      * @param {Event} event Browser event.
      * @protected
      */
    /* protected */ def handleMouseOut(event: Event): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var handleProjectionChanged_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../proj/Projection.js").default}
      */
    /* private */ var mapProjection_ : Any = js.native
    
    /***
      * @type {MousePositionOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_MousePosition: MousePositionOnSignature[EventsKey] = js.native
    
    /***
      * @type {MousePositionOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_MousePosition: MousePositionOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var placeholder_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var renderOnMouseOut_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var renderedHTML_ : Any = js.native
    
    /**
      * Set the coordinate format type used to render the current position.
      * @param {import("../coordinate.js").CoordinateFormat} format The format to render the current
      *     position in.
      * @observable
      * @api
      */
    def setCoordinateFormat(format: CoordinateFormat): Unit = js.native
    
    /**
      * Set the projection that is used to report the mouse position.
      * @param {import("../proj.js").ProjectionLike} projection The projection to report mouse
      *     position in.
      * @observable
      * @api
      */
    def setProjection(projection: ProjectionLike): Unit = js.native
    
    /**
      * @private
      * @type {?import("../proj.js").TransformFunction}
      */
    /* private */ var transform_ : Any = js.native
    
    /***
      * @type {MousePositionOnSignature<void>}
      */
    @JSName("un")
    var un_MousePosition: MousePositionOnSignature[Unit] = js.native
    
    /**
      * @param {?import("../pixel.js").Pixel} pixel Pixel.
      * @private
      */
    /* private */ var updateHTML_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var wrapX_ : Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait MousePositionOnSignature[Return]
    extends OnSignature[
          changeColoncoordinateFormat | changeColonprojection | EventTypes | Types, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options extends StObject {
    
    /**
      * CSS class name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Coordinate format.
      */
    var coordinateFormat: js.UndefOr[CoordinateFormat] = js.undefined
    
    /**
      * Markup to show when the mouse position is not
      * available (e.g. when the pointer leaves the map viewport).  By default, a non-breaking space is rendered
      * initially and the last position is retained when the mouse leaves the viewport.
      * When a string is provided (e.g. `'no position'` or `''` for an empty string) it is used as a
      * placeholder.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Projection. Default is the view projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Function called when the
      * control should be re-rendered. This is called in a `requestAnimationFrame`
      * callback.
      */
    var render: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
    
    /**
      * Specify a target if you want the
      * control to be rendered outside of the map's viewport.
      */
    var target: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Wrap the world horizontally on the projection's antimeridian, if it
      * is a global projection.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCoordinateFormat(value: /* arg0 */ js.UndefOr[js.Array[Double]] => String): Self = StObject.set(x, "coordinateFormat", js.Any.fromFunction1(value))
      
      inline def setCoordinateFormatUndefined: Self = StObject.set(x, "coordinateFormat", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRender(value: /* arg0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
