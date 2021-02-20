package typings.picturefill

import typings.picturefill.mod.Picturefill.EvaluateArg
import typings.std.Element
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("picturefill", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("picturefill", JSImport.Namespace)
  @js.native
  def apply(arg: EvaluateArg): Unit = js.native
  
  object Picturefill {
    
    type ElementNullable = Element | Null
    
    @js.native
    trait EvaluateArg extends StObject {
      
      var elements: NodeList | js.Array[ElementNullable] = js.native
      
      var reevaluate: js.UndefOr[Boolean] = js.native
    }
    object EvaluateArg {
      
      @scala.inline
      def apply(elements: NodeList | js.Array[ElementNullable]): EvaluateArg = {
        val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
        __obj.asInstanceOf[EvaluateArg]
      }
      
      @scala.inline
      implicit class EvaluateArgMutableBuilder[Self <: EvaluateArg] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setElements(value: NodeList | js.Array[ElementNullable]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementsVarargs(value: ElementNullable*): Self = StObject.set(x, "elements", js.Array(value :_*))
        
        @scala.inline
        def setReevaluate(value: Boolean): Self = StObject.set(x, "reevaluate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReevaluateUndefined: Self = StObject.set(x, "reevaluate", js.undefined)
      }
    }
  }
}
