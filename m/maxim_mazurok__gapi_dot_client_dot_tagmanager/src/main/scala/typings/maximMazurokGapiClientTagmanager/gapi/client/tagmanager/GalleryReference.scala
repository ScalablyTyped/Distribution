package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GalleryReference extends js.Object {
  
  /** The name of the host for the community gallery template. */
  var host: js.UndefOr[String] = js.native
  
  /** If a user has manually edited the community gallery template. */
  var isModified: js.UndefOr[Boolean] = js.native
  
  /** The name of the owner for the community gallery template. */
  var owner: js.UndefOr[String] = js.native
  
  /** The name of the repository for the community gallery template. */
  var repository: js.UndefOr[String] = js.native
  
  /** The signature of the community gallery template as computed at import time. This value is recomputed whenever the template is updated from the gallery. */
  var signature: js.UndefOr[String] = js.native
  
  /** The version of the community gallery template. */
  var version: js.UndefOr[String] = js.native
}
object GalleryReference {
  
  @scala.inline
  def apply(): GalleryReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GalleryReference]
  }
  
  @scala.inline
  implicit class GalleryReferenceOps[Self <: GalleryReference] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIsModified(value: Boolean): Self = this.set("isModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsModified: Self = this.set("isModified", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
