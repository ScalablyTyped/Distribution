package typings.phoenixLiveView

import typings.phoenix.mod.Socket
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Node
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phoenix_live_view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Browser {
    
    @JSImport("phoenix_live_view", "Browser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canPushState(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canPushState")().asInstanceOf[Boolean]
    
    inline def dropLocal(namespace: String, subkey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dropLocal")(namespace.asInstanceOf[js.Any], subkey.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def fetchPage(href: String, callback: js.Function2[/* status */ Double, /* resp */ js.UndefOr[String], Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchPage")(href.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getCookie(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookie")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getHashTargetEl(maybeHash: Any): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashTargetEl")(maybeHash.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
    
    inline def getLocal(namespace: String, subkey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocal")(namespace.asInstanceOf[js.Any], subkey.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def localKey(namespace: String, subkey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localKey")(namespace.asInstanceOf[js.Any], subkey.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def pushState(kind: String, meta: js.Object, to: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushState")(kind.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def redirect(toURL: String, flash: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(toURL.asInstanceOf[js.Any], flash.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCookie(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateCurrentState(callback: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCurrentState")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def updateLocal(namespace: String, subkey: String, initial: Any, func: js.Function1[/* current */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocal")(namespace.asInstanceOf[js.Any], subkey.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object DOM {
    
    @JSImport("phoenix_live_view", "DOM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def all(node: Node, query: String, callback: js.Function1[/* el */ HTMLElement, HTMLElement]): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(node.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
    
    inline def byId(id: String): HTMLElement | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("byId")(id.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Unit]
    
    inline def childNodeLength(html: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("childNodeLength")(html.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def cleanChildNodes(container: Node, phxUpdate: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanChildNodes")(container.asInstanceOf[js.Any], phxUpdate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def cloneNode(node: Node, html: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneNode")(node.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[Node]
    
    inline def copyPrivates(target: HTMLElement, source: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyPrivates")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def debounce(
      el: HTMLElement,
      event: Event,
      phxDebounce: String,
      defaultDebounce: String,
      phxThrottle: String,
      defaultThrottle: String,
      callback: js.Function0[Any]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], phxDebounce.asInstanceOf[js.Any], defaultDebounce.asInstanceOf[js.Any], phxThrottle.asInstanceOf[js.Any], defaultThrottle.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def debounce(
      el: HTMLElement,
      event: Event,
      phxDebounce: String,
      defaultDebounce: String,
      phxThrottle: String,
      defaultThrottle: Null,
      callback: js.Function0[Any]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], phxDebounce.asInstanceOf[js.Any], defaultDebounce.asInstanceOf[js.Any], phxThrottle.asInstanceOf[js.Any], defaultThrottle.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def debounce(
      el: HTMLElement,
      event: Event,
      phxDebounce: String,
      defaultDebounce: Null,
      phxThrottle: String,
      defaultThrottle: String,
      callback: js.Function0[Any]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], phxDebounce.asInstanceOf[js.Any], defaultDebounce.asInstanceOf[js.Any], phxThrottle.asInstanceOf[js.Any], defaultThrottle.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def debounce(
      el: HTMLElement,
      event: Event,
      phxDebounce: String,
      defaultDebounce: Null,
      phxThrottle: String,
      defaultThrottle: Null,
      callback: js.Function0[Any]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(el.asInstanceOf[js.Any], event.asInstanceOf[js.Any], phxDebounce.asInstanceOf[js.Any], defaultDebounce.asInstanceOf[js.Any], phxThrottle.asInstanceOf[js.Any], defaultThrottle.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def deletePrivate(el: HTMLElement, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deletePrivate")(el.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def discardError(container: Node, el: HTMLElement, phxFeedbackFor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("discardError")(container.asInstanceOf[js.Any], el.asInstanceOf[js.Any], phxFeedbackFor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def dispatchEvent(target: Node, eventString: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(target.asInstanceOf[js.Any], eventString.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def dispatchEvent(target: Node, eventString: String, detail: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(target.asInstanceOf[js.Any], eventString.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def filterWithinSameLiveView(nodes: js.Array[Node], parent: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWithinSameLiveView")(nodes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def findComponentNode(node: Node, cid: Double): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findComponentNode")(node.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
    
    inline def findParentCIDs(node: Node, cids: js.Array[Double]): Set[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findParentCIDs")(node.asInstanceOf[js.Any], cids.asInstanceOf[js.Any])).asInstanceOf[Set[Double]]
    
    inline def findPhxChildren(el: HTMLElement, parentId: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhxChildren")(el.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
    
    inline def findPhxChildrenInFragment(html: String, parentId: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhxChildrenInFragment")(html.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
    
    inline def findUploadInputs(node: Node): Unit | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUploadInputs")(node.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Array[Any]]
    
    inline def hasSelectionRange(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSelectionRange")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def incCycle(el: HTMLElement, key: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("incCycle")(el.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def incCycle(el: HTMLElement, key: String, trigger: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("incCycle")(el.asInstanceOf[js.Any], key.asInstanceOf[js.Any], trigger.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isFormInput(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormInput")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isIgnored(el: HTMLElement, phxUpdate: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIgnored")(el.asInstanceOf[js.Any], phxUpdate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isNowTriggerFormExternal(el: HTMLElement, phxTriggerExternal: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNowTriggerFormExternal")(el.asInstanceOf[js.Any], phxTriggerExternal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isPhxChild(el: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhxChild")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPhxDestroyed(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhxDestroyed")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPhxUpdate(el: Node, phxUpdate: String, updateTypes: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPhxUpdate")(el.asInstanceOf[js.Any], phxUpdate.asInstanceOf[js.Any], updateTypes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTextualInput(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextualInput")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isUploadInput(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUploadInput")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def markPhxChildDestroyed(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markPhxChildDestroyed")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def mergeAttrs(target: HTMLElement, source: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAttrs")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mergeAttrs(target: HTMLElement, source: HTMLElement, exclude: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAttrs")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def mergeFocusedInput(target: HTMLElement, source: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeFocusedInput")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def once(el: HTMLElement, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(el.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def `private`(el: HTMLElement, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("private")(el.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def putPrivate(el: HTMLElement, key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putPrivate")(el.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def putTitle(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("putTitle")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeClass(el: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def restoreFocus(focused: HTMLElement, selectionStart: Double, selectionEnd: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreFocus")(focused.asInstanceOf[js.Any], selectionStart.asInstanceOf[js.Any], selectionEnd.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def showError(inputEl: HTMLElement, phxFeedbackFor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showError")(inputEl.asInstanceOf[js.Any], phxFeedbackFor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def syncAttrsToProps(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncAttrsToProps")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def syncPendingRef(fromEl: HTMLElement, toEl: HTMLElement, disableWith: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPendingRef")(fromEl.asInstanceOf[js.Any], toEl.asInstanceOf[js.Any], disableWith.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def triggerCycle(el: HTMLElement, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerCycle")(el.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def triggerCycle(el: HTMLElement, key: String, currentCycle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerCycle")(el.asInstanceOf[js.Any], key.asInstanceOf[js.Any], currentCycle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def withinSameLiveView(node: Node, parent: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("withinSameLiveView")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("phoenix_live_view", "LiveSocket")
  @js.native
  open class LiveSocket protected () extends StObject {
    // phxSocket should be the Socket class (LiveSocket will use the constructor)
    def this(url: String, phxSocket: Any, opts: SocketOptions) = this()
    
    // public
    def connect(): Unit = js.native
    
    def disableDebug(): Unit = js.native
    
    def disableLatencySim(): Unit = js.native
    
    def disableProfiling(): Unit = js.native
    
    def disconnect(callback: Any): Unit = js.native
    
    def enableDebug(): Unit = js.native
    
    def enableLatencySim(upperBoundMs: Double): Unit = js.native
    
    def enableProfiling(): Unit = js.native
    
    def execJS(el: HTMLElement, encodedJS: String): Unit = js.native
    def execJS(el: HTMLElement, encodedJS: String, eventType: String): Unit = js.native
    
    def getLatencySim(): Double | Null = js.native
    
    def getSocket(): Socket = js.native
    
    def isDebugEnabled(): Boolean = js.native
    
    def isProfileEnabled(): Boolean = js.native
  }
  
  @JSImport("phoenix_live_view", "Rendered")
  @js.native
  open class Rendered protected () extends StObject {
    def this(viewId: String, rendered: Any) = this()
    
    // public
    def componentCIDs(diff: Any): js.Array[Double] = js.native
    
    def componentToString(cid: Double): String = js.native
    
    def doRecursiveMerge(target: Any, source: Any): Unit = js.native
    
    def getComponent(diff: Any, cid: Double): Any = js.native
    
    def isComponentOnlyDiff(diff: Any): Boolean = js.native
    
    def mergeDiff(diff: Any): Unit = js.native
    
    def parentViewId(): String = js.native
    
    def pruneCIDs(cids: js.Array[Double]): Any = js.native
    
    def recursiveMerge(target: js.Object, source: js.Object): Unit = js.native
    
    def recursiveToString(rendered: Any, components: Any): String = js.native
    def recursiveToString(rendered: Any, components: Any, onlyCids: js.Array[Double]): String = js.native
    
    def toString(onlyCids: js.Array[Double]): String = js.native
  }
  
  @JSImport("phoenix_live_view", "UploadEntry")
  @js.native
  open class UploadEntry protected () extends StObject {
    def this(fileEl: HTMLInputElement, file: LiveViewFile, view: View) = this()
    
    def cancel(): Unit = js.native
    
    def error(reason: String): Unit = js.native
    
    var file: LiveViewFile = js.native
    
    var fileEl: HTMLInputElement = js.native
    
    def isDone(): Boolean = js.native
    
    var meta: js.Object | Null = js.native
    
    def metadata(): js.Object | Null = js.native
    
    def progress(progress: Double): Unit = js.native
    
    var view: View = js.native
  }
  
  @JSImport("phoenix_live_view", "View")
  @js.native
  open class View protected () extends StObject {
    def this(el: HTMLElement, liveSocket: LiveSocket, parentView: View, href: String, flash: String) = this()
    
    // public?
    def ackJoin(child: View): Unit = js.native
    
    def addHook(el: HTMLElement): Unit = js.native
    
    def applyDiff(`type`: String, rawDiff: Any, callback: Any): Any = js.native
    
    def applyJoinPatch(live_patch: Any, html: String, events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
    
    def applyPendingUpdates(): Unit = js.native
    
    def attachTrueDocEl(): Unit = js.native
    
    def bindChannel(): Unit = js.native
    
    def binding(kind: String): Any = js.native
    
    def cancelSubmit(formEl: HTMLElement): Unit = js.native
    
    def closestComponentID(): Double | Null = js.native
    def closestComponentID(targetCtx: js.Object): Double | Null = js.native
    
    def componentID(el: HTMLElement): Double | Null = js.native
    
    def componentPatch(diff: Any, cid: Double): Boolean = js.native
    
    def connectParams(): js.Object = js.native
    
    def destroy(): Unit = js.native
    def destroy(callback: js.Function0[Unit]): Unit = js.native
    
    def destroyAllChildren(): Unit = js.native
    
    def destroyDescendent(id: String): Any = js.native
    
    def destroyHook(hook: ViewHook): Unit = js.native
    
    def dispatchEvents(events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
    
    def displayError(): Unit = js.native
    
    def dropPendingRefs(): Unit = js.native
    
    def expandURL(to: String): String = js.native
    
    def extractMeta(el: HTMLElement, meta: js.Object): js.Object = js.native
    
    def formsForRecovery(html: String): js.Array[HTMLElement] = js.native
    
    def getChildById(id: String): Any = js.native
    
    def getDescendentByEl(el: HTMLElement): Any = js.native
    
    def getHook(el: HTMLElement): ViewHook = js.native
    
    def getScheduledSubmit(formEl: HTMLElement): Any = js.native
    
    def getSession(): Any = js.native
    
    def getStatic(): String | Null = js.native
    
    def hideLoader(): Unit = js.native
    
    def isConnected(): Boolean = js.native
    
    def isDestroyed(): Boolean = js.native
    
    def isJoinPending(): Boolean = js.native
    
    def isLoading(): Boolean = js.native
    
    def isMain(): Boolean = js.native
    
    def join(callback: Any): Unit = js.native
    
    def joinChild(el: HTMLElement): Any = js.native
    
    def joinNewChildren(): Unit = js.native
    
    def log(kind: String, msgCallback: Any): Unit = js.native
    
    def maybePushComponentsDestroyed(destroyedCIDs: js.Array[Double]): Any = js.native
    
    def name(): String = js.native
    
    def onAllChildJoinsComplete(): Unit = js.native
    
    def onChannel(event: String, cb: js.Function1[/* resp */ Any, Unit]): Unit = js.native
    
    def onClose(reason: String): Unit = js.native
    
    def onError(reason: String): Unit = js.native
    
    def onJoin(resp: js.Object): Unit = js.native
    
    def onJoinComplete(resp: js.Object, html: String, events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
    
    def onJoinError(resp: js.Object): Unit = js.native
    
    def onLivePatch(redir: js.Object): Unit = js.native
    
    def onLiveRedirect(redir: js.Object): Unit = js.native
    
    def onRedirect(redir: js.Object): Unit = js.native
    
    def ownsElement(el: HTMLElement): Boolean = js.native
    
    def performPatch(patch: Any, pruneCids: Boolean): Boolean = js.native
    
    def pushEvent(`type`: String, el: HTMLElement, targetCtx: js.Object, phxEvent: String, meta: js.Object): Unit = js.native
    def pushEvent(`type`: String, el: HTMLElement, targetCtx: Null, phxEvent: String, meta: js.Object): Unit = js.native
    
    def pushFileProgress(fileEl: HTMLElement, entryRef: String, progress: Double): Unit = js.native
    def pushFileProgress(fileEl: HTMLElement, entryRef: String, progress: Double, onReply: js.Function0[Unit]): Unit = js.native
    
    def pushFormRecovery(form: HTMLElement, callback: Any): Unit = js.native
    
    def pushFormSubmit(formEl: HTMLElement, targetCtx: js.Object, phxEvent: String, onReply: Any): Unit = js.native
    def pushFormSubmit(formEl: HTMLElement, targetCtx: Null, phxEvent: String, onReply: Any): Unit = js.native
    
    def pushHookEvent(targetCtx: js.Object, event: String, payload: js.Object, onReply: Any): Unit = js.native
    def pushHookEvent(targetCtx: Null, event: String, payload: js.Object, onReply: Any): Unit = js.native
    
    def pushInput(inputEl: HTMLElement, targetCtx: js.Object, phxEvent: String, callback: Any): Unit = js.native
    def pushInput(inputEl: HTMLElement, targetCtx: Null, phxEvent: String, callback: Any): Unit = js.native
    
    def pushKey(keyElement: HTMLElement, targetCtx: js.Object, kind: String, phxEvent: String, meta: js.Object): Unit = js.native
    def pushKey(keyElement: HTMLElement, targetCtx: Null, kind: String, phxEvent: String, meta: js.Object): Unit = js.native
    
    def pushLinkPatch(href: String, targetEl: HTMLElement, callback: Any): Unit = js.native
    
    def pushWithReply(refGenerator: Any, event: String, payload: js.Object): Any = js.native
    def pushWithReply(refGenerator: Any, event: String, payload: js.Object, onReply: js.Function0[Unit]): Any = js.native
    
    def putRef(elements: js.Array[HTMLElement], event: String): js.Tuple2[Double, js.Array[HTMLElement]] = js.native
    
    def renderContainer(diff: Any, kind: String): String = js.native
    
    def scheduleSubmit(formEl: HTMLElement, ref: Double, callback: Any): Boolean = js.native
    
    def setContainerClasses(classes: String*): Unit = js.native
    
    def showLoader(): Unit = js.native
    def showLoader(timeout: Double): Unit = js.native
    
    def submitForm(form: HTMLElement, targetCtx: js.Object, phxEvent: String): Unit = js.native
    def submitForm(form: HTMLElement, targetCtx: Null, phxEvent: String): Unit = js.native
    
    def targetComponentID(target: HTMLElement): Double | Null = js.native
    def targetComponentID(target: HTMLElement, targetCtx: js.Object): Double | Null = js.native
    
    def triggerAwaitingSubmit(formEl: HTMLElement): Unit = js.native
    
    def triggerBeforeUpdateHook(fromEl: HTMLElement, toEl: HTMLElement): Any = js.native
    
    def triggerReconnected(): Unit = js.native
    
    def undoRefs(ref: Double): Unit = js.native
    
    def update(diff: Any, events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
    
    def uploadFiles(formEl: HTMLElement, targetCtx: js.Object, ref: Double, cid: Double, onComplete: Any): Unit = js.native
    def uploadFiles(formEl: HTMLElement, targetCtx: Null, ref: Double, cid: Double, onComplete: Any): Unit = js.native
    
    def withinTargets(phxTarget: String, callback: Any): Unit = js.native
  }
  
  inline def debug(view: View, kind: String, msg: js.Object, obj: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(view.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type BindCallback = js.Function7[
    /* e */ Event, 
    /* event */ String, 
    /* view */ View, 
    /* el */ HTMLElement, 
    /* targetCtx */ js.Object, 
    /* phxEvent */ String, 
    /* windowOwner */ js.UndefOr[String], 
    Unit
  ]
  
  trait Defaults extends StObject {
    
    var debounce: js.UndefOr[Double] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
  }
  object Defaults {
    
    inline def apply(): Defaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Defaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Defaults] (val x: Self) extends AnyVal {
      
      inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  trait DomOptions extends StObject {
    
    var childrenOnly: js.UndefOr[Boolean] = js.undefined
    
    var getNodeKey: js.UndefOr[js.Function1[/* node */ Node, Any]] = js.undefined
    
    var onBeforeElChildrenUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.undefined
    
    var onBeforeElUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.undefined
    
    var onBeforeNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
    
    var onBeforeNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
    
    var onElUpdated: js.UndefOr[js.Function1[/* el */ HTMLElement, Unit]] = js.undefined
    
    var onNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
    
    var onNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  }
  object DomOptions {
    
    inline def apply(): DomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomOptions] (val x: Self) extends AnyVal {
      
      inline def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
      
      inline def setChildrenOnlyUndefined: Self = StObject.set(x, "childrenOnly", js.undefined)
      
      inline def setGetNodeKey(value: /* node */ Node => Any): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      inline def setGetNodeKeyUndefined: Self = StObject.set(x, "getNodeKey", js.undefined)
      
      inline def setOnBeforeElChildrenUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = StObject.set(x, "onBeforeElChildrenUpdated", js.Any.fromFunction2(value))
      
      inline def setOnBeforeElChildrenUpdatedUndefined: Self = StObject.set(x, "onBeforeElChildrenUpdated", js.undefined)
      
      inline def setOnBeforeElUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = StObject.set(x, "onBeforeElUpdated", js.Any.fromFunction2(value))
      
      inline def setOnBeforeElUpdatedUndefined: Self = StObject.set(x, "onBeforeElUpdated", js.undefined)
      
      inline def setOnBeforeNodeAdded(value: /* node */ Node => Node): Self = StObject.set(x, "onBeforeNodeAdded", js.Any.fromFunction1(value))
      
      inline def setOnBeforeNodeAddedUndefined: Self = StObject.set(x, "onBeforeNodeAdded", js.undefined)
      
      inline def setOnBeforeNodeDiscarded(value: /* node */ Node => Boolean): Self = StObject.set(x, "onBeforeNodeDiscarded", js.Any.fromFunction1(value))
      
      inline def setOnBeforeNodeDiscardedUndefined: Self = StObject.set(x, "onBeforeNodeDiscarded", js.undefined)
      
      inline def setOnElUpdated(value: /* el */ HTMLElement => Unit): Self = StObject.set(x, "onElUpdated", js.Any.fromFunction1(value))
      
      inline def setOnElUpdatedUndefined: Self = StObject.set(x, "onElUpdated", js.undefined)
      
      inline def setOnNodeAdded(value: /* node */ Node => Node): Self = StObject.set(x, "onNodeAdded", js.Any.fromFunction1(value))
      
      inline def setOnNodeAddedUndefined: Self = StObject.set(x, "onNodeAdded", js.undefined)
      
      inline def setOnNodeDiscarded(value: /* node */ Node => Unit): Self = StObject.set(x, "onNodeDiscarded", js.Any.fromFunction1(value))
      
      inline def setOnNodeDiscardedUndefined: Self = StObject.set(x, "onNodeDiscarded", js.undefined)
    }
  }
  
  @js.native
  trait LiveViewFile
    extends StObject
       with File {
    
    var _phxRef: js.UndefOr[String] = js.native
  }
  
  trait LiveViewUploaderMeta extends StObject {
    
    var last_modified: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var path: String
    
    var ref: String
    
    var size: Double
    
    var `type`: String
  }
  object LiveViewUploaderMeta {
    
    inline def apply(name: String, path: String, ref: String, size: Double, `type`: String): LiveViewUploaderMeta = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveViewUploaderMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LiveViewUploaderMeta] (val x: Self) extends AnyVal {
      
      inline def setLast_modified(value: Double): Self = StObject.set(x, "last_modified", value.asInstanceOf[js.Any])
      
      inline def setLast_modifiedUndefined: Self = StObject.set(x, "last_modified", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketOptions extends StObject {
    
    var bindingPrefix: js.UndefOr[String] = js.undefined
    
    var defaults: js.UndefOr[Defaults] = js.undefined
    
    var dom: js.UndefOr[DomOptions] = js.undefined
    
    var hooks: js.UndefOr[js.Object] = js.undefined
    
    var loaderTimeout: js.UndefOr[Double] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var uploaders: js.UndefOr[js.Object] = js.undefined
    
    var viewLogger: js.UndefOr[ViewLogger] = js.undefined
  }
  object SocketOptions {
    
    inline def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      inline def setBindingPrefix(value: String): Self = StObject.set(x, "bindingPrefix", value.asInstanceOf[js.Any])
      
      inline def setBindingPrefixUndefined: Self = StObject.set(x, "bindingPrefix", js.undefined)
      
      inline def setDefaults(value: Defaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setDom(value: DomOptions): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      inline def setHooks(value: js.Object): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setLoaderTimeout(value: Double): Self = StObject.set(x, "loaderTimeout", value.asInstanceOf[js.Any])
      
      inline def setLoaderTimeoutUndefined: Self = StObject.set(x, "loaderTimeout", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUploaders(value: js.Object): Self = StObject.set(x, "uploaders", value.asInstanceOf[js.Any])
      
      inline def setUploadersUndefined: Self = StObject.set(x, "uploaders", js.undefined)
      
      inline def setViewLogger(value: (/* view */ View, /* kind */ String, /* msg */ Any, /* obj */ Any) => Unit): Self = StObject.set(x, "viewLogger", js.Any.fromFunction4(value))
      
      inline def setViewLoggerUndefined: Self = StObject.set(x, "viewLogger", js.undefined)
    }
  }
  
  @js.native
  trait ViewHook extends StObject {
    
    var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
    
    var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.native
    
    var destroyed: js.UndefOr[js.Function0[Unit]] = js.native
    
    var disconnected: js.UndefOr[js.Function0[Unit]] = js.native
    
    var el: HTMLElement = js.native
    
    def handleEvent(event: String, callback: js.Function1[/* payload */ js.Object, Unit]): Unit = js.native
    
    // callbacks
    var mounted: js.UndefOr[js.Function0[Unit]] = js.native
    
    def pushEvent(event: String, payload: js.Object): Unit = js.native
    def pushEvent(event: String, payload: js.Object, onReply: js.Function2[/* reply */ Any, /* ref */ Double, Any]): Unit = js.native
    
    def pushEventTo(selectorOrTarget: Any, event: String, payload: js.Object): Unit = js.native
    def pushEventTo(
      selectorOrTarget: Any,
      event: String,
      payload: js.Object,
      onReply: js.Function2[/* reply */ Any, /* ref */ Double, Any]
    ): Unit = js.native
    
    var reconnected: js.UndefOr[js.Function0[Unit]] = js.native
    
    var updated: js.UndefOr[js.Function0[Unit]] = js.native
    
    var viewName: String = js.native
  }
  
  type ViewLogger = js.Function4[/* view */ View, /* kind */ String, /* msg */ Any, /* obj */ Any, Unit]
}
