package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KvPutOptions extends StObject {
  
  var previousSeq: Double
}
object KvPutOptions {
  
  inline def apply(previousSeq: Double): KvPutOptions = {
    val __obj = js.Dynamic.literal(previousSeq = previousSeq.asInstanceOf[js.Any])
    __obj.asInstanceOf[KvPutOptions]
  }
  
  extension [Self <: KvPutOptions](x: Self) {
    
    inline def setPreviousSeq(value: Double): Self = StObject.set(x, "previousSeq", value.asInstanceOf[js.Any])
  }
}
