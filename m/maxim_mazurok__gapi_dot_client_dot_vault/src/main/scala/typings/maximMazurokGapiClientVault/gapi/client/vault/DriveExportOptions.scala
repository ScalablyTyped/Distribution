package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveExportOptions extends StObject {
  
  /** Set to true to include access level information for users with indirect access to files. */
  var includeAccessInfo: js.UndefOr[Boolean] = js.native
}
object DriveExportOptions {
  
  @scala.inline
  def apply(): DriveExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveExportOptions]
  }
  
  @scala.inline
  implicit class DriveExportOptionsMutableBuilder[Self <: DriveExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAccessInfo(value: Boolean): Self = StObject.set(x, "includeAccessInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAccessInfoUndefined: Self = StObject.set(x, "includeAccessInfo", js.undefined)
  }
}
