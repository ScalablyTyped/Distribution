package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ACTIONMENUTOPLEVELLIMIT extends js.Object {
  var ACTION_MENU_TOP_LEVEL_LIMIT: scala.Double = js.native
  var onClicked: chromeLib.chromeNs.contextMenusNs.MenuClickedEvent = js.native
  def create(createProperties: chromeLib.chromeNs.contextMenusNs.CreateProperties): scala.Unit = js.native
  def create(
    createProperties: chromeLib.chromeNs.contextMenusNs.CreateProperties,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def remove(menuItemId: java.lang.String): scala.Unit = js.native
  def remove(menuItemId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(menuItemId: scala.Double): scala.Unit = js.native
  def remove(menuItemId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def removeAll(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def update(id: java.lang.String, updateProperties: chromeLib.chromeNs.contextMenusNs.UpdateProperties): scala.Unit = js.native
  def update(
    id: java.lang.String,
    updateProperties: chromeLib.chromeNs.contextMenusNs.UpdateProperties,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def update(id: scala.Double, updateProperties: chromeLib.chromeNs.contextMenusNs.UpdateProperties): scala.Unit = js.native
  def update(
    id: scala.Double,
    updateProperties: chromeLib.chromeNs.contextMenusNs.UpdateProperties,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

