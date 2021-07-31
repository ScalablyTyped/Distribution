package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceMod {
  
  @JSImport("mobx/lib/api/trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def trace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")().asInstanceOf[Unit]
  @scala.inline
  def trace(enterBreakPoint: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(enterBreakPoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any, prop: String, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: js.Any, prop: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: Unit, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: Unit, prop: String, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trace(thing: Unit, prop: Unit, enterBreakPoint: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], enterBreakPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
