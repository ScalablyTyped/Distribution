package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClasses extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectClass: IObjectClass): scala.Unit
  def Clone(): IObjectClasses
  def Item(Index: scala.Double): IObjectClass
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectClasses {
  @scala.inline
  def apply(
    Add: (scala.Double, IObjectClass) => scala.Unit,
    Clone: () => IObjectClasses,
    Count: scala.Double,
    Item: scala.Double => IObjectClass,
    Remove: scala.Double => scala.Unit
  ): IObjectClasses = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectClasses]
  }
}

