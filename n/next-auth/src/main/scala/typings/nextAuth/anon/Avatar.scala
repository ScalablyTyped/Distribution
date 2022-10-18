package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar extends StObject {
  
  var avatar: Full
}
object Avatar {
  
  inline def apply(avatar: Full): Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  
  extension [Self <: Avatar](x: Self) {
    
    inline def setAvatar(value: Full): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
  }
}
