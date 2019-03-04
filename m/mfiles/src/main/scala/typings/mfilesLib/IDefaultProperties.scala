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
    Add: js.Function2[scala.Double, IDefaultProperty, scala.Unit],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IDefaultProperty],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IDefaultProperties = {
    val __obj = js.Dynamic.literal(Add = Add, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IDefaultProperties]
  }
}

