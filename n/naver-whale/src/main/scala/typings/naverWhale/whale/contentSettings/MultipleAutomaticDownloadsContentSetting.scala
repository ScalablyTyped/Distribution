package typings.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleAutomaticDownloadsContentSetting
  extends StObject
     with typings.chrome.chrome.contentSettings.ContentSetting {
  
  def set(details: typings.chrome.chrome.contentSettings.MultipleAutomaticDownloadsSetDetails): Unit = js.native
  def set(
    details: typings.chrome.chrome.contentSettings.MultipleAutomaticDownloadsSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}
