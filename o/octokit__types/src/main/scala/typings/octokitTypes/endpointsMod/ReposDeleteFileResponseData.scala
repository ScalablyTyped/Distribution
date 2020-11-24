package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.anon.Committer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposDeleteFileResponseData extends js.Object {
  
  var commit: Committer = js.native
  
  var content: StringDictionary[js.Any] = js.native
}
object ReposDeleteFileResponseData {
  
  @scala.inline
  def apply(commit: Committer, content: StringDictionary[js.Any]): ReposDeleteFileResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteFileResponseData]
  }
  
  @scala.inline
  implicit class ReposDeleteFileResponseDataOps[Self <: ReposDeleteFileResponseData] (val x: Self) extends AnyVal {
    
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
    def setContent(value: StringDictionary[js.Any]): Self = this.set("content", value.asInstanceOf[js.Any])
  }
}
