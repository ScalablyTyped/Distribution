package typings.nats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nuidMod {
  
  @JSImport("nats/lib/nats-base-client/nuid", "Nuid")
  @js.native
  open class Nuid_ () extends StObject {
    
    var buf: js.typedarray.Uint8Array = js.native
    
    /**
      * Fills the sequence part of the nuid as base36 from this.seq.
      *
      * @api private
      */
    /* private */ var fillSeq: Any = js.native
    
    var inc: Double = js.native
    
    /**
      * Initializes a nuid with a crypto random prefix,
      * and pseudo-random sequence and increment.
      *
      * @api private
      */
    /* private */ var init: Any = js.native
    
    /**
      * Initializes the pseudo randmon sequence number and the increment range.
      *
      * @api private
      */
    /* private */ var initSeqAndInc: Any = js.native
    
    /**
      * Returns the next nuid.
      *
      * @api private
      */
    def next(): String = js.native
    
    def reset(): Unit = js.native
    
    var seq: Double = js.native
    
    /**
      * Sets the prefix from crypto random bytes. Converts to base36.
      *
      * @api private
      */
    /* private */ var setPre: Any = js.native
  }
  
  @JSImport("nats/lib/nats-base-client/nuid", "nuid")
  @js.native
  val nuid: Nuid_ = js.native
}
