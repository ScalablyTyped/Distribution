package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypes extends js.Object {
  val Count: Double
  def Clone(): IObjectTypes
  def Item(Index: Double): IObjectType
}

object IObjectTypes {
  @scala.inline
  def apply(Clone: () => IObjectTypes, Count: Double, Item: Double => IObjectType): IObjectTypes = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IObjectTypes]
  }
}

