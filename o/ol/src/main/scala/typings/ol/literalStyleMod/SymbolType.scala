package typings.ol.literalStyleMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolType extends js.Object
@JSImport("ol/style/LiteralStyle", "SymbolType")
@js.native
object SymbolType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SymbolType with String] = js.native
  
  @js.native
  sealed trait CIRCLE extends SymbolType
  /* "circle" */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with String]
  
  @js.native
  sealed trait IMAGE extends SymbolType
  /* "image" */ @js.native
  object IMAGE extends TopLevel[IMAGE with String]
  
  @js.native
  sealed trait SQUARE extends SymbolType
  /* "square" */ @js.native
  object SQUARE extends TopLevel[SQUARE with String]
  
  @js.native
  sealed trait TRIANGLE extends SymbolType
  /* "triangle" */ @js.native
  object TRIANGLE extends TopLevel[TRIANGLE with String]
}
