package typings.officeDashJsDashPreview.Excel

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
  
  /* "Boolean" */ val boolean: typings.officeDashJsDashPreview.Excel.DocumentPropertyType.boolean with String = js.native
  /* "Date" */ val date: typings.officeDashJsDashPreview.Excel.DocumentPropertyType.date with String = js.native
  /* "Float" */ val float: typings.officeDashJsDashPreview.Excel.DocumentPropertyType.float with String = js.native
  /* "Number" */ val number: typings.officeDashJsDashPreview.Excel.DocumentPropertyType.number with String = js.native
  /* "String" */ val string: typings.officeDashJsDashPreview.Excel.DocumentPropertyType.string with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentPropertyType with String] = js.native
}

