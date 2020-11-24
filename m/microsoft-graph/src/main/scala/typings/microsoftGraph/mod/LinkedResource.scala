package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedResource extends Entity {
  
  // Field indicating the app name of the source that is sending the linkedResource.
  var applicationName: js.UndefOr[NullableOption[String]] = js.native
  
  // Field indicating the title of the linkedResource.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Id of the object that is associated with this task on the third-party/partner system.
  var externalId: js.UndefOr[NullableOption[String]] = js.native
  
  // Deep link to the linkedResource.
  var webUrl: js.UndefOr[NullableOption[String]] = js.native
}
object LinkedResource {
  
  @scala.inline
  def apply(): LinkedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedResource]
  }
  
  @scala.inline
  implicit class LinkedResourceOps[Self <: LinkedResource] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: NullableOption[String]): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    
    @scala.inline
    def setApplicationNameNull: Self = this.set("applicationName", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setExternalIdNull: Self = this.set("externalId", null)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
    
    @scala.inline
    def setWebUrlNull: Self = this.set("webUrl", null)
  }
}
