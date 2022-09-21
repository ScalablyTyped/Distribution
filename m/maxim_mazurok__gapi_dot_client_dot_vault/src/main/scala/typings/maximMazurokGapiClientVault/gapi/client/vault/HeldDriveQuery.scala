package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeldDriveQuery extends StObject {
  
  /** To include files in shared drives in the hold, set to **true**. */
  var includeSharedDriveFiles: js.UndefOr[Boolean] = js.undefined
  
  /** To include files in Team Drives in the hold, set to **true**. */
  var includeTeamDriveFiles: js.UndefOr[Boolean] = js.undefined
}
object HeldDriveQuery {
  
  inline def apply(): HeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldDriveQuery]
  }
  
  extension [Self <: HeldDriveQuery](x: Self) {
    
    inline def setIncludeSharedDriveFiles(value: Boolean): Self = StObject.set(x, "includeSharedDriveFiles", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedDriveFilesUndefined: Self = StObject.set(x, "includeSharedDriveFiles", js.undefined)
    
    inline def setIncludeTeamDriveFiles(value: Boolean): Self = StObject.set(x, "includeTeamDriveFiles", value.asInstanceOf[js.Any])
    
    inline def setIncludeTeamDriveFilesUndefined: Self = StObject.set(x, "includeTeamDriveFiles", js.undefined)
  }
}
