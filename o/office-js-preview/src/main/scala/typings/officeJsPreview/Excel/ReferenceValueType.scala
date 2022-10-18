package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReferenceValueType extends StObject
/**
  * Represents the types of the `ReferenceValue` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
@JSGlobal("Excel.ReferenceValueType")
@js.native
object ReferenceValueType extends StObject {
  
  /**
    * Represents an `ArrayCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait array
    extends StObject
       with ReferenceValueType
  
  /**
    * Represents an `EntityCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait entity
    extends StObject
       with ReferenceValueType
  
  /**
    * Represents a `RootReferenceCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  @js.native
  sealed trait root
    extends StObject
       with ReferenceValueType
}
