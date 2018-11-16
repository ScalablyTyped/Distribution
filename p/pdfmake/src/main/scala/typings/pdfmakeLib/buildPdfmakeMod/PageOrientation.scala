package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageOrientation extends js.Object

@JSImport("pdfmake/build/pdfmake", "PageOrientation")
@js.native
object PageOrientation extends js.Object {
  @js.native
  sealed trait LANDSCAPE
    extends pdfmakeLib.buildPdfmakeMod.PageOrientation
  
  @js.native
  sealed trait PORTRAIT
    extends pdfmakeLib.buildPdfmakeMod.PageOrientation
  
  /* "LANDSCAPE" */ val LANDSCAPE: LANDSCAPE with java.lang.String = js.native
  /* "PORTRAIT" */ val PORTRAIT: PORTRAIT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[pdfmakeLib.buildPdfmakeMod.PageOrientation with java.lang.String] = js.native
}

