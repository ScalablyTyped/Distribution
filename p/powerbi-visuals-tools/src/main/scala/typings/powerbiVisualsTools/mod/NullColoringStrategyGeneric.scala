package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullColoringStrategyGeneric[TStrategy, TColor] extends StObject {
  
  /**
    * Only used if strategy is specificColor
    */
  var color: js.UndefOr[TColor] = js.undefined
  
  var strategy: TStrategy
}
object NullColoringStrategyGeneric {
  
  inline def apply[TStrategy, TColor](strategy: TStrategy): NullColoringStrategyGeneric[TStrategy, TColor] = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullColoringStrategyGeneric[TStrategy, TColor]]
  }
  
  extension [Self <: NullColoringStrategyGeneric[?, ?], TStrategy, TColor](x: Self & (NullColoringStrategyGeneric[TStrategy, TColor])) {
    
    inline def setColor(value: TColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStrategy(value: TStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
