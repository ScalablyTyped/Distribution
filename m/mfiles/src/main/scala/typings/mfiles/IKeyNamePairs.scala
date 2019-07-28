package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyNamePairs extends js.Object {
  val Count: Double
  def Item(Index: Double): IKeyNamePair
}

object IKeyNamePairs {
  @scala.inline
  def apply(Count: Double, Item: Double => IKeyNamePair): IKeyNamePairs = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IKeyNamePairs]
  }
}

