package typings.pico8parse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait tokenTypes extends StObject
@JSImport("pico8parse", "tokenTypes")
@js.native
object tokenTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[tokenTypes & Double] = js.native
  
  @js.native
  sealed trait BooleanLiteral
    extends StObject
       with tokenTypes
  /* 64 */ val BooleanLiteral: typings.pico8parse.mod.tokenTypes.BooleanLiteral & Double = js.native
  
  @js.native
  sealed trait EOF
    extends StObject
       with tokenTypes
  /* 1 */ val EOF: typings.pico8parse.mod.tokenTypes.EOF & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with tokenTypes
  /* 8 */ val Identifier: typings.pico8parse.mod.tokenTypes.Identifier & Double = js.native
  
  @js.native
  sealed trait Keyword
    extends StObject
       with tokenTypes
  /* 4 */ val Keyword: typings.pico8parse.mod.tokenTypes.Keyword & Double = js.native
  
  @js.native
  sealed trait NilLiteral
    extends StObject
       with tokenTypes
  /* 128 */ val NilLiteral: typings.pico8parse.mod.tokenTypes.NilLiteral & Double = js.native
  
  @js.native
  sealed trait NumericLiteral
    extends StObject
       with tokenTypes
  /* 16 */ val NumericLiteral: typings.pico8parse.mod.tokenTypes.NumericLiteral & Double = js.native
  
  @js.native
  sealed trait Punctuator
    extends StObject
       with tokenTypes
  /* 32 */ val Punctuator: typings.pico8parse.mod.tokenTypes.Punctuator & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with tokenTypes
  /* 2 */ val StringLiteral: typings.pico8parse.mod.tokenTypes.StringLiteral & Double = js.native
  
  @js.native
  sealed trait VarargLiteral
    extends StObject
       with tokenTypes
  /* 256 */ val VarargLiteral: typings.pico8parse.mod.tokenTypes.VarargLiteral & Double = js.native
}
