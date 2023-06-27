package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinChange extends StObject {
  
  var onBinChange: js.UndefOr[js.Function1[/* bin */ String, Unit]] = js.undefined
}
object BinChange {
  
  inline def apply(): BinChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinChange] (val x: Self) extends AnyVal {
    
    inline def setOnBinChange(value: /* bin */ String => Unit): Self = StObject.set(x, "onBinChange", js.Any.fromFunction1(value))
    
    inline def setOnBinChangeUndefined: Self = StObject.set(x, "onBinChange", js.undefined)
  }
}
