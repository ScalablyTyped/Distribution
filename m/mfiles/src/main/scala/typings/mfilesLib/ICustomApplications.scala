package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomApplications extends js.Object {
  val Count: scala.Double
  def Clone(): ICustomApplications
  def Item(Index: scala.Double): ICustomApplication
}

object ICustomApplications {
  @scala.inline
  def apply(
    Clone: js.Function0[ICustomApplications],
    Count: scala.Double,
    Item: js.Function1[scala.Double, ICustomApplication]
  ): ICustomApplications = {
    val __obj = js.Dynamic.literal(Clone = Clone, Count = Count, Item = Item)
  
    __obj.asInstanceOf[ICustomApplications]
  }
}

