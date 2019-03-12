package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrings extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, Item: java.lang.String): scala.Unit
  def Clone(): IStrings
  def CloneFrom(Strings: IStrings): scala.Unit
  def Item(Index: scala.Double): java.lang.String
  def Join(Separator: java.lang.String): java.lang.String
  def Remove(Index: scala.Double): scala.Unit
}

object IStrings {
  @scala.inline
  def apply(
    Add: (scala.Double, java.lang.String) => scala.Unit,
    Clone: () => IStrings,
    CloneFrom: IStrings => scala.Unit,
    Count: scala.Double,
    Item: scala.Double => java.lang.String,
    Join: java.lang.String => java.lang.String,
    Remove: scala.Double => scala.Unit
  ): IStrings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Count = Count, Item = js.Any.fromFunction1(Item), Join = js.Any.fromFunction1(Join), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IStrings]
  }
}

