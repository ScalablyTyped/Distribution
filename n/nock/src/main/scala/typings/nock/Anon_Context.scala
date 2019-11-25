package typings.nock

import typings.nock.nockMod.BackContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: BackContext
  def nockDone(): Unit
}

object Anon_Context {
  @scala.inline
  def apply(context: BackContext, nockDone: () => Unit): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], nockDone = js.Any.fromFunction0(nockDone))
  
    __obj.asInstanceOf[Anon_Context]
  }
}

