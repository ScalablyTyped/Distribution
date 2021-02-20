package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HangoutsChatExportOptions extends StObject {
  
  /** The export format for hangouts chat export. */
  var exportFormat: js.UndefOr[String] = js.native
}
object HangoutsChatExportOptions {
  
  @scala.inline
  def apply(): HangoutsChatExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HangoutsChatExportOptions]
  }
  
  @scala.inline
  implicit class HangoutsChatExportOptionsMutableBuilder[Self <: HangoutsChatExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
  }
}
