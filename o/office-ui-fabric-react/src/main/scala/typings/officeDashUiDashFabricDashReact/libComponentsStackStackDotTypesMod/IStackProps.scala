package typings.officeDashUiDashFabricDashReact.libComponentsStackStackDotTypesMod

import typings.atUifabricFoundation.Anon_Slots
import typings.atUifabricFoundation.libIComponentMod.IStylesFunctionOrObject
import typings.atUifabricFoundation.libIComponentMod.ITokenFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.inherit
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.initial
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.unset
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atUifabricFoundation.libIComponentMod.IStyleableComponentProps because var conflicts: className. Inlined styles, theme, tokens */ trait IStackProps
  extends HTMLAttributes[HTMLElement]
     with IStackSlots
     with Anon_Slots[IStackSlots] {
  /**
    * Defines how to render the Stack.
    */
  var as: js.UndefOr[ReactType[HTMLAttributes[HTMLElement]]] = js.undefined
  /**
    * Defines whether Stack children should not shrink to fit the available space.
    * @defaultvalue false
    */
  var disableShrink: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the spacing between Stack children.
    * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
    * If 'column gap' is omitted, it's set to the same value as 'row gap'.
    * @deprecated Use 'childrenGap' token instead.
    */
  var gap: js.UndefOr[Double | String] = js.undefined
  /**
    * Defines how much to grow the Stack in proportion to its siblings.
    */
  var grow: js.UndefOr[Boolean | Double | inherit | initial | unset] = js.undefined
  /**
    * Defines whether to render Stack children horizontally.
    * @defaultvalue false
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines how to align Stack children horizontally (along the x-axis).
    */
  var horizontalAlign: js.UndefOr[Alignment] = js.undefined
  /**
    * Defines the maximum height that the Stack can take.
    * @deprecated Use 'maxHeight' token instead.
    */
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  /**
    * Defines the maximum width that the Stack can take.
    * @deprecated Use 'maxWidth' token instead.
    */
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  /**
    * Defines the inner padding of the Stack.
    * @deprecated Use 'padding' token instead.
    */
  var padding: js.UndefOr[Double | String] = js.undefined
  /**
    * Defines whether to render Stack children in the opposite direction (bottom-to-top if it's a vertical Stack and
    * right-to-left if it's a horizontal Stack).
    * @defaultvalue false
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  var tokens: js.UndefOr[ITokenFunctionOrObject[IStackProps, IStackTokens]] = js.undefined
  /**
    * Defines how to align Stack children vertically (along the y-axis).
    */
  var verticalAlign: js.UndefOr[Alignment] = js.undefined
  /**
    * Defines whether the Stack should take up 100% of the height of its parent.
    * This property is required to be set to true when using the `grow` flag on children in vertical oriented Stacks.
    * Stacks are rendered as block elements and grow horizontally to the container already.
    * @defaultvalue false
    */
  var verticalFill: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether Stack children should wrap onto multiple rows or columns when they are about to overflow
    * the size of the Stack.
    * @defaultvalue false
    */
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object IStackProps {
  @scala.inline
  def apply(
    Anon_Slots: Anon_Slots[IStackSlots] = null,
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    IStackSlots: IStackSlots = null,
    as: ReactType[HTMLAttributes[HTMLElement]] = null,
    disableShrink: js.UndefOr[Boolean] = js.undefined,
    gap: Double | String = null,
    grow: Boolean | Double | inherit | initial | unset = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    horizontalAlign: Alignment = null,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    padding: Double | String = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    styles: IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles] = null,
    theme: ITheme = null,
    tokens: ITokenFunctionOrObject[IStackProps, IStackTokens] = null,
    verticalAlign: Alignment = null,
    verticalFill: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): IStackProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Anon_Slots)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IStackSlots)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(disableShrink)) __obj.updateDynamic("disableShrink")(disableShrink)
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (grow != null) __obj.updateDynamic("grow")(grow.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (horizontalAlign != null) __obj.updateDynamic("horizontalAlign")(horizontalAlign)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (!js.isUndefined(verticalFill)) __obj.updateDynamic("verticalFill")(verticalFill)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[IStackProps]
  }
}

