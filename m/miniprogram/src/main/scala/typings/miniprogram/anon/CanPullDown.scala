package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanPullDown extends StObject {
  
  var canPullDown: Boolean = js.native
}
object CanPullDown {
  
  @scala.inline
  def apply(canPullDown: Boolean): CanPullDown = {
    val __obj = js.Dynamic.literal(canPullDown = canPullDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanPullDown]
  }
  
  @scala.inline
  implicit class CanPullDownMutableBuilder[Self <: CanPullDown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPullDown(value: Boolean): Self = StObject.set(x, "canPullDown", value.asInstanceOf[js.Any])
  }
}
