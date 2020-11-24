package typings.playable.eventEmitterTypesMod

import typings.eventemitter3.mod.ListenerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventEmitter extends js.Object {
  
  def bindEvents(eventsMap: js.Array[IEventMap]): js.Function0[Unit] = js.native
  def bindEvents(eventsMap: js.Array[IEventMap], defaultFnContext: js.Any): js.Function0[Unit] = js.native
  
  def destroy(): Unit = js.native
  
  def emitAsync(event: String, args: js.Any*): js.Promise[Boolean] | Unit = js.native
  def emitAsync(event: js.Symbol, args: js.Any*): js.Promise[Boolean] | Unit = js.native
  
  def off(event: String): this.type = js.native
  def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
  def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
  def off(event: String, fn: ListenerFn[js.Array[_]]): this.type = js.native
  def off(event: String, fn: ListenerFn[js.Array[_]], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
  def off(event: String, fn: ListenerFn[js.Array[_]], context: js.Any): this.type = js.native
  def off(event: String, fn: ListenerFn[js.Array[_]], context: js.Any, once: Boolean): this.type = js.native
  
  def on(event: String, fn: ListenerFn[js.Array[_]]): this.type = js.native
  def on(event: String, fn: ListenerFn[js.Array[_]], context: js.Any): this.type = js.native
}
