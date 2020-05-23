package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.stickyStickyMod.Sticky
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddSticky extends js.Object {
  def addSticky(sticky: Sticky): scala.Unit = js.native
  def notifySubscribers(): scala.Unit = js.native
  def notifySubscribers(sort: Boolean): scala.Unit = js.native
  def removeSticky(sticky: Sticky): scala.Unit = js.native
  def sortSticky(sticky: Sticky): scala.Unit = js.native
  def sortSticky(sticky: Sticky, sortAgain: Boolean): scala.Unit = js.native
  def subscribe(handler: js.Function2[/* container */ HTMLElement, /* stickyContainer */ HTMLElement, scala.Unit]): scala.Unit = js.native
  def syncScrollSticky(sticky: Sticky): scala.Unit = js.native
  def unsubscribe(handler: js.Function2[/* container */ HTMLElement, /* stickyContainer */ HTMLElement, scala.Unit]): scala.Unit = js.native
  def updateStickyRefHeights(): scala.Unit = js.native
}

