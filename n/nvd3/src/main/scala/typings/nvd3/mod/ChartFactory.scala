package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartFactory[TChart /* <: Nvd3Element */] extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* chart */ TChart, Unit]] = js.undefined
  
  def generate(): TChart
}
object ChartFactory {
  
  inline def apply[TChart /* <: Nvd3Element */](generate: () => TChart): ChartFactory[TChart] = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction0(generate))
    __obj.asInstanceOf[ChartFactory[TChart]]
  }
  
  extension [Self <: ChartFactory[?], TChart /* <: Nvd3Element */](x: Self & ChartFactory[TChart]) {
    
    inline def setCallback(value: /* chart */ TChart => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setGenerate(value: () => TChart): Self = StObject.set(x, "generate", js.Any.fromFunction0(value))
  }
}
