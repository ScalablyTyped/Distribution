package typings.atPollyjsPersister.atPollyjsPersisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persister extends js.Object {
  def persist(): js.Promise[Unit]
}

object Persister {
  @scala.inline
  def apply(persist: () => js.Promise[Unit]): Persister = {
    val __obj = js.Dynamic.literal(persist = js.Any.fromFunction0(persist))
  
    __obj.asInstanceOf[Persister]
  }
}

