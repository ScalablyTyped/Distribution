package typings.officeUiFabricReact.detailsRowFieldsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.anon.kinkeyofPickIDetailsRowSt
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowFieldsProps extends IOverrideColumnRenderProps {
  /**
    * Style properties to customize cell render output.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /**
    * Index to start for the column
    */
  var columnStartIndex: Double
  /**
    * Columns metadata
    */
  var columns: js.Array[IColumn]
  /**
    * whether to render as a compact field
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
  /**
    * Data source for this component
    */
  var item: js.Any
  /**
    * The item index of the collection for the DetailsList
    */
  var itemIndex: Double
  /**
    * Subset of classnames currently generated in DetailsRow that are used within DetailsRowFields.
    */
  var rowClassNames: kinkeyofPickIDetailsRowSt
}

object IDetailsRowFieldsProps {
  @scala.inline
  def apply(
    columnStartIndex: Double,
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    rowClassNames: kinkeyofPickIDetailsRowSt,
    cellStyleProps: ICellStyleProps = null,
    cellsByColumn: StringDictionary[ReactNode] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined,
    getCellValueKey: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String = null,
    onRenderItemColumn: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactNode = null
  ): IDetailsRowFieldsProps = {
    val __obj = js.Dynamic.literal(columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], rowClassNames = rowClassNames.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (cellsByColumn != null) __obj.updateDynamic("cellsByColumn")(cellsByColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations.get.asInstanceOf[js.Any])
    if (getCellValueKey != null) __obj.updateDynamic("getCellValueKey")(js.Any.fromFunction3(getCellValueKey))
    if (onRenderItemColumn != null) __obj.updateDynamic("onRenderItemColumn")(js.Any.fromFunction3(onRenderItemColumn))
    __obj.asInstanceOf[IDetailsRowFieldsProps]
  }
}

