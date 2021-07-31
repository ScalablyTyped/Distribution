package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zone extends StObject {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** This Zone's boundary. */
  var boundary: js.UndefOr[ZoneBoundary] = js.undefined
  
  /** Containers that are children of this Zone. */
  var childContainer: js.UndefOr[js.Array[ZoneChildContainer]] = js.undefined
  
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  
  /** The fingerprint of the GTM Zone as computed at storage time. This value is recomputed whenever the zone is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /** Zone display name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** User notes on how to apply this zone in the container. */
  var notes: js.UndefOr[String] = js.undefined
  
  /** GTM Zone's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  
  /** This Zone's type restrictions. */
  var typeRestriction: js.UndefOr[ZoneTypeRestriction] = js.undefined
  
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[String] = js.undefined
  
  /** The Zone ID uniquely identifies the GTM Zone. */
  var zoneId: js.UndefOr[String] = js.undefined
}
object Zone {
  
  @scala.inline
  def apply(): Zone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zone]
  }
  
  @scala.inline
  implicit class ZoneMutableBuilder[Self <: Zone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBoundary(value: ZoneBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setChildContainer(value: js.Array[ZoneChildContainer]): Self = StObject.set(x, "childContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildContainerUndefined: Self = StObject.set(x, "childContainer", js.undefined)
    
    @scala.inline
    def setChildContainerVarargs(value: ZoneChildContainer*): Self = StObject.set(x, "childContainer", js.Array(value :_*))
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    @scala.inline
    def setTypeRestriction(value: ZoneTypeRestriction): Self = StObject.set(x, "typeRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeRestrictionUndefined: Self = StObject.set(x, "typeRestriction", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
    
    @scala.inline
    def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
  }
}
