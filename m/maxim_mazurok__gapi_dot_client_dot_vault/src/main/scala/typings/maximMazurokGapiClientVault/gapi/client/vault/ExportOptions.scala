package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportOptions extends StObject {
  
  /** Options for Drive exports. */
  var driveOptions: js.UndefOr[DriveExportOptions] = js.undefined
  
  /** Options for Groups exports. */
  var groupsOptions: js.UndefOr[GroupsExportOptions] = js.undefined
  
  /** Options for Chat exports. */
  var hangoutsChatOptions: js.UndefOr[HangoutsChatExportOptions] = js.undefined
  
  /** Options for Gmail exports. */
  var mailOptions: js.UndefOr[MailExportOptions] = js.undefined
  
  /** The requested data region for the export. */
  var region: js.UndefOr[String] = js.undefined
  
  /** Options for Voice exports. */
  var voiceOptions: js.UndefOr[VoiceExportOptions] = js.undefined
}
object ExportOptions {
  
  inline def apply(): ExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportOptions]
  }
  
  extension [Self <: ExportOptions](x: Self) {
    
    inline def setDriveOptions(value: DriveExportOptions): Self = StObject.set(x, "driveOptions", value.asInstanceOf[js.Any])
    
    inline def setDriveOptionsUndefined: Self = StObject.set(x, "driveOptions", js.undefined)
    
    inline def setGroupsOptions(value: GroupsExportOptions): Self = StObject.set(x, "groupsOptions", value.asInstanceOf[js.Any])
    
    inline def setGroupsOptionsUndefined: Self = StObject.set(x, "groupsOptions", js.undefined)
    
    inline def setHangoutsChatOptions(value: HangoutsChatExportOptions): Self = StObject.set(x, "hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatOptionsUndefined: Self = StObject.set(x, "hangoutsChatOptions", js.undefined)
    
    inline def setMailOptions(value: MailExportOptions): Self = StObject.set(x, "mailOptions", value.asInstanceOf[js.Any])
    
    inline def setMailOptionsUndefined: Self = StObject.set(x, "mailOptions", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setVoiceOptions(value: VoiceExportOptions): Self = StObject.set(x, "voiceOptions", value.asInstanceOf[js.Any])
    
    inline def setVoiceOptionsUndefined: Self = StObject.set(x, "voiceOptions", js.undefined)
  }
}
