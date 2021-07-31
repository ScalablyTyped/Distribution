package typings.mobxReactLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerBatchingMod {
  
  @JSImport("mobx-react-lite/dist/utils/observerBatching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defaultNoopBatch(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultNoopBatch")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def isObserverBatched(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObserverBatched")().asInstanceOf[Boolean]
  
  @scala.inline
  def observerBatching(reactionScheduler: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observerBatching")(reactionScheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
