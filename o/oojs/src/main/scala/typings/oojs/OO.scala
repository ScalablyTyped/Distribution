package typings.oojs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojs.anon.Key
import typings.oojs.anon.Static
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OO {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends any ? T[K] extends (args : ...any): any ? K : never : never
    }}}
    */
  type CheckFunctionType[T, K /* <: /* keyof T */ String */] = K
  
  trait Cloneable
    extends StObject
       with _NonPlainObject {
    
    def clone(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
  }
  object Cloneable {
    
    inline def apply(clone_ : Any => Any): Cloneable = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
      __obj.asInstanceOf[Cloneable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cloneable] (val x: Self) extends AnyVal {
      
      inline def setClone_(value: Any => Any): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    }
  }
  
  // Simulate infer constraints of TypeScript 4.7+
  type ConstrainedInference[T, R /* <: T */] = R
  
  type Constructor = Instantiable1[/* args */ Any, Any]
  
  type ConstructorLike = (Instantiable1[/* args */ Any, Any]) | (js.Function1[/* args */ Any, Any])
  
  /**
    * Contain and manage a list of {@link OO.EventEmitter} items.
    *
    * Aggregates and manages their events collectively.
    *
    * This mixin must be used in a class that also mixes in {@link OO.EventEmitter}.
    */
  @js.native
  trait EmitterList extends StObject {
    
    def addItems(items: js.Array[EventEmitter]): this.type = js.native
    def addItems(items: js.Array[EventEmitter], index: Double): this.type = js.native
    /**
      * Add items to the list.
      *
      * @param items Item to add or
      *  an array of items to add
      * @param index Index to add items at. If no index is
      *  given, or if the index that is given is invalid, the item
      *  will be added at the end of the list.
      */
    def addItems(items: EventEmitter): this.type = js.native
    def addItems(items: EventEmitter, index: Double): this.type = js.native
    
    /**
      * Aggregate the events emitted by the group.
      *
      * When events are aggregated, the group will listen to all contained items for the event,
      * and then emit the event under a new name. The new event will contain an additional leading
      * parameter containing the item that emitted the original event. Other arguments emitted from
      * the original event are passed through.
      *
      * @param events An object keyed by the name of the event that
      *  should be aggregated  (e.g., ‘click’) and the value of the new name to use
      *  (e.g., ‘groupClick’). A `null` value will remove aggregated events.
      * @throws {Error} If aggregation already exists
      */
    def aggregate(events: Record[String, String | Null]): Unit = js.native
    
    /**
      * Clear all items.
      */
    def clearItems(): this.type = js.native
    
    /**
      * Get number of items.
      *
      * @return Number of items in the list
      */
    def getItemCount(): Double = js.native
    
    /**
      * Get the index of a specific item.
      *
      * @param item Requested item
      * @return Index of the item
      */
    def getItemIndex(item: EventEmitter): Double = js.native
    
    /**
      * Get all items.
      *
      * @return Items in the list
      */
    def getItems(): js.Array[EventEmitter] = js.native
    
    /**
      * Check if a list contains no items.
      *
      * @return  Group is empty
      */
    def isEmpty(): Boolean = js.native
    
    def removeItems(items: js.Array[EventEmitter]): this.type = js.native
    /**
      * Remove items.
      *
      * @param items Items to remove
      */
    def removeItems(items: EventEmitter): this.type = js.native
  }
  
  @js.native
  trait EmitterListConstructor
    extends StObject
       with Instantiable0[EmitterList]
  
  @js.native
  trait EventEmitter extends StObject {
    
    /**
      * Connect event handlers to an object.
      *
      * @param context Object to call methods on when events occur
      * @param methods
      *  List of event bindings keyed by event name containing either method names, functions or
      *  arrays containing method name or function followed by a list of arguments to be passed to
      *  callback before emitted arguments.
      */
    def connect[C](
      context: C,
      methods: Record[
          String, 
          (js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]) | (/* import warning: importer.ImportType#apply Failed type conversion: C extends object ? oojs.OO.ExtractFunctionKeys<C> : never */ js.Any) | (Array[
            (js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]) | (/* import warning: importer.ImportType#apply Failed type conversion: C extends object ? oojs.OO.ExtractFunctionKeys<C> : never */ js.Any) | Any
          ])
        ]
    ): this.type = js.native
    
    /**
      * Disconnect event handlers from an object.
      *
      * @param context Object to disconnect methods from
      * @param methods
      *  List of event bindings keyed by event name. Values can be either method names, functions or
      *  arrays containing a method name.
      *  NOTE: To allow matching call sites with {@link connect()}, array values are allowed to contain the
      *  parameters as well, but only the method name is used to find bindings. It is discouraged to
      *  have multiple bindings for the same event to the same listener, but if used (and only the
      *  parameters vary), disconnecting one variation of (event name, event listener, parameters)
      *  will disconnect other variations as well.
      */
    def disconnect(context: Any): this.type = js.native
    def disconnect(
      context: Any,
      methods: Record[
          String, 
          String | (js.Function1[/* repeated */ Any, Unit]) | (Array[(js.Function1[/* repeated */ Any, Unit]) | String | Any])
        ]
    ): this.type = js.native
    
    /**
      * Emit an event.
      *
      * All listeners for the event will be called synchronously, in an
      * unspecified order. If any listeners throw an exception, this won't
      * disrupt the calls to the remaining listeners; however, the exception
      * won't be thrown until the next tick.
      *
      * Listeners should avoid mutating the emitting object, as this is
      * something of an anti-pattern which can easily result in
      * hard-to-understand code with hidden side-effects and dependencies.
      *
      * @param event Type of event
      * @param args Arguments passed to the event handler
      * @return Whether the event was handled by at least one listener
      */
    def emit(event: String, args: Any*): Boolean = js.native
    
    /**
      * Emit an event, propagating the first exception some listener throws
      *
      * All listeners for the event will be called synchronously, in an
      * unspecified order. If any listener throws an exception, this won't
      * disrupt the calls to the remaining listeners. The first exception
      * thrown will be propagated back to the caller; any others won't be
      * thrown until the next tick.
      *
      * Listeners should avoid mutating the emitting object, as this is
      * something of an anti-pattern which can easily result in
      * hard-to-understand code with hidden side-effects and dependencies.
      *
      * @param event Type of event
      * @param args Arguments passed to the event handler
      * @return Whether the event was handled by at least one listener
      */
    def emitThrow(event: String, args: Any*): Boolean = js.native
    
    /**
      * Remove a specific listener from a specific event.
      *
      * @param event Type of event to remove listener from
      * @param method Listener to remove. Must be in the same form as was passed
      * to "on". Omit to remove all listeners.
      * @param context Context object function or method call
      * @throws {Error} Listener argument is not a function or a valid method name
      */
    def off(event: String): this.type = js.native
    def off(event: String, method: String): this.type = js.native
    def off(event: String, method: String, context: Any): this.type = js.native
    def off(event: String, method: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(event: String, method: js.Function1[/* repeated */ Any, Unit], context: Any): this.type = js.native
    def off(event: String, method: Unit, context: Any): this.type = js.native
    
    /**
      * Add a listener to events of a specific event.
      *
      * The listener can be a function or the string name of a method; if the latter, then the
      * name lookup happens at the time the listener is called.
      *
      * @param event Type of event to listen to
      * @param method Function or method name to call when event occurs
      * @param args Arguments to pass to listener, will be prepended to emitted arguments
      * @param context Context object for function or method call
      * @throws {Error} Listener argument is not a function or a valid method name
      */
    def on[C](event: String, method: js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]): this.type = js.native
    def on[C](
      event: String,
      method: js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit],
      args: js.Array[Any]
    ): this.type = js.native
    def on[C](
      event: String,
      method: js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    def on[C](
      event: String,
      method: js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit],
      args: Unit,
      context: C
    ): this.type = js.native
    /**
      * Add a listener to events of a specific event.
      *
      * The listener can be a function or the string name of a method; if the latter, then the
      * name lookup happens at the time the listener is called.
      *
      * @param event Type of event to listen to
      * @param method Function or method name to call when event occurs
      * @param args Arguments to pass to listener, will be prepended to emitted arguments
      * @param context Context object for function or method call
      * @throws {Error} Listener argument is not a function or a valid method name
      */
    def on[C /* <: js.Object */](event: String, method: ExtractFunctionKeys[C], args: js.Array[Any], context: C): this.type = js.native
    
    /**
      * Add a one-time listener to a specific event.
      *
      * @param event Type of event to listen to
      * @param listener Listener to call when event occurs
      */
    def once(event: String, listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]): this.type = js.native
  }
  
  @js.native
  trait EventEmitterConstructor
    extends StObject
       with Instantiable0[EventEmitter]
  
  type ExtractFunctionKeys[T /* <: js.Object */] = Exclude[CheckFunctionType[T, /* keyof T */ String], scala.Nothing]
  
  // HACK: Omit register and unregister because Factory changed their call signatures (!)
  /* Inlined parent std.Omit<oojs.OO.Registry, 'register' | 'unregister'> */
  @js.native
  trait Factory extends StObject {
    
    def connect[C](
      context: C,
      methods: Record[
          String, 
          (js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]) | (/* import warning: importer.ImportType#apply Failed type conversion: C extends object ? oojs.OO.ExtractFunctionKeys<C> : never */ js.Any) | (Array[
            (js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]) | (/* import warning: importer.ImportType#apply Failed type conversion: C extends object ? oojs.OO.ExtractFunctionKeys<C> : never */ js.Any) | Any
          ])
        ]
    ): this.type = js.native
    @JSName("connect")
    var connect_Original: js.Function2[
        /* context */ Any, 
        /* methods */ Record[
          String, 
          (js.ThisFunction1[/* this */ Any, /* repeated */ Any, Unit]) | (/* import warning: importer.ImportType#apply Failed type conversion: any extends object ? oojs.OO.ExtractFunctionKeys<any> : never */ js.Any) | (Array[
            (js.ThisFunction1[/* this */ Any, /* repeated */ Any, Unit]) | (/* import warning: importer.ImportType#apply Failed type conversion: any extends object ? oojs.OO.ExtractFunctionKeys<any> : never */ js.Any) | Any
          ])
        ], 
        this.type
      ] = js.native
    
    /**
      * Create an object based on a key.
      *
      * The key is used to look up the class to use, with any subsequent arguments passed to the
      * constructor function.
      *
      * @param key Class key
      * @param args Arguments to pass to the constructor
      * @return The new object
      * @throws {Error} Unknown key
      */
    def create(key: String, args: Any*): Any = js.native
    
    def disconnect(context: Any): this.type = js.native
    def disconnect(
      context: Any,
      methods: Record[
          String, 
          String | (js.Function1[/* repeated */ Any, Unit]) | (Array[(js.Function1[/* repeated */ Any, Unit]) | String | Any])
        ]
    ): this.type = js.native
    @JSName("disconnect")
    var disconnect_Original: js.Function2[
        /* context */ Any, 
        /* methods */ js.UndefOr[
          Record[
            String, 
            String | (js.Function1[/* repeated */ Any, Unit]) | (Array[(js.Function1[/* repeated */ Any, Unit]) | String | Any])
          ]
        ], 
        this.type
      ] = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    
    def emitThrow(event: String, args: Any*): Boolean = js.native
    @JSName("emitThrow")
    var emitThrow_Original: js.Function2[/* event */ String, /* repeated */ Any, Boolean] = js.native
    
    @JSName("emit")
    var emit_Original: js.Function2[/* event */ String, /* repeated */ Any, Boolean] = js.native
    
    def lookup(name: String): js.UndefOr[Any] = js.native
    @JSName("lookup")
    var lookup_Original: js.Function1[/* name */ String, js.UndefOr[Any]] = js.native
    
    def off(event: String): this.type = js.native
    def off(event: String, method: String): this.type = js.native
    def off(event: String, method: String, context: Any): this.type = js.native
    def off(event: String, method: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(event: String, method: js.Function1[/* repeated */ Any, Unit], context: Any): this.type = js.native
    def off(event: String, method: Unit, context: Any): this.type = js.native
    @JSName("off")
    var off_Original: js.Function3[
        /* event */ String, 
        /* method */ js.UndefOr[String | (js.Function1[/* repeated */ Any, Unit])], 
        /* context */ js.UndefOr[Any], 
        this.type
      ] = js.native
    
    def on[C](event: String, method: js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]): this.type = js.native
    def on[C](
      event: String,
      method: js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit],
      args: js.Array[Any]
    ): this.type = js.native
    def on[C](
      event: String,
      method: js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    def on[C](
      event: String,
      method: js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    var on_Original: js.Function4[
        /* event */ String, 
        /* method */ js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit], 
        /* args */ js.UndefOr[js.Array[Any]], 
        /* context */ js.UndefOr[Null], 
        this.type
      ] = js.native
    
    def once(event: String, listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    var once_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit], 
        this.type
      ] = js.native
    
    /**
      * Register a class with the factory.
      *
      *     function MyClass() {};
      *     OO.initClass( MyClass );
      *     MyClass.key = 'hello';
      *
      *     // Register class with the factory
      *     factory.register( MyClass );
      *
      *     // Instantiate a class based on its registered key (also known as a "symbolic name")
      *     factory.create( 'hello' );
      *
      * @param constructor Class to use when creating an object
      * @param key The key for {@link create}.
      *  This parameter is usually omitted in favour of letting the class declare
      *  its own key, through `MyClass.key`.
      *  For backwards-compatibility with OOjs 6.0 (2021) and older, it can also be declared
      *  via `MyClass.static.name`.
      * @throws {Error} If a parameter is invalid
      */
    def register(constructor: ConstructorLike & Key & Static): Unit = js.native
    /**
      * Register a class with the factory.
      *
      *     function MyClass() {};
      *     OO.initClass( MyClass );
      *     MyClass.key = 'hello';
      *
      *     // Register class with the factory
      *     factory.register( MyClass );
      *
      *     // Instantiate a class based on its registered key (also known as a "symbolic name")
      *     factory.create( 'hello' );
      *
      * @param constructor Class to use when creating an object
      * @param key The key for {@link create}.
      *  This parameter is usually omitted in favour of letting the class declare
      *  its own key, through `MyClass.key`.
      *  For backwards-compatibility with OOjs 6.0 (2021) and older, it can also be declared
      *  via `MyClass.static.name`.
      * @throws {Error} If a parameter is invalid
      */
    def register(constructor: ConstructorLike, key: String): Unit = js.native
    
    /**
      * Unregister a class from the factory.
      *
      * @param key Constructor function or key to unregister
      * @throws {Error} If a parameter is invalid
      */
    def unregister(key: String): Unit = js.native
    def unregister(key: ConstructorLike): Unit = js.native
  }
  
  @js.native
  trait FactoryConstructor
    extends StObject
       with Instantiable0[Factory] {
    
    /** @deprecated Use `super` instead */
    var parent: RegistryConstructor = js.native
    
    var `super`: RegistryConstructor = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Partial<std.Record<K, any>> ? T[K] : undefined
    }}}
    */
  type GetProp[T, K /* <: ValidKey */] = Unit
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends oojs.OO.NonPlainObject ? T : std.Extract<oojs.OO.NodesOf<T, D>, oojs.OO.NonPlainObject>
    }}}
    */
  type LeavesOf[T, D /* <: Double */] = T
  
  trait NodeLike
    extends StObject
       with _NonPlainObject {
    
    def cloneNode(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
  }
  object NodeLike {
    
    inline def apply(cloneNode: Any => Any): NodeLike = {
      val __obj = js.Dynamic.literal(cloneNode = js.Any.fromFunction1(cloneNode))
      __obj.asInstanceOf[NodeLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeLike] (val x: Self) extends AnyVal {
      
      inline def setCloneNode(value: Any => Any): Self = StObject.set(x, "cloneNode", js.Any.fromFunction1(value))
    }
  }
  
  type NodesOf[T, D /* <: Double */] = /* import warning: importer.ImportType#apply Failed type conversion: oojs.anon.Recur<T, D>[D extends -1 ? 'done' : T extends oojs.OO.NonPlainObject ? 'done' : 'recur'] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Symbol
    - js.BigInt
    - scala.Null
    - scala.Unit
    - js.Function
    - typings.oojs.OO.NodeLike
    - typings.oojs.OO.Cloneable
  */
  type NonPlainObject = js.UndefOr[
    _NonPlainObject | String | Double | Boolean | js.Symbol | js.BigInt | Null | js.Function
  ]
  
  type RecursivelyGet[T, K /* <: js.Array[ValidKey] */] = /* import warning: importer.ImportType#apply Failed type conversion: oojs.anon.Done<T, K>[K extends [oojs.OO.ValidKey] ? 'done' : 'recur'] */ js.Any
  
  /**
    * A map interface for associating arbitrary data with a symbolic name. Used in
    * place of a plain object to provide additional {@link OO.Registry.register registration}
    * or {@link OO.Registry.lookup lookup} functionality.
    *
    * See <https://www.mediawiki.org/wiki/OOjs/Registries_and_factories>.
    */
  @js.native
  trait Registry
    extends StObject
       with EventEmitter {
    
    /**
      * Get data for a given symbolic name.
      *
      * @param name Symbolic name
      * @return Data associated with symbolic name
      */
    def lookup(name: String): js.UndefOr[Any] = js.native
    
    /**
      * Associate one or more symbolic names with some data.
      *
      * Any existing entry with the same name will be overridden.
      *
      * @param name Symbolic name or list of symbolic names
      * @param data Data to associate with symbolic name
      * @throws {Error} Name argument must be a string or array
      */
    def register(name: String, data: Any): Unit = js.native
    def register(name: js.Array[String], data: Any): Unit = js.native
    
    /**
      * Remove one or more symbolic names from the registry.
      *
      * @param name Symbolic name or list of symbolic names
      * @throws {Error} Name argument must be a string or array
      */
    def unregister(name: String): Unit = js.native
    def unregister(name: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait RegistryConstructor
    extends StObject
       with Instantiable0[Registry]
  
  /**
    * Manage a sorted list of {@link OO.EmitterList} objects.
    *
    * The sort order is based on a callback that compares two items. The return value of
    * callback( a, b ) must be less than zero if a < b, greater than zero if a > b, and zero
    * if a is equal to b. The callback should only return zero if the two objects are
    * considered equal.
    *
    * When an item changes in a way that could affect their sorting behavior, it must
    * emit the `itemSortChange` event.
    * This will cause it to be re-sorted automatically.
    *
    * This mixin must be used in a class that also mixes in {@link OO.EventEmitter}.
    */
  @js.native
  trait SortedEmitterList
    extends StObject
       with EmitterList {
    
    /**
      * Find the index a given item should be inserted at. If the item is already
      * in the list, this will return the index where the item currently is.
      *
      * @param item Items to insert
      * @return The index the item should be inserted at
      */
    def findInsertionIndex(item: EventEmitter): Double = js.native
    
    /**
      * Handle a case where an item changed a property that relates
      * to its sorted order.
      *
      * @param item Item in the list
      */
    def onItemSortChange(item: EventEmitter): Unit = js.native
    
    /**
      * Change the sorting callback for this sorted list.
      *
      * The callback receives two items. The return value of callback(a, b) must be less than zero
      * if a < b, greater than zero if a > b, and zero if a is equal to b.
      *
      * @param sortingCallback Sorting callback
      */
    def setSortingCallback(sortingCallback: SortingCallback): Unit = js.native
  }
  
  @js.native
  trait SortedEmitterListConstructor
    extends StObject
       with /** @param sortingCallback Callback that compares two items. */
  Instantiable1[/* sortingCallback */ SortingCallback, SortedEmitterList] {
    
    /** @deprecated Use `super` instead */
    var parent: EmitterListConstructor = js.native
    
    var `super`: EmitterListConstructor = js.native
  }
  
  type SortingCallback = js.Function2[/* a */ EventEmitter, /* b */ EventEmitter, Double]
  
  type ValidKey = String | Double
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.Array<any> ? T[number] : T[keyof T]
    }}}
    */
  @js.native
  trait ValueOf[T] extends StObject
  
  trait _NonPlainObject extends StObject
  object _NonPlainObject {
    
    inline def Cloneable(clone_ : Any => Any): typings.oojs.OO.Cloneable = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
      __obj.asInstanceOf[typings.oojs.OO.Cloneable]
    }
    
    inline def NodeLike(cloneNode: Any => Any): typings.oojs.OO.NodeLike = {
      val __obj = js.Dynamic.literal(cloneNode = js.Any.fromFunction1(cloneNode))
      __obj.asInstanceOf[typings.oojs.OO.NodeLike]
    }
  }
}
