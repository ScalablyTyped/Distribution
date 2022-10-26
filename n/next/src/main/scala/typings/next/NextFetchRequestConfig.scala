package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextFetchRequestConfig extends StObject {
  
  var revalidate: js.UndefOr[Double] = js.undefined
}
object NextFetchRequestConfig {
  
  inline def apply(): NextFetchRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextFetchRequestConfig]
  }
  
  extension [Self <: NextFetchRequestConfig](x: Self) {
    
    inline def setRevalidate(value: Double): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
  }
}
