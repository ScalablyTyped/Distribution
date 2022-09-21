package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueuingStrategy[T] extends StObject {
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[QueuingStrategySize[T]] = js.undefined
}
object QueuingStrategy {
  
  inline def apply[T](): QueuingStrategy[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueuingStrategy[T]]
  }
  
  extension [Self <: QueuingStrategy[?], T](x: Self & QueuingStrategy[T]) {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setSize(value: /* chunk */ js.UndefOr[T] => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
