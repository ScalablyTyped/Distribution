package typings.officeUiFabricReact.imageTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageStyles extends js.Object {
  /**
    * Style set for the img element.
    */
  var image: IStyle
  /**
    * Style set for the root div element.
    */
  var root: IStyle
}

object IImageStyles {
  @scala.inline
  def apply(image: IStyle = null, root: IStyle = null): IImageStyles = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageStyles]
  }
}

