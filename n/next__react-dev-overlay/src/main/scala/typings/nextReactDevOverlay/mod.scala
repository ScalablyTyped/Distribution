package typings.nextReactDevOverlay

import typings.react.mod.FunctionComponent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@next/react-dev-overlay/lib/client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ReactDevOverlay: FunctionComponent[js.Object] = js.native
  
  def getNodeError(error: Error): Error = js.native
  
  def onBuildError(message: String): Unit = js.native
  
  def onBuildOk(): Unit = js.native
  
  def onRefresh(): Unit = js.native
  
  def register(): Unit = js.native
  
  def unregister(): Unit = js.native
}
