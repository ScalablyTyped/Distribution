package typings.nock

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: Record[String, String]
}

object Anon_Headers {
  @scala.inline
  def apply(headers: Record[String, String]): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

