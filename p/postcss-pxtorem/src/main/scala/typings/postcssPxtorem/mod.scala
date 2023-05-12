package typings.postcssPxtorem

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssPxtorem.mod.PostcssPxToRem.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-pxtorem", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[Options] = js.native
  
  object PostcssPxToRem {
    
    trait Options extends StObject {
      
      var exclude: js.UndefOr[String | js.RegExp | (js.Function1[/* file */ String, Boolean])] = js.undefined
      
      var mediaQuery: js.UndefOr[Boolean] = js.undefined
      
      var minPixelValue: js.UndefOr[Double] = js.undefined
      
      var propList: js.UndefOr[js.Array[String]] = js.undefined
      
      var replace: js.UndefOr[Boolean] = js.undefined
      
      var rootValue: js.UndefOr[Double | (js.Function1[/* pixelValue */ Double, Double])] = js.undefined
      
      var selectorBlackList: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
      
      var unitPrecision: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setExclude(value: String | js.RegExp | (js.Function1[/* file */ String, Boolean])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
        
        inline def setExcludeFunction1(value: /* file */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
        
        inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
        
        inline def setMediaQuery(value: Boolean): Self = StObject.set(x, "mediaQuery", value.asInstanceOf[js.Any])
        
        inline def setMediaQueryUndefined: Self = StObject.set(x, "mediaQuery", js.undefined)
        
        inline def setMinPixelValue(value: Double): Self = StObject.set(x, "minPixelValue", value.asInstanceOf[js.Any])
        
        inline def setMinPixelValueUndefined: Self = StObject.set(x, "minPixelValue", js.undefined)
        
        inline def setPropList(value: js.Array[String]): Self = StObject.set(x, "propList", value.asInstanceOf[js.Any])
        
        inline def setPropListUndefined: Self = StObject.set(x, "propList", js.undefined)
        
        inline def setPropListVarargs(value: String*): Self = StObject.set(x, "propList", js.Array(value*))
        
        inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
        
        inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
        
        inline def setRootValue(value: Double | (js.Function1[/* pixelValue */ Double, Double])): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
        
        inline def setRootValueFunction1(value: /* pixelValue */ Double => Double): Self = StObject.set(x, "rootValue", js.Any.fromFunction1(value))
        
        inline def setRootValueUndefined: Self = StObject.set(x, "rootValue", js.undefined)
        
        inline def setSelectorBlackList(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "selectorBlackList", value.asInstanceOf[js.Any])
        
        inline def setSelectorBlackListUndefined: Self = StObject.set(x, "selectorBlackList", js.undefined)
        
        inline def setSelectorBlackListVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "selectorBlackList", js.Array(value*))
        
        inline def setUnitPrecision(value: Double): Self = StObject.set(x, "unitPrecision", value.asInstanceOf[js.Any])
        
        inline def setUnitPrecisionUndefined: Self = StObject.set(x, "unitPrecision", js.undefined)
      }
    }
  }
  
  type _To = PluginCreator[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Options] = ^
}
