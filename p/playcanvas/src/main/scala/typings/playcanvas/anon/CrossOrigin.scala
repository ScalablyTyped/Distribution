package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossOrigin extends StObject {
  
  var crossOrigin: js.UndefOr[Boolean] = js.native
}
object CrossOrigin {
  
  @scala.inline
  def apply(): CrossOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossOrigin]
  }
  
  @scala.inline
  implicit class CrossOriginMutableBuilder[Self <: CrossOrigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossOrigin(value: Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
  }
}
