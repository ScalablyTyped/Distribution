package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsLevelSnippet extends js.Object {
  
  /** The id of the channel that's offering channel memberships. */
  var creatorChannelId: js.UndefOr[String] = js.native
  
  /** Details about the pricing level. */
  var levelDetails: js.UndefOr[LevelDetails] = js.native
}
object MembershipsLevelSnippet {
  
  @scala.inline
  def apply(): MembershipsLevelSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipsLevelSnippet]
  }
  
  @scala.inline
  implicit class MembershipsLevelSnippetOps[Self <: MembershipsLevelSnippet] (val x: Self) extends AnyVal {
    
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
    def setCreatorChannelId(value: String): Self = this.set("creatorChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorChannelId: Self = this.set("creatorChannelId", js.undefined)
    
    @scala.inline
    def setLevelDetails(value: LevelDetails): Self = this.set("levelDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelDetails: Self = this.set("levelDetails", js.undefined)
  }
}
