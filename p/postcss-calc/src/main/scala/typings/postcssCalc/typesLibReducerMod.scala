package typings.postcssCalc

import typings.postcssCalc.postcssCalcStrings.Plussign
import typings.postcssCalc.postcssCalcStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibReducerMod {
  
  /**
    * @param {import('../parser').CalcNode} node
    * @param {number} precision
    * @return {import('../parser').CalcNode}
    */
  inline def apply(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parser.CalcNode */ Any,
    precision: Double
  ): Any = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("postcss-calc/types/lib/reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Collectible extends StObject {
    
    var node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parser.CalcNode */ Any
    
    var preOperator: Plussign | `-_`
  }
  object Collectible {
    
    inline def apply(
      node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parser.CalcNode */ Any,
      preOperator: Plussign | `-_`
    ): Collectible = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], preOperator = preOperator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collectible]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Collectible] (val x: Self) extends AnyVal {
      
      inline def setNode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parser.CalcNode */ Any
      ): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPreOperator(value: Plussign | `-_`): Self = StObject.set(x, "preOperator", value.asInstanceOf[js.Any])
    }
  }
}
