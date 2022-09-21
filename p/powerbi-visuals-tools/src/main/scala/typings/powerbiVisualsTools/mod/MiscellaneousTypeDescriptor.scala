package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiscellaneousTypeDescriptor extends StObject {
  
  val barcode: js.UndefOr[Boolean] = js.undefined
  
  val image: js.UndefOr[Boolean] = js.undefined
  
  val imageUrl: js.UndefOr[Boolean] = js.undefined
  
  val webUrl: js.UndefOr[Boolean] = js.undefined
}
object MiscellaneousTypeDescriptor {
  
  inline def apply(): MiscellaneousTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiscellaneousTypeDescriptor]
  }
  
  extension [Self <: MiscellaneousTypeDescriptor](x: Self) {
    
    inline def setBarcode(value: Boolean): Self = StObject.set(x, "barcode", value.asInstanceOf[js.Any])
    
    inline def setBarcodeUndefined: Self = StObject.set(x, "barcode", js.undefined)
    
    inline def setImage(value: Boolean): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageUrl(value: Boolean): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setWebUrl(value: Boolean): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
