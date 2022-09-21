package typings.pdfjsDist

import typings.pdfjsDist.anon.DisableFontFace
import typings.std.FontFace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontLoaderMod {
  
  @JSImport("pdfjs-dist/types/src/display/font_loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/src/display/font_loader", "FontFaceObject")
  @js.native
  open class FontFaceObject protected () extends StObject {
    def this(
      translatedData: Any,
      hasIsEvalSupportedDisableFontFaceIgnoreErrorsOnUnsupportedFeatureFontRegistry: DisableFontFace
    ) = this()
    
    var _onUnsupportedFeature: Any = js.native
    
    var compiledGlyphs: Any = js.native
    
    def createFontFaceRule(): String | Null = js.native
    
    def createNativeFontFace(): FontFace | Null = js.native
    
    var disableFontFace: Boolean = js.native
    
    var fontRegistry: Any = js.native
    
    def getPathGenerator(objs: Any, character: Any): Any = js.native
    
    var ignoreErrors: Boolean = js.native
    
    var isEvalSupported: Boolean = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/font_loader", "FontLoader")
  @js.native
  def FontLoader: Any = js.native
  inline def FontLoader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FontLoader")(x.asInstanceOf[js.Any])
}
