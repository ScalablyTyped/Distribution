package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveOptions extends StObject {
  
  /** Set to true to include shared drive. */
  var includeSharedDrives: js.UndefOr[Boolean] = js.native
  
  /** Set to true to include Team Drive. */
  var includeTeamDrives: js.UndefOr[Boolean] = js.native
  
  /** Search the versions of the Drive file as of the reference date. These timestamps are in GMT and rounded down to the given date. */
  var versionDate: js.UndefOr[String] = js.native
}
object DriveOptions {
  
  @scala.inline
  def apply(): DriveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveOptions]
  }
  
  @scala.inline
  implicit class DriveOptionsMutableBuilder[Self <: DriveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeSharedDrives(value: Boolean): Self = StObject.set(x, "includeSharedDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSharedDrivesUndefined: Self = StObject.set(x, "includeSharedDrives", js.undefined)
    
    @scala.inline
    def setIncludeTeamDrives(value: Boolean): Self = StObject.set(x, "includeTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTeamDrivesUndefined: Self = StObject.set(x, "includeTeamDrives", js.undefined)
    
    @scala.inline
    def setVersionDate(value: String): Self = StObject.set(x, "versionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDateUndefined: Self = StObject.set(x, "versionDate", js.undefined)
  }
}
