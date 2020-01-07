package typings.ol.styleExpressionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueTypes extends js.Object

@JSImport("ol/style/expressions", "ValueTypes")
@js.native
object ValueTypes extends js.Object {
  @js.native
  sealed trait ANY extends ValueTypes
  
  @js.native
  sealed trait BOOLEAN extends ValueTypes
  
  @js.native
  sealed trait COLOR extends ValueTypes
  
  @js.native
  sealed trait NONE extends ValueTypes
  
  @js.native
  sealed trait NUMBER extends ValueTypes
  
  @js.native
  sealed trait NUMBER_ARRAY extends ValueTypes
  
  @js.native
  sealed trait STRING extends ValueTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueTypes with Double] = js.native
  /* 31 */ @js.native
  object ANY extends TopLevel[ANY with Double]
  
  /* 8 */ @js.native
  object BOOLEAN extends TopLevel[BOOLEAN with Double]
  
  /* 4 */ @js.native
  object COLOR extends TopLevel[COLOR with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object NUMBER extends TopLevel[NUMBER with Double]
  
  /* 16 */ @js.native
  object NUMBER_ARRAY extends TopLevel[NUMBER_ARRAY with Double]
  
  /* 2 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
}

