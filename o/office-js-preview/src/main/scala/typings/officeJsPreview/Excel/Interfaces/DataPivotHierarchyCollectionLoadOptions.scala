package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of DataPivotHierarchy items associated with the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
trait DataPivotHierarchyCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Determines whether the data should be shown as a specific summary calculation or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Determines whether to show all items of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[Boolean] = js.undefined
}

object DataPivotHierarchyCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    field: PivotFieldLoadOptions = null,
    id: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    numberFormat: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined,
    showAs: js.UndefOr[Boolean] = js.undefined,
    summarizeBy: js.UndefOr[Boolean] = js.undefined
  ): DataPivotHierarchyCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showAs)) __obj.updateDynamic("showAs")(showAs.asInstanceOf[js.Any])
    if (!js.isUndefined(summarizeBy)) __obj.updateDynamic("summarizeBy")(summarizeBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPivotHierarchyCollectionLoadOptions]
  }
}

