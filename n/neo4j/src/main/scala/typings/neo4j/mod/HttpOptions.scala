package typings.neo4j.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends js.Object {
  var body: js.Any
  var method: String
  var path: String
  var raw: js.Any
}

object HttpOptions {
  @scala.inline
  def apply(body: js.Any, method: String, path: String, raw: js.Any): HttpOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpOptions]
  }
}

