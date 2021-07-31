package typings.openjscad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAGExtrudeOptions extends StObject {
  
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var twistangle: js.UndefOr[Double] = js.undefined
  
  var twiststeps: js.UndefOr[Double] = js.undefined
}
object CAGExtrudeOptions {
  
  @scala.inline
  def apply(): CAGExtrudeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CAGExtrudeOptions]
  }
  
  @scala.inline
  implicit class CAGExtrudeOptionsMutableBuilder[Self <: CAGExtrudeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
    
    @scala.inline
    def setTwistangle(value: Double): Self = StObject.set(x, "twistangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwistangleUndefined: Self = StObject.set(x, "twistangle", js.undefined)
    
    @scala.inline
    def setTwiststeps(value: Double): Self = StObject.set(x, "twiststeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwiststepsUndefined: Self = StObject.set(x, "twiststeps", js.undefined)
  }
}
