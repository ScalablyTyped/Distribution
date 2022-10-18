package typings.parse5.distCommonTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("parse5/dist/common/token", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType & Double] = js.native
  
  @js.native
  sealed trait CHARACTER
    extends StObject
       with TokenType
  /* 0 */ val CHARACTER: typings.parse5.distCommonTokenMod.TokenType.CHARACTER & Double = js.native
  
  @js.native
  sealed trait COMMENT
    extends StObject
       with TokenType
  /* 5 */ val COMMENT: typings.parse5.distCommonTokenMod.TokenType.COMMENT & Double = js.native
  
  @js.native
  sealed trait DOCTYPE
    extends StObject
       with TokenType
  /* 6 */ val DOCTYPE: typings.parse5.distCommonTokenMod.TokenType.DOCTYPE & Double = js.native
  
  @js.native
  sealed trait END_TAG
    extends StObject
       with TokenType
  /* 4 */ val END_TAG: typings.parse5.distCommonTokenMod.TokenType.END_TAG & Double = js.native
  
  @js.native
  sealed trait EOF
    extends StObject
       with TokenType
  /* 7 */ val EOF: typings.parse5.distCommonTokenMod.TokenType.EOF & Double = js.native
  
  @js.native
  sealed trait HIBERNATION
    extends StObject
       with TokenType
  /* 8 */ val HIBERNATION: typings.parse5.distCommonTokenMod.TokenType.HIBERNATION & Double = js.native
  
  @js.native
  sealed trait NULL_CHARACTER
    extends StObject
       with TokenType
  /* 1 */ val NULL_CHARACTER: typings.parse5.distCommonTokenMod.TokenType.NULL_CHARACTER & Double = js.native
  
  @js.native
  sealed trait START_TAG
    extends StObject
       with TokenType
  /* 3 */ val START_TAG: typings.parse5.distCommonTokenMod.TokenType.START_TAG & Double = js.native
  
  @js.native
  sealed trait WHITESPACE_CHARACTER
    extends StObject
       with TokenType
  /* 2 */ val WHITESPACE_CHARACTER: typings.parse5.distCommonTokenMod.TokenType.WHITESPACE_CHARACTER & Double = js.native
}
