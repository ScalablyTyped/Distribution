package typings.officeUiFabricReact.detailsRowFieldsTypesMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'onRenderItemColumn' | 'getCellValueKey' ]: office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps[P]}
- Dropped {[ P in 'cellsByColumn' ]: office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowProps[P]} */ trait IDetailsRowFieldsProps extends js.Object {
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
  var rowClassNames: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowStyles, 'isMultiline' | 'isRowHeader' | 'cell' | 'cellAnimation' | 'cellPadded' | 'cellUnpadded' | 'fields'> ]: string}
    */ typings.officeUiFabricReact.officeUiFabricReactStrings.IDetailsRowFieldsProps with js.Any
}

object IDetailsRowFieldsProps {
  @scala.inline
  def apply(
    columnStartIndex: Double,
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    rowClassNames: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowStyles, 'isMultiline' | 'isRowHeader' | 'cell' | 'cellAnimation' | 'cellPadded' | 'cellUnpadded' | 'fields'> ]: string}
    */ typings.officeUiFabricReact.officeUiFabricReactStrings.IDetailsRowFieldsProps with js.Any,
    cellStyleProps: ICellStyleProps = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
  ): IDetailsRowFieldsProps = {
    val __obj = js.Dynamic.literal(columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], rowClassNames = rowClassNames.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowFieldsProps]
  }
}

