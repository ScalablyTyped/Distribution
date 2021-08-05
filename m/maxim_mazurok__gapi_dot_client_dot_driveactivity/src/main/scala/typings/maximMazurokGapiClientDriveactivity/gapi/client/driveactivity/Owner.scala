package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Owner extends StObject {
  
  /** The domain of the Drive item owner. */
  var domain: js.UndefOr[Domain] = js.undefined
  
  /** The drive that owns the item. */
  var drive: js.UndefOr[DriveReference] = js.undefined
  
  /** This field is deprecated; please use the `drive` field instead. */
  var teamDrive: js.UndefOr[TeamDriveReference] = js.undefined
  
  /** The user that owns the Drive item. */
  var user: js.UndefOr[User] = js.undefined
}
object Owner {
  
  inline def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  
  extension [Self <: Owner](x: Self) {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDrive(value: DriveReference): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setTeamDrive(value: TeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
