package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Commit
import typings.octokitTypes.anon.Enabled
import typings.octokitTypes.anon.Self
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetBranchResponseData extends js.Object {
  
  var _links: Self = js.native
  
  var commit: Commit = js.native
  
  var name: String = js.native
  
  var `protected`: Boolean = js.native
  
  var protection: Enabled = js.native
  
  var protection_url: String = js.native
}
object ReposGetBranchResponseData {
  
  @scala.inline
  def apply(
    _links: Self,
    commit: Commit,
    name: String,
    `protected`: Boolean,
    protection: Enabled,
    protection_url: String
  ): ReposGetBranchResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponseData]
  }
  
  @scala.inline
  implicit class ReposGetBranchResponseDataOps[Self <: ReposGetBranchResponseData] (val x: Self) extends AnyVal {
    
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
    def set_links(value: Self): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: Commit): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtected(value: Boolean): Self = this.set("protected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection(value: Enabled): Self = this.set("protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection_url(value: String): Self = this.set("protection_url", value.asInstanceOf[js.Any])
  }
}
