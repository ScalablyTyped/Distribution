package typings.next.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends js.Object {
  val browser: Boolean
}

object Process {
  @scala.inline
  def apply(browser: Boolean): Process = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
}

