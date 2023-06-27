package typings.observ

import typings.observ.mod.ObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMod {
  
  inline def apply[T](generator: js.Function1[/* setter */ js.Function1[/* value */ T, Unit], Unit], initial: T): ObservableValue[T] = (^.asInstanceOf[js.Dynamic].apply(generator.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[ObservableValue[T]]
  
  @JSImport("observ/source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
