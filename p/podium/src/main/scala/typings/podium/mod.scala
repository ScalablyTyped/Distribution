package typings.podium

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.podium.anon.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("podium", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Podium = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("podium", JSImport.Namespace)
  @js.native
  /**
    * Creates a new podium emitter
    * @param events  if present, the value is passed to podium.registerEvent().
    */
  open class Class ()
    extends StObject
       with Podium {
    def this(events: js.Array[Events]) = this()
    def this(events: Events) = this()
  }
  
  type Criteria = String | CriteriaObject
  
  trait CriteriaFilterOptionsObject extends StObject {
    
    /** if true, all tags must be present for the event update to match the subscription. Defaults to false (at least one matching tag). */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /** a tag string or array of tag strings. */
    var tags: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object CriteriaFilterOptionsObject {
    
    inline def apply(): CriteriaFilterOptionsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CriteriaFilterOptionsObject]
    }
    
    extension [Self <: CriteriaFilterOptionsObject](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setTags(value: String | js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait CriteriaObject extends StObject {
    
    /** if true, the listener method receives an additional callback argument which must be called when the method completes. No other event will be emitted until the callback methods is called. The method signature is function(). If block is set to a positive integer, the value is used to set a timeout after which any pending events will be emitted, ignoring the eventual call to callback. Defaults to false (non blocking). */
    var block: js.UndefOr[Boolean | Double] = js.undefined
    
    /** a string or array of strings specifying the event channels to subscribe to. If the event registration specified a list of allowed channels, the channels array must match the allowed channels. If channels are specified, event updates without any channel designation will not be included in the subscription. Defaults to no channels filter. */
    var channels: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** if true, the data object passed to podium.emit() is cloned before it is passed to the listener method. Defaults to the event registration option (which defaults to false). */
    @JSName("clone")
    var clone_FCriteriaObject: js.UndefOr[Boolean] = js.undefined
    
    /** a positive integer indicating the number of times the listener can be called after which the subscription is automatically removed. A count of 1 is the same as calling podium.once(). Defaults to no limit. */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * the event tags (if present) to subscribe to which can be one of:
      *  * a tag string.
      *  * an array of tag strings.
      *  * an object with the following:
      */
    var filter: js.UndefOr[String | js.Array[String] | CriteriaFilterOptionsObject] = js.undefined
    
    /** the handler method set to receive event updates. The function signature depends on the block, spread, and tags options. */
    var listener: js.UndefOr[Listener] = js.undefined
    
    /** the event name string (required). */
    var name: String
    
    /** if true, and the data object passed to podium.emit() is an array, the listener method is called with each array element passed as a separate argument. This should only be used when the emitted data structure is known and predictable. Defaults to the event registration option (which defaults to false). */
    var spread: js.UndefOr[Boolean] = js.undefined
    
    /** if true and the criteria object passed to podium.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to the arguments list at the end (but before the callback argument if block is set). Defaults to the event registration option (which defaults to false). */
    var tags: js.UndefOr[Boolean] = js.undefined
  }
  object CriteriaObject {
    
    inline def apply(name: String): CriteriaObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CriteriaObject]
    }
    
    extension [Self <: CriteriaObject](x: Self) {
      
      inline def setBlock(value: Boolean | Double): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setFilter(value: String | js.Array[String] | CriteriaFilterOptionsObject): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setListener(
        value: (/* data */ Any, /* tags */ js.UndefOr[Tags], /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit
      ): Self = StObject.set(x, "listener", js.Any.fromFunction3(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
      
      inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait EventOptionsObject
    extends StObject
       with _Events {
    
    /** a string or array of strings specifying the event channels available. Defaults to no channel restrictions (event updates can specify a channel or not). */
    var channels: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** if true, the data object passed to podium.emit() is cloned before it is passed to the listeners (unless an override specified by each listener). Defaults to false (data is passed as-is). */
    @JSName("clone")
    var clone_FEventOptionsObject: js.UndefOr[Boolean] = js.undefined
    
    /** the event name string (required). */
    var name: String
    
    /** if true, the same event name can be registered multiple times where the second registration is ignored. Note that if the registration config is changed between registrations, only the first configuration is used. Defaults to false (a duplicate registration will throw an error). */
    var shared: js.UndefOr[Boolean] = js.undefined
    
    /** if true, the data object passed to podium.emit() must be an array and the listener method is called with each array element passed as a separate argument (unless an override specified by each listener). This should only be used when the emitted data structure is known and predictable. Defaults to false (data is emitted as a single argument regardless of its type). */
    var spread: js.UndefOr[Boolean] = js.undefined
    
    /** if true and the criteria object passed to podium.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to the arguments list at the end (but before the callback argument if block is set). A configuration override can be set by each listener. Defaults to false. */
    var tags: js.UndefOr[Boolean] = js.undefined
  }
  object EventOptionsObject {
    
    inline def apply(name: String): EventOptionsObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventOptionsObject]
    }
    
    extension [Self <: EventOptionsObject](x: Self) {
      
      inline def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      
      inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
      
      inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.podium.mod.EventOptionsObject
    - typings.podium.mod.Podium
  */
  type Events = _Events | String
  
  type Listener = js.Function3[
    /* data */ Any, 
    /* tags */ js.UndefOr[Tags], 
    /* callback */ js.UndefOr[js.Function0[Unit]], 
    Unit
  ]
  
  @js.native
  trait Podium
    extends StObject
       with /**
    * Creates a new podium emitter
    * @param events  if present, the value is passed to podium.registerEvent().
    */
  Instantiable0[Podium]
       with Instantiable1[(/* events */ js.Array[Events]) | (/* events */ Events), Podium]
       with _Events {
    
    /**
      * podium.addListener(criteria, listener)
      * Same as podium.on()
      * @param criteria  the subscription criteria
      * @param listener  the handler method set to receive event updates. The function signature depends on the block, spread, and tags options.
      * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumoncriteria-listener}
      */
    def addListener(criteria: String, listener: Listener): Unit = js.native
    def addListener(criteria: Criteria, listener: Listener): Unit = js.native
    
    /**
      * podium.emit(criteria, data, [callback])
      * Emits an event update to all the subscribed listeners
      * @param criteria  the event update criteria
      * @param data  the value emitted to the subscribers.
      * @param callback  an optional callback method invoked when all subscribers have been notified using the signature function()
      * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumemitcriteria-data-callback}
      */
    def emit(criteria: String, data: Any): Unit = js.native
    def emit(criteria: String, data: Any, callback: js.Function0[Unit]): Unit = js.native
    def emit(criteria: Channel, data: Any): Unit = js.native
    def emit(criteria: Channel, data: Any, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * podium.hasListeners(name)
      * Returns whether an event has any listeners subscribed
      * @param name  the event name string.
      * Returns true if the event name has any listeners, otherwise false.
      * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumhaslistenersname}
      */
    def hasListeners(name: String): Boolean = js.native
    
    /**
      * podium.on(criteria, listener)
      * Subscribe a handler to an event
      * @param criteria  the subscription criteria
      * @param listener  the handler method set to receive event updates. The function signature depends on the block, spread, and tags options.
      * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumoncriteria-listener}
      */
    def on(criteria: String, listener: Listener): Unit = js.native
    def on(criteria: Criteria, listener: Listener): Unit = js.native
    
    /**
      * podium.once(criteria, listener)
      * Same as podium.on() with the count option set to 1.
      * @param criteria  the subscription criteria
      * @param listener  the handler method set to receive event updates. The function signature depends on the block, spread, and tags options.
      * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumoncriteria-listener}
      */
    def once(criteria: String, listener: Listener): Unit = js.native
    def once(criteria: Criteria, listener: Listener): Unit = js.native
    
    /**
      * podium.registerEvent(events)
      * Register the specified events and their optional configuration. Events must be registered before they can be emitted or subscribed to. This is done to detect event name mispelling and invalid event activities.
      * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumregistereventevents}
      */
    def registerEvent(events: js.Array[Events]): Unit = js.native
    def registerEvent(events: Events): Unit = js.native
    
    /**
      * podium.registerPodium(podiums)
      * Registers another emitter as an event source for the current emitter (any event update emitted by the source emitter is passed to any subscriber of the current emitter)
      * Note that any events registered with a source emitter are automatically added to the current emitter. If the events are already registered, they are left as-is.
      * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumregisterpodiumpodiums}
      */
    def registerPodium(podiums: js.Array[Podium]): Unit = js.native
    def registerPodium(podiums: Podium): Unit = js.native
    
    /**
      * podium.removeAllListeners(name)
      * Removes all listeners subscribed to a given event name
      * @param name  the event name string.
      * Returns a reference to the current emitter.
      * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumremovealllistenersname}
      */
    def removeAllListeners(name: String): Podium = js.native
    
    /**
      * podium.removeListener(name, listener)
      * Removes all listeners subscribed to a given event name matching the provided listener method where:
      * @param name  the event name string.
      * @param listener  the function reference provided when subscribed.
      * Returns a reference to the current emitter.
      * @see {@link https://github.com/hapijs/podium/blob/master/API.md#podiumremovelistenername-listener}
      */
    def removeListener(name: String, listener: Listener): Podium = js.native
  }
  
  type Tags = StringDictionary[Boolean]
  
  trait _Events extends StObject
  
  type _To = js.Object & Podium
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Podium = ^
}
