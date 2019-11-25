package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomApplications extends js.Object {
  val Count: Double
  def Clone(): ICustomApplications
  def Item(Index: Double): ICustomApplication
}

object ICustomApplications {
  @scala.inline
  def apply(Clone: () => ICustomApplications, Count: Double, Item: Double => ICustomApplication): ICustomApplications = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[ICustomApplications]
  }
}

