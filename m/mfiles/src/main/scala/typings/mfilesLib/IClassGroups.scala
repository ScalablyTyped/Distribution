package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassGroups extends js.Object {
  val Count: scala.Double
  def Clone(): IClassGroups
  def Item(Index: scala.Double): IClassGroup
}

object IClassGroups {
  @scala.inline
  def apply(Clone: () => IClassGroups, Count: scala.Double, Item: scala.Double => IClassGroup): IClassGroups = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IClassGroups]
  }
}

