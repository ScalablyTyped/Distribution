package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurgeTrimOpts
  extends StObject
     with PurgeOpts {
  
  var filter: js.UndefOr[String] = js.undefined
  
  var keep: Double
}
object PurgeTrimOpts {
  
  inline def apply(keep: Double): PurgeTrimOpts = {
    val __obj = js.Dynamic.literal(keep = keep.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeTrimOpts]
  }
  
  extension [Self <: PurgeTrimOpts](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setKeep(value: Double): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
  }
}
