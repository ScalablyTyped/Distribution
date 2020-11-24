package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedLocation extends Entity {
  
  /**
    * The Timestamp type represents creation date and time of the location using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Human-readable name of the location.
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The Timestamp type represents last modified date and time of the location using ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
}
object NamedLocation {
  
  @scala.inline
  def apply(): NamedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedLocation]
  }
  
  @scala.inline
  implicit class NamedLocationOps[Self <: NamedLocation] (val x: Self) extends AnyVal {
    
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
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setModifiedDateTime(value: NullableOption[String]): Self = this.set("modifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDateTime: Self = this.set("modifiedDateTime", js.undefined)
    
    @scala.inline
    def setModifiedDateTimeNull: Self = this.set("modifiedDateTime", null)
  }
}
