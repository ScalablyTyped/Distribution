package typings.nginstackWebFramework

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExpressionExpressionMod {
  
  inline def apply(expression: String): Expression = ^.asInstanceOf[js.Dynamic].apply(expression.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  @JSImport("@nginstack/web-framework/lib/expression/Expression", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Expression {
    def this(expression: String) = this()
    
    /* CompleteClass */
    override def evaluate(parameters: StringDictionary[Double]): Double = js.native
    
    /* private */ /* CompleteClass */
    var expression_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var extractVariables_ : Any = js.native
    
    /* CompleteClass */
    override def variables(): js.Array[String] = js.native
    
    /* private */ /* CompleteClass */
    var variablesLength_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var variables_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/expression/Expression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Expression extends StObject {
    
    def evaluate(parameters: StringDictionary[Double]): Double
    
    /* private */ var expression_ : Any
    
    /* private */ var extractVariables_ : Any
    
    def variables(): js.Array[String]
    
    /* private */ var variablesLength_ : Any
    
    /* private */ var variables_ : Any
  }
  object Expression {
    
    inline def apply(
      evaluate: StringDictionary[Double] => Double,
      expression_ : Any,
      extractVariables_ : Any,
      variables: () => js.Array[String],
      variablesLength_ : Any,
      variables_ : Any
    ): Expression = {
      val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), expression_ = expression_.asInstanceOf[js.Any], extractVariables_ = extractVariables_.asInstanceOf[js.Any], variables = js.Any.fromFunction0(variables), variablesLength_ = variablesLength_.asInstanceOf[js.Any], variables_ = variables_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
      
      inline def setEvaluate(value: StringDictionary[Double] => Double): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
      
      inline def setExpression_(value: Any): Self = StObject.set(x, "expression_", value.asInstanceOf[js.Any])
      
      inline def setExtractVariables_(value: Any): Self = StObject.set(x, "extractVariables_", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: () => js.Array[String]): Self = StObject.set(x, "variables", js.Any.fromFunction0(value))
      
      inline def setVariablesLength_(value: Any): Self = StObject.set(x, "variablesLength_", value.asInstanceOf[js.Any])
      
      inline def setVariables_(value: Any): Self = StObject.set(x, "variables_", value.asInstanceOf[js.Any])
    }
  }
}
