package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeLimit extends StObject {
  
  var sizeLimit: js.UndefOr[Double | String] = js.undefined
}
object SizeLimit {
  
  inline def apply(): SizeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeLimit]
  }
  
  extension [Self <: SizeLimit](x: Self) {
    
    inline def setSizeLimit(value: Double | String): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
    
    inline def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
  }
}
