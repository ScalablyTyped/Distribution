package typings.nock

import typings.nock.mod.BackContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: BackContext
  def nockDone(): Unit
}

object AnonContext {
  @scala.inline
  def apply(context: BackContext, nockDone: () => Unit): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], nockDone = js.Any.fromFunction0(nockDone))
    __obj.asInstanceOf[AnonContext]
  }
}

