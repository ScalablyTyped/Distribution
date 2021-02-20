package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoJoinPolicy extends StObject {
  
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
  implicit class AutoJoinPolicyMutableBuilder[Self <: AutoJoinPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoJoinPolicy(value: ORIGINSCOPED): Self = StObject.set(x, "AutoJoinPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: DEFAULTMEDIARECEIVERAPPID): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
