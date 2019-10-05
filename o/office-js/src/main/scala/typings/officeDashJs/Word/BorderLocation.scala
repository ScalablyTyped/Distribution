package typings.officeDashJs.Word

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
  
  /* "All" */ val all: typings.officeDashJs.Word.BorderLocation.all with String = js.native
  /* "Bottom" */ val bottom: typings.officeDashJs.Word.BorderLocation.bottom with String = js.native
  /* "Inside" */ val inside: typings.officeDashJs.Word.BorderLocation.inside with String = js.native
  /* "InsideHorizontal" */ val insideHorizontal: typings.officeDashJs.Word.BorderLocation.insideHorizontal with String = js.native
  /* "InsideVertical" */ val insideVertical: typings.officeDashJs.Word.BorderLocation.insideVertical with String = js.native
  /* "Left" */ val left: typings.officeDashJs.Word.BorderLocation.left with String = js.native
  /* "Outside" */ val outside: typings.officeDashJs.Word.BorderLocation.outside with String = js.native
  /* "Right" */ val right: typings.officeDashJs.Word.BorderLocation.right with String = js.native
  /* "Top" */ val top: typings.officeDashJs.Word.BorderLocation.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderLocation with String] = js.native
}

