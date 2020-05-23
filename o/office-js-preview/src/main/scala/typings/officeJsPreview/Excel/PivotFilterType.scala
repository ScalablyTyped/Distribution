package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotFilterType extends js.Object

/**
  *
  * A simple enum that represents a type of filter for a PivotField.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.PivotFilterType")
@js.native
object PivotFilterType extends js.Object {
  /**
    * Filters PivotItems with a date in place of a label.
    Note: A PivotField cannot simultaneously have a label filter and a date filter applied.
    *
    */
  @js.native
  sealed trait date extends PivotFilterType
  
  /**
    * Filters PivotItems based on their labels.
    Note: A PivotField cannot simultaneously have a label filter and a date filter applied.
    *
    */
  @js.native
  sealed trait label extends PivotFilterType
  
  /**
    * Filters specific manually selected PivotItems from the PivotTable.
    *
    */
  @js.native
  sealed trait manual extends PivotFilterType
  
  /**
    * PivotFilterType is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends PivotFilterType
  
  /**
    * Filters based on the value of a PivotItem with respect to a DataPivotHierarchy.
    *
    */
  @js.native
  sealed trait value extends PivotFilterType
  
}

