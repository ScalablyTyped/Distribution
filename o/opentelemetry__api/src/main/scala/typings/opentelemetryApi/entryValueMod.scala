package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryValueMod {
  
  @js.native
  sealed trait EntryTtl extends StObject
  @JSImport("@opentelemetry/api/build/src/correlation_context/EntryValue", "EntryTtl")
  @js.native
  object EntryTtl extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EntryTtl with Double] = js.native
    
    /**
      * NO_PROPAGATION is considered to have local context and is used within the
      * process it created.
      */
    @js.native
    sealed trait NO_PROPAGATION extends EntryTtl
    /* 0 */ val NO_PROPAGATION: typings.opentelemetryApi.entryValueMod.EntryTtl.NO_PROPAGATION with Double = js.native
    
    /** UNLIMITED_PROPAGATION can propagate unlimited hops. */
    @js.native
    sealed trait UNLIMITED_PROPAGATION extends EntryTtl
    /* -1 */ val UNLIMITED_PROPAGATION: typings.opentelemetryApi.entryValueMod.EntryTtl.UNLIMITED_PROPAGATION with Double = js.native
  }
  
  @js.native
  trait EntryValue extends StObject {
    
    /**
      * ttl is an integer that represents number of hops an entry can
      * propagate.
      */
    var ttl: js.UndefOr[EntryTtl] = js.native
    
    /** `String` value of the `EntryValue`. */
    var value: String = js.native
  }
  object EntryValue {
    
    @scala.inline
    def apply(value: String): EntryValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryValue]
    }
    
    @scala.inline
    implicit class EntryValueMutableBuilder[Self <: EntryValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTtl(value: EntryTtl): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
