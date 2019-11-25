package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateTransitions extends js.Object {
  val Count: Double
  def Add(Index: Double, StateTransition: IStateTransition): Unit
  def Item(Index: Double): IStateTransition
  def Remove(Index: Double): Unit
}

object IStateTransitions {
  @scala.inline
  def apply(
    Add: (Double, IStateTransition) => Unit,
    Count: Double,
    Item: Double => IStateTransition,
    Remove: Double => Unit
  ): IStateTransitions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IStateTransitions]
  }
}

