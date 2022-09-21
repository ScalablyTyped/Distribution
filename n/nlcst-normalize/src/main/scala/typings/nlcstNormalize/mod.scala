package typings.nlcstNormalize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nlcst-normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def normalize(node: String, options: NormalizeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalize(node: js.Array[Content]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def normalize(node: js.Array[Content], options: NormalizeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalize(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def normalize(node: Node, options: NormalizeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Content = typings.nlcst.mod.Content
  
  type Node = Root | Content
  
  trait NormalizeOptions extends StObject {
    
    var allowApostrophes: js.UndefOr[Boolean] = js.undefined
    
    var allowDashes: js.UndefOr[Boolean] = js.undefined
  }
  object NormalizeOptions {
    
    inline def apply(): NormalizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizeOptions]
    }
    
    extension [Self <: NormalizeOptions](x: Self) {
      
      inline def setAllowApostrophes(value: Boolean): Self = StObject.set(x, "allowApostrophes", value.asInstanceOf[js.Any])
      
      inline def setAllowApostrophesUndefined: Self = StObject.set(x, "allowApostrophes", js.undefined)
      
      inline def setAllowDashes(value: Boolean): Self = StObject.set(x, "allowDashes", value.asInstanceOf[js.Any])
      
      inline def setAllowDashesUndefined: Self = StObject.set(x, "allowDashes", js.undefined)
    }
  }
  
  type Root = typings.nlcst.mod.Root
}
