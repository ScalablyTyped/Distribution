package typings.nextReactDevOverlay.errorBoundaryMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorBoundaryProps extends js.Object {
  
  def onError(error: Error): Unit = js.native
  def onError(error: Error, componentStack: String): Unit = js.native
}
