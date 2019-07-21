package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * RangeAreas represents a collection of one or more rectangular ranges in the same worksheet.
  * To learn how to use discontinguous ranges, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-multiple-ranges | Work with multiple ranges simultaneously in Excel add-ins}.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.RangeAreas")
@js.native
class RangeAreas ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Returns the RageAreas reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g. "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val address: java.lang.String = js.native
  /**
    *
    * Returns the RageAreas reference in the user locale. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val addressLocal: java.lang.String = js.native
  /**
    *
    * Returns the number of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  val areaCount: scala.Double = js.native
  /**
    *
    * Returns a collection of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  val areas: RangeCollection = js.native
  /**
    *
    * Returns the number of cells in the RangeAreas object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val cellCount: scala.Double = js.native
  /**
    *
    * Returns a collection of ConditionalFormats that intersect with any cells in this RangeAreas object. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val conditionalFormats: ConditionalFormatCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeAreas: RequestContext = js.native
  /**
    *
    * Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  val dataValidation: DataValidation = js.native
  /**
    *
    * Returns a rangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val format: RangeFormat = js.native
  /**
    *
    * Indicates whether all the ranges on this RangeAreas object represent entire columns (e.g., "A:C, Q:Z"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val isEntireColumn: scala.Boolean = js.native
  /**
    *
    * Indicates whether all the ranges on this RangeAreas object represent entire rows (e.g., "1:3, 5:7"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val isEntireRow: scala.Boolean = js.native
  /**
    *
    * Represents the style for all ranges in this RangeAreas object.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: java.lang.String = js.native
  /**
    *
    * Returns the worksheet for the current RangeAreas. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val worksheet: Worksheet = js.native
  /**
    *
    * Calculates all cells in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  def calculate(): scala.Unit = js.native
  /**
    *
    * Clears values, format, fill, border, etc on each of the areas that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param applyTo Optional. Determines the type of clear action. See Excel.ClearApplyTo for details. Default is "All".
    */
  def clear(): scala.Unit = js.native
  def clear(applyTo: ClearApplyTo): scala.Unit = js.native
  @JSName("clear")
  def clear_All(applyTo: officeDashJsLib.officeDashJsLibStrings.All): scala.Unit = js.native
  @JSName("clear")
  def clear_Contents(applyTo: officeDashJsLib.officeDashJsLibStrings.Contents): scala.Unit = js.native
  @JSName("clear")
  def clear_Formats(applyTo: officeDashJsLib.officeDashJsLibStrings.Formats): scala.Unit = js.native
  @JSName("clear")
  def clear_Hyperlinks(applyTo: officeDashJsLib.officeDashJsLibStrings.Hyperlinks): scala.Unit = js.native
  @JSName("clear")
  def clear_RemoveHyperlinks(applyTo: officeDashJsLib.officeDashJsLibStrings.RemoveHyperlinks): scala.Unit = js.native
  /**
    *
    * Converts all cells in the RangeAreas with datatypes into text.
    *
    * [Api set: ExcelApi 1.9]
    */
  def convertDataTypeToText(): scala.Unit = js.native
  /**
    *
    * Converts all cells in the RangeAreas into linked datatype.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param serviceID The Service ID which will be used to query the data.
    * @param languageCulture Language Culture to query the service for.
    */
  def convertToLinkedDataType(serviceID: scala.Double, languageCulture: java.lang.String): scala.Unit = js.native
  def copyFrom(sourceRange: java.lang.String): scala.Unit = js.native
  def copyFrom(sourceRange: java.lang.String, copyType: RangeCopyType): scala.Unit = js.native
  def copyFrom(sourceRange: java.lang.String, copyType: RangeCopyType, skipBlanks: scala.Boolean): scala.Unit = js.native
  def copyFrom(
    sourceRange: java.lang.String,
    copyType: RangeCopyType,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  /**
    *
    * Copies cell data or formatting from the source range or RangeAreas to the current RangeAreas.
    The destination rangeAreas can be of different size than the source range or RangeAreas. The destination will be expanded automatically if it is smaller than the source.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param sourceRange The source range or RangeAreas to copy from. When the source RangeAreas has multiple ranges, it must be in the outline form which can be created by removing full rows or columns from a rectangular range.
    * @param copyType The type of cell data or formatting to copy over. Default is "All".
    * @param skipBlanks True if to skip blank cells in the source range or RangeAreas. Default is false.
    * @param transpose True if to transpose the cells in the destination RangeAreas. Default is false.
    */
  def copyFrom(sourceRange: Range): scala.Unit = js.native
  def copyFrom(sourceRange: RangeAreas): scala.Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType): scala.Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: scala.Boolean): scala.Unit = js.native
  def copyFrom(
    sourceRange: RangeAreas,
    copyType: RangeCopyType,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType): scala.Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: scala.Boolean): scala.Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: scala.Boolean, transpose: scala.Boolean): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: java.lang.String, copyType: officeDashJsLib.officeDashJsLibStrings.All): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(
    sourceRange: java.lang.String,
    copyType: officeDashJsLib.officeDashJsLibStrings.All,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(
    sourceRange: java.lang.String,
    copyType: officeDashJsLib.officeDashJsLibStrings.All,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: RangeAreas, copyType: officeDashJsLib.officeDashJsLibStrings.All): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(
    sourceRange: RangeAreas,
    copyType: officeDashJsLib.officeDashJsLibStrings.All,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(
    sourceRange: RangeAreas,
    copyType: officeDashJsLib.officeDashJsLibStrings.All,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(sourceRange: Range, copyType: officeDashJsLib.officeDashJsLibStrings.All): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(
    sourceRange: Range,
    copyType: officeDashJsLib.officeDashJsLibStrings.All,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_All(
    sourceRange: Range,
    copyType: officeDashJsLib.officeDashJsLibStrings.All,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: java.lang.String, copyType: officeDashJsLib.officeDashJsLibStrings.Formats): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(
    sourceRange: java.lang.String,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formats,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(
    sourceRange: java.lang.String,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formats,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: RangeAreas, copyType: officeDashJsLib.officeDashJsLibStrings.Formats): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(
    sourceRange: RangeAreas,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formats,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(
    sourceRange: RangeAreas,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formats,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(sourceRange: Range, copyType: officeDashJsLib.officeDashJsLibStrings.Formats): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(
    sourceRange: Range,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formats,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formats(
    sourceRange: Range,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formats,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: java.lang.String, copyType: officeDashJsLib.officeDashJsLibStrings.Formulas): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(
    sourceRange: java.lang.String,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formulas,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(
    sourceRange: java.lang.String,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formulas,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: RangeAreas, copyType: officeDashJsLib.officeDashJsLibStrings.Formulas): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(
    sourceRange: RangeAreas,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formulas,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(
    sourceRange: RangeAreas,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formulas,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(sourceRange: Range, copyType: officeDashJsLib.officeDashJsLibStrings.Formulas): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(
    sourceRange: Range,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formulas,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Formulas(
    sourceRange: Range,
    copyType: officeDashJsLib.officeDashJsLibStrings.Formulas,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: java.lang.String, copyType: officeDashJsLib.officeDashJsLibStrings.Values): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(
    sourceRange: java.lang.String,
    copyType: officeDashJsLib.officeDashJsLibStrings.Values,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(
    sourceRange: java.lang.String,
    copyType: officeDashJsLib.officeDashJsLibStrings.Values,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: RangeAreas, copyType: officeDashJsLib.officeDashJsLibStrings.Values): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(
    sourceRange: RangeAreas,
    copyType: officeDashJsLib.officeDashJsLibStrings.Values,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(
    sourceRange: RangeAreas,
    copyType: officeDashJsLib.officeDashJsLibStrings.Values,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(sourceRange: Range, copyType: officeDashJsLib.officeDashJsLibStrings.Values): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(
    sourceRange: Range,
    copyType: officeDashJsLib.officeDashJsLibStrings.Values,
    skipBlanks: scala.Boolean
  ): scala.Unit = js.native
  @JSName("copyFrom")
  def copyFrom_Values(
    sourceRange: Range,
    copyType: officeDashJsLib.officeDashJsLibStrings.Values,
    skipBlanks: scala.Boolean,
    transpose: scala.Boolean
  ): scala.Unit = js.native
  /**
    *
    * Returns a RangeAreas object that represents the entire columns of the RangeAreas (for example, if the current RangeAreas represents cells "B4:E11, H2", it returns a RangeAreas that represents columns "B:E, H:H").
    *
    * [Api set: ExcelApi 1.9]
    */
  def getEntireColumn(): RangeAreas = js.native
  /**
    *
    * Returns a RangeAreas object that represents the entire rows of the RangeAreas (for example, if the current RangeAreas represents cells "B4:E11", it returns a RangeAreas that represents rows "4:11").
    *
    * [Api set: ExcelApi 1.9]
    */
  def getEntireRow(): RangeAreas = js.native
  def getIntersection(anotherRange: java.lang.String): RangeAreas = js.native
  /**
    *
    * Returns the RangeAreas object that represents the intersection of the given ranges or RangeAreas. If no intersection is found, an ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param anotherRange The range, RangeAreas object or range address that will be used to determine the intersection.
    */
  def getIntersection(anotherRange: Range): RangeAreas = js.native
  def getIntersection(anotherRange: RangeAreas): RangeAreas = js.native
  def getIntersectionOrNullObject(anotherRange: java.lang.String): RangeAreas = js.native
  /**
    *
    * Returns the RangeAreas object that represents the intersection of the given ranges or RangeAreas. If no intersection is found, a null object is returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param anotherRange The range, RangeAreas, or address that will be used to determine the intersection.
    */
  def getIntersectionOrNullObject(anotherRange: Range): RangeAreas = js.native
  def getIntersectionOrNullObject(anotherRange: RangeAreas): RangeAreas = js.native
  /**
    *
    * Returns an RangeAreas object that is shifted by the specific row and column offset. The dimension of the returned RangeAreas will match the original object. If the resulting RangeAreas is forced outside the bounds of the worksheet grid, an error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param rowOffset The number of rows (positive, negative, or 0) by which the RangeAreas is to be offset. Positive values are offset downward, and negative values are offset upward.
    * @param columnOffset The number of columns (positive, negative, or 0) by which the RangeAreas is to be offset. Positive values are offset to the right, and negative values are offset to the left.
    */
  def getOffsetRangeAreas(rowOffset: scala.Double, columnOffset: scala.Double): RangeAreas = js.native
  /**
    *
    * Returns a RangeAreas object that represents all the cells that match the specified type and value. Throws an error if no special cells are found that match the criteria.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCells(cellType: SpecialCellType): RangeAreas = js.native
  def getSpecialCells(cellType: SpecialCellType, cellValueType: SpecialCellValueType): RangeAreas = js.native
  def getSpecialCells(
    cellType: officeDashJsLib.officeDashJsLibStrings.Blanks,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: officeDashJsLib.officeDashJsLibStrings.ConditionalFormats,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: officeDashJsLib.officeDashJsLibStrings.Constants,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: officeDashJsLib.officeDashJsLibStrings.DataValidations,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: officeDashJsLib.officeDashJsLibStrings.Formulas,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: officeDashJsLib.officeDashJsLibStrings.SameConditionalFormat,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: officeDashJsLib.officeDashJsLibStrings.SameDataValidation,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCells(
    cellType: officeDashJsLib.officeDashJsLibStrings.Visible,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  /**
    *
    * Returns a RangeAreas object that represents all the cells that match the specified type and value. Returns a null object if no special cells are found that match the criteria.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCellsOrNullObject(cellType: SpecialCellType): RangeAreas = js.native
  def getSpecialCellsOrNullObject(cellType: SpecialCellType, cellValueType: SpecialCellValueType): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: officeDashJsLib.officeDashJsLibStrings.Blanks,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: officeDashJsLib.officeDashJsLibStrings.ConditionalFormats,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: officeDashJsLib.officeDashJsLibStrings.Constants,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: officeDashJsLib.officeDashJsLibStrings.DataValidations,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: officeDashJsLib.officeDashJsLibStrings.Formulas,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: officeDashJsLib.officeDashJsLibStrings.SameConditionalFormat,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: officeDashJsLib.officeDashJsLibStrings.SameDataValidation,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  def getSpecialCellsOrNullObject(
    cellType: officeDashJsLib.officeDashJsLibStrings.Visible,
    cellValueType: officeDashJsLib.officeDashJsLibStrings.All | officeDashJsLib.officeDashJsLibStrings.Errors | officeDashJsLib.officeDashJsLibStrings.ErrorsLogical | officeDashJsLib.officeDashJsLibStrings.ErrorsNumbers | officeDashJsLib.officeDashJsLibStrings.ErrorsText | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalNumber | officeDashJsLib.officeDashJsLibStrings.ErrorsLogicalText | officeDashJsLib.officeDashJsLibStrings.ErrorsNumberText | officeDashJsLib.officeDashJsLibStrings.Logical | officeDashJsLib.officeDashJsLibStrings.LogicalNumbers | officeDashJsLib.officeDashJsLibStrings.LogicalText | officeDashJsLib.officeDashJsLibStrings.LogicalNumbersText | officeDashJsLib.officeDashJsLibStrings.Numbers | officeDashJsLib.officeDashJsLibStrings.NumbersText | officeDashJsLib.officeDashJsLibStrings.Text
  ): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_Blanks(cellType: officeDashJsLib.officeDashJsLibStrings.Blanks): RangeAreas = js.native
  /**
    *
    * Returns a RangeAreas object that represents all the cells that match the specified type and value. Returns a null object if no special cells are found that match the criteria.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_ConditionalFormats(cellType: officeDashJsLib.officeDashJsLibStrings.ConditionalFormats): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_Constants(cellType: officeDashJsLib.officeDashJsLibStrings.Constants): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_DataValidations(cellType: officeDashJsLib.officeDashJsLibStrings.DataValidations): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_Formulas(cellType: officeDashJsLib.officeDashJsLibStrings.Formulas): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_SameConditionalFormat(cellType: officeDashJsLib.officeDashJsLibStrings.SameConditionalFormat): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_SameDataValidation(cellType: officeDashJsLib.officeDashJsLibStrings.SameDataValidation): RangeAreas = js.native
  @JSName("getSpecialCellsOrNullObject")
  def getSpecialCellsOrNullObject_Visible(cellType: officeDashJsLib.officeDashJsLibStrings.Visible): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_Blanks(cellType: officeDashJsLib.officeDashJsLibStrings.Blanks): RangeAreas = js.native
  /**
    *
    * Returns a RangeAreas object that represents all the cells that match the specified type and value. Throws an error if no special cells are found that match the criteria.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  @JSName("getSpecialCells")
  def getSpecialCells_ConditionalFormats(cellType: officeDashJsLib.officeDashJsLibStrings.ConditionalFormats): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_Constants(cellType: officeDashJsLib.officeDashJsLibStrings.Constants): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_DataValidations(cellType: officeDashJsLib.officeDashJsLibStrings.DataValidations): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_Formulas(cellType: officeDashJsLib.officeDashJsLibStrings.Formulas): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_SameConditionalFormat(cellType: officeDashJsLib.officeDashJsLibStrings.SameConditionalFormat): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_SameDataValidation(cellType: officeDashJsLib.officeDashJsLibStrings.SameDataValidation): RangeAreas = js.native
  @JSName("getSpecialCells")
  def getSpecialCells_Visible(cellType: officeDashJsLib.officeDashJsLibStrings.Visible): RangeAreas = js.native
  /**
    *
    * Returns a scoped collection of tables that overlap with any range in this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param fullyContained If true, returns only tables that are fully contained within the range bounds. Default is false.
    */
  def getTables(): TableScopedCollection = js.native
  def getTables(fullyContained: scala.Boolean): TableScopedCollection = js.native
  /**
    *
    * Returns the used RangeAreas that comprises all the used areas of individual rectangular ranges in the RangeAreas object.
    If there are no used cells within the RangeAreas, the ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param valuesOnly Whether to only consider cells with values as used cells. Default is false.
    */
  def getUsedRangeAreas(): RangeAreas = js.native
  def getUsedRangeAreas(valuesOnly: scala.Boolean): RangeAreas = js.native
  /**
    *
    * Returns the used RangeAreas that comprises all the used areas of individual rectangular ranges in the RangeAreas object.
    If there are no used cells within the RangeAreas, a null object will be returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param valuesOnly Whether to only consider cells with values as used cells.
    */
  def getUsedRangeAreasOrNullObject(): RangeAreas = js.native
  def getUsedRangeAreasOrNullObject(valuesOnly: scala.Boolean): RangeAreas = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.RangeAreas` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.RangeAreas` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeAreas` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeAreas = js.native
  def load(option: java.lang.String): RangeAreas = js.native
  def load(option: js.Array[java.lang.String]): RangeAreas = js.native
  def load(option: officeDashJsLib.Anon_Expand): RangeAreas = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.RangeAreasLoadOptions): RangeAreas = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeAreas): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.RangeAreasUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.RangeAreasUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeAreas): scala.Unit = js.native
  /**
    *
    * Sets the RangeAreas to be recalculated when the next recalculation occurs.
    *
    * [Api set: ExcelApi 1.9]
    */
  def setDirty(): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeAreas object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeAreasData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.RangeAreasData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): RangeAreas = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): RangeAreas = js.native
}

