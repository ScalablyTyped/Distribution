package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepLinkParameters extends js.Object {
  
  /**
    * The developer-defined unique ID for the sub-entity to which this deep link points in the current entity.
    * This field should be used to restore to a specific state within an entity, such as scrolling to or activating a specific piece of content.
    */
  var subEntityId: String = js.native
  
  /**
    * The label for the sub-entity that should be displayed when the deep link is rendered in a client.
    */
  var subEntityLabel: String = js.native
  
  /**
    * The fallback URL to which to navigate the user if the client cannot render the page.
    * This URL should lead directly to the sub-entity.
    */
  var subEntityWebUrl: js.UndefOr[String] = js.native
}
object DeepLinkParameters {
  
  @scala.inline
  def apply(subEntityId: String, subEntityLabel: String): DeepLinkParameters = {
    val __obj = js.Dynamic.literal(subEntityId = subEntityId.asInstanceOf[js.Any], subEntityLabel = subEntityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepLinkParameters]
  }
  
  @scala.inline
  implicit class DeepLinkParametersOps[Self <: DeepLinkParameters] (val x: Self) extends AnyVal {
    
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
    def setSubEntityId(value: String): Self = this.set("subEntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubEntityLabel(value: String): Self = this.set("subEntityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubEntityWebUrl(value: String): Self = this.set("subEntityWebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubEntityWebUrl: Self = this.set("subEntityWebUrl", js.undefined)
  }
}
