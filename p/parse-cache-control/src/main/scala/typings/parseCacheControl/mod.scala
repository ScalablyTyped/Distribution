package typings.parseCacheControl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(field: String): Header | Null = ^.asInstanceOf[js.Dynamic].apply(field.asInstanceOf[js.Any]).asInstanceOf[Header | Null]
  
  @JSImport("parse-cache-control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Header extends StObject {
    
    var `max-age`: js.UndefOr[Double] = js.undefined
    
    var `must-revalidate`: js.UndefOr[Boolean] = js.undefined
    
    var `no-cache`: js.UndefOr[Boolean] = js.undefined
    
    var `no-store`: js.UndefOr[Boolean] = js.undefined
    
    var `private`: js.UndefOr[Boolean] = js.undefined
  }
  object Header {
    
    inline def apply(): Header = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def `setMax-age`(value: Double): Self = StObject.set(x, "max-age", value.asInstanceOf[js.Any])
      
      inline def `setMax-ageUndefined`: Self = StObject.set(x, "max-age", js.undefined)
      
      inline def `setMust-revalidate`(value: Boolean): Self = StObject.set(x, "must-revalidate", value.asInstanceOf[js.Any])
      
      inline def `setMust-revalidateUndefined`: Self = StObject.set(x, "must-revalidate", js.undefined)
      
      inline def `setNo-cache`(value: Boolean): Self = StObject.set(x, "no-cache", value.asInstanceOf[js.Any])
      
      inline def `setNo-cacheUndefined`: Self = StObject.set(x, "no-cache", js.undefined)
      
      inline def `setNo-store`(value: Boolean): Self = StObject.set(x, "no-store", value.asInstanceOf[js.Any])
      
      inline def `setNo-storeUndefined`: Self = StObject.set(x, "no-store", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
}
