package typings.officeJsPreview.Word

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
  
}

