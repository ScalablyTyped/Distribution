package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetKeepScreenOnArgs
  extends StObject
     with AsyncVoidCallback {
  
  var keepScreenOn: Boolean
}
object SetKeepScreenOnArgs {
  
  inline def apply(keepScreenOn: Boolean): SetKeepScreenOnArgs = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeepScreenOnArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetKeepScreenOnArgs] (val x: Self) extends AnyVal {
    
    inline def setKeepScreenOn(value: Boolean): Self = StObject.set(x, "keepScreenOn", value.asInstanceOf[js.Any])
  }
}
