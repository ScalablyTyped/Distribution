package typings.officeDashUiDashFabricDashReact.libComponentsTextTextDotTypesMod

import typings.atUifabricFoundation.Anon_Slots
import typings.atUifabricFoundation.libIComponentMod.IStylesFunctionOrObject
import typings.atUifabricFoundation.libIComponentMod.ITokenFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atUifabricFoundation.libIComponentMod.IStyleableComponentProps because var conflicts: className. Inlined styles, theme, tokens */ trait ITextProps
  extends HTMLAttributes[HTMLElement]
     with ITextSlots
     with Anon_Slots[ITextSlots] {
  /**
    * Optionally render the component as another component type or primitive.
    */
  var as: js.UndefOr[ReactType[HTMLAttributes[HTMLElement]]] = js.undefined
  /**
    * Whether the text is displayed as a block element.
    *
    * Note that in order for ellipsis on overflow to work properly,
    * `block` and `nowrap` should be set to true.
    */
  var block: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the text is not wrapped.
    *
    * Note that in order for ellipsis on overflow to work properly,
    * `block` and `nowrap` should be set to true.
    */
  var nowrap: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  var tokens: js.UndefOr[ITokenFunctionOrObject[ITextProps, ITextTokens]] = js.undefined
  /**
    * Optional font type for Text.
    */
  var variant: js.UndefOr[String] = js.undefined
}

object ITextProps {
  @scala.inline
  def apply(
    Anon_Slots: Anon_Slots[ITextSlots] = null,
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    ITextSlots: ITextSlots = null,
    as: ReactType[HTMLAttributes[HTMLElement]] = null,
    block: js.UndefOr[Boolean] = js.undefined,
    nowrap: js.UndefOr[Boolean] = js.undefined,
    styles: IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles] = null,
    theme: ITheme = null,
    tokens: ITokenFunctionOrObject[ITextProps, ITextTokens] = null,
    variant: String = null
  ): ITextProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Anon_Slots)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ITextSlots)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (!js.isUndefined(nowrap)) __obj.updateDynamic("nowrap")(nowrap)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[ITextProps]
  }
}

