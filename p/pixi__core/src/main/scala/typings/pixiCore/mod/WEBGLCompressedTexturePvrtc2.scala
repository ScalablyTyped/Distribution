package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLCompressedTexturePvrtc2 extends StObject {
  
  var COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double
  
  var COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double
  
  var COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double
  
  var COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double
}
object WEBGLCompressedTexturePvrtc2 {
  
  inline def apply(
    COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double,
    COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double,
    COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double,
    COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double
  ): WEBGLCompressedTexturePvrtc2 = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = COMPRESSED_RGBA_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = COMPRESSED_RGBA_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_2BPPV1_IMG = COMPRESSED_RGB_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_4BPPV1_IMG = COMPRESSED_RGB_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTexturePvrtc2]
  }
  
  extension [Self <: WEBGLCompressedTexturePvrtc2](x: Self) {
    
    inline def setCOMPRESSED_RGBA_PVRTC_2BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGBA_PVRTC_4BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_PVRTC_2BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_PVRTC_4BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
  }
}
