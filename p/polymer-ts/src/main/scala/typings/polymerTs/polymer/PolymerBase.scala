package typings.polymerTs.polymer

import org.scalablytyped.runtime.StringDictionary
import typings.polymerTs.anon.AddedCount
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolymerBase extends HTMLElement {
  @JSName("$")
  var $: js.Any = js.native
  @JSName("$$")
  var DollarDollar: js.Any = js.native
  var customStyle: StringDictionary[String] = js.native
  var root: HTMLElement = js.native
  var shadyRoot: HTMLElement = js.native
  def arrayDelete(path: String, item: String): js.Any = js.native
  def arrayDelete(path: String, item: js.Any): js.Any = js.native
  def async(callback: js.Function): js.Any = js.native
  def async(callback: js.Function, waitTime: Double): js.Any = js.native
  def attachedCallback(): Unit = js.native
  def attributeFollows(name: String, toElement: HTMLElement, fromElement: HTMLElement): Unit = js.native
  def cancelAsync(handle: Double): Unit = js.native
  def cancelDebouncer(jobName: String): Unit = js.native
  def classFollows(name: String, toElement: HTMLElement, fromElement: HTMLElement): Unit = js.native
  def create(tag: String): HTMLElement = js.native
  def create(tag: String, props: js.Object): HTMLElement = js.native
  def debounce(jobName: String, callback: js.Function): Unit = js.native
  def debounce(jobName: String, callback: js.Function, wait: Double): Unit = js.native
  def deserialize(value: String, `type`: js.Any): js.Any = js.native
  def distributeContent(): Unit = js.native
  def domHost(): Unit = js.native
  def elementMatches(selector: String, node: Element): js.Any = js.native
  def fire(`type`: String): js.Any = js.native
  def fire(`type`: String, detail: js.Object): js.Any = js.native
  def fire(`type`: String, detail: js.Object, options: FireOptions): js.Any = js.native
  def flushDebouncer(jobName: String): Unit = js.native
  def get(path: String): js.Any = js.native
  def get(path: js.Array[String | Double]): js.Any = js.native
  def getContentChildNodes(slctr: String): js.Any = js.native
  def getContentChildren(slctr: String): js.Any = js.native
  def getNativePrototype(tag: String): js.Any = js.native
  def getPropertyInfo(property: String): js.Any = js.native
  def importHref(href: String): js.Any = js.native
  def importHref(href: String, onload: js.Function): js.Any = js.native
  def importHref(href: String, onload: js.Function, onerror: js.Function): js.Any = js.native
  def importHref(href: String, onload: js.Function, onerror: js.Function, optAsync: Boolean): js.Any = js.native
  def instanceTemplate(template: js.Any): js.Any = js.native
  def isDebouncerActive(jobName: String): js.Any = js.native
  def linkPaths(to: String, from: String): Unit = js.native
  def listen(node: Element, eventName: String, methodName: String): Unit = js.native
  def mixin(target: js.Object, source: js.Object): Unit = js.native
  def notifyPath(path: String, value: js.Any): Unit = js.native
  def notifyPath(path: String, value: js.Any, fromAbove: js.Any): Unit = js.native
  def notifySplices(path: String, splices: AddedCount): Unit = js.native
  def pop(path: String): js.Any = js.native
  def push(path: String, value: js.Any): js.Any = js.native
  def reflectPropertyToAttribute(name: String): Unit = js.native
  def resolveUrl(url: String): js.Any = js.native
  def scopeSubtree(container: Element, shouldObserve: Boolean): Unit = js.native
  def serialize(value: String): js.Any = js.native
  def serializeValueToAttribute(value: js.Any, attribute: String, node: Element): Unit = js.native
  def set(path: String, value: js.Any): js.Any = js.native
  def set(path: String, value: js.Any, root: js.Object): js.Any = js.native
  def set(path: js.Array[String | Double], value: js.Any): js.Any = js.native
  def set(path: js.Array[String | Double], value: js.Any, root: js.Object): js.Any = js.native
  def setScrollDirection(direction: String, node: HTMLElement): Unit = js.native
  def shift(path: String, value: js.Any): js.Any = js.native
  def splice(path: String, start: Double, deleteCount: Double, items: js.Any*): js.Any = js.native
  def toggleAttribute(name: String, force: Boolean, node: HTMLElement): Boolean = js.native
  def toggleClass(name: String, bool: Boolean): Unit = js.native
  def toggleClass(name: String, bool: Boolean, node: HTMLElement): Unit = js.native
  def transform(transform: String): Unit = js.native
  def transform(transform: String, node: HTMLElement): Unit = js.native
  def translate3d(x: js.Any, y: js.Any, z: js.Any): Unit = js.native
  def translate3d(x: js.Any, y: js.Any, z: js.Any, node: HTMLElement): Unit = js.native
  def unlinkPaths(path: String): Unit = js.native
  def unshift(path: String, value: js.Any): js.Any = js.native
  def updateStyles(): Unit = js.native
}

