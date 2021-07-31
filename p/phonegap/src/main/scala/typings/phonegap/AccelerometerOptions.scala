package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerOptions extends StObject {
  
  var frequency: js.UndefOr[Double] = js.undefined
}
object AccelerometerOptions {
  
  @scala.inline
  def apply(): AccelerometerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerOptions]
  }
  
  @scala.inline
  implicit class AccelerometerOptionsMutableBuilder[Self <: AccelerometerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
