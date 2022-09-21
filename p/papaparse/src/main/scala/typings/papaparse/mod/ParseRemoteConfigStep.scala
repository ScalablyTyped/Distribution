package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseRemoteConfigStep[T]
  extends StObject
     with ParseRemoteConfigBase[T]
     with ParseRemoteConfig[T] {
  
  /** @inheritdoc */
  @JSName("step")
  def step_MParseRemoteConfigStep(results: ParseStepResult[T], parser: Parser): Unit
}
object ParseRemoteConfigStep {
  
  inline def apply[T](step: (ParseStepResult[T], Parser) => Unit): ParseRemoteConfigStep[T] = {
    val __obj = js.Dynamic.literal(download = true, step = js.Any.fromFunction2(step))
    __obj.asInstanceOf[ParseRemoteConfigStep[T]]
  }
  
  extension [Self <: ParseRemoteConfigStep[?], T](x: Self & ParseRemoteConfigStep[T]) {
    
    inline def setStep(value: (ParseStepResult[T], Parser) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
  }
}
