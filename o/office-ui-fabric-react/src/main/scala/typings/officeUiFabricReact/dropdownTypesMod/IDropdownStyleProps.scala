package typings.officeUiFabricReact.dropdownTypesMod

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Dropdown/Dropdown.types.IDropdownProps, 'theme' | 'className' | 'disabled' | 'required'> & {  hasError :boolean,   hasLabel :boolean,   isOpen :boolean,   isRenderingPlaceholder :boolean,   panelClassName :string | undefined,   calloutClassName :string | undefined,   calloutRenderEdge :office-ui-fabric-react.office-ui-fabric-react/lib/utilities/positioning.RectangleEdge | undefined} */
@js.native
trait IDropdownStyleProps extends js.Object {
  /**
    * Custom className for the callout that displays in larger viewports, hosting the Dropdown options.
    * This is primarily provided for backwards compatibility.
    */
  var calloutClassName: js.UndefOr[String] = js.native
  /**
    * Which edge the dropdown callout was positioned on relative to the title.
    */
  var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the dropdown is in an error state.
    */
  var hasError: Boolean = js.native
  /**
    * Specifies if the dropdown has label content.
    */
  var hasLabel: Boolean = js.native
  /**
    * Whether the dropdown is in an opened state.
    */
  var isOpen: Boolean = js.native
  /**
    * Whether the dropdown is currently rendering placeholder text instead of a selected option.
    */
  var isRenderingPlaceholder: Boolean = js.native
  /**
    * Custom className for the panel that displays in small viewports, hosting the Dropdown options.
    * This is primarily provided for backwards compatibility.
    */
  var panelClassName: js.UndefOr[String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[ITheme] = js.native
}

object IDropdownStyleProps {
  @scala.inline
  def apply(hasError: Boolean, hasLabel: Boolean, isOpen: Boolean, isRenderingPlaceholder: Boolean): IDropdownStyleProps = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], hasLabel = hasLabel.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isRenderingPlaceholder = isRenderingPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownStyleProps]
  }
  @scala.inline
  implicit class IDropdownStylePropsOps[Self <: IDropdownStyleProps] (val x: Self) extends AnyVal {
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
    def setHasError(value: Boolean): Self = this.set("hasError", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasLabel(value: Boolean): Self = this.set("hasLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRenderingPlaceholder(value: Boolean): Self = this.set("isRenderingPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalloutClassName(value: String): Self = this.set("calloutClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutClassName: Self = this.set("calloutClassName", js.undefined)
    @scala.inline
    def setCalloutRenderEdge(value: RectangleEdge): Self = this.set("calloutRenderEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutRenderEdge: Self = this.set("calloutRenderEdge", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setPanelClassName(value: String): Self = this.set("panelClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelClassName: Self = this.set("panelClassName", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

