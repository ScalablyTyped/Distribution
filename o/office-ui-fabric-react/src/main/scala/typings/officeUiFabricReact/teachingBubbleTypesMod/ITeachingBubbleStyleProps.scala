package typings.officeUiFabricReact.teachingBubbleTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'hasCondensedHeadline' | 'hasSmallHeadline' | 'isWide'> & {  calloutProps :office-ui-fabric-react.office-ui-fabric-react/lib/Callout.ICalloutContentStyleProps | undefined,   primaryButtonClassName :string | undefined,   secondaryButtonClassName :string | undefined,   hasCloseButton :boolean | undefined,   hasHeadline :boolean | undefined} */
@js.native
trait ITeachingBubbleStyleProps extends js.Object {
  
  /** Style props for callout. */
  var calloutProps: js.UndefOr[ICalloutContentStyleProps] = js.native
  
  /** If the close button is visible. */
  var hasCloseButton: js.UndefOr[Boolean] = js.native
  
  var hasCondensedHeadline: js.UndefOr[Boolean] = js.native
  
  /** If a headline has been specified. */
  var hasHeadline: js.UndefOr[Boolean] = js.native
  
  var hasSmallHeadline: js.UndefOr[Boolean] = js.native
  
  var isWide: js.UndefOr[Boolean] = js.native
  
  /** Class name for primary button. */
  var primaryButtonClassName: js.UndefOr[String] = js.native
  
  /** Class name for secondary button. */
  var secondaryButtonClassName: js.UndefOr[String] = js.native
  
  var theme: ITheme = js.native
}
object ITeachingBubbleStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): ITeachingBubbleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleStyleProps]
  }
  
  @scala.inline
  implicit class ITeachingBubbleStylePropsOps[Self <: ITeachingBubbleStyleProps] (val x: Self) extends AnyVal {
    
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
    def setCalloutProps(value: ICalloutContentStyleProps): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutProps: Self = this.set("calloutProps", js.undefined)
    
    @scala.inline
    def setHasCloseButton(value: Boolean): Self = this.set("hasCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCloseButton: Self = this.set("hasCloseButton", js.undefined)
    
    @scala.inline
    def setHasCondensedHeadline(value: Boolean): Self = this.set("hasCondensedHeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCondensedHeadline: Self = this.set("hasCondensedHeadline", js.undefined)
    
    @scala.inline
    def setHasHeadline(value: Boolean): Self = this.set("hasHeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasHeadline: Self = this.set("hasHeadline", js.undefined)
    
    @scala.inline
    def setHasSmallHeadline(value: Boolean): Self = this.set("hasSmallHeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSmallHeadline: Self = this.set("hasSmallHeadline", js.undefined)
    
    @scala.inline
    def setIsWide(value: Boolean): Self = this.set("isWide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWide: Self = this.set("isWide", js.undefined)
    
    @scala.inline
    def setPrimaryButtonClassName(value: String): Self = this.set("primaryButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryButtonClassName: Self = this.set("primaryButtonClassName", js.undefined)
    
    @scala.inline
    def setSecondaryButtonClassName(value: String): Self = this.set("secondaryButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryButtonClassName: Self = this.set("secondaryButtonClassName", js.undefined)
  }
}
