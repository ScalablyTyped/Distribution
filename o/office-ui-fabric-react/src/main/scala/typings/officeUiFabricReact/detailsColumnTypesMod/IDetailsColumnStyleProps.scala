package typings.officeUiFabricReact.detailsColumnTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsColumn.types.IDetailsColumnProps, 'theme' | 'cellStyleProps'>> & {  headerClassName :string | undefined,   isActionable :boolean | undefined,   isEmpty :boolean | undefined,   isIconVisible :boolean | undefined,   isPadded :boolean | undefined,   isIconOnly :boolean | undefined,   iconClassName :string | undefined,   transitionDurationDrag :number | undefined,   transitionDurationDrop :number | undefined} */
@js.native
trait IDetailsColumnStyleProps extends js.Object {
  
  var cellStyleProps: ICellStyleProps = js.native
  
  /**
    * Classname to provide for header region.
    */
  var headerClassName: js.UndefOr[String] = js.native
  
  /**
    * Classname to provide for the header's icon region.
    */
  var iconClassName: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the column is actionable.
    */
  var isActionable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the column contains contents.
    */
  var isEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the column has icon only content/
    */
  var isIconOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the column has a visible icon.
    */
  var isIconVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the column is padded.
    */
  var isPadded: js.UndefOr[Boolean] = js.native
  
  var theme: ITheme = js.native
  
  /**
    * CSS transition duration on drag event.
    */
  var transitionDurationDrag: js.UndefOr[Double] = js.native
  
  /**
    * CSS transition duration on drop event.
    */
  var transitionDurationDrop: js.UndefOr[Double] = js.native
}
object IDetailsColumnStyleProps {
  
  @scala.inline
  def apply(cellStyleProps: ICellStyleProps, theme: ITheme): IDetailsColumnStyleProps = {
    val __obj = js.Dynamic.literal(cellStyleProps = cellStyleProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsColumnStyleProps]
  }
  
  @scala.inline
  implicit class IDetailsColumnStylePropsOps[Self <: IDetailsColumnStyleProps] (val x: Self) extends AnyVal {
    
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
    def setCellStyleProps(value: ICellStyleProps): Self = this.set("cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    
    @scala.inline
    def setIconClassName(value: String): Self = this.set("iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClassName: Self = this.set("iconClassName", js.undefined)
    
    @scala.inline
    def setIsActionable(value: Boolean): Self = this.set("isActionable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActionable: Self = this.set("isActionable", js.undefined)
    
    @scala.inline
    def setIsEmpty(value: Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEmpty: Self = this.set("isEmpty", js.undefined)
    
    @scala.inline
    def setIsIconOnly(value: Boolean): Self = this.set("isIconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIconOnly: Self = this.set("isIconOnly", js.undefined)
    
    @scala.inline
    def setIsIconVisible(value: Boolean): Self = this.set("isIconVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIconVisible: Self = this.set("isIconVisible", js.undefined)
    
    @scala.inline
    def setIsPadded(value: Boolean): Self = this.set("isPadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPadded: Self = this.set("isPadded", js.undefined)
    
    @scala.inline
    def setTransitionDurationDrag(value: Double): Self = this.set("transitionDurationDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDurationDrag: Self = this.set("transitionDurationDrag", js.undefined)
    
    @scala.inline
    def setTransitionDurationDrop(value: Double): Self = this.set("transitionDurationDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDurationDrop: Self = this.set("transitionDurationDrop", js.undefined)
  }
}
