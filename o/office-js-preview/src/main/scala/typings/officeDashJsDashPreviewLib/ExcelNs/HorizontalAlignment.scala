package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait center
    extends officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment
  
  @js.native
  sealed trait centerAcrossSelection
    extends officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment
  
  @js.native
  sealed trait distributed
    extends officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment
  
  @js.native
  sealed trait fill
    extends officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment
  
  @js.native
  sealed trait general
    extends officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment
  
  @js.native
  sealed trait justify
    extends officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment
  
  @js.native
  sealed trait left
    extends officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment
  
  @js.native
  sealed trait right
    extends officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment
  
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "CenterAcrossSelection" */ val centerAcrossSelection: centerAcrossSelection with java.lang.String = js.native
  /* "Distributed" */ val distributed: distributed with java.lang.String = js.native
  /* "Fill" */ val fill: fill with java.lang.String = js.native
  /* "General" */ val general: general with java.lang.String = js.native
  /* "Justify" */ val justify: justify with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.HorizontalAlignment with java.lang.String] = js.native
}

