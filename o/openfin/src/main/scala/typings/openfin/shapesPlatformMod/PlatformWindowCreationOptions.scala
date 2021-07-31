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
  
  @scala.inline
  def apply(): PlatformWindowCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformWindowCreationOptions]
  }
  
  @scala.inline
  implicit class PlatformWindowCreationOptionsMutableBuilder[Self <: PlatformWindowCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: WindowCreationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
