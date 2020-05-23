package typings.naverWhale.global.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Windows
////////////////////
/**
  * Use the chrome.windows API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  * Permissions: The chrome.windows API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab objects.
  * @since Chrome 5.
  */
@JSGlobal("chrome.windows")
@js.native
object windows extends js.Object

