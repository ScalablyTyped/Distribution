package typings
package neo4jLib.neo4jMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends js.Object {
  var body: js.Any
  var method: java.lang.String
  var path: java.lang.String
  var raw: js.Any
}

object HttpOptions {
  @scala.inline
  def apply(body: js.Any, method: java.lang.String, path: java.lang.String, raw: js.Any): HttpOptions = {
    val __obj = js.Dynamic.literal(body = body, method = method, path = path, raw = raw)
  
    __obj.asInstanceOf[HttpOptions]
  }
}

