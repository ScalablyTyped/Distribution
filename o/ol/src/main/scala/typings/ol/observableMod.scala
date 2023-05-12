package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableMod {
  
  @JSImport("ol/Observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /***
    * @template {string} Type
    * @template {Event|import("./events/Event.js").default} EventClass
    * @template Return
    * @typedef {(type: Type, listener: (event: EventClass) => ?) => Return} OnSignature
    */
  /***
    * @template {string} Type
    * @template Return
    * @typedef {(type: Type[], listener: (event: Event|import("./events/Event").default) => ?) => Return extends void ? void : Return[]} CombinedOnSignature
    */
  /**
    * @typedef {'change'|'error'} EventTypes
    */
  /***
    * @template Return
    * @typedef {OnSignature<EventTypes, import("./events/Event.js").default, Return> & CombinedOnSignature<EventTypes, Return>} ObservableOnSignature
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * An event target providing convenient methods for listener registration
    * and unregistration. A generic `change` event is always available through
    * {@link module:ol/Observable~Observable#changed}.
    *
    * @fires import("./events/Event.js").default
    * @api
    */
  @JSImport("ol/Observable", JSImport.Default)
  @js.native
  open class default () extends Observable
  
  inline def unByKey(key: js.Array[EventsKey]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unByKey(key: EventsKey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type CombinedOnSignature[Type /* <: String */, Return] = js.Function2[
    /* type */ js.Array[Type], 
    /* listener */ js.Function1[/* event */ Event | typings.ol.eventsEventMod.default, Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: Return extends void ? void : std.Array<Return> */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.change
    - typings.ol.olStrings.error
  */
  trait EventTypes extends StObject
  object EventTypes {
    
    inline def change: typings.ol.olStrings.change = "change".asInstanceOf[typings.ol.olStrings.change]
    
    inline def error: typings.ol.olStrings.error = "error".asInstanceOf[typings.ol.olStrings.error]
  }
  
  /***
    * @template {string} Type
    * @template {Event|import("./events/Event.js").default} EventClass
    * @template Return
    * @typedef {(type: Type, listener: (event: EventClass) => ?) => Return} OnSignature
    */
  /***
    * @template {string} Type
    * @template Return
    * @typedef {(type: Type[], listener: (event: Event|import("./events/Event").default) => ?) => Return extends void ? void : Return[]} CombinedOnSignature
    */
  /**
    * @typedef {'change'|'error'} EventTypes
    */
  /***
    * @template Return
    * @typedef {OnSignature<EventTypes, import("./events/Event.js").default, Return> & CombinedOnSignature<EventTypes, Return>} ObservableOnSignature
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * An event target providing convenient methods for listener registration
    * and unregistration. A generic `change` event is always available through
    * {@link module:ol/Observable~Observable#changed}.
    *
    * @fires import("./events/Event.js").default
    * @api
    */
  @js.native
  trait Observable
    extends typings.ol.eventsTargetMod.default {
    
    /**
      * Increases the revision counter and dispatches a 'change' event.
      * @api
      */
    def changed(): Unit = js.native
    
    /**
      * Get the version number for this object.  Each time the object is modified,
      * its version number will be incremented.
      * @return {number} Revision.
      * @api
      */
    def getRevision(): Double = js.native
    
    var on: ObservableOnSignature[EventsKey] = js.native
    
    /**
      * @param {string|Array<string>} type Type.
      * @param {function((Event|import("./events/Event").default)): ?} listener Listener.
      * @return {import("./events.js").EventsKey|Array<import("./events.js").EventsKey>} Event key.
      * @protected
      */
    /* protected */ def onInternal(`type`: String, listener: js.Function1[/* arg0 */ Event | typings.ol.eventsEventMod.default, Any]): EventsKey | js.Array[EventsKey] = js.native
    /* protected */ def onInternal(
      `type`: js.Array[String],
      listener: js.Function1[/* arg0 */ Event | typings.ol.eventsEventMod.default, Any]
    ): EventsKey | js.Array[EventsKey] = js.native
    
    var once: ObservableOnSignature[EventsKey] = js.native
    
    /**
      * @param {string|Array<string>} type Type.
      * @param {function((Event|import("./events/Event").default)): ?} listener Listener.
      * @return {import("./events.js").EventsKey|Array<import("./events.js").EventsKey>} Event key.
      * @protected
      */
    /* protected */ def onceInternal(`type`: String, listener: js.Function1[/* arg0 */ Event | typings.ol.eventsEventMod.default, Any]): EventsKey | js.Array[EventsKey] = js.native
    /* protected */ def onceInternal(
      `type`: js.Array[String],
      listener: js.Function1[/* arg0 */ Event | typings.ol.eventsEventMod.default, Any]
    ): EventsKey | js.Array[EventsKey] = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var revision_ : Any = js.native
    
    var un: ObservableOnSignature[Unit] = js.native
    
    /**
      * Unlisten for a certain type of event.
      * @param {string|Array<string>} type Type.
      * @param {function((Event|import("./events/Event").default)): ?} listener Listener.
      * @protected
      */
    /* protected */ def unInternal(`type`: String, listener: js.Function1[/* arg0 */ Event | typings.ol.eventsEventMod.default, Any]): Unit = js.native
    /* protected */ def unInternal(
      `type`: js.Array[String],
      listener: js.Function1[/* arg0 */ Event | typings.ol.eventsEventMod.default, Any]
    ): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait ObservableOnSignature[Return]
    extends OnSignature[EventTypes, typings.ol.eventsEventMod.default, Return]
  
  type OnSignature[Type /* <: String */, EventClass /* <: typings.ol.eventsEventMod.default | Event */, Return] = js.Function2[/* type */ Type, /* listener */ js.Function1[/* event */ EventClass, Any], Return]
}
