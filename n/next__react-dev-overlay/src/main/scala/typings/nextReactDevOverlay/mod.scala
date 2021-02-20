package typings.nextReactDevOverlay

import typings.react.mod.FunctionComponent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@next/react-dev-overlay/lib/client", "ReactDevOverlay")
  @js.native
  val ReactDevOverlay: FunctionComponent[js.Object] = js.native
  
  @JSImport("@next/react-dev-overlay/lib/client", "getNodeError")
  @js.native
  def getNodeError(error: Error): Error = js.native
  
  @JSImport("@next/react-dev-overlay/lib/client", "onBuildError")
  @js.native
  def onBuildError(message: String): Unit = js.native
  
  @JSImport("@next/react-dev-overlay/lib/client", "onBuildOk")
  @js.native
  def onBuildOk(): Unit = js.native
  
  @JSImport("@next/react-dev-overlay/lib/client", "onRefresh")
  @js.native
  def onRefresh(): Unit = js.native
  
  @JSImport("@next/react-dev-overlay/lib/client", "register")
  @js.native
  def register(): Unit = js.native
  
  @JSImport("@next/react-dev-overlay/lib/client", "unregister")
  @js.native
  def unregister(): Unit = js.native
}
