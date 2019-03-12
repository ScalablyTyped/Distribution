package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZones extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, OCRZone: IOCRZone): scala.Unit
  def Clone(): IOCRZones
  def Item(Index: scala.Double): IOCRZone
  def Remove(Index: scala.Double): scala.Unit
}

object IOCRZones {
  @scala.inline
  def apply(
    Add: (scala.Double, IOCRZone) => scala.Unit,
    Clone: () => IOCRZones,
    Count: scala.Double,
    Item: scala.Double => IOCRZone,
    Remove: scala.Double => scala.Unit
  ): IOCRZones = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IOCRZones]
  }
}

