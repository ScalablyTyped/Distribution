package typings
package plottableLib.buildSrcUtilsEntityStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionedEntity extends js.Object {
  var position: plottableLib.buildSrcCoreInterfacesMod.Point
}

object IPositionedEntity {
  @scala.inline
  def apply(position: plottableLib.buildSrcCoreInterfacesMod.Point): IPositionedEntity = {
    val __obj = js.Dynamic.literal(position = position)
  
    __obj.asInstanceOf[IPositionedEntity]
  }
}

