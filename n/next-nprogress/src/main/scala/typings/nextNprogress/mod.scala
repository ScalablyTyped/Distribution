package typings.nextNprogress

import typings.nextNprogress.anon.PartialNProgressOptions
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next-nprogress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* Page */ ComponentType[js.Object], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* Page */ ComponentType[js.Object], ComponentType[js.Object]]]
  inline def default(delayMs: Double): js.Function1[/* Page */ ComponentType[js.Object], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(delayMs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Page */ ComponentType[js.Object], ComponentType[js.Object]]]
  inline def default(delayMs: Double, options: PartialNProgressOptions): js.Function1[/* Page */ ComponentType[js.Object], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(delayMs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Page */ ComponentType[js.Object], ComponentType[js.Object]]]
  inline def default(delayMs: Unit, options: PartialNProgressOptions): js.Function1[/* Page */ ComponentType[js.Object], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(delayMs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Page */ ComponentType[js.Object], ComponentType[js.Object]]]
}
