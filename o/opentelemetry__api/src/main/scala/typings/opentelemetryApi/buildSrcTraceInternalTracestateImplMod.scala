package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcTraceTraceStateMod.TraceState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceInternalTracestateImplMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/internal/tracestate-impl", "TraceStateImpl")
  @js.native
  open class TraceStateImpl ()
    extends StObject
       with TraceState {
    def this(rawTraceState: String) = this()
    
    /* private */ var _clone: Any = js.native
    
    /* private */ var _internalState: Any = js.native
    
    /* private */ var _keys: Any = js.native
    
    /* private */ var _parse: Any = js.native
    
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
      * Create a new TraceState which inherits from this TraceState and has the
      * given key set.
      * The new entry will always be added in the front of the list of states.
      *
      * @param key key of the TraceState entry.
      * @param value value of the TraceState entry.
      */
    /* CompleteClass */
    override def set(key: String, value: String): TraceState = js.native
    
    /**
      * Return a new TraceState which inherits from this TraceState but does not
      * contain the given key.
      *
      * @param key the key for the TraceState entry to be removed.
      */
    /* CompleteClass */
    override def unset(key: String): TraceState = js.native
  }
}
