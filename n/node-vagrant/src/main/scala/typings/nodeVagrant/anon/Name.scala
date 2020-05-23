package typings.nodeVagrant.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var provider: String
  var version: String
}

object Name {
  @scala.inline
  def apply(name: String, provider: String, version: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

