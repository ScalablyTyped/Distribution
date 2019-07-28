package typings.officeDashJs.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileContentFormat extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.FileContentFormat")
@js.native
object FileContentFormat extends js.Object {
  @js.native
  sealed trait base64 extends FileContentFormat
  
  @js.native
  sealed trait html extends FileContentFormat
  
  @js.native
  sealed trait ooxml extends FileContentFormat
  
  /* "Base64" */ val base64: typings.officeDashJs.WordNs.FileContentFormat.base64 with String = js.native
  /* "Html" */ val html: typings.officeDashJs.WordNs.FileContentFormat.html with String = js.native
  /* "Ooxml" */ val ooxml: typings.officeDashJs.WordNs.FileContentFormat.ooxml with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileContentFormat with String] = js.native
}

