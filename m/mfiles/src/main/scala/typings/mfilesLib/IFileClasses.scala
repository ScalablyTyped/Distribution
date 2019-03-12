package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileClasses extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, FileClass: IFileClass): scala.Unit
  def Clone(): IFileClasses
  def Item(Index: scala.Double): IFileClass
  def Remove(Index: scala.Double): scala.Unit
}

object IFileClasses {
  @scala.inline
  def apply(
    Add: (scala.Double, IFileClass) => scala.Unit,
    Clone: () => IFileClasses,
    Count: scala.Double,
    Item: scala.Double => IFileClass,
    Remove: scala.Double => scala.Unit
  ): IFileClasses = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IFileClasses]
  }
}

