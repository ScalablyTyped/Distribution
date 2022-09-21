package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurgeBySeq
  extends StObject
     with PurgeOpts {
  
  var filter: js.UndefOr[String] = js.undefined
  
  var seq: Double
}
object PurgeBySeq {
  
  inline def apply(seq: Double): PurgeBySeq = {
    val __obj = js.Dynamic.literal(seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeBySeq]
  }
  
  extension [Self <: PurgeBySeq](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
  }
}
