package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedPropertyDefs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, AssociatedPropertyDef: IAssociatedPropertyDef): scala.Unit
  def Clone(): IAssociatedPropertyDefs
  def Item(Index: scala.Double): IAssociatedPropertyDef
  def Remove(Index: scala.Double): scala.Unit
}

object IAssociatedPropertyDefs {
  @scala.inline
  def apply(
    Add: (scala.Double, IAssociatedPropertyDef) => scala.Unit,
    Clone: () => IAssociatedPropertyDefs,
    Count: scala.Double,
    Item: scala.Double => IAssociatedPropertyDef,
    Remove: scala.Double => scala.Unit
  ): IAssociatedPropertyDefs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IAssociatedPropertyDefs]
  }
}

