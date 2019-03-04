package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionAndPropertiesOfMultipleObjects extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectVersionAndProperties: IObjectVersionAndProperties): scala.Unit
  def Clone(): IObjectVersionAndPropertiesOfMultipleObjects
  def Item(Index: scala.Double): IObjectVersionAndProperties
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectVersionAndPropertiesOfMultipleObjects {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IObjectVersionAndProperties, scala.Unit],
    Clone: js.Function0[IObjectVersionAndPropertiesOfMultipleObjects],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IObjectVersionAndProperties],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IObjectVersionAndPropertiesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IObjectVersionAndPropertiesOfMultipleObjects]
  }
}

