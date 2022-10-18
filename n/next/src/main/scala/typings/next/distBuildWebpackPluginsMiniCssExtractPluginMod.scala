package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsMiniCssExtractPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/mini-css-extract-plugin", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NextMiniCssExtractPlugin {
    
    /* CompleteClass */
    var __next_css_remove: Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MiniCssExtractPlugin * / any */ trait NextMiniCssExtractPlugin extends StObject {
    
    var __next_css_remove: Boolean
  }
  object NextMiniCssExtractPlugin {
    
    inline def apply(__next_css_remove: Boolean): NextMiniCssExtractPlugin = {
      val __obj = js.Dynamic.literal(__next_css_remove = __next_css_remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextMiniCssExtractPlugin]
    }
    
    extension [Self <: NextMiniCssExtractPlugin](x: Self) {
      
      inline def set__next_css_remove(value: Boolean): Self = StObject.set(x, "__next_css_remove", value.asInstanceOf[js.Any])
    }
  }
}
