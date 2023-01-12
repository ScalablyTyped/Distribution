package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoJoinPolicy extends StObject {
  
  var AutoJoinPolicy: ORIGINSCOPED
  
  var media: DEFAULTMEDIARECEIVERAPPID
}
object AutoJoinPolicy {
  
  inline def apply(AutoJoinPolicy: ORIGINSCOPED, media: DEFAULTMEDIARECEIVERAPPID): AutoJoinPolicy = {
    val __obj = js.Dynamic.literal(AutoJoinPolicy = AutoJoinPolicy.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoJoinPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoJoinPolicy] (val x: Self) extends AnyVal {
    
    inline def setAutoJoinPolicy(value: ORIGINSCOPED): Self = StObject.set(x, "AutoJoinPolicy", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: DEFAULTMEDIARECEIVERAPPID): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
