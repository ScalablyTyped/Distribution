package typings.openfin.shapesPlatformMod

import typings.openfin.windowOptionMod.WindowOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformWindowCreationOptions
  extends StObject
     with WindowOption {
  
  var reason: js.UndefOr[WindowCreationReason] = js.undefined
}
object PlatformWindowCreationOptions {
  
  inline def apply(): PlatformWindowCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformWindowCreationOptions]
  }
  
  extension [Self <: PlatformWindowCreationOptions](x: Self) {
    
    inline def setReason(value: WindowCreationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
