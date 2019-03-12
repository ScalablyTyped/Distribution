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
  def apply(Clone: () => ICustomApplications, Count: scala.Double, Item: scala.Double => ICustomApplication): ICustomApplications = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[ICustomApplications]
  }
}

