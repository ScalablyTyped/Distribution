package typings.node

import typings.node.NodeJS.Immediate
import typings.node.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timersMod {
  
  @JSImport("timers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearImmediate(immediateId: Immediate): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearImmediate")(immediateId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearInterval(intervalId: Timeout): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(intervalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearTimeout(timeoutId: Timeout): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(timeoutId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = (^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Immediate]
  
  @scala.inline
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
  
  @scala.inline
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
}
