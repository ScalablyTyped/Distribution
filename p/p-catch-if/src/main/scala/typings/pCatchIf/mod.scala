package typings.pCatchIf

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-catch-if", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](predicate: Predicate, catchHandler: js.Function1[/* error */ js.Error, T]): js.Function1[/* error */ js.Error, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(predicate.asInstanceOf[js.Any], catchHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* error */ js.Error, T]]
  
  type ErrorConstructor = Instantiable1[/* message */ js.UndefOr[String], js.Error]
  
  type Predicate = ErrorConstructor | js.Array[ErrorConstructor] | Boolean | (js.Function1[/* error */ js.Error, Boolean | js.Thenable[Boolean]])
}
