package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mixpanel-browser", "track_with_groups")
@js.native
object trackWithGroups extends js.Object {
  
  def apply(event_name: String, properties: Dict, groups: Dict): Unit = js.native
  def apply(event_name: String, properties: Dict, groups: Dict, callback: Callback): Unit = js.native
}
