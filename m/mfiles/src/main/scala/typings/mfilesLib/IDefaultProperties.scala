package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaultProperties extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, DefaultProperty: IDefaultProperty): scala.Unit
  def Item(Index: scala.Double): IDefaultProperty
  def Remove(Index: scala.Double): scala.Unit
}

object IDefaultProperties {
  @scala.inline
  def apply(
    Add: (scala.Double, IDefaultProperty) => scala.Unit,
    Count: scala.Double,
    Item: scala.Double => IDefaultProperty,
    Remove: scala.Double => scala.Unit
  ): IDefaultProperties = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IDefaultProperties]
  }
}

