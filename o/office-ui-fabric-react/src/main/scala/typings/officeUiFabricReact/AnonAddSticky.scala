package typings.officeUiFabricReact

import typings.officeUiFabricReact.stickyStickyMod.Sticky
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddSticky extends js.Object {
  def addSticky(sticky: Sticky): Unit = js.native
  def notifySubscribers(): Unit = js.native
  def notifySubscribers(sort: Boolean): Unit = js.native
  def removeSticky(sticky: Sticky): Unit = js.native
  def sortSticky(sticky: Sticky): Unit = js.native
  def sortSticky(sticky: Sticky, sortAgain: Boolean): Unit = js.native
  def subscribe(handler: js.Function2[/* container */ HTMLElement, /* stickyContainer */ HTMLElement, Unit]): Unit = js.native
  def syncScrollSticky(sticky: Sticky): Unit = js.native
  def unsubscribe(handler: js.Function2[/* container */ HTMLElement, /* stickyContainer */ HTMLElement, Unit]): Unit = js.native
  def updateStickyRefHeights(): Unit = js.native
}

