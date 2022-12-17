package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  @JSImport("playcanvas", "events")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCallback(name: String, callback: HandleEventCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addCallback")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCallback(name: String, callback: HandleEventCallback, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addCallback")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCallback(name: String, callback: HandleEventCallback, scope: Any, once: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addCallback")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCallback(name: String, callback: HandleEventCallback, scope: Unit, once: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addCallback")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def attach(target: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(target.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def fire(
    name: String,
    arg1: js.UndefOr[Any],
    arg2: js.UndefOr[Any],
    arg3: js.UndefOr[Any],
    arg4: js.UndefOr[Any],
    arg5: js.UndefOr[Any],
    arg6: js.UndefOr[Any],
    arg7: js.UndefOr[Any],
    arg8: js.UndefOr[Any]
  ): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(name.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any], arg6.asInstanceOf[js.Any], arg7.asInstanceOf[js.Any], arg8.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  
  inline def hasEvent(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEvent")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def off(): EventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("off")().asInstanceOf[EventHandler]
  inline def off(name: String): EventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any]).asInstanceOf[EventHandler]
  inline def off(name: String, callback: Unit, scope: Any): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  inline def off(name: String, callback: HandleEventCallback): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  inline def off(name: String, callback: HandleEventCallback, scope: Any): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  inline def off(name: Unit, callback: Unit, scope: Any): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  inline def off(name: Unit, callback: HandleEventCallback): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  inline def off(name: Unit, callback: HandleEventCallback, scope: Any): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  
  inline def on(name: String, callback: HandleEventCallback): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  inline def on(name: String, callback: HandleEventCallback, scope: Any): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  
  inline def once(name: String, callback: HandleEventCallback): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
  inline def once(name: String, callback: HandleEventCallback, scope: Any): EventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[EventHandler]
}
