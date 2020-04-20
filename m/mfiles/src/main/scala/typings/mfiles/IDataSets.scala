package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSets extends js.Object {
  val Count: Double
  def Clone(): IDataSets
  def Item(Index: Double): IDataSet
}

object IDataSets {
  @scala.inline
  def apply(Clone: () => IDataSets, Count: Double, Item: Double => IDataSet): IDataSets = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IDataSets]
  }
}

