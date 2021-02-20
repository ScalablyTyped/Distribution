package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureImageOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[Double] = js.native
}
object CaptureImageOptions {
  
  @scala.inline
  def apply(): CaptureImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureImageOptions]
  }
  
  @scala.inline
  implicit class CaptureImageOptionsMutableBuilder[Self <: CaptureImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
