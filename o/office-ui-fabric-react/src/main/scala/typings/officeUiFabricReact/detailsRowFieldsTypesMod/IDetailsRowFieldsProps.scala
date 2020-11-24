package typings.officeUiFabricReact.detailsRowFieldsTypesMod

import typings.officeUiFabricReact.anon.kinkeyofPickIDetailsRowSt
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsRowFieldsProps extends IOverrideColumnRenderProps {
  
  /**
    * Style properties to customize cell render output.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  
  /**
    * Index to start for the column
    */
  var columnStartIndex: Double = js.native
  
  /**
    * Columns metadata
    */
  var columns: js.Array[IColumn] = js.native
  
  /**
    * whether to render as a compact field
    */
  var compact: js.UndefOr[Boolean] = js.native
  
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.native
  
  /**
    * Data source for this component
    */
  var item: js.Any = js.native
  
  /**
    * The item index of the collection for the DetailsList
    */
  var itemIndex: Double = js.native
  
  /**
    * Subset of classnames currently generated in DetailsRow that are used within DetailsRowFields.
    */
  var rowClassNames: kinkeyofPickIDetailsRowSt = js.native
}
object IDetailsRowFieldsProps {
  
  @scala.inline
  def apply(
    columnStartIndex: Double,
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    rowClassNames: kinkeyofPickIDetailsRowSt
  ): IDetailsRowFieldsProps = {
    val __obj = js.Dynamic.literal(columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], rowClassNames = rowClassNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowFieldsProps]
  }
  
  @scala.inline
  implicit class IDetailsRowFieldsPropsOps[Self <: IDetailsRowFieldsProps] (val x: Self) extends AnyVal {
    
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
    def setColumnStartIndex(value: Double): Self = this.set("columnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: IColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowClassNames(value: kinkeyofPickIDetailsRowSt): Self = this.set("rowClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStyleProps(value: ICellStyleProps): Self = this.set("cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellStyleProps: Self = this.set("cellStyleProps", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setEnableUpdateAnimations(value: Boolean): Self = this.set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableUpdateAnimations: Self = this.set("enableUpdateAnimations", js.undefined)
  }
}
