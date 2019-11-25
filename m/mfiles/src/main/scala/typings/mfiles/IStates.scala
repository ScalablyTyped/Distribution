package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStates extends js.Object {
  val Count: Double
  def Item(Index: Double): IState
}

object IStates {
  @scala.inline
  def apply(Count: Double, Item: Double => IState): IStates = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IStates]
  }
}

