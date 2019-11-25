package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZones extends js.Object {
  val Count: Double
  def Add(Index: Double, OCRZone: IOCRZone): Unit
  def Clone(): IOCRZones
  def Item(Index: Double): IOCRZone
  def Remove(Index: Double): Unit
}

object IOCRZones {
  @scala.inline
  def apply(
    Add: (Double, IOCRZone) => Unit,
    Clone: () => IOCRZones,
    Count: Double,
    Item: Double => IOCRZone,
    Remove: Double => Unit
  ): IOCRZones = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IOCRZones]
  }
}

