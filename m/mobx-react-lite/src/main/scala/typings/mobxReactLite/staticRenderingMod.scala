package typings.mobxReactLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticRenderingMod {
  
  @JSImport("mobx-react-lite/dist/staticRendering", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enableStaticRendering(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableStaticRendering")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isUsingStaticRendering(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingStaticRendering")().asInstanceOf[Boolean]
}
