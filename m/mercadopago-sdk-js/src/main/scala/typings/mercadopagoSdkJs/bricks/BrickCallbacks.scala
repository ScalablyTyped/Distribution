package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickCallbacks extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ BrickError, Unit]] = js.undefined
  
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object BrickCallbacks {
  
  inline def apply(): BrickCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrickCallbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrickCallbacks] (val x: Self) extends AnyVal {
    
    inline def setOnError(value: /* error */ BrickError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
  }
}
