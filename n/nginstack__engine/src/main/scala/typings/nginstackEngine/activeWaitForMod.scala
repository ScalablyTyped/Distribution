package typings.nginstackEngine

import typings.nginstackEngine.anon.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activeWaitForMod {
  
  inline def apply(func: js.Function0[Boolean], timeout: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(func: js.Function0[Boolean], timeout: Double, opt_options: Interval): Boolean = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@nginstack/engine/lib/sync/activeWaitFor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
