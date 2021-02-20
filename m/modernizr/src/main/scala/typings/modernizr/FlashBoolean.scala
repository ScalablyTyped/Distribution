package typings.modernizr

import typings.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashBoolean extends Boolean {
  
  var blocked: scala.Boolean = js.native
}
object FlashBoolean {
  
  @scala.inline
  def apply(blocked: scala.Boolean): FlashBoolean = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBoolean]
  }
  
  @scala.inline
  implicit class FlashBooleanMutableBuilder[Self <: FlashBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked(value: scala.Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
  }
}
