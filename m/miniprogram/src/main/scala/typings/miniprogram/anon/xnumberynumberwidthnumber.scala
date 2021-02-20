package typings.miniprogram.anon

import typings.miniprogram.AsyncCallbackFailObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  x :number,   y :number,   width :number,   height :number} & miniprogram.AsyncCallback<{  width :number,   height :number,   data :std.Uint8ClampedArray | undefined}> */
@js.native
trait xnumberynumberwidthnumber extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.native
  
  var height: Double = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ Data, Unit]] = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object xnumberynumberwidthnumber {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): xnumberynumberwidthnumber = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[xnumberynumberwidthnumber]
  }
  
  @scala.inline
  implicit class xnumberynumberwidthnumberMutableBuilder[Self <: xnumberynumberwidthnumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* err */ AsyncCallbackFailObject => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ Data => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
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
