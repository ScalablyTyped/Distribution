package typings.officeUiFabricReact.stackTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typings.officeUiFabricReact.officeUiFabricReactStrings.initial
import typings.officeUiFabricReact.officeUiFabricReactStrings.unset
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricFoundation.anon.Slots
import typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.uifabricFoundation.libIcomponentMod.IStyleableComponentProps because var conflicts: className. Inlined styles, theme, tokens */ @js.native
trait IStackProps
  extends HTMLAttributes[HTMLElement]
     with IStackSlots
     with Slots[IStackSlots] {
  
  /**
    * Defines how to render the Stack.
    */
  var as: js.UndefOr[ElementType[HTMLAttributes[HTMLElement]]] = js.native
  
  /**
    * Defines whether Stack children should not shrink to fit the available space.
    * @defaultvalue false
    */
  var disableShrink: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the spacing between Stack children.
    * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
    * If 'column gap' is omitted, it's set to the same value as 'row gap'.
    * @deprecated Use `childrenGap` token in `IStackTokens` instead.
    */
  var gap: js.UndefOr[Double | String] = js.native
  
  /**
    * Defines how much to grow the Stack in proportion to its siblings.
    */
  var grow: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.native
  
  /**
    * Defines whether to render Stack children horizontally.
    * @defaultvalue false
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines how to align Stack children horizontally (along the x-axis).
    */
  var horizontalAlign: js.UndefOr[Alignment] = js.native
  
  /**
    * Defines the maximum height that the Stack can take.
    * @deprecated Use `maxHeight` token in `IStackTokens` instead.
    */
  var maxHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * Defines the maximum width that the Stack can take.
    * @deprecated Use `maxWidth` token in `IStackTokens` instead.
    */
  var maxWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Defines the inner padding of the Stack.
    * @deprecated Use `padding` token in `IStackTokens` instead.
    */
  var padding: js.UndefOr[Double | String] = js.native
  
  /**
    * Defines whether to render Stack children in the opposite direction (bottom-to-top if it's a vertical Stack and
    * right-to-left if it's a horizontal Stack).
    * @defaultvalue false
    */
  var reversed: js.UndefOr[Boolean] = js.native
  
  var styles: js.UndefOr[IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles]] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
  
  var tokens: js.UndefOr[ITokenFunctionOrObject[IStackProps, IStackTokens]] = js.native
  
  /**
    * Defines how to align Stack children vertically (along the y-axis).
    */
  var verticalAlign: js.UndefOr[Alignment] = js.native
  
  /**
    * Defines whether the Stack should take up 100% of the height of its parent.
    * This property is required to be set to true when using the `grow` flag on children in vertical oriented Stacks.
    * Stacks are rendered as block elements and grow horizontally to the container already.
    * @defaultvalue false
    */
  var verticalFill: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines whether Stack children should wrap onto multiple rows or columns when they are about to overflow
    * the size of the Stack.
    * @defaultvalue false
    */
  var wrap: js.UndefOr[Boolean] = js.native
}
object IStackProps {
  
  @scala.inline
  def apply(): IStackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackProps]
  }
  
  @scala.inline
  implicit class IStackPropsOps[Self <: IStackProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: ElementType[HTMLAttributes[HTMLElement]]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setDisableShrink(value: Boolean): Self = this.set("disableShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableShrink: Self = this.set("disableShrink", js.undefined)
    
    @scala.inline
    def setGap(value: Double | String): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setGrow(value: Boolean | Double | inherit | initial | unset): Self = this.set("grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrow: Self = this.set("grow", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setHorizontalAlign(value: Alignment): Self = this.set("horizontalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlign: Self = this.set("horizontalAlign", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    
    @scala.inline
    def setStylesFunction3(value: (IStackProps, /* theme */ ITheme, IStackTokens) => IStackStyles): Self = this.set("styles", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyles(value: IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTokens(value: ITokenFunctionOrObject[IStackProps, IStackTokens]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: Alignment): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setVerticalFill(value: Boolean): Self = this.set("verticalFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalFill: Self = this.set("verticalFill", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
