package typings.officeUiFabricReact.iconTypesMod

import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageIconProps extends HTMLAttributes[HTMLElement] {
  /**
    * Props passed to the Image component.
    */
  var imageProps: IImageProps = js.native
}

object IImageIconProps {
  @scala.inline
  def apply(imageProps: IImageProps): IImageIconProps = {
    val __obj = js.Dynamic.literal(imageProps = imageProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageIconProps]
  }
  @scala.inline
  implicit class IImageIconPropsOps[Self <: IImageIconProps] (val x: Self) extends AnyVal {
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
    def setImageProps(value: IImageProps): Self = this.set("imageProps", value.asInstanceOf[js.Any])
  }
  
}

