package typings.phoenixLiveView.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phoenix_live_view", "View")
@js.native
class View protected () extends js.Object {
  def this(el: HTMLElement, liveSocket: LiveSocket, parentView: View, href: String, o: js.Any) = this()
  
  def ackJoin(child: js.Any): Unit = js.native
  
  def addHook(el: HTMLElement): Unit = js.native
  
  def applyJoinPatch(live_patch: js.Any, html: js.Any, events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
  
  def applyPendingUpdates(): Unit = js.native
  
  def attachTrueDocEl(): Unit = js.native
  
  def bindChannel(): Unit = js.native
  
  def binding(kind: String): js.Any = js.native
  
  def closestComponentID(): Double | Null = js.native
  def closestComponentID(targetCtx: js.Object): Double | Null = js.native
  
  def componentID(el: HTMLElement): Double | Null = js.native
  
  def componentPatch(diff: js.Any, cid: Double): Boolean = js.native
  
  def connectParams(): js.Object = js.native
  
  def destroy(): Unit = js.native
  def destroy(callback: js.Function0[Unit]): Unit = js.native
  
  def destroyAllChildren(): Unit = js.native
  
  def destroyDescendent(id: String): js.Any = js.native
  
  def destroyHook(hook: ViewHookInterface): Unit = js.native
  
  def dispatchEvents(events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
  
  def displayError(): Unit = js.native
  
  def dropPendingRefs(): Unit = js.native
  
  def expandURL(to: String): String = js.native
  
  def extractMeta(el: HTMLElement, meta: js.Object): js.Object = js.native
  
  def formsForRecovery(html: String): js.Array[HTMLElement] = js.native
  
  def getChildById(id: String): js.Any = js.native
  
  def getDescendentByEl(el: HTMLElement): js.Any = js.native
  
  def getHook(el: HTMLElement): ViewHookInterface = js.native
  
  def getSession(): String = js.native
  
  def getStatic(): String | Null = js.native
  
  def hideLoader(): Unit = js.native
  
  def isConnected(): Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  def isJoinPending(): Boolean = js.native
  
  def isLoading(): Boolean = js.native
  
  def isMain(): Boolean = js.native
  
  def join(): js.Any = js.native
  def join(callback: js.Function2[/* view */ this.type, /* joinCount */ Double, Unit]): js.Any = js.native
  
  def joinChild(el: HTMLElement): js.Any = js.native
  
  def joinNewChildren(): Unit = js.native
  
  def log(kind: String, msgCallback: js.Any): Unit = js.native
  
  def maybePushComponentsDestroyed(destroyedCIDs: js.Array[Double]): js.Any = js.native
  
  def name(): String = js.native
  
  def onAllChildJoinsComplete(): Unit = js.native
  
  def onChannel(event: String, cb: js.Function1[/* resp */ js.Any, Unit]): Unit = js.native
  
  def onClose(): Unit = js.native
  
  def onError(reason: js.Any): Unit = js.native
  
  def onJoin(resp: js.Object): Unit = js.native
  
  def onJoinComplete(resp: js.Object, html: js.Any, events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
  
  def onJoinError(resp: js.Object): Unit = js.native
  
  def onLivePatch(redir: js.Object): Unit = js.native
  
  def onLiveRedirect(redir: js.Object): Unit = js.native
  
  def onRedirect(redir: js.Object): Unit = js.native
  
  def ownsElement(el: HTMLElement): Boolean = js.native
  
  def performPatch(patch: js.Any, pruneCids: Boolean): Boolean = js.native
  
  def pushEvent(`type`: String, el: HTMLElement, targetCtx: js.Object, phxEvent: String, meta: js.Object): Unit = js.native
  def pushEvent(`type`: String, el: HTMLElement, targetCtx: Null, phxEvent: String, meta: js.Object): Unit = js.native
  
  def pushFormRecovery(form: HTMLElement, callback: js.Any): Unit = js.native
  
  def pushFormSubmit(inputEl: HTMLElement, targetCtx: js.Object, kind: String, phxEvent: String, onReply: js.Any): Unit = js.native
  def pushFormSubmit(inputEl: HTMLElement, targetCtx: Null, kind: String, phxEvent: String, onReply: js.Any): Unit = js.native
  
  def pushHookEvent(targetCtx: js.Object, event: String, payload: js.Object): Unit = js.native
  def pushHookEvent(targetCtx: Null, event: String, payload: js.Object): Unit = js.native
  
  def pushInput(inputEl: HTMLElement, targetCtx: js.Object, kind: String, phxEvent: String, callback: js.Any): Unit = js.native
  def pushInput(inputEl: HTMLElement, targetCtx: Null, kind: String, phxEvent: String, callback: js.Any): Unit = js.native
  
  def pushKey(keyElement: HTMLElement, targetCtx: js.Object, kind: String, phxEvent: String, meta: js.Object): Unit = js.native
  def pushKey(keyElement: HTMLElement, targetCtx: Null, kind: String, phxEvent: String, meta: js.Object): Unit = js.native
  
  def pushLinkPatch(href: String, targetEl: HTMLElement, callback: js.Any): Unit = js.native
  
  def pushWithReply(refGenerator: js.Any, event: String, payload: js.Object, onReply: js.Any): js.Any = js.native
  
  def putRef(elements: js.Array[HTMLElement], event: String): js.Tuple2[Double, js.Array[HTMLElement]] = js.native
  
  def renderContainer(diff: js.Any, kind: String): String = js.native
  
  def setContainerClasses(classes: js.Any*): Unit = js.native
  
  def showLoader(): Unit = js.native
  def showLoader(timeout: Double): Unit = js.native
  
  def submitForm(form: HTMLElement, targetCtx: js.Object, phxEvent: String): Unit = js.native
  def submitForm(form: HTMLElement, targetCtx: Null, phxEvent: String): Unit = js.native
  
  def targetComponentID(target: HTMLElement): Double | Null = js.native
  def targetComponentID(target: HTMLElement, targetCtx: js.Object): Double | Null = js.native
  
  def triggerBeforeUpdate(fromEl: HTMLElement, toEl: HTMLElement): js.Any = js.native
  
  def triggerReconnected(): Unit = js.native
  
  def triggerUpdatedHook(hook: js.Any): Unit = js.native
  
  def undoRefs(ref: Double): Unit = js.native
  
  def update(diff: js.Any, events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
}
