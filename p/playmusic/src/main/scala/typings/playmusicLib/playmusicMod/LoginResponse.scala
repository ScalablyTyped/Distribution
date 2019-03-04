package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginResponse extends js.Object {
  var androidId: java.lang.String
  var masterToken: java.lang.String
}

object LoginResponse {
  @scala.inline
  def apply(androidId: java.lang.String, masterToken: java.lang.String): LoginResponse = {
    val __obj = js.Dynamic.literal(androidId = androidId, masterToken = masterToken)
  
    __obj.asInstanceOf[LoginResponse]
  }
}

