package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypesAdmin extends js.Object {
  val Count: Double
  def Item(Index: Double): IObjectTypeAdmin
}

object IObjectTypesAdmin {
  @scala.inline
  def apply(Count: Double, Item: Double => IObjectTypeAdmin): IObjectTypesAdmin = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IObjectTypesAdmin]
  }
}

