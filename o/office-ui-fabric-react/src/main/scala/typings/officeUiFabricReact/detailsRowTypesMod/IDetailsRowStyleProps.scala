package typings.officeUiFabricReact.detailsRowTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowProps, 'theme'>> & {  isSelected :boolean | undefined,   anySelected :boolean | undefined,   canSelect :boolean | undefined,   droppingClassName :string | undefined,   isCheckVisible :boolean | undefined,   isRowHeader :boolean | undefined,   checkboxCellClassName :string | undefined,   className :string | undefined,   compact :boolean | undefined,   cellStyleProps :office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.ICellStyleProps | undefined,   enableUpdateAnimations :boolean | undefined} */
@js.native
trait IDetailsRowStyleProps extends js.Object {
  
  /** Whether there are any rows in the list selected */
  var anySelected: js.UndefOr[Boolean] = js.native
  
  /** Whether this row can be selected */
  var canSelect: js.UndefOr[Boolean] = js.native
  
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  
  /** A class name from the checkbox cell, so proper styling can be targeted */
  var checkboxCellClassName: js.UndefOr[String] = js.native
  
  /** CSS class name for the component */
  var className: js.UndefOr[String] = js.native
  
  /** Is list in compact mode */
  var compact: js.UndefOr[Boolean] = js.native
  
  /** Class name of when this becomes a drop target. */
  var droppingClassName: js.UndefOr[String] = js.native
  
  /** Whether to animate updates */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.native
  
  /** Is the checkbox visible */
  var isCheckVisible: js.UndefOr[Boolean] = js.native
  
  /** Is this a row header */
  var isRowHeader: js.UndefOr[Boolean] = js.native
  
  /** Whether the row is selected  */
  var isSelected: js.UndefOr[Boolean] = js.native
  
  var theme: ITheme = js.native
}
object IDetailsRowStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IDetailsRowStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowStyleProps]
  }
  
  @scala.inline
  implicit class IDetailsRowStylePropsOps[Self <: IDetailsRowStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnySelected(value: Boolean): Self = this.set("anySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnySelected: Self = this.set("anySelected", js.undefined)
    
    @scala.inline
    def setCanSelect(value: Boolean): Self = this.set("canSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSelect: Self = this.set("canSelect", js.undefined)
    
    @scala.inline
    def setCellStyleProps(value: ICellStyleProps): Self = this.set("cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellStyleProps: Self = this.set("cellStyleProps", js.undefined)
    
    @scala.inline
    def setCheckboxCellClassName(value: String): Self = this.set("checkboxCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxCellClassName: Self = this.set("checkboxCellClassName", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setDroppingClassName(value: String): Self = this.set("droppingClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDroppingClassName: Self = this.set("droppingClassName", js.undefined)
    
    @scala.inline
    def setEnableUpdateAnimations(value: Boolean): Self = this.set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableUpdateAnimations: Self = this.set("enableUpdateAnimations", js.undefined)
    
    @scala.inline
    def setIsCheckVisible(value: Boolean): Self = this.set("isCheckVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCheckVisible: Self = this.set("isCheckVisible", js.undefined)
    
    @scala.inline
    def setIsRowHeader(value: Boolean): Self = this.set("isRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRowHeader: Self = this.set("isRowHeader", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
  }
}
