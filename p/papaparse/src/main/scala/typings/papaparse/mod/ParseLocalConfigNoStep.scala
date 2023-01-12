package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseLocalConfigNoStep[T, TInput]
  extends StObject
     with ParseLocalConfigBase[T, TInput]
     with ParseLocalConfig[T, TInput] {
  
  /** @inheritdoc */
  @JSName("complete")
  def complete_MParseLocalConfigNoStep(results: ParseResult[T], file: TInput): Unit
}
object ParseLocalConfigNoStep {
  
  inline def apply[T, TInput](complete: (ParseResult[T], TInput) => Unit): ParseLocalConfigNoStep[T, TInput] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2(complete))
    __obj.asInstanceOf[ParseLocalConfigNoStep[T, TInput]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseLocalConfigNoStep[?, ?], T, TInput] (val x: Self & (ParseLocalConfigNoStep[T, TInput])) extends AnyVal {
    
    inline def setComplete(value: (ParseResult[T], TInput) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
  }
}
