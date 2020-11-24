package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mixpanel-browser", "remove_group")
@js.native
object removeGroup extends js.Object {
  
  def apply(group_key: String, group_ids: String): Unit = js.native
  def apply(group_key: String, group_ids: String, callback: Callback): Unit = js.native
  def apply(group_key: String, group_ids: js.Array[Double | String]): Unit = js.native
  def apply(group_key: String, group_ids: js.Array[Double | String], callback: Callback): Unit = js.native
  def apply(group_key: String, group_ids: Double): Unit = js.native
  def apply(group_key: String, group_ids: Double, callback: Callback): Unit = js.native
}
