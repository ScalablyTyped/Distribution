package typings.officeDashJsDashPreview.Word

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Word.FileContentFormat.base64
import typings.officeDashJsDashPreview.Word.FileContentFormat.html
import typings.officeDashJsDashPreview.Word.FileContentFormat.ooxml
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileContentFormat with String] = js.native
  /* "Base64" */ @js.native
  object base64 extends TopLevel[base64 with String]
  
  /* "Html" */ @js.native
  object html extends TopLevel[html with String]
  
  /* "Ooxml" */ @js.native
  object ooxml extends TopLevel[ooxml with String]
  
}

