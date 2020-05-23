package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err extends js.Object {
  var err: js.Any
}

object Err {
  @scala.inline
  def apply(err: js.Any): Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
}

