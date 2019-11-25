package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassGroups extends js.Object {
  val Count: Double
  def Clone(): IClassGroups
  def Item(Index: Double): IClassGroup
}

object IClassGroups {
  @scala.inline
  def apply(Clone: () => IClassGroups, Count: Double, Item: Double => IClassGroup): IClassGroups = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IClassGroups]
  }
}

