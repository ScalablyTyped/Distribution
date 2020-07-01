package typings.officeJsPreview.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * The insertion location types.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.InsertLocation")
@js.native
object InsertLocation extends js.Object {
  /* "After" */ val after: typings.officeJsPreview.Word.InsertLocation.after with String = js.native
  /* "Before" */ val before: typings.officeJsPreview.Word.InsertLocation.before with String = js.native
  /* "End" */ val end: typings.officeJsPreview.Word.InsertLocation.end with String = js.native
  /* "Replace" */ val replace: typings.officeJsPreview.Word.InsertLocation.replace with String = js.native
  /* "Start" */ val start: typings.officeJsPreview.Word.InsertLocation.start with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.InsertLocation with String] = js.native
}

