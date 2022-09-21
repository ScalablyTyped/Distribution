package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SlicerSortType extends StObject
/**
  * Specifies the slicer sort behavior for `Slicer.sortBy`.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.SlicerSortType")
@js.native
object SlicerSortType extends StObject {
  
  /**
    * Sort slicer items in ascending order by item captions.
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  @js.native
  sealed trait ascending
    extends StObject
       with SlicerSortType
  
  /**
    * Sort slicer items in the order provided by the data source.
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  @js.native
  sealed trait dataSourceOrder
    extends StObject
       with SlicerSortType
  
  /**
    * Sort slicer items in descending order by item captions.
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  @js.native
  sealed trait descending
    extends StObject
       with SlicerSortType
}
