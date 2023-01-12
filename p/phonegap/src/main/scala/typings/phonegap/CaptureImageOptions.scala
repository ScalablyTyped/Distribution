package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureImageOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[Double] = js.undefined
}
object CaptureImageOptions {
  
  inline def apply(): CaptureImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureImageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptureImageOptions] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
