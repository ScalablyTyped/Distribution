package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

/**
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashJsDashPreviewLib.ExcelNs.VerticalAlignment
  
  @js.native
  sealed trait center
    extends officeDashJsDashPreviewLib.ExcelNs.VerticalAlignment
  
  @js.native
  sealed trait distributed
    extends officeDashJsDashPreviewLib.ExcelNs.VerticalAlignment
  
  @js.native
  sealed trait justify
    extends officeDashJsDashPreviewLib.ExcelNs.VerticalAlignment
  
  @js.native
  sealed trait top
    extends officeDashJsDashPreviewLib.ExcelNs.VerticalAlignment
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Distributed" */ val distributed: distributed with java.lang.String = js.native
  /* "Justify" */ val justify: justify with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.VerticalAlignment with java.lang.String] = js.native
}

