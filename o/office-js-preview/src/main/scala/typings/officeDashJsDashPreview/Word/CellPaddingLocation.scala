package typings.officeDashJsDashPreview.Word

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Word.CellPaddingLocation.bottom
import typings.officeDashJsDashPreview.Word.CellPaddingLocation.left
import typings.officeDashJsDashPreview.Word.CellPaddingLocation.right
import typings.officeDashJsDashPreview.Word.CellPaddingLocation.top
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CellPaddingLocation with String] = js.native
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

