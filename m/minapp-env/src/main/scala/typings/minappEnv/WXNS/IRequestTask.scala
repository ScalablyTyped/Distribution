package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestTask extends js.Object {
  def abort(): Unit
}

object IRequestTask {
  @scala.inline
  def apply(abort: () => Unit): IRequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[IRequestTask]
  }
}

