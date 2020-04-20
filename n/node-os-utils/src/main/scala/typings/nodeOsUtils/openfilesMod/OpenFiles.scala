package typings.nodeOsUtils.openfilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFiles extends js.Object {
  def openFd(): js.Promise[Double]
}

object OpenFiles {
  @scala.inline
  def apply(openFd: () => js.Promise[Double]): OpenFiles = {
    val __obj = js.Dynamic.literal(openFd = js.Any.fromFunction0(openFd))
    __obj.asInstanceOf[OpenFiles]
  }
}

