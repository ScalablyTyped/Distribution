package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait On extends StObject {
  
  var on: Boolean = js.native
}
object On {
  
  @scala.inline
  def apply(on: Boolean): On = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[On]
  }
  
  @scala.inline
  implicit class OnMutableBuilder[Self <: On] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
