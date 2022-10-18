package typings.next

import typings.next.anon.Dir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestMod {
  
  @JSImport("next/jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* customJestConfig */ js.UndefOr[Any], js.Function0[js.Promise[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* customJestConfig */ js.UndefOr[Any], js.Function0[js.Promise[Any]]]]
  inline def default(options: Dir): js.Function1[/* customJestConfig */ js.UndefOr[Any], js.Function0[js.Promise[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* customJestConfig */ js.UndefOr[Any], js.Function0[js.Promise[Any]]]]
}
