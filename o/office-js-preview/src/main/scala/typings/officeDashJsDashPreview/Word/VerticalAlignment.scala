package typings.officeDashJsDashPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom extends VerticalAlignment
  
  @js.native
  sealed trait center extends VerticalAlignment
  
  @js.native
  sealed trait mixed extends VerticalAlignment
  
  @js.native
  sealed trait top extends VerticalAlignment
  
  /* "Bottom" */ val bottom: typings.officeDashJsDashPreview.Word.VerticalAlignment.bottom with String = js.native
  /* "Center" */ val center: typings.officeDashJsDashPreview.Word.VerticalAlignment.center with String = js.native
  /* "Mixed" */ val mixed: typings.officeDashJsDashPreview.Word.VerticalAlignment.mixed with String = js.native
  /* "Top" */ val top: typings.officeDashJsDashPreview.Word.VerticalAlignment.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VerticalAlignment with String] = js.native
}

