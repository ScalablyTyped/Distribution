package typings.naverDashWhale.whaleNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.contextMenus")
@js.native
object ^ extends js.Object {
  var ACTION_MENU_TOP_LEVEL_LIMIT: Double = js.native
  var onClicked: typings.chrome.chromeNs.contextMenusNs.MenuClickedEvent = js.native
  def create(createProperties: typings.chrome.chromeNs.contextMenusNs.CreateProperties): Unit = js.native
  def create(
    createProperties: typings.chrome.chromeNs.contextMenusNs.CreateProperties,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def remove(menuItemId: String): Unit = js.native
  def remove(menuItemId: String, callback: js.Function0[Unit]): Unit = js.native
  def remove(menuItemId: Double): Unit = js.native
  def remove(menuItemId: Double, callback: js.Function0[Unit]): Unit = js.native
  def removeAll(): Unit = js.native
  def removeAll(callback: js.Function0[Unit]): Unit = js.native
  def update(id: String, updateProperties: typings.chrome.chromeNs.contextMenusNs.UpdateProperties): Unit = js.native
  def update(
    id: String,
    updateProperties: typings.chrome.chromeNs.contextMenusNs.UpdateProperties,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def update(id: Double, updateProperties: typings.chrome.chromeNs.contextMenusNs.UpdateProperties): Unit = js.native
  def update(
    id: Double,
    updateProperties: typings.chrome.chromeNs.contextMenusNs.UpdateProperties,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

