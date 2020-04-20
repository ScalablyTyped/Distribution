package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrings extends js.Object {
  val Count: Double
  def Add(Index: Double, Item: String): Unit
  def Clone(): IStrings
  def CloneFrom(Strings: IStrings): Unit
  def Item(Index: Double): String
  def Join(Separator: String): String
  def Remove(Index: Double): Unit
}

object IStrings {
  @scala.inline
  def apply(
    Add: (Double, String) => Unit,
    Clone: () => IStrings,
    CloneFrom: IStrings => Unit,
    Count: Double,
    Item: Double => String,
    Join: String => String,
    Remove: Double => Unit
  ): IStrings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Join = js.Any.fromFunction1(Join), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IStrings]
  }
}

