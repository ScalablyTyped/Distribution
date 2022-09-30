package typings.niceTry

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(`val`: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply[T](fn: js.Function0[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  @JSImport("nice-try", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promise(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")().asInstanceOf[js.Promise[Unit]]
  inline def promise(`val`: Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def promise[T](fn: js.Function0[PromiseLike[T] | T]): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
}
