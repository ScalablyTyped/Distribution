package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.papaparse.mod.ParseLocalConfigStep[T, TInput]
  - typings.papaparse.mod.ParseLocalConfigNoStep[T, TInput]
*/
trait ParseLocalConfig[T, TInput] extends StObject
object ParseLocalConfig {
  
  inline def ParseLocalConfigNoStep[T, TInput](complete: (ParseResult[T], TInput) => Unit): typings.papaparse.mod.ParseLocalConfigNoStep[T, TInput] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2(complete))
    __obj.asInstanceOf[typings.papaparse.mod.ParseLocalConfigNoStep[T, TInput]]
  }
  
  inline def ParseLocalConfigStep[T, TInput](step: (ParseStepResult[T], Parser) => Unit): typings.papaparse.mod.ParseLocalConfigStep[T, TInput] = {
    val __obj = js.Dynamic.literal(step = js.Any.fromFunction2(step))
    __obj.asInstanceOf[typings.papaparse.mod.ParseLocalConfigStep[T, TInput]]
  }
}
