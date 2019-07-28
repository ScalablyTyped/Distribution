package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPageResults extends js.Object {
  val Count: Double
  def Item(Index: Double): IOCRPageResult
}

object IOCRPageResults {
  @scala.inline
  def apply(Count: Double, Item: Double => IOCRPageResult): IOCRPageResults = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IOCRPageResults]
  }
}

