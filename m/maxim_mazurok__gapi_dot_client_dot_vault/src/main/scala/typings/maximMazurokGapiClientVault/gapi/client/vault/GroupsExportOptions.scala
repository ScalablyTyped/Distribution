package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupsExportOptions extends StObject {
  
  /** The export format for groups export. */
  var exportFormat: js.UndefOr[String] = js.undefined
}
object GroupsExportOptions {
  
  @scala.inline
  def apply(): GroupsExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupsExportOptions]
  }
  
  @scala.inline
  implicit class GroupsExportOptionsMutableBuilder[Self <: GroupsExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
  }
}
