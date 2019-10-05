package typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.Anon_HeightWidth
import typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDotTypesMod.IChoiceGroupOptionStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDotTypesMod.IChoiceGroupOptionStyles
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupOption extends InputHTMLAttributes[HTMLElement | HTMLInputElement] {
  /**
    * The aria label of the ChoiceGroupOption for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The Icon component props for choice field
    */
  var iconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * The alt of image for choice field. Defaults to '' if not set.
    */
  var imageAlt: js.UndefOr[String] = js.undefined
  /**
    * The width and height of the image in px for choice field.
    * @defaultvalue \{ width: 32, height: 32 \}
    */
  var imageSize: js.UndefOr[Anon_HeightWidth] = js.undefined
  /**
    * The src of image for choice field.
    */
  var imageSrc: js.UndefOr[String] = js.undefined
  /**
    * A required key to uniquely identify the option.
    */
  var key: String
  /**
    * DOM id to tag the ChoiceGroup label with, for reference.
    * Should be used for 'aria-owns' and other such uses, rather than direct reference for programmatic purposes.
    */
  var labelId: js.UndefOr[String] = js.undefined
  /**
    * Optional override of option render
    */
  var onRenderField: js.UndefOr[IRenderFunction[IChoiceGroupOption]] = js.undefined
  /**
    * Optional override of label render
    */
  var onRenderLabel: js.UndefOr[js.Function1[/* option */ IChoiceGroupOption, Element]] = js.undefined
  /**
    * The src of image for choice field which is selected.
    */
  var selectedImageSrc: js.UndefOr[String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles]] = js.undefined
  /**
    * The text string for the option.
    */
  var text: String
}

object IChoiceGroupOption {
  @scala.inline
  def apply(
    key: String,
    text: String,
    InputHTMLAttributes: InputHTMLAttributes[HTMLElement | HTMLInputElement] = null,
    ariaLabel: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    iconProps: IIconProps = null,
    id: String = null,
    imageAlt: String = null,
    imageSize: Anon_HeightWidth = null,
    imageSrc: String = null,
    labelId: String = null,
    onRenderField: (/* props */ js.UndefOr[IChoiceGroupOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IChoiceGroupOption], Element | Null]]) => Element | Null = null,
    onRenderLabel: /* option */ IChoiceGroupOption => Element = null,
    selectedImageSrc: String = null,
    styles: IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles] = null
  ): IChoiceGroupOption = {
    val __obj = js.Dynamic.literal(key = key, text = text)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt)
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize)
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc)
    if (labelId != null) __obj.updateDynamic("labelId")(labelId)
    if (onRenderField != null) __obj.updateDynamic("onRenderField")(js.Any.fromFunction2(onRenderField))
    if (onRenderLabel != null) __obj.updateDynamic("onRenderLabel")(js.Any.fromFunction1(onRenderLabel))
    if (selectedImageSrc != null) __obj.updateDynamic("selectedImageSrc")(selectedImageSrc)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupOption]
  }
}

