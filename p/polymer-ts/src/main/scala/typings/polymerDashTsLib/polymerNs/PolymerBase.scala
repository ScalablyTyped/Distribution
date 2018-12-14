package typings
package polymerDashTsLib.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("polymer.PolymerBase")
@js.native
class PolymerBase ()
  extends stdLib.HTMLElement {
  @JSName("$")
  var $: js.Any = js.native
  @JSName("$$")
  var $$: js.Any = js.native
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  var customStyle: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
       * Returns the first following sibling that
       * is an element, and null otherwise.
       */
  /* CompleteClass */
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
       * Returns the first preceding sibling that
       * is an element, and null otherwise.
       */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  var root: stdLib.HTMLElement = js.native
  var shadyRoot: stdLib.HTMLElement = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
  def arrayDelete(path: java.lang.String, item: java.lang.String): js.Any = js.native
  def arrayDelete(path: java.lang.String, item: js.Any): js.Any = js.native
  def async(callback: js.Function): js.Any = js.native
  def async(callback: js.Function, waitTime: scala.Double): js.Any = js.native
  def attachedCallback(): scala.Unit = js.native
  def attributeFollows(name: java.lang.String, toElement: stdLib.HTMLElement, fromElement: stdLib.HTMLElement): scala.Unit = js.native
  def cancelAsync(handle: scala.Double): scala.Unit = js.native
  def cancelDebouncer(jobName: java.lang.String): scala.Unit = js.native
  def classFollows(name: java.lang.String, toElement: stdLib.HTMLElement, fromElement: stdLib.HTMLElement): scala.Unit = js.native
  def create(tag: java.lang.String): stdLib.HTMLElement = js.native
  def create(tag: java.lang.String, props: js.Object): stdLib.HTMLElement = js.native
  def debounce(jobName: java.lang.String, callback: js.Function): scala.Unit = js.native
  def debounce(jobName: java.lang.String, callback: js.Function, wait: scala.Double): scala.Unit = js.native
  def deserialize(value: java.lang.String, `type`: js.Any): js.Any = js.native
  def distributeContent(): scala.Unit = js.native
  def domHost(): scala.Unit = js.native
  def elementMatches(selector: java.lang.String, node: Element): js.Any = js.native
  def fire(`type`: java.lang.String): js.Any = js.native
  def fire(`type`: java.lang.String, detail: js.Object): js.Any = js.native
  def fire(`type`: java.lang.String, detail: js.Object, options: FireOptions): js.Any = js.native
  def flushDebouncer(jobName: java.lang.String): scala.Unit = js.native
  def get(path: java.lang.String): js.Any = js.native
  def get(path: js.Array[java.lang.String | scala.Double]): js.Any = js.native
  def getContentChildNodes(slctr: java.lang.String): js.Any = js.native
  def getContentChildren(slctr: java.lang.String): js.Any = js.native
  def getNativePrototype(tag: java.lang.String): js.Any = js.native
  def getPropertyInfo(property: java.lang.String): js.Any = js.native
  def importHref(href: java.lang.String): js.Any = js.native
  def importHref(href: java.lang.String, onload: js.Function): js.Any = js.native
  def importHref(href: java.lang.String, onload: js.Function, onerror: js.Function): js.Any = js.native
  def importHref(href: java.lang.String, onload: js.Function, onerror: js.Function, optAsync: scala.Boolean): js.Any = js.native
  def instanceTemplate(template: js.Any): js.Any = js.native
  def isDebouncerActive(jobName: java.lang.String): js.Any = js.native
  def linkPaths(to: java.lang.String, from: java.lang.String): scala.Unit = js.native
  def listen(node: Element, eventName: java.lang.String, methodName: java.lang.String): scala.Unit = js.native
  def mixin(target: js.Object, source: js.Object): scala.Unit = js.native
  def notifyPath(path: java.lang.String, value: js.Any): scala.Unit = js.native
  def notifyPath(path: java.lang.String, value: js.Any, fromAbove: js.Any): scala.Unit = js.native
  def notifySplices(path: java.lang.String, splices: polymerDashTsLib.Anon_Removed): scala.Unit = js.native
  def pop(path: java.lang.String): js.Any = js.native
  def push(path: java.lang.String, value: js.Any): js.Any = js.native
  def reflectPropertyToAttribute(name: java.lang.String): scala.Unit = js.native
  def resolveUrl(url: java.lang.String): js.Any = js.native
  def scopeSubtree(container: Element, shouldObserve: scala.Boolean): scala.Unit = js.native
  def serialize(value: java.lang.String): js.Any = js.native
  def serializeValueToAttribute(value: js.Any, attribute: java.lang.String, node: Element): scala.Unit = js.native
  def set(path: java.lang.String, value: js.Any): js.Any = js.native
  def set(path: java.lang.String, value: js.Any, root: js.Object): js.Any = js.native
  def set(path: js.Array[java.lang.String | scala.Double], value: js.Any): js.Any = js.native
  def set(path: js.Array[java.lang.String | scala.Double], value: js.Any, root: js.Object): js.Any = js.native
  def setScrollDirection(direction: java.lang.String, node: stdLib.HTMLElement): scala.Unit = js.native
  def shift(path: java.lang.String, value: js.Any): js.Any = js.native
  def splice(path: java.lang.String, start: scala.Double, deleteCount: scala.Double, items: js.Any*): js.Any = js.native
  def toggleAttribute(name: java.lang.String, force: scala.Boolean, node: stdLib.HTMLElement): scala.Boolean = js.native
  def toggleClass(name: java.lang.String, bool: scala.Boolean): scala.Unit = js.native
  def toggleClass(name: java.lang.String, bool: scala.Boolean, node: stdLib.HTMLElement): scala.Unit = js.native
  def transform(transform: java.lang.String): scala.Unit = js.native
  def transform(transform: java.lang.String, node: stdLib.HTMLElement): scala.Unit = js.native
  def translate3d(x: js.Any, y: js.Any, z: js.Any): scala.Unit = js.native
  def translate3d(x: js.Any, y: js.Any, z: js.Any, node: stdLib.HTMLElement): scala.Unit = js.native
  def unlinkPaths(path: java.lang.String): scala.Unit = js.native
  def unshift(path: java.lang.String, value: js.Any): js.Any = js.native
  def updateStyles(): scala.Unit = js.native
}

