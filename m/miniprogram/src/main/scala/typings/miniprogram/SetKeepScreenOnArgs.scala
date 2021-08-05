package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetKeepScreenOnArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  var keepScreenOn: Boolean
}
object SetKeepScreenOnArgs {
  
  inline def apply(keepScreenOn: Boolean): SetKeepScreenOnArgs = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeepScreenOnArgs]
  }
  
  extension [Self <: SetKeepScreenOnArgs](x: Self) {
    
    inline def setKeepScreenOn(value: Boolean): Self = StObject.set(x, "keepScreenOn", value.asInstanceOf[js.Any])
  }
}
