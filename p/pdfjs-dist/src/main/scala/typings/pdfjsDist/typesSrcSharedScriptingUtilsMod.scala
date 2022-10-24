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
    
    inline def CMYK_G(param0: js.Tuple4[Any, Any, Any, Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("CMYK_G")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def CMYK_HTML(components: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CMYK_HTML")(components.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def CMYK_RGB(param0: js.Tuple4[Any, Any, Any, Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("CMYK_RGB")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def G_CMYK(param0: js.Array[Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("G_CMYK")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def G_HTML(param0: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("G_HTML")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def G_RGB(param0: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("G_RGB")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def RGB_CMYK(param0: js.Tuple3[Any, Any, Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("RGB_CMYK")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def RGB_G(param0: js.Tuple3[Any, Any, Any]): js.Array[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("RGB_G")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double]]
    
    inline def RGB_HTML(param0: js.Tuple3[Any, Any, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RGB_HTML")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def T_HTML(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("T_HTML")().asInstanceOf[String]
  }
}
