package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndirectPropertyID extends js.Object {
  val Count: Double
  def Add(Index: Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): Unit
  def Clone(): IIndirectPropertyID
  def EqualTo(IndirectPropertyID: IIndirectPropertyID): Boolean
  def Item(Index: Double): IIndirectPropertyIDLevel
  def Remove(Index: Double): Unit
  def ToJSON(): String
}

object IIndirectPropertyID {
  @scala.inline
  def apply(
    Add: (Double, IIndirectPropertyIDLevel) => Unit,
    Clone: () => IIndirectPropertyID,
    Count: Double,
    EqualTo: IIndirectPropertyID => Boolean,
    Item: Double => IIndirectPropertyIDLevel,
    Remove: Double => Unit,
    ToJSON: () => String
  ): IIndirectPropertyID = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, EqualTo = js.Any.fromFunction1(EqualTo), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), ToJSON = js.Any.fromFunction0(ToJSON))
  
    __obj.asInstanceOf[IIndirectPropertyID]
  }
}

