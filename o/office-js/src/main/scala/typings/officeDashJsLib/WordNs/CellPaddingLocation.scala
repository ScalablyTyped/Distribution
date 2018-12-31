package typings
package officeDashJsLib.WordNs

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
  sealed trait bottom
    extends officeDashJsLib.WordNs.CellPaddingLocation
  
  @js.native
  sealed trait left
    extends officeDashJsLib.WordNs.CellPaddingLocation
  
  @js.native
  sealed trait right
    extends officeDashJsLib.WordNs.CellPaddingLocation
  
  @js.native
  sealed trait top
    extends officeDashJsLib.WordNs.CellPaddingLocation
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.CellPaddingLocation with java.lang.String] = js.native
}

