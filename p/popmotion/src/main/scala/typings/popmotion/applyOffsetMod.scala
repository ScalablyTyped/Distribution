package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyOffsetMod {
  
  @JSImport("popmotion/lib/utils/apply-offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def applyOffset(from: Double): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyOffset")(from.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  @scala.inline
  def applyOffset(from: Double, to: Double): js.Function1[/* v */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOffset")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Double]]
}
