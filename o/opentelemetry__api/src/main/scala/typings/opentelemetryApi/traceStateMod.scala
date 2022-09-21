package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceStateMod {
  
  trait TraceState extends StObject {
    
    /**
      * Returns the value to which the specified key is mapped, or `undefined` if
      * this map contains no mapping for the key.
      *
      * @param key with which the specified value is to be associated.
      * @returns the value to which the specified key is mapped, or `undefined` if
      *     this map contains no mapping for the key.
      */
    def get(key: String): js.UndefOr[String]
    
    /**
      * Serializes the TraceState to a `list` as defined below. The `list` is a
      * series of `list-members` separated by commas `,`, and a list-member is a
      * key/value pair separated by an equals sign `=`. Spaces and horizontal tabs
      * surrounding `list-members` are ignored. There can be a maximum of 32
      * `list-members` in a `list`.
      *
      * @returns the serialized string.
      */
    def serialize(): String
    
    /**
      * Create a new TraceState which inherits from this TraceState and has the
      * given key set.
      * The new entry will always be added in the front of the list of states.
      *
      * @param key key of the TraceState entry.
      * @param value value of the TraceState entry.
      */
    def set(key: String, value: String): TraceState
    
    /**
      * Return a new TraceState which inherits from this TraceState but does not
      * contain the given key.
      *
      * @param key the key for the TraceState entry to be removed.
      */
    def unset(key: String): TraceState
  }
  object TraceState {
    
    inline def apply(
      get: String => js.UndefOr[String],
      serialize: () => String,
      set: (String, String) => TraceState,
      unset: String => TraceState
    ): TraceState = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), serialize = js.Any.fromFunction0(serialize), set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
      __obj.asInstanceOf[TraceState]
    }
    
    extension [Self <: TraceState](x: Self) {
      
      inline def setGet(value: String => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSerialize(value: () => String): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, String) => TraceState): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setUnset(value: String => TraceState): Self = StObject.set(x, "unset", js.Any.fromFunction1(value))
    }
  }
}
