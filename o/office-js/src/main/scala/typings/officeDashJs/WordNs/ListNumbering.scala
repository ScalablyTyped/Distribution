package typings.officeDashJs.WordNs

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
  sealed trait arabic extends ListNumbering
  
  @js.native
  sealed trait lowerLetter extends ListNumbering
  
  @js.native
  sealed trait lowerRoman extends ListNumbering
  
  @js.native
  sealed trait none extends ListNumbering
  
  @js.native
  sealed trait upperLetter extends ListNumbering
  
  @js.native
  sealed trait upperRoman extends ListNumbering
  
  /* "Arabic" */ val arabic: typings.officeDashJs.WordNs.ListNumbering.arabic with String = js.native
  /* "LowerLetter" */ val lowerLetter: typings.officeDashJs.WordNs.ListNumbering.lowerLetter with String = js.native
  /* "LowerRoman" */ val lowerRoman: typings.officeDashJs.WordNs.ListNumbering.lowerRoman with String = js.native
  /* "None" */ val none: typings.officeDashJs.WordNs.ListNumbering.none with String = js.native
  /* "UpperLetter" */ val upperLetter: typings.officeDashJs.WordNs.ListNumbering.upperLetter with String = js.native
  /* "UpperRoman" */ val upperRoman: typings.officeDashJs.WordNs.ListNumbering.upperRoman with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListNumbering with String] = js.native
}

