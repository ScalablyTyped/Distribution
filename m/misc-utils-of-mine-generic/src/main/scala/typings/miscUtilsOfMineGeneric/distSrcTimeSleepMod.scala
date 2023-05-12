package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTimeSleepMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time/sleep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blockFor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockFor")().asInstanceOf[Unit]
  inline def blockFor(ms: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockFor")(ms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time/sleep", "wait")
  @js.native
  val wait_ : js.Function1[/* ms */ Double, js.Promise[Unit]] = js.native
  
  inline def withTime[T](label: String, fn: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("withTime")(label.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
}
