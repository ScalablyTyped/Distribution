package typings.onfleetNodeOnfleet.hubsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hub extends js.Object {
  def get(): js.Promise[js.Array[OnfleetHub]]
}

object Hub {
  @scala.inline
  def apply(get: () => js.Promise[js.Array[OnfleetHub]]): Hub = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Hub]
  }
}

