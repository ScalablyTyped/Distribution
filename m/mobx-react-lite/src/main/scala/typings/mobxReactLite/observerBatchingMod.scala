package typings.mobxReactLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerBatchingMod {
  
  @JSImport("mobx-react-lite/dist/utils/observerBatching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultNoopBatch(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultNoopBatch")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isObserverBatched(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObserverBatched")().asInstanceOf[Boolean]
  
  inline def observerBatching(reactionScheduler: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observerBatching")(reactionScheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
