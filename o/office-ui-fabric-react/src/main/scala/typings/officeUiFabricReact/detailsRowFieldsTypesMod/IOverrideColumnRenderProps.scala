package typings.officeUiFabricReact.detailsRowFieldsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.IDetailsListProps, 'onRenderItemColumn' | 'getCellValueKey'> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.IDetailsRowProps, 'cellsByColumn'> */
@js.native
trait IOverrideColumnRenderProps extends js.Object {
  
  var cellsByColumn: js.UndefOr[StringDictionary[ReactNode]] = js.native
  
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.native
  
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      ReactNode
    ]
  ] = js.native
}
object IOverrideColumnRenderProps {
  
  @scala.inline
  def apply(): IOverrideColumnRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverrideColumnRenderProps]
  }
  
  @scala.inline
  implicit class IOverrideColumnRenderPropsOps[Self <: IOverrideColumnRenderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellsByColumn(value: StringDictionary[ReactNode]): Self = this.set("cellsByColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellsByColumn: Self = this.set("cellsByColumn", js.undefined)
    
    @scala.inline
    def setGetCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = this.set("getCellValueKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetCellValueKey: Self = this.set("getCellValueKey", js.undefined)
    
    @scala.inline
    def setOnRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactNode
    ): Self = this.set("onRenderItemColumn", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRenderItemColumn: Self = this.set("onRenderItemColumn", js.undefined)
  }
}
