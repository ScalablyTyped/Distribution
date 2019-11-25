package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatesAdmin extends js.Object {
  val Count: Double
  def Add(Index: Double, StateAdmin: IStateAdmin): Unit
  def Item(Index: Double): IStateAdmin
  def Remove(Index: Double): Unit
}

object IStatesAdmin {
  @scala.inline
  def apply(
    Add: (Double, IStateAdmin) => Unit,
    Count: Double,
    Item: Double => IStateAdmin,
    Remove: Double => Unit
  ): IStatesAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IStatesAdmin]
  }
}

