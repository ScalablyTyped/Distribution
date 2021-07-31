package typings.momentMini.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromTo
  extends StObject
     with _DurationInputArg1 {
  
  var from: MomentInput
  
  var to: MomentInput
}
object FromTo {
  
  @scala.inline
  def apply(from: MomentInput, to: MomentInput): FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTo]
  }
  
  @scala.inline
  implicit class FromToMutableBuilder[Self <: FromTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: MomentInput): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromVarargs(value: (Double | String)*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: MomentInput): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVarargs(value: (Double | String)*): Self = StObject.set(x, "to", js.Array(value :_*))
  }
}
