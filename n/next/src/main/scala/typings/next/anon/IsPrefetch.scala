package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPrefetch extends StObject {
  
  var isManualRevalidate: js.UndefOr[Boolean] = js.undefined
  
  var isPrefetch: js.UndefOr[Boolean] = js.undefined
}
object IsPrefetch {
  
  inline def apply(): IsPrefetch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsPrefetch]
  }
  
  extension [Self <: IsPrefetch](x: Self) {
    
    inline def setIsManualRevalidate(value: Boolean): Self = StObject.set(x, "isManualRevalidate", value.asInstanceOf[js.Any])
    
    inline def setIsManualRevalidateUndefined: Self = StObject.set(x, "isManualRevalidate", js.undefined)
    
    inline def setIsPrefetch(value: Boolean): Self = StObject.set(x, "isPrefetch", value.asInstanceOf[js.Any])
    
    inline def setIsPrefetchUndefined: Self = StObject.set(x, "isPrefetch", js.undefined)
  }
}
