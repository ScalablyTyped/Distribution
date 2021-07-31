package typings.popmotion

import typings.popmotion.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testsUtilsMod {
  
  @JSImport("popmotion/lib/animations/@/tests/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def syncDriver(): js.Function1[/* update */ js.Function1[/* v */ Double, Unit], Start] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncDriver")().asInstanceOf[js.Function1[/* update */ js.Function1[/* v */ Double, Unit], Start]]
  @scala.inline
  def syncDriver(interval: Double): js.Function1[/* update */ js.Function1[/* v */ Double, Unit], Start] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncDriver")(interval.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* update */ js.Function1[/* v */ Double, Unit], Start]]
}
