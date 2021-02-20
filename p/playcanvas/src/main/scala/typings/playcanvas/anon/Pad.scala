package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pad extends StObject {
  
  var pad: js.UndefOr[js.Any] = js.native
}
object Pad {
  
  @scala.inline
  def apply(): Pad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pad]
  }
  
  @scala.inline
  implicit class PadMutableBuilder[Self <: Pad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPad(value: js.Any): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
