package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Represents the layout of a card in card view.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
type CardLayout = EntityCardLayout

/**
  * Represents the value in a cell.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
type CellValue = (ArrayCellValue & CellValueExtraProperties) | (BooleanCellValue & CellValueExtraProperties) | (DoubleCellValue & CellValueExtraProperties) | (EntityCellValue & CellValueExtraProperties) | (EmptyCellValue & CellValueExtraProperties) | (ErrorCellValue & CellValueExtraProperties) | (FormattedNumberCellValue & CellValueExtraProperties) | (LinkedEntityCellValue & CellValueExtraProperties) | (ReferenceCellValue & CellValueExtraProperties) | (StringCellValue & CellValueExtraProperties) | (ValueTypeNotAvailableCellValue & CellValueExtraProperties) | (WebImageCellValue & CellValueExtraProperties)

/**
  * Represents the value and metadata of a property. The metadata applies to the property (and not the value), but it is combined with the value in this type.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
type CellValueAndPropertyMetadata = CellValue & EntityPropertyExtraProperties

/**
  * Represents the layout used when there is limited space to represent the entity.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
type CompactLayout = EntityCompactLayout

/**
  * Represents the value of a property.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
type EntityPropertyType = CellValueAndPropertyMetadata | CellValue
