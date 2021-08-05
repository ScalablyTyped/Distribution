package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolOptions extends StObject {
  
  var size: js.UndefOr[Double] = js.undefined
}
object PoolOptions {
  
  inline def apply(): PoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolOptions]
  }
  
  extension [Self <: PoolOptions](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
