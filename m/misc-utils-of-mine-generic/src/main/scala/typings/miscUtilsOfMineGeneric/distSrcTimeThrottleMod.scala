package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.anon.Leading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTimeThrottleMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throttle[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, wait: Double): js.ThisFunction0[/* this */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ Any, Any]]
  inline def throttle[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, wait: Double, options: Leading): js.ThisFunction0[/* this */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ Any, Any]]
}
