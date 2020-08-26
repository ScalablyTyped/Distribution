package typings.officeUiFabricReact.detailsHeaderTypesMod

import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types.IDetailsHeaderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.types.IDetailsHeaderProps, 'className'> & {  isSelectAllHidden :boolean | undefined,   isAllSelected :boolean | undefined,   isResizingColumn :boolean | undefined,   isAllCollapsed :boolean | undefined,   isSizing :boolean | undefined,   isCheckboxHidden :boolean | undefined,   cellStyleProps :office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.ICellStyleProps | undefined} */
@js.native
trait IDetailsHeaderStyleProps extends js.Object {
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  var className: js.UndefOr[String] = js.native
  /** Are all columns collapsed */
  var isAllCollapsed: js.UndefOr[Boolean] = js.native
  /** Whether the "select all" checkbox is checked */
  var isAllSelected: js.UndefOr[Boolean] = js.native
  /** Whether checkbox is hidden  */
  var isCheckboxHidden: js.UndefOr[Boolean] = js.native
  /** Is column being resized */
  var isResizingColumn: js.UndefOr[Boolean] = js.native
  /** Whether to hide select all checkbox */
  var isSelectAllHidden: js.UndefOr[Boolean] = js.native
  /** Whether the header is sizing */
  var isSizing: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
}

object IDetailsHeaderStyleProps {
  @scala.inline
  def apply(theme: ITheme): IDetailsHeaderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsHeaderStyleProps]
  }
  @scala.inline
  implicit class IDetailsHeaderStylePropsOps[Self <: IDetailsHeaderStyleProps] (val x: Self) extends AnyVal {
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
    def setCellStyleProps(value: ICellStyleProps): Self = this.set("cellStyleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellStyleProps: Self = this.set("cellStyleProps", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIsAllCollapsed(value: Boolean): Self = this.set("isAllCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAllCollapsed: Self = this.set("isAllCollapsed", js.undefined)
    @scala.inline
    def setIsAllSelected(value: Boolean): Self = this.set("isAllSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAllSelected: Self = this.set("isAllSelected", js.undefined)
    @scala.inline
    def setIsCheckboxHidden(value: Boolean): Self = this.set("isCheckboxHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCheckboxHidden: Self = this.set("isCheckboxHidden", js.undefined)
    @scala.inline
    def setIsResizingColumn(value: Boolean): Self = this.set("isResizingColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResizingColumn: Self = this.set("isResizingColumn", js.undefined)
    @scala.inline
    def setIsSelectAllHidden(value: Boolean): Self = this.set("isSelectAllHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelectAllHidden: Self = this.set("isSelectAllHidden", js.undefined)
    @scala.inline
    def setIsSizing(value: Boolean): Self = this.set("isSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSizing: Self = this.set("isSizing", js.undefined)
  }
  
}

