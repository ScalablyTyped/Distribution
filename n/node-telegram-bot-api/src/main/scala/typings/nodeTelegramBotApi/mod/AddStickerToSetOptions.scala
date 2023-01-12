package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddStickerToSetOptions extends StObject {
  
  var mask_position: js.UndefOr[MaskPosition] = js.undefined
}
object AddStickerToSetOptions {
  
  inline def apply(): AddStickerToSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddStickerToSetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddStickerToSetOptions] (val x: Self) extends AnyVal {
    
    inline def setMask_position(value: MaskPosition): Self = StObject.set(x, "mask_position", value.asInstanceOf[js.Any])
    
    inline def setMask_positionUndefined: Self = StObject.set(x, "mask_position", js.undefined)
  }
}
