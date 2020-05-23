package typings.postmanCollection.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: String
  var path: RegExp
  var protocols: js.Array[String]
}

object Host {
  @scala.inline
  def apply(host: String, path: RegExp, protocols: js.Array[String]): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

