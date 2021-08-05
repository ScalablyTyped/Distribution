package typings.nextReactDevOverlay

import typings.react.mod.FunctionComponent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@next/react-dev-overlay/lib/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@next/react-dev-overlay/lib/client", "ReactDevOverlay")
  @js.native
  val ReactDevOverlay: FunctionComponent[js.Object] = js.native
  
  inline def getNodeError(error: Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeError")(error.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def onBuildError(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBuildError")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onBuildOk(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBuildOk")().asInstanceOf[Unit]
  
  inline def onRefresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRefresh")().asInstanceOf[Unit]
  
  inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  
  inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
}
