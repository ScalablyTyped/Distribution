package typings.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicrophoneContentSetting
  extends typings.chrome.chrome.contentSettings.ContentSetting {
  
  def set(details: typings.chrome.chrome.contentSettings.MicrophoneSetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.contentSettings.MicrophoneSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
