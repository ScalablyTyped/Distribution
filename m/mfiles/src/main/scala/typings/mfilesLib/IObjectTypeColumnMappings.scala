package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeColumnMappings extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectTypeColumnMapping: IObjectTypeColumnMapping): scala.Unit
  def Clone(): IObjectTypeColumnMappings
  def Item(Index: scala.Double): IObjectTypeColumnMapping
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectTypeColumnMappings {
  @scala.inline
  def apply(
    Add: (scala.Double, IObjectTypeColumnMapping) => scala.Unit,
    Clone: () => IObjectTypeColumnMappings,
    Count: scala.Double,
    Item: scala.Double => IObjectTypeColumnMapping,
    Remove: scala.Double => scala.Unit
  ): IObjectTypeColumnMappings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectTypeColumnMappings]
  }
}

