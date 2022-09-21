package typings.postcssImageSetFunction

import typings.postcss.mod.Declaration
import typings.postcssImageSetFunction.anon.Decl
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processImageSetMod {
  
  @JSImport("postcss-image-set-function/dist/lib/process-image-set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processImageSet(imageSetFunctions: js.Array[imageSetFunction], decl: Declaration, opts: Decl): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processImageSet")(imageSetFunctions.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait imageSetFunction extends StObject {
    
    var imageSetFunction: Node
    
    var imageSetOptionNodes: js.Array[Node]
  }
  object imageSetFunction {
    
    inline def apply(imageSetFunction: Node, imageSetOptionNodes: js.Array[Node]): imageSetFunction = {
      val __obj = js.Dynamic.literal(imageSetFunction = imageSetFunction.asInstanceOf[js.Any], imageSetOptionNodes = imageSetOptionNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[imageSetFunction]
    }
    
    extension [Self <: imageSetFunction](x: Self) {
      
      inline def setImageSetFunction(value: Node): Self = StObject.set(x, "imageSetFunction", value.asInstanceOf[js.Any])
      
      inline def setImageSetOptionNodes(value: js.Array[Node]): Self = StObject.set(x, "imageSetOptionNodes", value.asInstanceOf[js.Any])
      
      inline def setImageSetOptionNodesVarargs(value: Node*): Self = StObject.set(x, "imageSetOptionNodes", js.Array(value*))
    }
  }
}
