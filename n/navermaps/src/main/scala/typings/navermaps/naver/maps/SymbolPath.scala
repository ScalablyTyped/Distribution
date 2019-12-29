package typings.navermaps.naver.maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolPath extends js.Object

@JSGlobal("naver.maps.SymbolPath")
@js.native
object SymbolPath extends js.Object {
  @js.native
  sealed trait BACKWARD_CLOSED_ARROW extends SymbolPath
  
  @js.native
  sealed trait BACKWARD_OPEN_ARROW extends SymbolPath
  
  @js.native
  sealed trait CIRCLE extends SymbolPath
  
  @js.native
  sealed trait FORWARD_CLOSED_ARROW extends SymbolPath
  
  @js.native
  sealed trait FORWARD_OPEN_ARROW extends SymbolPath
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolPath with Double] = js.native
  /* 1 */ @js.native
  object BACKWARD_CLOSED_ARROW extends TopLevel[BACKWARD_CLOSED_ARROW with Double]
  
  /* 0 */ @js.native
  object BACKWARD_OPEN_ARROW extends TopLevel[BACKWARD_OPEN_ARROW with Double]
  
  /* 1 */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with Double]
  
  /* 2 */ @js.native
  object FORWARD_CLOSED_ARROW extends TopLevel[FORWARD_CLOSED_ARROW with Double]
  
  /* 3 */ @js.native
  object FORWARD_OPEN_ARROW extends TopLevel[FORWARD_OPEN_ARROW with Double]
  
}

