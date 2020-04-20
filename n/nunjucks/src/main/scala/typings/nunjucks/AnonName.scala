package typings.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var template: String
}

object AnonName {
  @scala.inline
  def apply(name: String, template: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

