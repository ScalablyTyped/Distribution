package typings.plottable.buildSrcUtilsEntityStoreMod

import typings.plottable.buildSrcCoreInterfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionedEntity extends js.Object {
  var position: Point
}

object IPositionedEntity {
  @scala.inline
  def apply(position: Point): IPositionedEntity = {
    val __obj = js.Dynamic.literal(position = position)
  
    __obj.asInstanceOf[IPositionedEntity]
  }
}

