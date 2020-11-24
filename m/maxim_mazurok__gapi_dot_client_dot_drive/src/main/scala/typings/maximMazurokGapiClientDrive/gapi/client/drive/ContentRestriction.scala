package typings.maximMazurokGapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentRestriction extends js.Object {
  
  /**
    * Whether the content of the file is read-only. If a file is read-only, a new revision of the file may not be added, comments may not be added or modified, and the title of the file
    * may not be modified.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Reason for why the content of the file is restricted. This is only mutable on requests that also set readOnly=true. */
  var reason: js.UndefOr[String] = js.native
  
  /** The user who set the content restriction. Only populated if readOnly is true. */
  var restrictingUser: js.UndefOr[User] = js.native
  
  /** The time at which the content restriction was set (formatted RFC 3339 timestamp). Only populated if readOnly is true. */
  var restrictionTime: js.UndefOr[String] = js.native
  
  /** The type of the content restriction. Currently the only possible value is globalContentRestriction. */
  var `type`: js.UndefOr[String] = js.native
}
object ContentRestriction {
  
  @scala.inline
  def apply(): ContentRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentRestriction]
  }
  
  @scala.inline
  implicit class ContentRestrictionOps[Self <: ContentRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRestrictingUser(value: User): Self = this.set("restrictingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictingUser: Self = this.set("restrictingUser", js.undefined)
    
    @scala.inline
    def setRestrictionTime(value: String): Self = this.set("restrictionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictionTime: Self = this.set("restrictionTime", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
