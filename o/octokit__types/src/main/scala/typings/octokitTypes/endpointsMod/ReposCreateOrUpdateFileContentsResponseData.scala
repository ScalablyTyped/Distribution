package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Committer
import typings.octokitTypes.anon.Downloadurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateOrUpdateFileContentsResponseData extends js.Object {
  
  var commit: Committer = js.native
  
  var content: Downloadurl = js.native
}
object ReposCreateOrUpdateFileContentsResponseData {
  
  @scala.inline
  def apply(commit: Committer, content: Downloadurl): ReposCreateOrUpdateFileContentsResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsResponseData]
  }
  
  @scala.inline
  implicit class ReposCreateOrUpdateFileContentsResponseDataOps[Self <: ReposCreateOrUpdateFileContentsResponseData] (val x: Self) extends AnyVal {
    
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
    def setCommit(value: Committer): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Downloadurl): Self = this.set("content", value.asInstanceOf[js.Any])
  }
}
