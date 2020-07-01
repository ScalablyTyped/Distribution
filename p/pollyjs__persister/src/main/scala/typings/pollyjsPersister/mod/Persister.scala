package typings.pollyjsPersister.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persister extends js.Object {
  val options: StringDictionary[js.Any]
  def persist(): js.Promise[Unit]
}

object Persister {
  @scala.inline
  def apply(options: StringDictionary[js.Any], persist: () => js.Promise[Unit]): Persister = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist))
    __obj.asInstanceOf[Persister]
  }
}

