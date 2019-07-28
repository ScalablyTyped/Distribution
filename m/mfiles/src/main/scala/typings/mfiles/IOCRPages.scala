package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPages extends js.Object {
  val Count: Double
  def Add(Index: Double, OCRPage: IOCRPage): Unit
  def Clone(): IOCRPages
  def Item(Index: Double): IOCRPage
  def Remove(Index: Double): Unit
}

object IOCRPages {
  @scala.inline
  def apply(
    Add: (Double, IOCRPage) => Unit,
    Clone: () => IOCRPages,
    Count: Double,
    Item: Double => IOCRPage,
    Remove: Double => Unit
  ): IOCRPages = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IOCRPages]
  }
}

