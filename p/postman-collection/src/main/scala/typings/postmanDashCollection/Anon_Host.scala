package typings.postmanDashCollection

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: String
  var path: RegExp
  var protocols: js.Array[String]
}

object Anon_Host {
  @scala.inline
  def apply(host: String, path: RegExp, protocols: js.Array[String]): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Host]
  }
}

