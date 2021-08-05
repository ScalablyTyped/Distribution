package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permanent extends StObject {
  
  var permanent: js.UndefOr[Boolean] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
}
object Permanent {
  
  inline def apply(): Permanent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permanent]
  }
  
  extension [Self <: Permanent](x: Self) {
    
    inline def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    inline def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
