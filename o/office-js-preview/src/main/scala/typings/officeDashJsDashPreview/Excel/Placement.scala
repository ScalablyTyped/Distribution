package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

/**
  *
  * Specifies the way that an object is attached to its underlying cells.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Placement")
@js.native
object Placement extends js.Object {
  /**
    *
    * The object is free floating.
    *
    */
  @js.native
  sealed trait absolute extends Placement
  
  /**
    *
    * The object is moved and sized with the cells.
    *
    */
  @js.native
  sealed trait oneCell extends Placement
  
  /**
    *
    * The object is moved with the cells.
    *
    */
  @js.native
  sealed trait twoCell extends Placement
  
  /* "Absolute" */ val absolute: typings.officeDashJsDashPreview.Excel.Placement.absolute with String = js.native
  /* "OneCell" */ val oneCell: typings.officeDashJsDashPreview.Excel.Placement.oneCell with String = js.native
  /* "TwoCell" */ val twoCell: typings.officeDashJsDashPreview.Excel.Placement.twoCell with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Placement with String] = js.native
}

