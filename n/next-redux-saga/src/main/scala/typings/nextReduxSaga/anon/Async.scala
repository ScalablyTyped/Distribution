package typings.nextReduxSaga.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Async extends js.Object {
  var async: Boolean
}

object Async {
  @scala.inline
  def apply(async: Boolean): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
}

