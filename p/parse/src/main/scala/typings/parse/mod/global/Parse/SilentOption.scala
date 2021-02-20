package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SilentOption extends StObject {
  
  /**
    * Set to true to avoid firing the event.
    */
  var silent: js.UndefOr[Boolean] = js.native
}
object SilentOption {
  
  @scala.inline
  def apply(): SilentOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SilentOption]
  }
  
  @scala.inline
  implicit class SilentOptionMutableBuilder[Self <: SilentOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
