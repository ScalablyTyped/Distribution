package typings.officeDashJsDashPreview.Word

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VerticalAlignment with String] = js.native
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Center" */ @js.native
  object center extends TopLevel[center with String]
  
  /* "Mixed" */ @js.native
  object mixed extends TopLevel[mixed with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

