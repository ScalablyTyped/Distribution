package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveOptions extends StObject {
  
  /** Set to true to include shared drive. */
  var includeSharedDrives: js.UndefOr[Boolean] = js.undefined
  
  /** Set to true to include Team Drive. */
  var includeTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /** Search the versions of the Drive file as of the reference date. These timestamps are in GMT and rounded down to the given date. */
  var versionDate: js.UndefOr[String] = js.undefined
}
object DriveOptions {
  
  inline def apply(): DriveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveOptions]
  }
  
  extension [Self <: DriveOptions](x: Self) {
    
    inline def setIncludeSharedDrives(value: Boolean): Self = StObject.set(x, "includeSharedDrives", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedDrivesUndefined: Self = StObject.set(x, "includeSharedDrives", js.undefined)
    
    inline def setIncludeTeamDrives(value: Boolean): Self = StObject.set(x, "includeTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDrivesUndefined: Self = StObject.set(x, "includeTeamDrives", js.undefined)
    
    inline def setVersionDate(value: String): Self = StObject.set(x, "versionDate", value.asInstanceOf[js.Any])
    
    inline def setVersionDateUndefined: Self = StObject.set(x, "versionDate", js.undefined)
  }
}
