package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLCompressedTextureEtc12 extends StObject {
  
  var COMPRESSED_RGB_ETC1_WEBGL: Double
}
object WEBGLCompressedTextureEtc12 {
  
  inline def apply(COMPRESSED_RGB_ETC1_WEBGL: Double): WEBGLCompressedTextureEtc12 = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGB_ETC1_WEBGL = COMPRESSED_RGB_ETC1_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureEtc12]
  }
  
  extension [Self <: WEBGLCompressedTextureEtc12](x: Self) {
    
    inline def setCOMPRESSED_RGB_ETC1_WEBGL(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_ETC1_WEBGL", value.asInstanceOf[js.Any])
  }
}
