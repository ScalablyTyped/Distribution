package typings.officeUiFabricReact.detailsRowFieldsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.IDetailsListProps, 'onRenderItemColumn' | 'getCellValueKey'> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.IDetailsRowProps, 'cellsByColumn'> */
trait IOverrideColumnRenderProps extends js.Object {
  var cellsByColumn: js.UndefOr[StringDictionary[ReactNode]] = js.undefined
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.undefined
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      ReactNode
    ]
  ] = js.undefined
}

object IOverrideColumnRenderProps {
  @scala.inline
  def apply(
    cellsByColumn: StringDictionary[ReactNode] = null,
    getCellValueKey: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String = null,
    onRenderItemColumn: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactNode = null
  ): IOverrideColumnRenderProps = {
    val __obj = js.Dynamic.literal()
    if (cellsByColumn != null) __obj.updateDynamic("cellsByColumn")(cellsByColumn.asInstanceOf[js.Any])
    if (getCellValueKey != null) __obj.updateDynamic("getCellValueKey")(js.Any.fromFunction3(getCellValueKey))
    if (onRenderItemColumn != null) __obj.updateDynamic("onRenderItemColumn")(js.Any.fromFunction3(onRenderItemColumn))
    __obj.asInstanceOf[IOverrideColumnRenderProps]
  }
}

