package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentRestriction extends StObject {
  
  /**
    * Whether the content of the file is read-only. If a file is read-only, a new revision of the file may not be added, comments may not be added or modified, and the title of the file
    * may not be modified.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Reason for why the content of the file is restricted. This is only mutable on requests that also set readOnly=true. */
  var reason: js.UndefOr[String] = js.undefined
  
  /** The user who set the content restriction. Only populated if readOnly is true. */
  var restrictingUser: js.UndefOr[User] = js.undefined
  
  /** The time at which the content restriction was set (formatted RFC 3339 timestamp). Only populated if readOnly is true. */
  var restrictionTime: js.UndefOr[String] = js.undefined
  
  /** The type of the content restriction. Currently the only possible value is globalContentRestriction. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ContentRestriction {
  
  @scala.inline
  def apply(): ContentRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentRestriction]
  }
  
  @scala.inline
  implicit class ContentRestrictionMutableBuilder[Self <: ContentRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setRestrictingUser(value: User): Self = StObject.set(x, "restrictingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictingUserUndefined: Self = StObject.set(x, "restrictingUser", js.undefined)
    
    @scala.inline
    def setRestrictionTime(value: String): Self = StObject.set(x, "restrictionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionTimeUndefined: Self = StObject.set(x, "restrictionTime", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
