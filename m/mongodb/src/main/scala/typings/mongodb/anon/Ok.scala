package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ok extends StObject {
  
  var n: Double = js.native
  
  var ok: Double = js.native
}
object Ok {
  
  @scala.inline
  def apply(n: Double, ok: Double): Ok = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok]
  }
  
  @scala.inline
  implicit class OkMutableBuilder[Self <: Ok] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
