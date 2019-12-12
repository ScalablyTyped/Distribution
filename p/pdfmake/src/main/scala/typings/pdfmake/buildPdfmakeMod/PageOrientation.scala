package typings.pdfmake.buildPdfmakeMod

import org.scalablytyped.runtime.TopLevel
import typings.pdfmake.buildPdfmakeMod.PageOrientation.LANDSCAPE
import typings.pdfmake.buildPdfmakeMod.PageOrientation.PORTRAIT
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PageOrientation with String] = js.native
  /* "LANDSCAPE" */ @js.native
  object LANDSCAPE extends TopLevel[LANDSCAPE with String]
  
  /* "PORTRAIT" */ @js.native
  object PORTRAIT extends TopLevel[PORTRAIT with String]
  
}

