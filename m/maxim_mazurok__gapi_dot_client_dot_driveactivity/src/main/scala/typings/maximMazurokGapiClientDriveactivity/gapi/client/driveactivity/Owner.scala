package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Owner extends StObject {
  
  /** The domain of the Drive item owner. */
  var domain: js.UndefOr[Domain] = js.native
  
  /** The drive that owns the item. */
  var drive: js.UndefOr[DriveReference] = js.native
  
  /** This field is deprecated; please use the `drive` field instead. */
  var teamDrive: js.UndefOr[TeamDriveReference] = js.native
  
  /** The user that owns the Drive item. */
  var user: js.UndefOr[User] = js.native
}
object Owner {
  
  @scala.inline
  def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  
  @scala.inline
  implicit class OwnerMutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setDrive(value: DriveReference): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    @scala.inline
    def setTeamDrive(value: TeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
