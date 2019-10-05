package typings.navermaps.naver.maps

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
  
  /* 1 */ val BACKWARD_CLOSED_ARROW: typings.navermaps.naver.maps.SymbolPath.BACKWARD_CLOSED_ARROW with Double = js.native
  /* 0 */ val BACKWARD_OPEN_ARROW: typings.navermaps.naver.maps.SymbolPath.BACKWARD_OPEN_ARROW with Double = js.native
  /* 1 */ val CIRCLE: typings.navermaps.naver.maps.SymbolPath.CIRCLE with Double = js.native
  /* 2 */ val FORWARD_CLOSED_ARROW: typings.navermaps.naver.maps.SymbolPath.FORWARD_CLOSED_ARROW with Double = js.native
  /* 3 */ val FORWARD_OPEN_ARROW: typings.navermaps.naver.maps.SymbolPath.FORWARD_OPEN_ARROW with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolPath with Double] = js.native
}

