package typings.octokitGraphql.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions extends js.Object {
  var extensions: StringDictionary[js.Any]
  var locations: js.Array[Column]
  var message: String
  var path: js.Array[String]
}

object Extensions {
  @scala.inline
  def apply(
    extensions: StringDictionary[js.Any],
    locations: js.Array[Column],
    message: String,
    path: js.Array[String]
  ): Extensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
}

