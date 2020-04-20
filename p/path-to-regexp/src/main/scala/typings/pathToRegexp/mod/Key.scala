package typings.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var modifier: String
  var name: String | Double
  var pattern: String
  var prefix: String
  var suffix: String
}

object Key {
  @scala.inline
  def apply(modifier: String, name: String | Double, pattern: String, prefix: String, suffix: String): Key = {
    val __obj = js.Dynamic.literal(modifier = modifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

