package typings.officeJsPreview.Excel

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
    * The object is free floating.
    *
    */
  @js.native
  sealed trait absolute extends Placement
  
  /**
    * The object is moved and sized with the cells.
    *
    */
  @js.native
  sealed trait oneCell extends Placement
  
  /**
    * The object is moved with the cells.
    *
    */
  @js.native
  sealed trait twoCell extends Placement
  
}

