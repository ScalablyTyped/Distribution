package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressApplyWithProgressMod {
  
  inline def apply(
    taskName: String,
    totalWork: Double,
    func: js.Function1[/* arg0 */ js.Function1[/* arg0 */ js.UndefOr[Double], Unit], Any]
  ): Any = (^.asInstanceOf[js.Dynamic].apply(taskName.asInstanceOf[js.Any], totalWork.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    taskName: String,
    totalWork: Double,
    func: js.Function1[/* arg0 */ js.Function1[/* arg0 */ js.UndefOr[Double], Unit], Any],
    opt_thisObj: Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(taskName.asInstanceOf[js.Any], totalWork.asInstanceOf[js.Any], func.asInstanceOf[js.Any], opt_thisObj.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/progress/applyWithProgress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
