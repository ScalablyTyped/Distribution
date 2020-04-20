package typings.octokitGraphql

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensions extends js.Object {
  var extensions: StringDictionary[js.Any]
  var locations: js.Array[AnonColumn]
  var message: String
  var path: js.Array[String]
}

object AnonExtensions {
  @scala.inline
  def apply(
    extensions: StringDictionary[js.Any],
    locations: js.Array[AnonColumn],
    message: String,
    path: js.Array[String]
  ): AnonExtensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensions]
  }
}

