package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAppShowCallbackResult extends StObject {
  
  var `object`: ResultOption
}
object OnAppShowCallbackResult {
  
  @scala.inline
  def apply(`object`: ResultOption): OnAppShowCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAppShowCallbackResult]
  }
  
  @scala.inline
  implicit class OnAppShowCallbackResultMutableBuilder[Self <: OnAppShowCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: ResultOption): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
