package typings.nextgenEvents.mod

import typings.nextgenEvents.nextgenEventsNumbers.`0`
import typings.nextgenEvents.nextgenEventsNumbers.`1`
import typings.nextgenEvents.nextgenEventsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nextgen-events", JSImport.Namespace)
@js.native
class ^ () extends NextGenEvents
@JSImport("nextgen-events", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  val CONTEXT_DISABLED: `1` = js.native
  
  val CONTEXT_ENABLED: `0` = js.native
  
  val CONTEXT_QUEUED: `2` = js.native
  
  def emitCallback(event: Event): Unit = js.native
  
  def emitEvent(event: Event): Event = js.native
  
  def emitToOneListener(event: Event, listener: js.Any, removedListeners: js.Any): Unit = js.native
  
  def filterOutCallback(what: js.Any, currentElement: js.Any): Boolean = js.native
  
  def getContextScope(context: Context, scopeName: String): Scope = js.native
  
  def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String): js.Any = js.native
  def groupAddListener(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): js.Any = js.native
  def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): js.Any = js.native
  def groupAddListener(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): js.Any = js.native
  
  def groupDefineStates(emitters: js.Array[NextGenEvents], args: js.Any*): Unit = js.native
  
  def groupEmit(emitters: js.Array[NextGenEvents], nice: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def groupEmit(emitters: js.Array[NextGenEvents], nice: Double, args: js.Any*): Unit = js.native
  
  def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  def groupGlobalOnce(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  def groupGlobalOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  def groupGlobalOnceAll(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  def groupGlobalOnceAll(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  def groupOn(emitters: js.Array[NextGenEvents], eventName: String): js.Any = js.native
  def groupOn(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): js.Any = js.native
  def groupOn(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): js.Any = js.native
  def groupOn(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): js.Any = js.native
  
  def groupOnce(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  def groupOnce(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  def groupOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  def groupOnce(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  def groupOnceFirst(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  def groupOnceFirst(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  def groupOnceLast(
    emitters: js.Array[NextGenEvents],
    eventName: String,
    fn: js.UndefOr[scala.Nothing],
    options: AddListenerOptions
  ): Unit = js.native
  def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String, fn: Func): Unit = js.native
  def groupOnceLast(emitters: js.Array[NextGenEvents], eventName: String, fn: Func, options: AddListenerOptions): Unit = js.native
  
  def groupRemoveAllListeners(emitters: js.Array[NextGenEvents], eventName: String): Unit = js.native
  
  def groupRemoveListener(emitters: js.Array[NextGenEvents], eventName: String, id: Double): Unit = js.native
  
  def groupWaitFor(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  def groupWaitForAll(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  def groupWaitForEmit(emitters: js.Array[NextGenEvents], nice: js.UndefOr[scala.Nothing], args: js.Any*): js.Promise[Unit] = js.native
  def groupWaitForEmit(emitters: js.Array[NextGenEvents], nice: Double, args: js.Any*): js.Promise[Unit] = js.native
  
  def groupWaitForFirst(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  def groupWaitForFirstAll(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  def groupWaitForLast(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  def groupWaitForLastAll(emitters: js.Array[NextGenEvents], eventName: String): js.Promise[Unit] = js.native
  
  def init(): Unit = js.native
  
  def initFrom(from: NextGenEvents): Unit = js.native
  
  def listenerCount(emitter: NextGenEvents, eventName: String): Double = js.native
  
  def listenerWrapper(listener: js.Any, event: js.Any, contextScope: String, serial: js.Any): Unit = js.native
  
  def mergeListeners(foreigners: Listeners): Unit = js.native
  
  def noop(args: js.Any*): Unit = js.native
  
  def processScopeQueue(self: NextGenEvents, contextScope: Scope, serial: Boolean, isCompletionCallback: Boolean): Unit = js.native
  
  def reset(emitter: NextGenEvents): Unit = js.native
  
  def share(source: NextGenEvents, target: NextGenEvents): Unit = js.native
}
