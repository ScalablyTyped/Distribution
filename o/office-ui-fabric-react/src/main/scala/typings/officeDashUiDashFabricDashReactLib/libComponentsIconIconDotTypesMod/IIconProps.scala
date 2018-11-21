package typings
package officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IIconProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]
     with atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[js.Any] {
  /**
       * The aria label of the button for the benefit of screen readers.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the icon to use from the icon font. If string is empty, a placeholder icon will be rendered the same width as an icon
       */
  var iconName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The type of icon to render (image or icon font).
       *
       * @type {IconType}
       * @memberOf IIconProps
       */
  var iconType: js.UndefOr[IconType] = js.undefined
  /**
       * If rendering an image icon, this function callback will be invoked in the event loading the image errors.
       */
  var imageErrorAs: js.UndefOr[
    (reactLib.reactMod.ReactNs.StatelessComponent[
      officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.IImageProps
    ]) | (reactLib.reactMod.ReactNs.ComponentClass[
      officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.IImageProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ])
  ] = js.undefined
  /**
       * If rendering an image icon, these props will be passed to the Image component.
       *
       * @type {IImageProps}
       * @memberOf IIconProps
       */
  var imageProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.IImageProps
  ] = js.undefined
  /**
       * Gets the styles for an Icon.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IIconStyleProps, IIconStyles]
  ] = js.undefined
}

