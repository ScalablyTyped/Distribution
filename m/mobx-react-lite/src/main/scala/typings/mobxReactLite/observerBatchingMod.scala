package typings.mobxReactLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerBatchingMod {
  
  @JSImport("mobx-react-lite/dist/utils/observerBatching", "defaultNoopBatch")
  @js.native
  def defaultNoopBatch(callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("mobx-react-lite/dist/utils/observerBatching", "isObserverBatched")
  @js.native
  def isObserverBatched(): Boolean = js.native
  
  @JSImport("mobx-react-lite/dist/utils/observerBatching", "observerBatching")
  @js.native
  def observerBatching(reactionScheduler: js.Any): Unit = js.native
}
