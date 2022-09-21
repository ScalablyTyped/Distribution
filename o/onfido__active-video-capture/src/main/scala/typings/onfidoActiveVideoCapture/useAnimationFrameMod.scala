package typings.onfidoActiveVideoCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAnimationFrameMod {
  
  @JSImport("@onfido/active-video-capture/dist/helpers/useAnimationFrame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimationFrame(callback: AsyncFrameRequestCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAnimationFrame(callback: AsyncFrameRequestCallback, frameRate: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationFrame")(callback.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AsyncFrameRequestCallback = js.Function1[/* time */ Double, js.Promise[Unit]]
}
