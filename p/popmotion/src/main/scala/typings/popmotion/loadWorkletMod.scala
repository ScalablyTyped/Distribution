package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadWorkletMod {
  
  @JSImport("popmotion/lib/worklet/load-worklet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def whenWorkletReady(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("whenWorkletReady")().asInstanceOf[js.Promise[Unit]]
  
  inline def workletReady(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("workletReady")().asInstanceOf[Unit]
}
