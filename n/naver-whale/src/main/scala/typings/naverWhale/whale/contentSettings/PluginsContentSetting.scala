package typings.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginsContentSetting
  extends StObject
     with typings.chrome.chrome.contentSettings.ContentSetting {
  
  def set(details: typings.chrome.chrome.contentSettings.PluginsSetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.contentSettings.PluginsSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
