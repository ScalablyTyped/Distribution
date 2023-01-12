package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bmp extends StObject {
  
  var bmp: js.UndefOr[Boolean] = js.undefined
  
  var jpeg: js.UndefOr[Boolean] = js.undefined
  
  var jpg: js.UndefOr[Boolean] = js.undefined
  
  var png: js.UndefOr[Boolean] = js.undefined
  
  var tif: js.UndefOr[Boolean] = js.undefined
  
  var wdp: js.UndefOr[Boolean] = js.undefined
}
object Bmp {
  
  inline def apply(): Bmp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bmp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bmp] (val x: Self) extends AnyVal {
    
    inline def setBmp(value: Boolean): Self = StObject.set(x, "bmp", value.asInstanceOf[js.Any])
    
    inline def setBmpUndefined: Self = StObject.set(x, "bmp", js.undefined)
    
    inline def setJpeg(value: Boolean): Self = StObject.set(x, "jpeg", value.asInstanceOf[js.Any])
    
    inline def setJpegUndefined: Self = StObject.set(x, "jpeg", js.undefined)
    
    inline def setJpg(value: Boolean): Self = StObject.set(x, "jpg", value.asInstanceOf[js.Any])
    
    inline def setJpgUndefined: Self = StObject.set(x, "jpg", js.undefined)
    
    inline def setPng(value: Boolean): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
    
    inline def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
    
    inline def setTif(value: Boolean): Self = StObject.set(x, "tif", value.asInstanceOf[js.Any])
    
    inline def setTifUndefined: Self = StObject.set(x, "tif", js.undefined)
    
    inline def setWdp(value: Boolean): Self = StObject.set(x, "wdp", value.asInstanceOf[js.Any])
    
    inline def setWdpUndefined: Self = StObject.set(x, "wdp", js.undefined)
  }
}
