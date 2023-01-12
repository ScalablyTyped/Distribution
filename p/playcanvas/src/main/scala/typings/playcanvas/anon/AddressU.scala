package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressU extends StObject {
  
  var addressU: js.UndefOr[Double] = js.undefined
  
  var addressV: js.UndefOr[Double] = js.undefined
  
  var addressW: js.UndefOr[Double] = js.undefined
  
  var anisotropy: js.UndefOr[Double] = js.undefined
  
  var compareFunc: js.UndefOr[Double] = js.undefined
  
  var compareOnRead: js.UndefOr[Boolean] = js.undefined
  
  var cubemap: js.UndefOr[Boolean] = js.undefined
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var fixCubemapSeams: js.UndefOr[Boolean] = js.undefined
  
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var levels: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
  
  var magFilter: js.UndefOr[Double] = js.undefined
  
  var minFilter: js.UndefOr[Double] = js.undefined
  
  var mipmaps: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var premultiplyAlpha: js.UndefOr[Boolean] = js.undefined
  
  var projection: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var volume: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object AddressU {
  
  inline def apply(): AddressU = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressU]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressU] (val x: Self) extends AnyVal {
    
    inline def setAddressU(value: Double): Self = StObject.set(x, "addressU", value.asInstanceOf[js.Any])
    
    inline def setAddressUUndefined: Self = StObject.set(x, "addressU", js.undefined)
    
    inline def setAddressV(value: Double): Self = StObject.set(x, "addressV", value.asInstanceOf[js.Any])
    
    inline def setAddressVUndefined: Self = StObject.set(x, "addressV", js.undefined)
    
    inline def setAddressW(value: Double): Self = StObject.set(x, "addressW", value.asInstanceOf[js.Any])
    
    inline def setAddressWUndefined: Self = StObject.set(x, "addressW", js.undefined)
    
    inline def setAnisotropy(value: Double): Self = StObject.set(x, "anisotropy", value.asInstanceOf[js.Any])
    
    inline def setAnisotropyUndefined: Self = StObject.set(x, "anisotropy", js.undefined)
    
    inline def setCompareFunc(value: Double): Self = StObject.set(x, "compareFunc", value.asInstanceOf[js.Any])
    
    inline def setCompareFuncUndefined: Self = StObject.set(x, "compareFunc", js.undefined)
    
    inline def setCompareOnRead(value: Boolean): Self = StObject.set(x, "compareOnRead", value.asInstanceOf[js.Any])
    
    inline def setCompareOnReadUndefined: Self = StObject.set(x, "compareOnRead", js.undefined)
    
    inline def setCubemap(value: Boolean): Self = StObject.set(x, "cubemap", value.asInstanceOf[js.Any])
    
    inline def setCubemapUndefined: Self = StObject.set(x, "cubemap", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFixCubemapSeams(value: Boolean): Self = StObject.set(x, "fixCubemapSeams", value.asInstanceOf[js.Any])
    
    inline def setFixCubemapSeamsUndefined: Self = StObject.set(x, "fixCubemapSeams", js.undefined)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLevels(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setMagFilter(value: Double): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
    
    inline def setMagFilterUndefined: Self = StObject.set(x, "magFilter", js.undefined)
    
    inline def setMinFilter(value: Double): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
    
    inline def setMinFilterUndefined: Self = StObject.set(x, "minFilter", js.undefined)
    
    inline def setMipmaps(value: Boolean): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
    
    inline def setMipmapsUndefined: Self = StObject.set(x, "mipmaps", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPremultiplyAlpha(value: Boolean): Self = StObject.set(x, "premultiplyAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultiplyAlphaUndefined: Self = StObject.set(x, "premultiplyAlpha", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVolume(value: Boolean): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
