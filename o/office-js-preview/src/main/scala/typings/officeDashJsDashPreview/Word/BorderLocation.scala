package typings.officeDashJsDashPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderLocation extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.BorderLocation")
@js.native
object BorderLocation extends js.Object {
  @js.native
  sealed trait all extends BorderLocation
  
  @js.native
  sealed trait bottom extends BorderLocation
  
  @js.native
  sealed trait inside extends BorderLocation
  
  @js.native
  sealed trait insideHorizontal extends BorderLocation
  
  @js.native
  sealed trait insideVertical extends BorderLocation
  
  @js.native
  sealed trait left extends BorderLocation
  
  @js.native
  sealed trait outside extends BorderLocation
  
  @js.native
  sealed trait right extends BorderLocation
  
  @js.native
  sealed trait top extends BorderLocation
  
  /* "All" */ val all: typings.officeDashJsDashPreview.Word.BorderLocation.all with String = js.native
  /* "Bottom" */ val bottom: typings.officeDashJsDashPreview.Word.BorderLocation.bottom with String = js.native
  /* "Inside" */ val inside: typings.officeDashJsDashPreview.Word.BorderLocation.inside with String = js.native
  /* "InsideHorizontal" */ val insideHorizontal: typings.officeDashJsDashPreview.Word.BorderLocation.insideHorizontal with String = js.native
  /* "InsideVertical" */ val insideVertical: typings.officeDashJsDashPreview.Word.BorderLocation.insideVertical with String = js.native
  /* "Left" */ val left: typings.officeDashJsDashPreview.Word.BorderLocation.left with String = js.native
  /* "Outside" */ val outside: typings.officeDashJsDashPreview.Word.BorderLocation.outside with String = js.native
  /* "Right" */ val right: typings.officeDashJsDashPreview.Word.BorderLocation.right with String = js.native
  /* "Top" */ val top: typings.officeDashJsDashPreview.Word.BorderLocation.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderLocation with String] = js.native
}

