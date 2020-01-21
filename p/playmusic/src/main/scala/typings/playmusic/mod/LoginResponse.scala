package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginResponse extends js.Object {
  var androidId: String
  var masterToken: String
}

object LoginResponse {
  @scala.inline
  def apply(androidId: String, masterToken: String): LoginResponse = {
    val __obj = js.Dynamic.literal(androidId = androidId.asInstanceOf[js.Any], masterToken = masterToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginResponse]
  }
}

