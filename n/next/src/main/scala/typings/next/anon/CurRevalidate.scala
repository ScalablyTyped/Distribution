package typings.next.anon

import typings.next.distServerResponseCacheTypesMod.IncrementalCacheValue
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurRevalidate extends StObject {
  
  var curRevalidate: js.UndefOr[Double | `false`] = js.undefined
  
  var isMiss: js.UndefOr[Boolean] = js.undefined
  
  var isStale: js.UndefOr[Boolean] = js.undefined
  
  var revalidate: js.UndefOr[Double | `false`] = js.undefined
  
  var revalidateAfter: js.UndefOr[Double | `false`] = js.undefined
  
  var value: IncrementalCacheValue | Null
}
object CurRevalidate {
  
  inline def apply(): CurRevalidate = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[CurRevalidate]
  }
  
  extension [Self <: CurRevalidate](x: Self) {
    
    inline def setCurRevalidate(value: Double | `false`): Self = StObject.set(x, "curRevalidate", value.asInstanceOf[js.Any])
    
    inline def setCurRevalidateUndefined: Self = StObject.set(x, "curRevalidate", js.undefined)
    
    inline def setIsMiss(value: Boolean): Self = StObject.set(x, "isMiss", value.asInstanceOf[js.Any])
    
    inline def setIsMissUndefined: Self = StObject.set(x, "isMiss", js.undefined)
    
    inline def setIsStale(value: Boolean): Self = StObject.set(x, "isStale", value.asInstanceOf[js.Any])
    
    inline def setIsStaleUndefined: Self = StObject.set(x, "isStale", js.undefined)
    
    inline def setRevalidate(value: Double | `false`): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setRevalidateAfter(value: Double | `false`): Self = StObject.set(x, "revalidateAfter", value.asInstanceOf[js.Any])
    
    inline def setRevalidateAfterUndefined: Self = StObject.set(x, "revalidateAfter", js.undefined)
    
    inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
    
    inline def setValue(value: IncrementalCacheValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
