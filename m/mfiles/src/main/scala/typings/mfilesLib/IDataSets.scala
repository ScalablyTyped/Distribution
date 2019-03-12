package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSets extends js.Object {
  val Count: scala.Double
  def Clone(): IDataSets
  def Item(Index: scala.Double): IDataSet
}

object IDataSets {
  @scala.inline
  def apply(Clone: () => IDataSets, Count: scala.Double, Item: scala.Double => IDataSet): IDataSets = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IDataSets]
  }
}

