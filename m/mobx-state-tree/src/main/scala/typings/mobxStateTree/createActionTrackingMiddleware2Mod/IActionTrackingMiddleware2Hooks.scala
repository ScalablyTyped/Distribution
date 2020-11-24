package typings.mobxStateTree.createActionTrackingMiddleware2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionTrackingMiddleware2Hooks[TEnv] extends js.Object {
  
  var filter: js.UndefOr[js.Function1[/* call */ IActionTrackingMiddleware2Call[TEnv], Boolean]] = js.native
  
  def onFinish(call: IActionTrackingMiddleware2Call[TEnv]): Unit = js.native
  def onFinish(call: IActionTrackingMiddleware2Call[TEnv], error: js.Any): Unit = js.native
  
  def onStart(call: IActionTrackingMiddleware2Call[TEnv]): Unit = js.native
}
