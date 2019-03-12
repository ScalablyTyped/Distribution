package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZoneResults extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IOCRZoneResult
}

object IOCRZoneResults {
  @scala.inline
  def apply(Count: scala.Double, Item: scala.Double => IOCRZoneResult): IOCRZoneResults = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IOCRZoneResults]
  }
}

