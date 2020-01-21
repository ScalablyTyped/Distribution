package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  @js.native
  sealed trait center extends HorizontalAlignment
  
  @js.native
  sealed trait centerAcrossSelection extends HorizontalAlignment
  
  @js.native
  sealed trait distributed extends HorizontalAlignment
  
  @js.native
  sealed trait fill extends HorizontalAlignment
  
  @js.native
  sealed trait general extends HorizontalAlignment
  
  @js.native
  sealed trait justify extends HorizontalAlignment
  
  @js.native
  sealed trait left extends HorizontalAlignment
  
  @js.native
  sealed trait right extends HorizontalAlignment
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HorizontalAlignment with String] = js.native
  /* "Center" */ @js.native
  object center extends TopLevel[center with String]
  
  /* "CenterAcrossSelection" */ @js.native
  object centerAcrossSelection extends TopLevel[centerAcrossSelection with String]
  
  /* "Distributed" */ @js.native
  object distributed extends TopLevel[distributed with String]
  
  /* "Fill" */ @js.native
  object fill extends TopLevel[fill with String]
  
  /* "General" */ @js.native
  object general extends TopLevel[general with String]
  
  /* "Justify" */ @js.native
  object justify extends TopLevel[justify with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
}

