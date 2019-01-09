package typings
package officeDashUiDashFabricDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddSticky extends js.Object {
  def addSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky): scala.Unit = js.native
  def notifySubscribers(): scala.Unit = js.native
  def notifySubscribers(sort: scala.Boolean): scala.Unit = js.native
  def removeSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky): scala.Unit = js.native
  def sortSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky): scala.Unit = js.native
  def sortSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky, sortAgain: scala.Boolean): scala.Unit = js.native
  def subscribe(
    handler: js.Function2[
      /* container */ reactLib.HTMLElement, 
      /* stickyContainer */ reactLib.HTMLElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def syncScrollSticky(sticky: officeDashUiDashFabricDashReactLib.libStickyMod.Sticky): scala.Unit = js.native
  def unsubscribe(
    handler: js.Function2[
      /* container */ reactLib.HTMLElement, 
      /* stickyContainer */ reactLib.HTMLElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def updateStickyRefHeights(): scala.Unit = js.native
}

