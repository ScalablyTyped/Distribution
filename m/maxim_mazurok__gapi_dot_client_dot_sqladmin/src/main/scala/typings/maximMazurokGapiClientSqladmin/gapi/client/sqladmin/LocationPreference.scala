package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationPreference extends StObject {
  
  /** The App Engine application to follow, it must be in the same region as the Cloud SQL instance. */
  var followGaeApplication: js.UndefOr[String] = js.native
  
  /** This is always *sql#locationPreference*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-central1-b, etc.). Reserved for future use. */
  var secondaryZone: js.UndefOr[String] = js.native
  
  /** The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.). */
  var zone: js.UndefOr[String] = js.native
}
object LocationPreference {
  
  @scala.inline
  def apply(): LocationPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationPreference]
  }
  
  @scala.inline
  implicit class LocationPreferenceMutableBuilder[Self <: LocationPreference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowGaeApplication(value: String): Self = StObject.set(x, "followGaeApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowGaeApplicationUndefined: Self = StObject.set(x, "followGaeApplication", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSecondaryZone(value: String): Self = StObject.set(x, "secondaryZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryZoneUndefined: Self = StObject.set(x, "secondaryZone", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
