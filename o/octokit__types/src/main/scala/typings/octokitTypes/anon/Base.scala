package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: Ref
  var head: Ref
  var id: Double
  var number: Double
  var url: String
}

object Base {
  @scala.inline
  def apply(base: Ref, head: Ref, id: Double, number: Double, url: String): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

