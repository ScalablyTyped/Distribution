package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var api: String
  var software: String
}

object Api {
  @scala.inline
  def apply(api: String, software: String): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
}

