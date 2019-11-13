package typings.next.distClientLinkMod

import typings.node.urlMod.UrlObject
import typings.react.reactMod.Component
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link
  extends Component[LinkProps, js.Object, js.Any] {
  var p: Boolean = js.native
  def cleanUpListeners(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MLink(): Unit = js.native
  def formatUrls(href: String): FormatResult = js.native
  def formatUrls(href: String, as: String): FormatResult = js.native
  def formatUrls(href: String, as: UrlObject): FormatResult = js.native
  def formatUrls(href: UrlObject): FormatResult = js.native
  def formatUrls(href: UrlObject, as: String): FormatResult = js.native
  def formatUrls(href: UrlObject, as: UrlObject): FormatResult = js.native
  def handleRef(ref: Element): Unit = js.native
  def linkClicked(e: typings.react.reactMod.MouseEvent[Element, MouseEvent]): Unit = js.native
  def prefetch(): Unit = js.native
}

