package typings
package nextgenDashEventsLib.nextgenDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nextgen-events", JSImport.Namespace)
@js.native
class namespaced () extends NextGenEvents

@JSImport("nextgen-events", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  val CONTEXT_DISABLED: nextgenDashEventsLib.nextgenDashEventsLibNumbers.`1` = js.native
  val CONTEXT_ENABLED: nextgenDashEventsLib.nextgenDashEventsLibNumbers.`0` = js.native
  val CONTEXT_QUEUED: nextgenDashEventsLib.nextgenDashEventsLibNumbers.`2` = js.native
  def emitCallback(event: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Event): scala.Unit = js.native
  def emitEvent(event: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Event): nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Event = js.native
  def emitToOneListener(
    event: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Event,
    listener: js.Any,
    removedListeners: js.Any
  ): scala.Unit = js.native
  def filterOutCallback(what: js.Any, currentElement: js.Any): scala.Boolean = js.native
  def getContextScope(
    context: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Context,
    scopeName: java.lang.String
  ): nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Scope = js.native
  def groupAddListener(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): js.Any = js.native
  def groupAddListener(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func
  ): js.Any = js.native
  def groupAddListener(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func,
    options: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.AddListenerOptions
  ): js.Any = js.native
  def groupDefineStates(emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents], args: js.Any*): scala.Unit = js.native
  def groupEmit(emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents]): scala.Unit = js.native
  def groupEmit(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    nice: scala.Double,
    args: js.Any*
  ): scala.Unit = js.native
  def groupGlobalOnce(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): scala.Unit = js.native
  def groupGlobalOnce(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func
  ): scala.Unit = js.native
  def groupGlobalOnce(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func,
    options: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.AddListenerOptions
  ): scala.Unit = js.native
  def groupGlobalOnceAll(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): scala.Unit = js.native
  def groupGlobalOnceAll(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func
  ): scala.Unit = js.native
  def groupGlobalOnceAll(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func,
    options: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.AddListenerOptions
  ): scala.Unit = js.native
  def groupOn(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): js.Any = js.native
  def groupOn(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func
  ): js.Any = js.native
  def groupOn(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func,
    options: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.AddListenerOptions
  ): js.Any = js.native
  def groupOnce(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): scala.Unit = js.native
  def groupOnce(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func
  ): scala.Unit = js.native
  def groupOnce(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func,
    options: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.AddListenerOptions
  ): scala.Unit = js.native
  def groupOnceFirst(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): scala.Unit = js.native
  def groupOnceFirst(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func
  ): scala.Unit = js.native
  def groupOnceFirst(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func,
    options: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.AddListenerOptions
  ): scala.Unit = js.native
  def groupOnceLast(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): scala.Unit = js.native
  def groupOnceLast(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func
  ): scala.Unit = js.native
  def groupOnceLast(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    fn: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Func,
    options: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.AddListenerOptions
  ): scala.Unit = js.native
  def groupRemoveAllListeners(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): scala.Unit = js.native
  def groupRemoveListener(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String,
    id: scala.Double
  ): scala.Unit = js.native
  def groupWaitFor(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def groupWaitForAll(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def groupWaitForEmit(emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents]): js.Promise[scala.Unit] = js.native
  def groupWaitForEmit(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    nice: scala.Double,
    args: js.Any*
  ): js.Promise[scala.Unit] = js.native
  def groupWaitForFirst(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def groupWaitForFirstAll(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def groupWaitForLast(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def groupWaitForLastAll(
    emitters: js.Array[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    eventName: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def init(): scala.Unit = js.native
  def initFrom(from: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents): scala.Unit = js.native
  def listenerCount(emitter: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents, eventName: java.lang.String): scala.Double = js.native
  def listenerWrapper(listener: js.Any, event: js.Any, contextScope: java.lang.String, serial: js.Any): scala.Unit = js.native
  def mergeListeners(foreigners: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Listeners): scala.Unit = js.native
  def noop(args: js.Any*): scala.Unit = js.native
  def processScopeQueue(
    self: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents,
    contextScope: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs.Scope,
    serial: scala.Boolean,
    isCompletionCallback: scala.Boolean
  ): scala.Unit = js.native
  def reset(emitter: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents): scala.Unit = js.native
  def share(
    source: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents,
    target: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents
  ): scala.Unit = js.native
}

