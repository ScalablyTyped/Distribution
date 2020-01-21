package typings.ol.literalStyleMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolType extends js.Object

@JSImport("ol/style/LiteralStyle", "SymbolType")
@js.native
object SymbolType extends js.Object {
  @js.native
  sealed trait CIRCLE extends SymbolType
  
  @js.native
  sealed trait IMAGE extends SymbolType
  
  @js.native
  sealed trait SQUARE extends SymbolType
  
  @js.native
  sealed trait TRIANGLE extends SymbolType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SymbolType with String] = js.native
  /* "circle" */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with String]
  
  /* "image" */ @js.native
  object IMAGE extends TopLevel[IMAGE with String]
  
  /* "square" */ @js.native
  object SQUARE extends TopLevel[SQUARE with String]
  
  /* "triangle" */ @js.native
  object TRIANGLE extends TopLevel[TRIANGLE with String]
  
}

