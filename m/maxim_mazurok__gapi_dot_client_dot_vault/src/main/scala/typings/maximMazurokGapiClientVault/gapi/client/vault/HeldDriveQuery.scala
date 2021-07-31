package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeldDriveQuery extends StObject {
  
  /** If true, include files in shared drives in the hold. */
  var includeSharedDriveFiles: js.UndefOr[Boolean] = js.undefined
  
  /** If true, include files in Team Drives in the hold. */
  var includeTeamDriveFiles: js.UndefOr[Boolean] = js.undefined
}
object HeldDriveQuery {
  
  @scala.inline
  def apply(): HeldDriveQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldDriveQuery]
  }
  
  @scala.inline
  implicit class HeldDriveQueryMutableBuilder[Self <: HeldDriveQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeSharedDriveFiles(value: Boolean): Self = StObject.set(x, "includeSharedDriveFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSharedDriveFilesUndefined: Self = StObject.set(x, "includeSharedDriveFiles", js.undefined)
    
    @scala.inline
    def setIncludeTeamDriveFiles(value: Boolean): Self = StObject.set(x, "includeTeamDriveFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTeamDriveFilesUndefined: Self = StObject.set(x, "includeTeamDriveFiles", js.undefined)
  }
}
