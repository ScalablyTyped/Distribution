package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentPropertyType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.DocumentPropertyType")
@js.native
object DocumentPropertyType extends js.Object {
  @js.native
  sealed trait boolean extends DocumentPropertyType
  
  @js.native
  sealed trait date extends DocumentPropertyType
  
  @js.native
  sealed trait float extends DocumentPropertyType
  
  @js.native
  sealed trait number extends DocumentPropertyType
  
  @js.native
  sealed trait string extends DocumentPropertyType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentPropertyType with String] = js.native
  /* "Boolean" */ @js.native
  object boolean extends TopLevel[boolean with String]
  
  /* "Date" */ @js.native
  object date extends TopLevel[date with String]
  
  /* "Float" */ @js.native
  object float extends TopLevel[float with String]
  
  /* "Number" */ @js.native
  object number extends TopLevel[number with String]
  
  /* "String" */ @js.native
  object string extends TopLevel[string with String]
  
}

