package typings
package officeDashJsDashPreviewLib.WordNs

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
  sealed trait base64
    extends officeDashJsDashPreviewLib.WordNs.FileContentFormat
  
  @js.native
  sealed trait html
    extends officeDashJsDashPreviewLib.WordNs.FileContentFormat
  
  @js.native
  sealed trait ooxml
    extends officeDashJsDashPreviewLib.WordNs.FileContentFormat
  
  /* "Base64" */ val base64: base64 with java.lang.String = js.native
  /* "Html" */ val html: html with java.lang.String = js.native
  /* "Ooxml" */ val ooxml: ooxml with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.FileContentFormat with java.lang.String] = js.native
}

