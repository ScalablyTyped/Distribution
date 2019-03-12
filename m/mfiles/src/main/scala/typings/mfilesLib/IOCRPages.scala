package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPages extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, OCRPage: IOCRPage): scala.Unit
  def Clone(): IOCRPages
  def Item(Index: scala.Double): IOCRPage
  def Remove(Index: scala.Double): scala.Unit
}

object IOCRPages {
  @scala.inline
  def apply(
    Add: (scala.Double, IOCRPage) => scala.Unit,
    Clone: () => IOCRPages,
    Count: scala.Double,
    Item: scala.Double => IOCRPage,
    Remove: scala.Double => scala.Unit
  ): IOCRPages = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IOCRPages]
  }
}

