package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndirectPropertyID extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): scala.Unit
  def Clone(): IIndirectPropertyID
  def EqualTo(IndirectPropertyID: IIndirectPropertyID): scala.Boolean
  def Item(Index: scala.Double): IIndirectPropertyIDLevel
  def Remove(Index: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
}

object IIndirectPropertyID {
  @scala.inline
  def apply(
    Add: (scala.Double, IIndirectPropertyIDLevel) => scala.Unit,
    Clone: () => IIndirectPropertyID,
    Count: scala.Double,
    EqualTo: IIndirectPropertyID => scala.Boolean,
    Item: scala.Double => IIndirectPropertyIDLevel,
    Remove: scala.Double => scala.Unit,
    ToJSON: () => java.lang.String
  ): IIndirectPropertyID = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, EqualTo = js.Any.fromFunction1(EqualTo), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), ToJSON = js.Any.fromFunction0(ToJSON))
  
    __obj.asInstanceOf[IIndirectPropertyID]
  }
}

