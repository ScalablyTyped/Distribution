package typings.ol.expressionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueTypes extends js.Object
@JSImport("ol/style/expressions", "ValueTypes")
@js.native
object ValueTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueTypes with Double] = js.native
  
  @js.native
  sealed trait ANY extends ValueTypes
  /* 31 */ @js.native
  object ANY extends TopLevel[ANY with Double]
  
  @js.native
  sealed trait BOOLEAN extends ValueTypes
  /* 8 */ @js.native
  object BOOLEAN extends TopLevel[BOOLEAN with Double]
  
  @js.native
  sealed trait COLOR extends ValueTypes
  /* 4 */ @js.native
  object COLOR extends TopLevel[COLOR with Double]
  
  @js.native
  sealed trait NONE extends ValueTypes
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait NUMBER extends ValueTypes
  /* 1 */ @js.native
  object NUMBER extends TopLevel[NUMBER with Double]
  
  @js.native
  sealed trait NUMBER_ARRAY extends ValueTypes
  /* 16 */ @js.native
  object NUMBER_ARRAY extends TopLevel[NUMBER_ARRAY with Double]
  
  @js.native
  sealed trait STRING extends ValueTypes
  /* 2 */ @js.native
  object STRING extends TopLevel[STRING with Double]
}
