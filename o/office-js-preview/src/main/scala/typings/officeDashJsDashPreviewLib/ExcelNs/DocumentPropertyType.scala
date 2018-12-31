package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait boolean
    extends officeDashJsDashPreviewLib.ExcelNs.DocumentPropertyType
  
  @js.native
  sealed trait date
    extends officeDashJsDashPreviewLib.ExcelNs.DocumentPropertyType
  
  @js.native
  sealed trait float
    extends officeDashJsDashPreviewLib.ExcelNs.DocumentPropertyType
  
  @js.native
  sealed trait number
    extends officeDashJsDashPreviewLib.ExcelNs.DocumentPropertyType
  
  @js.native
  sealed trait string
    extends officeDashJsDashPreviewLib.ExcelNs.DocumentPropertyType
  
  /* "Boolean" */ val boolean: boolean with java.lang.String = js.native
  /* "Date" */ val date: date with java.lang.String = js.native
  /* "Float" */ val float: float with java.lang.String = js.native
  /* "Number" */ val number: number with java.lang.String = js.native
  /* "String" */ val string: string with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.DocumentPropertyType with java.lang.String] = js.native
}

