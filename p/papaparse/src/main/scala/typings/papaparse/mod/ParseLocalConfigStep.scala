package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseLocalConfigStep[T, TInput]
  extends StObject
     with ParseLocalConfigBase[T, TInput]
     with ParseLocalConfig[T, TInput] {
  
  /** @inheritdoc */
  @JSName("step")
  def step_MParseLocalConfigStep(results: ParseStepResult[T], parser: Parser): Unit
}
object ParseLocalConfigStep {
  
  inline def apply[T, TInput](step: (ParseStepResult[T], Parser) => Unit): ParseLocalConfigStep[T, TInput] = {
    val __obj = js.Dynamic.literal(step = js.Any.fromFunction2(step))
    __obj.asInstanceOf[ParseLocalConfigStep[T, TInput]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseLocalConfigStep[?, ?], T, TInput] (val x: Self & (ParseLocalConfigStep[T, TInput])) extends AnyVal {
    
    inline def setStep(value: (ParseStepResult[T], Parser) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
  }
}
