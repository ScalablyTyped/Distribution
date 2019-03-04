package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyNamePairs extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IKeyNamePair
}

object IKeyNamePairs {
  @scala.inline
  def apply(Count: scala.Double, Item: js.Function1[scala.Double, IKeyNamePair]): IKeyNamePairs = {
    val __obj = js.Dynamic.literal(Count = Count, Item = Item)
  
    __obj.asInstanceOf[IKeyNamePairs]
  }
}

