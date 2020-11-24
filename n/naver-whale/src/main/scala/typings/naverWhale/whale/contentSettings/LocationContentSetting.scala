package typings.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationContentSetting
  extends typings.chrome.chrome.contentSettings.ContentSetting {
  
  def set(details: typings.chrome.chrome.contentSettings.LocationSetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.contentSettings.LocationSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
