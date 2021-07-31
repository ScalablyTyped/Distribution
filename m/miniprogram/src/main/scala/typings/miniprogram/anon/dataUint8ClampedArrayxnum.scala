package typings.miniprogram.anon

import typings.miniprogram.AsyncCallbackFailObject
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  data :std.Uint8ClampedArray,   x :number,   y :number,   width :number,   height :number} & miniprogram.AsyncCallback<void> */
trait dataUint8ClampedArrayxnum extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var data: Uint8ClampedArray
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.undefined
  
  var height: Double
  
  var success: js.UndefOr[js.Function1[/* res */ Unit, Unit]] = js.undefined
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object dataUint8ClampedArrayxnum {
  
  @scala.inline
  def apply(data: Uint8ClampedArray, height: Double, width: Double, x: Double, y: Double): dataUint8ClampedArrayxnum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[dataUint8ClampedArrayxnum]
  }
  
  @scala.inline
  implicit class dataUint8ClampedArrayxnumMutableBuilder[Self <: dataUint8ClampedArrayxnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setData(value: Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* err */ AsyncCallbackFailObject => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ Unit => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
