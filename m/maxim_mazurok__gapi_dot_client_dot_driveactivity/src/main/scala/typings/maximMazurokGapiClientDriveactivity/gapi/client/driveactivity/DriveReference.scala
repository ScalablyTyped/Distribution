package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveReference extends js.Object {
  
  /** The resource name of the shared drive. The format is "COLLECTION_ID/DRIVE_ID". Clients should not assume a specific collection ID for this resource name. */
  var name: js.UndefOr[String] = js.native
  
  /** The title of the shared drive. */
  var title: js.UndefOr[String] = js.native
}
object DriveReference {
  
  @scala.inline
  def apply(): DriveReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveReference]
  }
  
  @scala.inline
  implicit class DriveReferenceOps[Self <: DriveReference] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
