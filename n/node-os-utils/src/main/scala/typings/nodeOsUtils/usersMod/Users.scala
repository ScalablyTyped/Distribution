package typings.nodeOsUtils.usersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Users extends js.Object {
  def openedCount(): js.Promise[Double | String]
}

object Users {
  @scala.inline
  def apply(openedCount: () => js.Promise[Double | String]): Users = {
    val __obj = js.Dynamic.literal(openedCount = js.Any.fromFunction0(openedCount))
  
    __obj.asInstanceOf[Users]
  }
}

