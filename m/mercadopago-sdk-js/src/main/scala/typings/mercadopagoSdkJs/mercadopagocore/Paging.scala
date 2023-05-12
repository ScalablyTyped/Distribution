package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paging extends StObject {
  
  var limit: Double
  
  var offset: Double
  
  var total: Double
}
object Paging {
  
  inline def apply(limit: Double, offset: Double, total: Double): Paging = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paging] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
