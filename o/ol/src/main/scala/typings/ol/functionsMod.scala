package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("ol/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FALSE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("FALSE")().asInstanceOf[Boolean]
  
  inline def TRUE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TRUE")().asInstanceOf[Boolean]
  
  inline def VOID(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("VOID")().asInstanceOf[Unit]
  
  inline def memoizeOne[ReturnType_1](fn: js.Function1[/* repeated */ Any, ReturnType_1]): js.Function1[/* repeated */ Any, ReturnType_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeOne")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, ReturnType_1]]
  
  inline def toPromise[T](getter: js.Function0[T | js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPromise")(getter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
}
