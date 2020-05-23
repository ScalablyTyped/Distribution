package typings.nock.anon

import typings.nock.mod.BackContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: BackContext
  def nockDone(): Unit
}

object Context {
  @scala.inline
  def apply(context: BackContext, nockDone: () => Unit): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], nockDone = js.Any.fromFunction0(nockDone))
    __obj.asInstanceOf[Context]
  }
}

