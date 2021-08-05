package typings.modernizr

import typings.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashBoolean
  extends StObject
     with Boolean {
  
  var blocked: scala.Boolean
}
object FlashBoolean {
  
  inline def apply(blocked: scala.Boolean): FlashBoolean = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBoolean]
  }
  
  extension [Self <: FlashBoolean](x: Self) {
    
    inline def setBlocked(value: scala.Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
  }
}
