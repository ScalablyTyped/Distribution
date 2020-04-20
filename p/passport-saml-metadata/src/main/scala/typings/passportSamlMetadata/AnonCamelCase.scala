package typings.passportSamlMetadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCamelCase extends js.Object {
  var camelCase: String
  var description: String
  var name: String
}

object AnonCamelCase {
  @scala.inline
  def apply(camelCase: String, description: String, name: String): AnonCamelCase = {
    val __obj = js.Dynamic.literal(camelCase = camelCase.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCamelCase]
  }
}

