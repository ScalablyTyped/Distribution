package typings.polished

import typings.polished.libTypesColorMod.ContrastScores
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorMeetsContrastGuidelinesMod {
  
  @JSImport("polished/lib/color/meetsContrastGuidelines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color1: String, color2: String): ContrastScores = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[ContrastScores]
}
