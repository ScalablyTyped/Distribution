package typings.nextReactDevOverlay

import typings.nextReactDevOverlay.anon.Children
import typings.react.mod.global.JSX.Element
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@next/react-dev-overlay/lib/client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def ReactDevOverlay(hasChildren: Children): Element = js.native
  def getNodeError(error: Error): Error = js.native
  def onBuildError(message: String): Unit = js.native
  def onBuildOk(): Unit = js.native
  def onRefresh(): Unit = js.native
  def register(): Unit = js.native
  def unregister(): Unit = js.native
}

