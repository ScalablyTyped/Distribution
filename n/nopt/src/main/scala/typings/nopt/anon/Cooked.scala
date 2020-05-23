package typings.nopt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cooked extends js.Object {
  var cooked: js.Array[String]
  var original: js.Array[String]
  var remain: js.Array[String]
}

object Cooked {
  @scala.inline
  def apply(cooked: js.Array[String], original: js.Array[String], remain: js.Array[String]): Cooked = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], remain = remain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cooked]
  }
}

