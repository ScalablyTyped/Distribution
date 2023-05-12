package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.add
import typings.ol.olStrings.changeColonlength
import typings.ol.olStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionMod {
  
  /***
    * @template T
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<import("./ObjectEventType").Types|'change:length', import("./Object").ObjectEvent, Return> &
    *   import("./Observable").OnSignature<'add'|'remove', CollectionEvent<T>, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|import("./ObjectEventType").Types|
    *     'change:length'|'add'|'remove',Return>} CollectionOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {boolean} [unique=false] Disallow the same item from being added to
    * the collection twice.
    */
  /**
    * @classdesc
    * An expanded version of standard JS Array, adding convenience methods for
    * manipulation. Add and remove changes to the Collection trigger a Collection
    * event. Note that this does not cover changes to the objects _within_ the
    * Collection; they trigger events on the appropriate object, not on the
    * Collection as a whole.
    *
    * @fires CollectionEvent
    *
    * @template T
    * @api
    */
  @JSImport("ol/Collection", JSImport.Default)
  @js.native
  /**
    * @param {Array<T>} [array] Array.
    * @param {Options} [options] Collection options.
    */
  open class default[T] () extends Collection[T] {
    def this(array: js.Array[T]) = this()
    def this(array: js.Array[T], options: Options) = this()
    def this(array: Unit, options: Options) = this()
  }
  
  @JSImport("ol/Collection", "CollectionEvent")
  @js.native
  open class CollectionEvent[T] protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {import("./CollectionEventType.js").default} type Type.
      * @param {T} element Element.
      * @param {number} index The index of the added or removed element.
      */
    def this(`type`: Any, element: T, index: Double) = this()
    
    /**
      * The element that is added to or removed from the collection.
      * @type {T}
      * @api
      */
    var element: T = js.native
    
    /**
      * The index of the added or removed element.
      * @type {number}
      * @api
      */
    var index: Double = js.native
  }
  
  /***
    * @template T
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<import("./ObjectEventType").Types|'change:length', import("./Object").ObjectEvent, Return> &
    *   import("./Observable").OnSignature<'add'|'remove', CollectionEvent<T>, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|import("./ObjectEventType").Types|
    *     'change:length'|'add'|'remove',Return>} CollectionOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {boolean} [unique=false] Disallow the same item from being added to
    * the collection twice.
    */
  /**
    * @classdesc
    * An expanded version of standard JS Array, adding convenience methods for
    * manipulation. Add and remove changes to the Collection trigger a Collection
    * event. Note that this does not cover changes to the objects _within_ the
    * Collection; they trigger events on the appropriate object, not on the
    * Collection as a whole.
    *
    * @fires CollectionEvent
    *
    * @template T
    * @api
    */
  @js.native
  trait Collection[T]
    extends typings.ol.objectMod.default {
    
    /**
      * @private
      * @type {!Array<T>}
      */
    /* private */ var array_ : Any = js.native
    
    /**
      * @private
      * @param {T} elem Element.
      * @param {number} [except] Optional index to ignore.
      */
    /* private */ var assertUnique_ : Any = js.native
    
    /**
      * Remove all elements from the collection.
      * @api
      */
    def clear(): Unit = js.native
    
    /**
      * Add elements to the collection.  This pushes each item in the provided array
      * to the end of the collection.
      * @param {!Array<T>} arr Array.
      * @return {Collection<T>} This collection.
      * @api
      */
    def extend(arr: js.Array[T]): Collection[T] = js.native
    
    /**
      * Iterate over each element, calling the provided callback.
      * @param {function(T, number, Array<T>): *} f The function to call
      *     for every element. This function takes 3 arguments (the element, the
      *     index and the array). The return value is ignored.
      * @api
      */
    def forEach(f: js.Function3[/* arg0 */ T, /* arg1 */ Double, /* arg2 */ js.Array[T], Any]): Unit = js.native
    
    /**
      * Get a reference to the underlying Array object. Warning: if the array
      * is mutated, no events will be dispatched by the collection, and the
      * collection's "length" property won't be in sync with the actual length
      * of the array.
      * @return {!Array<T>} Array.
      * @api
      */
    def getArray(): js.Array[T] = js.native
    
    /**
      * Get the length of this collection.
      * @return {number} The length of the array.
      * @observable
      * @api
      */
    def getLength(): Double = js.native
    
    /**
      * Insert an element at the provided index.
      * @param {number} index Index.
      * @param {T} elem Element.
      * @api
      */
    def insertAt(index: Double, elem: T): Unit = js.native
    
    /**
      * Get the element at the provided index.
      * @param {number} index Index.
      * @return {T} Element.
      * @api
      */
    def item(index: Double): T = js.native
    
    /***
      * @type {CollectionOnSignature<T, import("./events").EventsKey>}
      */
    @JSName("on")
    var on_Collection: CollectionOnSignature[T, EventsKey] = js.native
    
    /***
      * @type {CollectionOnSignature<T, import("./events").EventsKey>}
      */
    @JSName("once")
    var once_Collection: CollectionOnSignature[T, EventsKey] = js.native
    
    /**
      * Remove the last element of the collection and return it.
      * Return `undefined` if the collection is empty.
      * @return {T|undefined} Element.
      * @api
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * Insert the provided element at the end of the collection.
      * @param {T} elem Element.
      * @return {number} New length of the collection.
      * @api
      */
    def push(elem: T): Double = js.native
    
    /**
      * Remove the first occurrence of an element from the collection.
      * @param {T} elem Element.
      * @return {T|undefined} The removed element or undefined if none found.
      * @api
      */
    def remove(elem: T): js.UndefOr[T] = js.native
    
    /**
      * Remove the element at the provided index and return it.
      * Return `undefined` if the collection does not contain this index.
      * @param {number} index Index.
      * @return {T|undefined} Value.
      * @api
      */
    def removeAt(index: Double): js.UndefOr[T] = js.native
    
    /**
      * Set the element at the provided index.
      * @param {number} index Index.
      * @param {T} elem Element.
      * @api
      */
    def setAt(index: Double, elem: T): Unit = js.native
    
    /***
      * @type {CollectionOnSignature<T, void>}
      */
    @JSName("un")
    var un_Collection: CollectionOnSignature[T, Unit] = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var unique_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var updateLength_ : Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait CollectionOnSignature[T, Return]
    extends OnSignature[
          changeColonlength | add | remove | EventTypes | Types, 
          CollectionEvent[T] | ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options extends StObject {
    
    /**
      * Disallow the same item from being added to
      * the collection twice.
      */
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
}
