package typings.officeDashJs.Word

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Word.ListNumbering.arabic
import typings.officeDashJs.Word.ListNumbering.lowerLetter
import typings.officeDashJs.Word.ListNumbering.lowerRoman
import typings.officeDashJs.Word.ListNumbering.none
import typings.officeDashJs.Word.ListNumbering.upperLetter
import typings.officeDashJs.Word.ListNumbering.upperRoman
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListNumbering with String] = js.native
  /* "Arabic" */ @js.native
  object arabic extends TopLevel[arabic with String]
  
  /* "LowerLetter" */ @js.native
  object lowerLetter extends TopLevel[lowerLetter with String]
  
  /* "LowerRoman" */ @js.native
  object lowerRoman extends TopLevel[lowerRoman with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "UpperLetter" */ @js.native
  object upperLetter extends TopLevel[upperLetter with String]
  
  /* "UpperRoman" */ @js.native
  object upperRoman extends TopLevel[upperRoman with String]
  
}

