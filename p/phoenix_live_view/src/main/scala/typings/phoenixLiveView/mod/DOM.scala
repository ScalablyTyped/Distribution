package typings.phoenixLiveView.mod

import typings.std.Event
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix_live_view", "DOM")
@js.native
object DOM extends js.Object {
  def all(node: Node, query: String, callback: js.Function1[/* el */ HTMLElement, HTMLElement]): js.Array[HTMLElement] = js.native
  def byId(id: String): HTMLElement | Unit = js.native
  def cloneNode(node: Node, html: js.Any): Node = js.native
  def copyPrivates(target: HTMLElement, source: HTMLElement): Unit = js.native
  def debounce(
    el: HTMLElement,
    event: Event,
    phxDebounce: String,
    defaultDebounce: String,
    phxThrottle: String,
    defaultThrottle: String,
    callback: js.Function0[_]
  ): js.Any = js.native
  def debounce(
    el: HTMLElement,
    event: Event,
    phxDebounce: String,
    defaultDebounce: String,
    phxThrottle: String,
    defaultThrottle: Null,
    callback: js.Function0[_]
  ): js.Any = js.native
  def debounce(
    el: HTMLElement,
    event: Event,
    phxDebounce: String,
    defaultDebounce: Null,
    phxThrottle: String,
    defaultThrottle: String,
    callback: js.Function0[_]
  ): js.Any = js.native
  def debounce(
    el: HTMLElement,
    event: Event,
    phxDebounce: String,
    defaultDebounce: Null,
    phxThrottle: String,
    defaultThrottle: Null,
    callback: js.Function0[_]
  ): js.Any = js.native
  def deletePrivate(el: HTMLElement, key: String): Unit = js.native
  def discardError(container: HTMLElement, el: HTMLElement, phxFeedbackFor: String): Unit = js.native
  def dispatchEvent(target: Node, eventString: String): Unit = js.native
  def dispatchEvent(target: Node, eventString: String, detail: js.Object): Unit = js.native
  def findComponentNodeList(node: Node, cid: Double): js.Array[HTMLElement] = js.native
  def findFirstComponentNode(node: Node, cid: Double): HTMLElement | Null = js.native
  def findParentCIDs(node: Node, cids: js.Array[Double]): Set[Double] = js.native
  def findPhxChildren(el: HTMLElement, parentId: String): js.Array[HTMLElement] = js.native
  def findPhxChildrenInFragment(html: String, parentId: String): js.Array[HTMLElement] = js.native
  def incCycle(el: HTMLElement, key: String): Double = js.native
  def incCycle(el: HTMLElement, key: String, trigger: js.Any): Double = js.native
  def isFormInput(el: HTMLElement): Boolean = js.native
  def isNowTriggerFormExternal(el: HTMLElement, phxTriggerExternal: String): Boolean = js.native
  def isPhxChild(e: js.Any): Boolean = js.native
  def isPhxUpdate(e: js.Any, t: js.Any, n: js.Any): Boolean = js.native
  def isTextualInput(el: HTMLElement): Boolean = js.native
  def mergeAttrs(target: HTMLElement, source: HTMLElement): Unit = js.native
  def mergeAttrs(target: HTMLElement, source: HTMLElement, exclude: js.Array[String]): Unit = js.native
  def mergeFocusedInput(target: HTMLElement, source: HTMLElement): Unit = js.native
  def once(el: HTMLElement, key: String): Boolean = js.native
  def putPrivate(el: HTMLElement, key: String, value: js.Any): Unit = js.native
  def putTitle(str: String): Unit = js.native
  def removeClass(el: HTMLElement, className: String): Unit = js.native
  def restoreFocus(focused: HTMLElement, selectionStart: Double, selectionEnd: Double): Unit = js.native
  def syncAttrsToProps(el: HTMLElement): Unit = js.native
  def syncPendingRef(ref: Double, fromEl: HTMLElement, toEl: HTMLElement): Boolean = js.native
  def syncPendingRef(ref: Null, fromEl: HTMLElement, toEl: HTMLElement): Boolean = js.native
  def triggerCycle(el: HTMLElement, key: String): Unit = js.native
  def triggerCycle(el: HTMLElement, key: String, currentCycle: Double): Unit = js.native
  def undoRefs(ref: Double, container: Node): Unit = js.native
  def undoRefs(ref: Null, container: Node): Unit = js.native
}

