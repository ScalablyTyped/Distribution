package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorksheetPositionType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.WorksheetPositionType")
@js.native
object WorksheetPositionType extends js.Object {
  @js.native
  sealed trait after extends WorksheetPositionType
  
  @js.native
  sealed trait before extends WorksheetPositionType
  
  @js.native
  sealed trait beginning extends WorksheetPositionType
  
  @js.native
  sealed trait end extends WorksheetPositionType
  
  @js.native
  sealed trait none extends WorksheetPositionType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WorksheetPositionType with String] = js.native
  /* "After" */ @js.native
  object after extends TopLevel[after with String]
  
  /* "Before" */ @js.native
  object before extends TopLevel[before with String]
  
  /* "Beginning" */ @js.native
  object beginning extends TopLevel[beginning with String]
  
  /* "End" */ @js.native
  object end extends TopLevel[end with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
}

