package typings.playable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoJoinPolicy extends js.Object {
  
  var AutoJoinPolicy: ORIGINSCOPED = js.native
  
  var media: DEFAULTMEDIARECEIVERAPPID = js.native
}
object AutoJoinPolicy {
  
  @scala.inline
  def apply(AutoJoinPolicy: ORIGINSCOPED, media: DEFAULTMEDIARECEIVERAPPID): AutoJoinPolicy = {
    val __obj = js.Dynamic.literal(AutoJoinPolicy = AutoJoinPolicy.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoJoinPolicy]
  }
  
  @scala.inline
  implicit class AutoJoinPolicyOps[Self <: AutoJoinPolicy] (val x: Self) extends AnyVal {
    
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
    def setAutoJoinPolicy(value: ORIGINSCOPED): Self = this.set("AutoJoinPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: DEFAULTMEDIARECEIVERAPPID): Self = this.set("media", value.asInstanceOf[js.Any])
  }
}
