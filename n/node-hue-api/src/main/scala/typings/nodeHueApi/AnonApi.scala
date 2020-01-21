package typings.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApi extends js.Object {
  var api: String
  var software: String
}

object AnonApi {
  @scala.inline
  def apply(api: String, software: String): AnonApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApi]
  }
}

