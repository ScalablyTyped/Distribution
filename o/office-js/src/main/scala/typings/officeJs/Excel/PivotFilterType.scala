package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotFilterType extends StObject
/**
  *
  * A simple enum that represents a type of filter for a PivotField.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.PivotFilterType")
@js.native
object PivotFilterType extends StObject {
  
  /**
    * Filters PivotItems with a date in place of a label.
    Note: A PivotField cannot simultaneously have a label filter and a date filter applied.
    *
    */
  @js.native
  sealed trait date
    extends StObject
       with PivotFilterType
  
  /**
    * Filters PivotItems based on their labels.
    Note: A PivotField cannot simultaneously have a label filter and a date filter applied.
    *
    */
  @js.native
  sealed trait label
    extends StObject
       with PivotFilterType
  
  /**
    * Filters specific manually selected PivotItems from the PivotTable.
    *
    */
  @js.native
  sealed trait manual
    extends StObject
       with PivotFilterType
  
  /**
    * PivotFilterType is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with PivotFilterType
  
  /**
    * Filters based on the value of a PivotItem with respect to a DataPivotHierarchy.
    *
    */
  @js.native
  sealed trait value
    extends StObject
       with PivotFilterType
}
