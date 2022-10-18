package typings.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcSharedScriptingUtilsMod {
  
  @JSImport("pdfjs-dist/types/src/shared/scripting_utils", "ColorConverters")
  @js.native
  open class ColorConverters () extends StObject
  /* static members */
  object ColorConverters {
    
    @JSImport("pdfjs-dist/types/src/shared/scripting_utils", "ColorConverters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CMYK_G(hasCYMK: js.Tuple4[Any, Any, Any, Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("CMYK_G")(hasCYMK.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def CMYK_HTML(components: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CMYK_HTML")(components.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def CMYK_RGB(hasCYMK: js.Tuple4[Any, Any, Any, Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("CMYK_RGB")(hasCYMK.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def G_CMYK(hasG: js.Array[Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("G_CMYK")(hasG.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def G_HTML(hasG: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("G_HTML")(hasG.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def G_RGB(hasG: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("G_RGB")(hasG.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def RGB_CMYK(hasRGB: js.Tuple3[Any, Any, Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("RGB_CMYK")(hasRGB.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def RGB_G(hasRGB: js.Tuple3[Any, Any, Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("RGB_G")(hasRGB.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def RGB_HTML(hasRGB: js.Tuple3[Any, Any, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RGB_HTML")(hasRGB.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def T_HTML(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("T_HTML")().asInstanceOf[String]
  }
}
