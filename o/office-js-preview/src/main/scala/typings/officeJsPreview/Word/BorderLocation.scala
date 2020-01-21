package typings.officeJsPreview.Word

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderLocation with String] = js.native
  /* "All" */ @js.native
  object all extends TopLevel[all with String]
  
  /* "Bottom" */ @js.native
  object bottom extends TopLevel[bottom with String]
  
  /* "Inside" */ @js.native
  object inside extends TopLevel[inside with String]
  
  /* "InsideHorizontal" */ @js.native
  object insideHorizontal extends TopLevel[insideHorizontal with String]
  
  /* "InsideVertical" */ @js.native
  object insideVertical extends TopLevel[insideVertical with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Outside" */ @js.native
  object outside extends TopLevel[outside with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
  /* "Top" */ @js.native
  object top extends TopLevel[top with String]
  
}

