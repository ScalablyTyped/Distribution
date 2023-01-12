package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseRemoteConfigNoStep[T]
  extends StObject
     with ParseRemoteConfigBase[T]
     with ParseRemoteConfig[T] {
  
  /** @inheritdoc */
  @JSName("complete")
  def complete_MParseRemoteConfigNoStep(results: ParseResult[T], file: String): Unit
}
object ParseRemoteConfigNoStep {
  
  inline def apply[T](complete: (ParseResult[T], String) => Unit): ParseRemoteConfigNoStep[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2(complete), download = true)
    __obj.asInstanceOf[ParseRemoteConfigNoStep[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseRemoteConfigNoStep[?], T] (val x: Self & ParseRemoteConfigNoStep[T]) extends AnyVal {
    
    inline def setComplete(value: (ParseResult[T], String) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
  }
}
