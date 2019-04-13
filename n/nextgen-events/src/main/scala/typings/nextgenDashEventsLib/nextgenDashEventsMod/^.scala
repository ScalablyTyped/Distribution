package typings
package nextgenDashEventsLib.nextgenDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nextgen-events", JSImport.Namespace)
@js.native
class ^ () extends NextGenEvents

@JSImport("nextgen-events", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CONTEXT_DISABLED: nextgenDashEventsLib.nextgenDashEventsLibNumbers.`1` = js.native
  val CONTEXT_ENABLED: nextgenDashEventsLib.nextgenDashEventsLibNumbers.`0` = js.native
  val CONTEXT_QUEUED: nextgenDashEventsLib.nextgenDashEventsLibNumbers.`2` = js.native
  val DESYNC: scala.Double = js.native
  val SYNC: scala.Double = js.native
  val defaultMaxListeners: scala.Double = js.native
  def emitCallback(event: Event): scala.Unit = js.native
  def emitEvent(event: Event): Event = js.native
  def emitToOneListener(event: Event, listener: js.Any, removedListeners: js.Any): scala.Unit = js.native
  def filterOutCallback(what: js.Any, currentElement: js.Any): scala.Boolean = js.native
  def getContextScope(context: Context, scopeName: java.lang.String): Scope = js.native
  def groupAddListener(emitters: js.Array[NextGenEvents], eventName: java.lang.String): js.Any = js.native
  def groupAddListener(emitters: js.Array[NextGenEvents], eventName: java.lang.String, fn: Func): js.Any = js.native
  def groupAddListener(
    emitters: js.Array[NextGenEvents],
    eventName: java.lang.String,
    fn: Func,
    options: AddListenerOptions
  ): js.Any = js.native
  def groupDefineStates(emitters: js.Array[NextGenEvents], args: js.Any*): scala.Unit = js.native
  def groupEmit(emitters: js.Array[NextGenEvents]): scala.Unit = js.native
  def groupEmit(emitters: js.Array[NextGenEvents], nice: scala.Double, args: js.Any*): scala.Unit = js.native
  def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: java.lang.String): scala.Unit = js.native
  def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: java.lang.String, fn: Func): scala.Unit = js.native
  def groupGlobalOnce(
    emitters: js.Array[NextGenEvents],
    eventName: java.lang.String,
    fn: Func,
    options: AddListenerOptions
  ): scala.Unit = js.native
  def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: java.lang.String): scala.Unit = js.native
  def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: java.lang.String, fn: Func): scala.Unit = js.native
  def groupGlobalOnceAll(
    emitters: js.Array[NextGenEvents],
    eventName: java.lang.String,
    fn: Func,
    options: AddListenerOptions
  ): scala.Unit = js.native
  def groupOn(emitters: js.Array[NextGenEvents], eventName: java.lang.String): js.Any = js.native
  def groupOn(emitters: js.Array[NextGenEvents], eventName: java.lang.String, fn: Func): js.Any = js.native
  def groupOn(
    emitters: js.Array[NextGenEvents],
    eventName: java.lang.String,
    fn: Func,
    options: AddListenerOptions
  ): js.Any = js.native
  def groupOnce(emitters: js.Array[NextGenEvents], eventName: java.lang.String): scala.Unit = js.native
  def groupOnce(emitters: js.Array[NextGenEvents], eventName: java.lang.String, fn: Func): scala.Unit = js.native
  def groupOnce(
    emitters: js.Array[NextGenEvents],
    eventName: java.lang.String,
    fn: Func,
    options: AddListenerOptions
  ): scala.Unit = js.native
  def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: java.lang.String): scala.Unit = js.native
  def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: java.lang.String, fn: Func): scala.Unit = js.native
  def groupOnceFirst(
    emitters: js.Array[NextGenEvents],
    eventName: java.lang.String,
    fn: Func,
    options: AddListenerOptions
  ): scala.Unit = js.native
  def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: java.lang.String): scala.Unit = js.native
  def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: java.lang.String, fn: Func): scala.Unit = js.native
  def groupOnceLast(
    emitters: js.Array[NextGenEvents],
    eventName: java.lang.String,
    fn: Func,
    options: AddListenerOptions
  ): scala.Unit = js.native
  def groupRemoveAllListeners(emitters: js.Array[NextGenEvents], eventName: java.lang.String): scala.Unit = js.native
  def groupRemoveListener(emitters: js.Array[NextGenEvents], eventName: java.lang.String, id: scala.Double): scala.Unit = js.native
  def groupWaitFor(emitters: js.Array[NextGenEvents], eventName: java.lang.String): js.Promise[scala.Unit] = js.native
  def groupWaitForAll(emitters: js.Array[NextGenEvents], eventName: java.lang.String): js.Promise[scala.Unit] = js.native
  def groupWaitForEmit(emitters: js.Array[NextGenEvents]): js.Promise[scala.Unit] = js.native
  def groupWaitForEmit(emitters: js.Array[NextGenEvents], nice: scala.Double, args: js.Any*): js.Promise[scala.Unit] = js.native
  def groupWaitForFirst(emitters: js.Array[NextGenEvents], eventName: java.lang.String): js.Promise[scala.Unit] = js.native
  def groupWaitForFirstAll(emitters: js.Array[NextGenEvents], eventName: java.lang.String): js.Promise[scala.Unit] = js.native
  def groupWaitForLast(emitters: js.Array[NextGenEvents], eventName: java.lang.String): js.Promise[scala.Unit] = js.native
  def groupWaitForLastAll(emitters: js.Array[NextGenEvents], eventName: java.lang.String): js.Promise[scala.Unit] = js.native
  def init(): scala.Unit = js.native
  def initFrom(from: NextGenEvents): scala.Unit = js.native
  def listenerCount(emitter: NextGenEvents, eventName: java.lang.String): scala.Double = js.native
  def listenerWrapper(listener: js.Any, event: js.Any, contextScope: java.lang.String, serial: js.Any): scala.Unit = js.native
  def mergeListeners(foreigners: Listeners): scala.Unit = js.native
  def noop(args: js.Any*): scala.Unit = js.native
  def processScopeQueue(
    self: NextGenEvents,
    contextScope: Scope,
    serial: scala.Boolean,
    isCompletionCallback: scala.Boolean
  ): scala.Unit = js.native
  def reset(emitter: NextGenEvents): scala.Unit = js.native
  def share(source: NextGenEvents, target: NextGenEvents): scala.Unit = js.native
}

