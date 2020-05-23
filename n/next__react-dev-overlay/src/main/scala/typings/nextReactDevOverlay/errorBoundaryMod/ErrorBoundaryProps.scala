package typings.nextReactDevOverlay.errorBoundaryMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorBoundaryProps extends js.Object {
  def onError(error: Error): Unit = js.native
  def onError(error: Error, componentStack: String): Unit = js.native
}

