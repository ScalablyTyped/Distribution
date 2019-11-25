package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedACLs extends js.Object {
  val Count: Double
  def Item(Index: Double): INamedACL
}

object INamedACLs {
  @scala.inline
  def apply(Count: Double, Item: Double => INamedACL): INamedACLs = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[INamedACLs]
  }
}

