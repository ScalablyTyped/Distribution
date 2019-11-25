package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZoneResults extends js.Object {
  val Count: Double
  def Item(Index: Double): IOCRZoneResult
}

object IOCRZoneResults {
  @scala.inline
  def apply(Count: Double, Item: Double => IOCRZoneResult): IOCRZoneResults = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IOCRZoneResults]
  }
}

