package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitOption extends StObject {
  
  /**
    * Set to true to wait for the server to confirm success
    * before triggering an event.
    */
  @JSName("wait")
  var wait_FWaitOption: js.UndefOr[Boolean] = js.native
}
object WaitOption {
  
  @scala.inline
  def apply(): WaitOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitOption]
  }
  
  @scala.inline
  implicit class WaitOptionMutableBuilder[Self <: WaitOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
