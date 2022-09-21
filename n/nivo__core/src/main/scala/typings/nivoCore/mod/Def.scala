package typings.nivoCore.mod

import typings.nivoCore.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nivoCore.mod.LinearGradientDef_
  - typings.nivoCore.mod.PatternDotsDef_
  - typings.nivoCore.mod.PatternSquaresDef_
  - typings.nivoCore.mod.PatternLinesDef_
*/
trait Def extends StObject
object Def {
  
  inline def LinearGradientDef_(colors: js.Array[Color], id: String): typings.nivoCore.mod.LinearGradientDef_ = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linearGradient")
    __obj.asInstanceOf[typings.nivoCore.mod.LinearGradientDef_]
  }
  
  inline def PatternDotsDef_(id: String): typings.nivoCore.mod.PatternDotsDef_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("patternDots")
    __obj.asInstanceOf[typings.nivoCore.mod.PatternDotsDef_]
  }
  
  inline def PatternLinesDef_(id: String): typings.nivoCore.mod.PatternLinesDef_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("patternLines")
    __obj.asInstanceOf[typings.nivoCore.mod.PatternLinesDef_]
  }
  
  inline def PatternSquaresDef_(id: String): typings.nivoCore.mod.PatternSquaresDef_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("patternSquares")
    __obj.asInstanceOf[typings.nivoCore.mod.PatternSquaresDef_]
  }
}
