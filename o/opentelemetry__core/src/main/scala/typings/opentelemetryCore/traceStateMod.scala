package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceStateMod {
  
  @JSImport("@opentelemetry/core/build/src/trace/TraceState", "TraceState")
  @js.native
  class TraceState ()
    extends StObject
       with typings.opentelemetryApi.traceStateMod.TraceState {
    def this(rawTraceState: String) = this()
    
    /* private */ var _internalState: js.Any = js.native
    
    /* private */ var _keys: js.Any = js.native
    
    /* private */ var _parse: js.Any = js.native
    
    /**
      * Returns the value to which the specified key is mapped, or `undefined` if
      * this map contains no mapping for the key.
      *
      * @param key with which the specified value is to be associated.
      * @returns the value to which the specified key is mapped, or `undefined` if
      *     this map contains no mapping for the key.
      */
    /* CompleteClass */
    override def get(key: String): js.UndefOr[String] = js.native
    
    /**
      * Serializes the TraceState to a `list` as defined below. The `list` is a
      * series of `list-members` separated by commas `,`, and a list-member is a
      * key/value pair separated by an equals sign `=`. Spaces and horizontal tabs
      * surrounding `list-members` are ignored. There can be a maximum of 32
      * `list-members` in a `list`.
      *
      * @returns the serialized string.
      */
    /* CompleteClass */
    override def serialize(): String = js.native
    
    /**
      * Adds or updates the TraceState that has the given `key` if it is
      * present. The new State will always be added in the front of the
      * list of states.
      *
      * @param key key of the TraceState entry.
      * @param value value of the TraceState entry.
      */
    /* CompleteClass */
    override def set(key: String, value: String): Unit = js.native
    
    /**
      * Removes the TraceState Entry that has the given `key` if it is present.
      *
      * @param key the key for the TraceState Entry to be removed.
      */
    /* CompleteClass */
    override def unset(key: String): Unit = js.native
  }
}
