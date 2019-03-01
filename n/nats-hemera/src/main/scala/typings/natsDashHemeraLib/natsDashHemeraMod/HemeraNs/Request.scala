package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var id: java.lang.String
  var `type`: RequestType
}

object Request {
  @scala.inline
  def apply(id: java.lang.String, `type`: RequestType): Request = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Request]
  }
}

