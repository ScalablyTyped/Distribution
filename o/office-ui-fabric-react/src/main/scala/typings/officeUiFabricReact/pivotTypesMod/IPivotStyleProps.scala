package typings.officeUiFabricReact.pivotTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'className'> & {  rootIsLarge :boolean | undefined,   rootIsTabs :boolean | undefined,   linkIsSelected :boolean | undefined} */
@js.native
trait IPivotStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  /**
    * Indicates whether Pivot link is selected.
    * @deprecated Is not populated with valid value. Specify `linkIsSelected` styling instead.
    */
  var linkIsSelected: js.UndefOr[Boolean] = js.native
  /** Indicates whether Pivot has large format. */
  var rootIsLarge: js.UndefOr[Boolean] = js.native
  /** Indicates whether Pivot has tabbed format. */
  var rootIsTabs: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
}

object IPivotStyleProps {
  @scala.inline
  def apply(theme: ITheme): IPivotStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPivotStyleProps]
  }
  @scala.inline
  implicit class IPivotStylePropsOps[Self <: IPivotStyleProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setLinkIsSelected(value: Boolean): Self = this.set("linkIsSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkIsSelected: Self = this.set("linkIsSelected", js.undefined)
    @scala.inline
    def setRootIsLarge(value: Boolean): Self = this.set("rootIsLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootIsLarge: Self = this.set("rootIsLarge", js.undefined)
    @scala.inline
    def setRootIsTabs(value: Boolean): Self = this.set("rootIsTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootIsTabs: Self = this.set("rootIsTabs", js.undefined)
  }
  
}

