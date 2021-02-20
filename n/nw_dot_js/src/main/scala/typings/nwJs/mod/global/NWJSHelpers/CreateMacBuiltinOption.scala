package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to modify default `edit` and `window` MenuItems in Mac.
  */
@js.native
trait CreateMacBuiltinOption extends StObject {
  
  /**
    * {Boolean} (Optional) do not populate the Edit menu
    */
  var hideEdit: js.UndefOr[Boolean] = js.native
  
  /**
    * {Boolean} (Optional) do not populate the Window menu
    */
  var hideWindow: js.UndefOr[Boolean] = js.native
}
object CreateMacBuiltinOption {
  
  @scala.inline
  def apply(): CreateMacBuiltinOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMacBuiltinOption]
  }
  
  @scala.inline
  implicit class CreateMacBuiltinOptionMutableBuilder[Self <: CreateMacBuiltinOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideEdit(value: Boolean): Self = StObject.set(x, "hideEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideEditUndefined: Self = StObject.set(x, "hideEdit", js.undefined)
    
    @scala.inline
    def setHideWindow(value: Boolean): Self = StObject.set(x, "hideWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideWindowUndefined: Self = StObject.set(x, "hideWindow", js.undefined)
  }
}
