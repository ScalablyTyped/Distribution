package typings.officeJs.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * The insertion location types.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.InsertLocation")
@js.native
object InsertLocation extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.InsertLocation with String] = js.native
  
  /* "After" */ val after: typings.officeJs.Word.InsertLocation.after with String = js.native
  
  /* "Before" */ val before: typings.officeJs.Word.InsertLocation.before with String = js.native
  
  /* "End" */ val end: typings.officeJs.Word.InsertLocation.end with String = js.native
  
  /* "Replace" */ val replace: typings.officeJs.Word.InsertLocation.replace with String = js.native
  
  /* "Start" */ val start: typings.officeJs.Word.InsertLocation.start with String = js.native
}
