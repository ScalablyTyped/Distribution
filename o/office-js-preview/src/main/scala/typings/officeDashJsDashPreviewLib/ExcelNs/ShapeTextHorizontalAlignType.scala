package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextHorizontalAlignType extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ShapeTextHorizontalAlignType")
@js.native
object ShapeTextHorizontalAlignType extends js.Object {
  @js.native
  sealed trait center
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType
  
  @js.native
  sealed trait distributed
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType
  
  @js.native
  sealed trait justify
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType
  
  @js.native
  sealed trait justifyLow
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType
  
  @js.native
  sealed trait left
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType
  
  @js.native
  sealed trait right
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType
  
  @js.native
  sealed trait shapeTextHorizontalAlignType_MaxEnumIDs
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType
  
  @js.native
  sealed trait thaiDistributed
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType
  
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Distributed" */ val distributed: distributed with java.lang.String = js.native
  /* "Justify" */ val justify: justify with java.lang.String = js.native
  /* "JustifyLow" */ val justifyLow: justifyLow with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  /* "ShapeTextHorizontalAlignType_MaxEnumIDs" */ val shapeTextHorizontalAlignType_MaxEnumIDs: shapeTextHorizontalAlignType_MaxEnumIDs with java.lang.String = js.native
  /* "ThaiDistributed" */ val thaiDistributed: thaiDistributed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType with java.lang.String
  ] = js.native
}

