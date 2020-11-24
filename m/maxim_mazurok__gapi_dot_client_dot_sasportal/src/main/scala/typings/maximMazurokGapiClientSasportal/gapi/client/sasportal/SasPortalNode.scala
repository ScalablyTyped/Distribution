package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalNode extends js.Object {
  
  /** The node's display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Resource name. */
  var name: js.UndefOr[String] = js.native
  
  /** User ids used by the devices belonging to this node. */
  var sasUserIds: js.UndefOr[js.Array[String]] = js.native
}
object SasPortalNode {
  
  @scala.inline
  def apply(): SasPortalNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalNode]
  }
  
  @scala.inline
  implicit class SasPortalNodeOps[Self <: SasPortalNode] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSasUserIdsVarargs(value: String*): Self = this.set("sasUserIds", js.Array(value :_*))
    
    @scala.inline
    def setSasUserIds(value: js.Array[String]): Self = this.set("sasUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSasUserIds: Self = this.set("sasUserIds", js.undefined)
  }
}
