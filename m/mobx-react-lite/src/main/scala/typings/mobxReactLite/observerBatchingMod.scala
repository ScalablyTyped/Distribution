package typings.mobxReactLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react-lite/dist/utils/observerBatching", JSImport.Namespace)
@js.native
object observerBatchingMod extends js.Object {
  
  def defaultNoopBatch(callback: js.Function0[Unit]): Unit = js.native
  
  def isObserverBatched(): Boolean = js.native
  
  def observerBatching(reactionScheduler: js.Any): Unit = js.native
}
