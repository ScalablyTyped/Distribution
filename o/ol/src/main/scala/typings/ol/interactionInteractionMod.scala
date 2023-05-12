package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.changeColonactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionInteractionMod {
  
  @JSImport("ol/interaction/Interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active', Return>} InteractionOnSignature
    */
  /**
    * Object literal with config options for interactions.
    * @typedef {Object} InteractionOptions
    * @property {function(import("../MapBrowserEvent.js").default):boolean} handleEvent
    * Method called by the map to notify the interaction that a browser event was
    * dispatched to the map. If the function returns a falsy value, propagation of
    * the event to other interactions in the map's interactions chain will be
    * prevented (this includes functions with no explicit return). The interactions
    * are traversed in reverse order of the interactions collection of the map.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * User actions that change the state of the map. Some are similar to controls,
    * but are not associated with a DOM element.
    * For example, {@link module:ol/interaction/KeyboardZoom~KeyboardZoom} is
    * functionally the same as {@link module:ol/control/Zoom~Zoom}, but triggered
    * by a keyboard event not a button element event.
    * Although interactions do not have a DOM element, some of them do render
    * vectors and so are visible on the screen.
    * @api
    */
  @JSImport("ol/interaction/Interaction", JSImport.Default)
  @js.native
  /**
    * @param {InteractionOptions} [options] Options.
    */
  open class default () extends Interaction {
    def this(options: InteractionOptions) = this()
  }
  
  inline def pan(view: typings.ol.viewMod.default, delta: Coordinate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pan")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pan(view: typings.ol.viewMod.default, delta: Coordinate, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pan")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def zoomByDelta(view: typings.ol.viewMod.default, delta: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomByDelta")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoomByDelta(view: typings.ol.viewMod.default, delta: Double, anchor: Unit, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomByDelta")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoomByDelta(view: typings.ol.viewMod.default, delta: Double, anchor: Coordinate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomByDelta")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoomByDelta(view: typings.ol.viewMod.default, delta: Double, anchor: Coordinate, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomByDelta")(view.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active', Return>} InteractionOnSignature
    */
  /**
    * Object literal with config options for interactions.
    * @typedef {Object} InteractionOptions
    * @property {function(import("../MapBrowserEvent.js").default):boolean} handleEvent
    * Method called by the map to notify the interaction that a browser event was
    * dispatched to the map. If the function returns a falsy value, propagation of
    * the event to other interactions in the map's interactions chain will be
    * prevented (this includes functions with no explicit return). The interactions
    * are traversed in reverse order of the interactions collection of the map.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * User actions that change the state of the map. Some are similar to controls,
    * but are not associated with a DOM element.
    * For example, {@link module:ol/interaction/KeyboardZoom~KeyboardZoom} is
    * functionally the same as {@link module:ol/control/Zoom~Zoom}, but triggered
    * by a keyboard event not a button element event.
    * Although interactions do not have a DOM element, some of them do render
    * vectors and so are visible on the screen.
    * @api
    */
  @js.native
  trait Interaction
    extends typings.ol.objectMod.default {
    
    /**
      * Return whether the interaction is currently active.
      * @return {boolean} `true` if the interaction is active, `false` otherwise.
      * @observable
      * @api
      */
    def getActive(): Boolean = js.native
    
    /**
      * Get the map associated with this interaction.
      * @return {import("../Map.js").default|null} Map.
      * @api
      */
    def getMap(): typings.ol.rendererMapMod.default | Null = js.native
    
    /**
      * Handles the {@link module:ol/MapBrowserEvent~MapBrowserEvent map browser event}.
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Map browser event.
      * @return {boolean} `false` to stop event propagation.
      * @api
      */
    def handleEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any]): Boolean = js.native
    
    /**
      * @private
      * @type {import("../Map.js").default|null}
      */
    /* private */ var map_ : Any = js.native
    
    /***
      * @type {InteractionOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_Interaction: InteractionOnSignature[EventsKey] = js.native
    
    /***
      * @type {InteractionOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_Interaction: InteractionOnSignature[EventsKey] = js.native
    
    /**
      * Activate or deactivate the interaction.
      * @param {boolean} active Active.
      * @observable
      * @api
      */
    def setActive(active: Boolean): Unit = js.native
    
    /**
      * Remove the interaction from its current map and attach it to the new map.
      * Subclasses may set up event handlers to get notified about changes to
      * the map here.
      * @param {import("../Map.js").default|null} map Map.
      */
    def setMap(): Unit = js.native
    def setMap(map: typings.ol.rendererMapMod.default): Unit = js.native
    
    /***
      * @type {InteractionOnSignature<void>}
      */
    @JSName("un")
    var un_Interaction: InteractionOnSignature[Unit] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait InteractionOnSignature[Return]
    extends OnSignature[
          changeColonactive | EventTypes | Types, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait InteractionOptions extends StObject {
    
    /**
      * Method called by the map to notify the interaction that a browser event was
      * dispatched to the map. If the function returns a falsy value, propagation of
      * the event to other interactions in the map's interactions chain will be
      * prevented (this includes functions with no explicit return). The interactions
      * are traversed in reverse order of the interactions collection of the map.
      */
    def handleEvent(arg0: typings.ol.mapBrowserEventMod.default[Any]): Boolean
  }
  object InteractionOptions {
    
    inline def apply(handleEvent: typings.ol.mapBrowserEventMod.default[Any] => Boolean): InteractionOptions = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[InteractionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionOptions] (val x: Self) extends AnyVal {
      
      inline def setHandleEvent(value: typings.ol.mapBrowserEventMod.default[Any] => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
}
