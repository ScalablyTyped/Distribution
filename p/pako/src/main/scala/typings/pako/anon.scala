package typings.pako

import typings.pako.mod.StrategyValues
import typings.pako.pakoNumbers.`-1`
import typings.pako.pakoNumbers.`0`
import typings.pako.pakoNumbers.`1`
import typings.pako.pakoNumbers.`2`
import typings.pako.pakoNumbers.`3`
import typings.pako.pakoNumbers.`4`
import typings.pako.pakoNumbers.`5`
import typings.pako.pakoNumbers.`6`
import typings.pako.pakoNumbers.`7`
import typings.pako.pakoNumbers.`8`
import typings.pako.pakoNumbers.`9`
import typings.pako.pakoStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined pako.pako.DeflateFunctionOptions & {  to :'string'} */
  trait DeflateFunctionOptionstos extends StObject {
    
    var dictionary: js.UndefOr[js.Any] = js.undefined
    
    var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
    
    var memLevel: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var strategy: js.UndefOr[StrategyValues] = js.undefined
    
    var to: js.UndefOr[string] & string
    
    var windowBits: js.UndefOr[Double] = js.undefined
  }
  object DeflateFunctionOptionstos {
    
    @scala.inline
    def apply(to: js.UndefOr[string] & string): DeflateFunctionOptionstos = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeflateFunctionOptionstos]
    }
    
    @scala.inline
    implicit class DeflateFunctionOptionstosMutableBuilder[Self <: DeflateFunctionOptionstos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDictionary(value: js.Any): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
      
      @scala.inline
      def setLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setStrategy(value: StrategyValues): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setTo(value: js.UndefOr[string] & string): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
    }
  }
  
  /* Inlined pako.pako.InflateFunctionOptions & {  to :'string'} */
  trait InflateFunctionOptionstos extends StObject {
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[string] & string
    
    var windowBits: js.UndefOr[Double] = js.undefined
  }
  object InflateFunctionOptionstos {
    
    @scala.inline
    def apply(to: js.UndefOr[string] & string): InflateFunctionOptionstos = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[InflateFunctionOptionstos]
    }
    
    @scala.inline
    implicit class InflateFunctionOptionstosMutableBuilder[Self <: InflateFunctionOptionstos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setTo(value: js.UndefOr[string] & string): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
    }
  }
}
