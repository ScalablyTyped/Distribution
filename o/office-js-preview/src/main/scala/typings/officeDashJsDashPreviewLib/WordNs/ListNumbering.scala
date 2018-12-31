package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListNumbering extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.ListNumbering")
@js.native
object ListNumbering extends js.Object {
  @js.native
  sealed trait arabic
    extends officeDashJsDashPreviewLib.WordNs.ListNumbering
  
  @js.native
  sealed trait lowerLetter
    extends officeDashJsDashPreviewLib.WordNs.ListNumbering
  
  @js.native
  sealed trait lowerRoman
    extends officeDashJsDashPreviewLib.WordNs.ListNumbering
  
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.WordNs.ListNumbering
  
  @js.native
  sealed trait upperLetter
    extends officeDashJsDashPreviewLib.WordNs.ListNumbering
  
  @js.native
  sealed trait upperRoman
    extends officeDashJsDashPreviewLib.WordNs.ListNumbering
  
  /* "Arabic" */ val arabic: arabic with java.lang.String = js.native
  /* "LowerLetter" */ val lowerLetter: lowerLetter with java.lang.String = js.native
  /* "LowerRoman" */ val lowerRoman: lowerRoman with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "UpperLetter" */ val upperLetter: upperLetter with java.lang.String = js.native
  /* "UpperRoman" */ val upperRoman: upperRoman with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.ListNumbering with java.lang.String] = js.native
}

