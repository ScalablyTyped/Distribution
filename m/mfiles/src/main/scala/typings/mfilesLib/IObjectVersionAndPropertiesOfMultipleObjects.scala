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
    Add: (scala.Double, IObjectVersionAndProperties) => scala.Unit,
    Clone: () => IObjectVersionAndPropertiesOfMultipleObjects,
    Count: scala.Double,
    Item: scala.Double => IObjectVersionAndProperties,
    Remove: scala.Double => scala.Unit
  ): IObjectVersionAndPropertiesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectVersionAndPropertiesOfMultipleObjects]
  }
}

