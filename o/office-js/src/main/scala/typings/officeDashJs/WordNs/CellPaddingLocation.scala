package typings.officeDashJs.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellPaddingLocation extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.CellPaddingLocation")
@js.native
object CellPaddingLocation extends js.Object {
  @js.native
  sealed trait bottom extends CellPaddingLocation
  
  @js.native
  sealed trait left extends CellPaddingLocation
  
  @js.native
  sealed trait right extends CellPaddingLocation
  
  @js.native
  sealed trait top extends CellPaddingLocation
  
  /* "Bottom" */ val bottom: typings.officeDashJs.WordNs.CellPaddingLocation.bottom with String = js.native
  /* "Left" */ val left: typings.officeDashJs.WordNs.CellPaddingLocation.left with String = js.native
  /* "Right" */ val right: typings.officeDashJs.WordNs.CellPaddingLocation.right with String = js.native
  /* "Top" */ val top: typings.officeDashJs.WordNs.CellPaddingLocation.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CellPaddingLocation with String] = js.native
}

