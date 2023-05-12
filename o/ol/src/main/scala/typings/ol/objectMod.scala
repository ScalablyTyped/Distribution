package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.eventsMod.Listener
import typings.ol.objectEventTypeMod.Types
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *    import("./Observable").OnSignature<import("./ObjectEventType").Types, ObjectEvent, Return> &
    *    import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|import("./ObjectEventType").Types, Return>} ObjectOnSignature
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Most non-trivial classes inherit from this.
    *
    * This extends {@link module:ol/Observable~Observable} with observable
    * properties, where each property is observable as well as the object as a
    * whole.
    *
    * Classes that inherit from this have pre-defined properties, to which you can
    * add your owns. The pre-defined properties are listed in this documentation as
    * 'Observable Properties', and have their own accessors; for example,
    * {@link module:ol/Map~Map} has a `target` property, accessed with
    * `getTarget()` and changed with `setTarget()`. Not all properties are however
    * settable. There are also general-purpose accessors `get()` and `set()`. For
    * example, `get('target')` is equivalent to `getTarget()`.
    *
    * The `set` accessors trigger a change event, and you can monitor this by
    * registering a listener. For example, {@link module:ol/View~View} has a
    * `center` property, so `view.on('change:center', function(evt) {...});` would
    * call the function whenever the value of the center property changes. Within
    * the function, `evt.target` would be the view, so `evt.target.getCenter()`
    * would return the new center.
    *
    * You can add your own observable properties with
    * `object.set('prop', 'value')`, and retrieve that with `object.get('prop')`.
    * You can listen for changes on that property value with
    * `object.on('change:prop', listener)`. You can get a list of all
    * properties with {@link module:ol/Object~BaseObject#getProperties}.
    *
    * Note that the observable properties are separate from standard JS properties.
    * You can, for example, give your map object a title with
    * `map.title='New title'` and with `map.set('title', 'Another title')`. The
    * first will be a `hasOwnProperty`; the second will appear in
    * `getProperties()`. Only the second is observable.
    *
    * Properties can be deleted by using the unset method. E.g.
    * object.unset('foo').
    *
    * @fires ObjectEvent
    * @api
    */
  @JSImport("ol/Object", JSImport.Default)
  @js.native
  /**
    * @param {Object<string, *>} [values] An object with key-value pairs.
    */
  open class default () extends BaseObject {
    def this(values: StringDictionary[Any]) = this()
  }
  
  @JSImport("ol/Object", "ObjectEvent")
  @js.native
  open class ObjectEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {string} type The event type.
      * @param {string} key The property name.
      * @param {*} oldValue The old value for `key`.
      */
    def this(`type`: String, key: String, oldValue: Any) = this()
    
    /**
      * The name of the property whose value is changing.
      * @type {string}
      * @api
      */
    var key: String = js.native
    
    /**
      * The old value. To get the new value use `e.target.get(e.key)` where
      * `e` is the event object.
      * @type {*}
      * @api
      */
    var oldValue: Any = js.native
  }
  
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *    import("./Observable").OnSignature<import("./ObjectEventType").Types, ObjectEvent, Return> &
    *    import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|import("./ObjectEventType").Types, Return>} ObjectOnSignature
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Most non-trivial classes inherit from this.
    *
    * This extends {@link module:ol/Observable~Observable} with observable
    * properties, where each property is observable as well as the object as a
    * whole.
    *
    * Classes that inherit from this have pre-defined properties, to which you can
    * add your owns. The pre-defined properties are listed in this documentation as
    * 'Observable Properties', and have their own accessors; for example,
    * {@link module:ol/Map~Map} has a `target` property, accessed with
    * `getTarget()` and changed with `setTarget()`. Not all properties are however
    * settable. There are also general-purpose accessors `get()` and `set()`. For
    * example, `get('target')` is equivalent to `getTarget()`.
    *
    * The `set` accessors trigger a change event, and you can monitor this by
    * registering a listener. For example, {@link module:ol/View~View} has a
    * `center` property, so `view.on('change:center', function(evt) {...});` would
    * call the function whenever the value of the center property changes. Within
    * the function, `evt.target` would be the view, so `evt.target.getCenter()`
    * would return the new center.
    *
    * You can add your own observable properties with
    * `object.set('prop', 'value')`, and retrieve that with `object.get('prop')`.
    * You can listen for changes on that property value with
    * `object.on('change:prop', listener)`. You can get a list of all
    * properties with {@link module:ol/Object~BaseObject#getProperties}.
    *
    * Note that the observable properties are separate from standard JS properties.
    * You can, for example, give your map object a title with
    * `map.title='New title'` and with `map.set('title', 'Another title')`. The
    * first will be a `hasOwnProperty`; the second will appear in
    * `getProperties()`. Only the second is observable.
    *
    * Properties can be deleted by using the unset method. E.g.
    * object.unset('foo').
    *
    * @fires ObjectEvent
    * @api
    */
  @js.native
  trait BaseObject
    extends typings.ol.observableMod.default {
    
    /**
      * @param {string} key Key name.
      * @param {import("./events.js").Listener} listener Listener.
      */
    def addChangeListener(key: String, listener: Listener): Unit = js.native
    
    /**
      * Apply any properties from another object without triggering events.
      * @param {BaseObject} source The source object.
      * @protected
      */
    /* protected */ def applyProperties(source: BaseObject): Unit = js.native
    
    /**
      * Gets a value.
      * @param {string} key Key name.
      * @return {*} Value.
      * @api
      */
    def get(key: String): Any = js.native
    
    /**
      * Get a list of object property names.
      * @return {Array<string>} List of property names.
      * @api
      */
    def getKeys(): js.Array[String] = js.native
    
    /**
      * Get an object of all property names and values.
      * @return {Object<string, *>} Object.
      * @api
      */
    def getProperties(): StringDictionary[Any] = js.native
    
    /**
      * @return {boolean} The object has properties.
      */
    def hasProperties(): Boolean = js.native
    
    /**
      * @param {string} key Key name.
      * @param {*} oldValue Old value.
      */
    def notify(key: String, oldValue: Any): Unit = js.native
    
    /***
      * @type {ObjectOnSignature<import("./events").EventsKey>}
      */
    @JSName("on")
    var on_BaseObject: ObjectOnSignature[EventsKey] = js.native
    
    /***
      * @type {ObjectOnSignature<import("./events").EventsKey>}
      */
    @JSName("once")
    var once_BaseObject: ObjectOnSignature[EventsKey] = js.native
    
    /**
      * @param {string} key Key name.
      * @param {import("./events.js").Listener} listener Listener.
      */
    def removeChangeListener(key: String, listener: Listener): Unit = js.native
    
    /**
      * Sets a value.
      * @param {string} key Key name.
      * @param {*} value Value.
      * @param {boolean} [silent] Update without triggering an event.
      * @api
      */
    def set(key: String, value: Any): Unit = js.native
    def set(key: String, value: Any, silent: Boolean): Unit = js.native
    
    /**
      * Sets a collection of key-value pairs.  Note that this changes any existing
      * properties and adds new ones (it does not remove any existing properties).
      * @param {Object<string, *>} values Values.
      * @param {boolean} [silent] Update without triggering an event.
      * @api
      */
    def setProperties(values: StringDictionary[Any]): Unit = js.native
    def setProperties(values: StringDictionary[Any], silent: Boolean): Unit = js.native
    
    /***
      * @type {ObjectOnSignature<void>}
      */
    @JSName("un")
    var un_BaseObject: ObjectOnSignature[Unit] = js.native
    
    /**
      * Unsets a property.
      * @param {string} key Key name.
      * @param {boolean} [silent] Unset without triggering an event.
      * @api
      */
    def unset(key: String): Unit = js.native
    def unset(key: String, silent: Boolean): Unit = js.native
    
    /**
      * @private
      * @type {Object<string, *>}
      */
    /* private */ var values_ : Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait ObjectOnSignature[Return]
    extends OnSignature[EventTypes | Types, ObjectEvent | typings.ol.eventsEventMod.default, Return]
}
