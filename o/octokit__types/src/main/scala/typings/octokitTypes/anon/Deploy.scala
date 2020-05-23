package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deploy extends js.Object {
  var deploy: String
}

object Deploy {
  @scala.inline
  def apply(deploy: String): Deploy = {
    val __obj = js.Dynamic.literal(deploy = deploy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deploy]
  }
}

