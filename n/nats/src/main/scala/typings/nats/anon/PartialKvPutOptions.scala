package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.KvPutOptions> */
trait PartialKvPutOptions extends StObject {
  
  var previousSeq: js.UndefOr[Double] = js.undefined
}
object PartialKvPutOptions {
  
  inline def apply(): PartialKvPutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKvPutOptions]
  }
  
  extension [Self <: PartialKvPutOptions](x: Self) {
    
    inline def setPreviousSeq(value: Double): Self = StObject.set(x, "previousSeq", value.asInstanceOf[js.Any])
    
    inline def setPreviousSeqUndefined: Self = StObject.set(x, "previousSeq", js.undefined)
  }
}
