package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fallback extends js.Object {
  var fallback: Boolean
  var paths: js.Array[String]
}

object Fallback {
  @scala.inline
  def apply(fallback: Boolean, paths: js.Array[String]): Fallback = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback]
  }
}

