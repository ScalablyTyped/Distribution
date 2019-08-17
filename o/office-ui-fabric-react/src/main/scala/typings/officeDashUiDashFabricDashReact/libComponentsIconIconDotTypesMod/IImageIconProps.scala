package typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.IImageProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageIconProps extends HTMLAttributes[HTMLElement] {
  /**
    * Props passed to the Image component.
    */
  var imageProps: IImageProps
}

object IImageIconProps {
  @scala.inline
  def apply(
    imageProps: IImageProps,
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    className: String = null
  ): IImageIconProps = {
    val __obj = js.Dynamic.literal(imageProps = imageProps)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IImageIconProps]
  }
}

