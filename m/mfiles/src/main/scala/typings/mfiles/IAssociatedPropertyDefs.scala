package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedPropertyDefs extends js.Object {
  val Count: Double
  def Add(Index: Double, AssociatedPropertyDef: IAssociatedPropertyDef): Unit
  def Clone(): IAssociatedPropertyDefs
  def Item(Index: Double): IAssociatedPropertyDef
  def Remove(Index: Double): Unit
}

object IAssociatedPropertyDefs {
  @scala.inline
  def apply(
    Add: (Double, IAssociatedPropertyDef) => Unit,
    Clone: () => IAssociatedPropertyDefs,
    Count: Double,
    Item: Double => IAssociatedPropertyDef,
    Remove: Double => Unit
  ): IAssociatedPropertyDefs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IAssociatedPropertyDefs]
  }
}

