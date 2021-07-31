package typings.otplibPresetV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotpOptionsInterface
  extends StObject
     with HotpOptionsInterface {
  
  var epoch: js.UndefOr[js.Any] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var window: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object TotpOptionsInterface {
  
  @scala.inline
  def apply(): TotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotpOptionsInterface]
  }
  
  @scala.inline
  implicit class TotpOptionsInterfaceMutableBuilder[Self <: TotpOptionsInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEpoch(value: js.Any): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setWindow(value: Double | js.Array[Double]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    @scala.inline
    def setWindowVarargs(value: Double*): Self = StObject.set(x, "window", js.Array(value :_*))
  }
}
