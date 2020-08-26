package typings.nextgenEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextGenEvents extends js.Object {
  def addListener(eventName: String): this.type = js.native
  def addListener(eventName: String, fn: js.UndefOr[scala.Nothing], options: AddListenerOptions): this.type = js.native
  def addListener(eventName: String, fn: js.Any): this.type = js.native
  def addListener(eventName: String, fn: js.Any, options: AddListenerOptions): this.type = js.native
  def addListenerContext(contextName: String, options: ContextOptions): this.type = js.native
  def defineStates(states: js.Any*): Unit = js.native
  def destroyListenerContext(contextName: String): this.type = js.native
  def desyncUseNextTick(useNextTick: Boolean): Unit = js.native
  def disableListenerContext(contextName: String): this.type = js.native
  def emit(name: String, args: js.Any*): Event = js.native
  def emit(nice: Double, name: String, args: js.Any*): Event = js.native
  def enableListenerContext(contextName: String): this.type = js.native
  def getAllStates(): States = js.native
  def getMaxListeners(): Double = js.native
  def hasState(state: String): Boolean = js.native
  def listenerCount(eventName: String): Double = js.native
  def listeners(eventName: String): js.Array[Func] = js.native
  def off(eventName: String, id: js.Any): this.type = js.native
  def on(eventName: String): this.type = js.native
  def on(eventName: String, fn: js.UndefOr[scala.Nothing], options: AddListenerOptions): this.type = js.native
  def on(eventName: String, fn: js.Any): this.type = js.native
  def on(eventName: String, fn: js.Any, options: AddListenerOptions): this.type = js.native
  def once(eventName: String): this.type = js.native
  def once(eventName: String, fn: js.UndefOr[scala.Nothing], options: AddListenerOptions): this.type = js.native
  def once(eventName: String, fn: js.Any): this.type = js.native
  def once(eventName: String, fn: js.Any, options: AddListenerOptions): this.type = js.native
  def queueListenerContext(contextName: String): this.type = js.native
  def removeAllListeners(eventName: String): this.type = js.native
  def removeListener(eventName: String, id: js.Any): this.type = js.native
  def serializeListenerContext(contextName: String): this.type = js.native
  def serializeListenerContext(contextName: String, value: Boolean): this.type = js.native
  def setInterruptible(isInterruptible: Boolean): Unit = js.native
  def setListenerContextNice(contextName: String, nice: Double): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
  def setNice(nice: Double): Unit = js.native
  def waitFor(eventName: String): js.Promise[this.type] = js.native
  def waitForAll(eventName: String): js.Promise[this.type] = js.native
  def waitForEmit(name: String, args: js.Any*): js.Promise[_] = js.native
  def waitForEmit(nice: Double, name: String, args: js.Any*): js.Promise[_] = js.native
}

