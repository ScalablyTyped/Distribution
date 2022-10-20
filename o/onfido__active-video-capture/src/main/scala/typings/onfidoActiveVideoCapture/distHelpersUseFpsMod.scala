package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.anon.AvgFps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersUseFpsMod {
  
  @JSImport("@onfido/active-video-capture/dist/helpers/useFps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFps(windowWidth: Double): AvgFps = ^.asInstanceOf[js.Dynamic].applyDynamic("useFps")(windowWidth.asInstanceOf[js.Any]).asInstanceOf[AvgFps]
}
