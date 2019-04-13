package typings
package nextgenDashEventsLib.nextgenDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextGenEvents extends js.Object {
  def addListener(eventName: java.lang.String): this.type = js.native
  def addListener(eventName: java.lang.String, fn: js.Any): this.type = js.native
  def addListener(eventName: java.lang.String, fn: js.Any, options: AddListenerOptions): this.type = js.native
  def addListenerContext(contextName: java.lang.String, options: ContextOptions): this.type = js.native
  def defineStates(states: js.Any*): scala.Unit = js.native
  def destroyListenerContext(contextName: java.lang.String): this.type = js.native
  def desyncUseNextTick(useNextTick: scala.Boolean): scala.Unit = js.native
  def disableListenerContext(contextName: java.lang.String): this.type = js.native
  def emit(name: java.lang.String, args: js.Any*): Event = js.native
  def emit(nice: scala.Double, name: java.lang.String, args: js.Any*): Event = js.native
  def enableListenerContext(contextName: java.lang.String): this.type = js.native
  def getAllStates(): States = js.native
  def getMaxListeners(): scala.Double = js.native
  def hasState(state: java.lang.String): scala.Boolean = js.native
  def listenerCount(eventName: java.lang.String): scala.Double = js.native
  def listeners(eventName: java.lang.String): js.Array[Func] = js.native
  def off(eventName: java.lang.String, id: js.Any): this.type = js.native
  def on(eventName: java.lang.String): this.type = js.native
  def on(eventName: java.lang.String, fn: js.Any): this.type = js.native
  def on(eventName: java.lang.String, fn: js.Any, options: AddListenerOptions): this.type = js.native
  def once(eventName: java.lang.String): this.type = js.native
  def once(eventName: java.lang.String, fn: js.Any): this.type = js.native
  def once(eventName: java.lang.String, fn: js.Any, options: AddListenerOptions): this.type = js.native
  def queueListenerContext(contextName: java.lang.String): this.type = js.native
  def removeAllListeners(eventName: java.lang.String): this.type = js.native
  def removeListener(eventName: java.lang.String, id: js.Any): this.type = js.native
  def serializeListenerContext(contextName: java.lang.String): this.type = js.native
  def serializeListenerContext(contextName: java.lang.String, value: scala.Boolean): this.type = js.native
  def setInterruptible(isInterruptible: scala.Boolean): scala.Unit = js.native
  def setListenerContextNice(contextName: java.lang.String, nice: scala.Double): this.type = js.native
  def setMaxListeners(n: scala.Double): this.type = js.native
  def setNice(nice: scala.Double): scala.Unit = js.native
  def waitFor(eventName: java.lang.String): js.Promise[this.type] = js.native
  def waitForAll(eventName: java.lang.String): js.Promise[this.type] = js.native
  def waitForEmit(name: java.lang.String, args: js.Any*): js.Promise[_] = js.native
  def waitForEmit(nice: scala.Double, name: java.lang.String, args: js.Any*): js.Promise[_] = js.native
}

