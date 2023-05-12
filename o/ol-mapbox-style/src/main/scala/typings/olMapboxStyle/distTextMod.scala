package typings.olMapboxStyle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextMod {
  
  @JSImport("ol-mapbox-style/dist/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyLetterSpacing(text: Any, letterSpacing: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("applyLetterSpacing")(text.asInstanceOf[js.Any], letterSpacing.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getFonts(fonts: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFonts")(fonts.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getFonts(fonts: js.Array[Any], templateUrl: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFonts")(fonts.asInstanceOf[js.Any], templateUrl.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def wrapText(text: Any, font: Any, em: Any, letterSpacing: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapText")(text.asInstanceOf[js.Any], font.asInstanceOf[js.Any], em.asInstanceOf[js.Any], letterSpacing.asInstanceOf[js.Any])).asInstanceOf[Any]
}
