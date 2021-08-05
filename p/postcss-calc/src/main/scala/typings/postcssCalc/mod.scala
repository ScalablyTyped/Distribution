package typings.postcssCalc

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-calc", JSImport.Namespace)
  @js.native
  val ^ : Calc = js.native
  
  type Calc = Plugin_[Options]
  
  trait Options extends StObject {
    
    var mediaQueries: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var selectors: js.UndefOr[Boolean] = js.undefined
    
    var warnWhenCannotResolve: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMediaQueries(value: Boolean): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
      
      inline def setMediaQueriesUndefined: Self = StObject.set(x, "mediaQueries", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setSelectors(value: Boolean): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setWarnWhenCannotResolve(value: Boolean): Self = StObject.set(x, "warnWhenCannotResolve", value.asInstanceOf[js.Any])
      
      inline def setWarnWhenCannotResolveUndefined: Self = StObject.set(x, "warnWhenCannotResolve", js.undefined)
    }
  }
  
  type _To = Calc
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Calc = ^
}
