package typings.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentSetting extends StObject {
  
  /**
    * Clear all content setting rules set by this extension.
    */
  def clear(details: typings.chrome.chrome.contentSettings.ClearDetails): Unit = js.native
  def clear(details: typings.chrome.chrome.contentSettings.ClearDetails, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Gets the current content setting for a given pair of URLs.
    */
  def get(
    details: typings.chrome.chrome.contentSettings.GetDetails,
    callback: js.Function1[/* details */ typings.chrome.chrome.contentSettings.ReturnedDetails, Unit]
  ): Unit = js.native
  
  def getResourceIdentifiers(
    callback: js.Function1[
      /* resourceIdentifiers */ js.UndefOr[js.Array[typings.chrome.chrome.contentSettings.ResourceIdentifier]], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Applies a new content setting rule.
    */
  def set(details: typings.chrome.chrome.contentSettings.SetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.contentSettings.SetDetails, callback: js.Function0[Unit]): Unit = js.native
}
