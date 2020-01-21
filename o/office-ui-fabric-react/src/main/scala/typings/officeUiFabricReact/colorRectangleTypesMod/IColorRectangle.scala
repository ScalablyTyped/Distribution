package typings.officeUiFabricReact.colorRectangleTypesMod

import typings.officeUiFabricReact.interfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorRectangle extends js.Object {
  /** Currently selected color. */
  var color: IColor
}

object IColorRectangle {
  @scala.inline
  def apply(color: IColor): IColorRectangle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColorRectangle]
  }
}

