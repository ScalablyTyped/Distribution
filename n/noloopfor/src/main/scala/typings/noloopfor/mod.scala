package typings.noloopfor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("noloopfor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrementLoop(value: Double, target: Double, callback: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decrementLoop")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decrementStep(value: Double, target: Double, step: Double, callback: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decrementStep")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loop(value: Double, target: Double, callback: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loopStep(value: Double, target: Double, step: Double, callback: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loopStep")(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
