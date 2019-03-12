package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefsAdmin extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IPropertyDefAdmin
}

object IPropertyDefsAdmin {
  @scala.inline
  def apply(Count: scala.Double, Item: scala.Double => IPropertyDefAdmin): IPropertyDefsAdmin = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IPropertyDefsAdmin]
  }
}

