package typings.pdfmake.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageOrientation extends js.Object

@JSImport("pdfmake/build/pdfmake", "PageOrientation")
@js.native
object PageOrientation extends js.Object {
  @js.native
  sealed trait LANDSCAPE extends PageOrientation
  
  @js.native
  sealed trait PORTRAIT extends PageOrientation
  
  /* "LANDSCAPE" */ val LANDSCAPE: typings.pdfmake.buildPdfmakeMod.PageOrientation.LANDSCAPE with String = js.native
  /* "PORTRAIT" */ val PORTRAIT: typings.pdfmake.buildPdfmakeMod.PageOrientation.PORTRAIT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PageOrientation with String] = js.native
}

