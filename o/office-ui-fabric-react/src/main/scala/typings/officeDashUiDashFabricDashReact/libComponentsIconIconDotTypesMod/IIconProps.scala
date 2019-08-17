package typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.IImageProps
import typings.react.reactMod.ComponentType
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconProps
  extends HTMLAttributes[HTMLElement]
     with IBaseProps[js.Any] {
  /**
    * The aria label of the icon for the benefit of screen readers.
    * @deprecated Use the native prop `aria-label`
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The name of the icon to use from the icon font.
    * If string is empty, a placeholder icon will be rendered the same width as an icon.
    */
  var iconName: js.UndefOr[String] = js.undefined
  /**
    * The type of icon to render (image or icon font).
    * @deprecated Inferred based on the presence of `imageProps`
    */
  var iconType: js.UndefOr[IconType] = js.undefined
  /**
    * If rendering an image icon, this component will be rendered in the event that loading the image fails.
    */
  var imageErrorAs: js.UndefOr[ComponentType[IImageProps]] = js.undefined
  /**
    * If rendering an image icon, these props will be passed to the Image component.
    */
  var imageProps: js.UndefOr[IImageProps] = js.undefined
  /**
    * Gets the styles for an Icon.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IIconStyleProps, IIconStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IIconProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    IBaseProps: IBaseProps[js.Any] = null,
    ariaLabel: String = null,
    iconName: String = null,
    iconType: IconType = null,
    imageErrorAs: ComponentType[IImageProps] = null,
    imageProps: IImageProps = null,
    styles: IStyleFunctionOrObject[IIconStyleProps, IIconStyles] = null,
    theme: ITheme = null
  ): IIconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IBaseProps)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (iconName != null) __obj.updateDynamic("iconName")(iconName)
    if (iconType != null) __obj.updateDynamic("iconType")(iconType)
    if (imageErrorAs != null) __obj.updateDynamic("imageErrorAs")(imageErrorAs.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IIconProps]
  }
}

