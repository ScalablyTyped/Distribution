package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefsAdmin extends js.Object {
  val Count: Double
  def Item(Index: Double): IPropertyDefAdmin
}

object IPropertyDefsAdmin {
  @scala.inline
  def apply(Count: Double, Item: Double => IPropertyDefAdmin): IPropertyDefsAdmin = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IPropertyDefsAdmin]
  }
}

