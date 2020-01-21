package typings.mongoose

import typings.mongoose.mongooseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewTrue extends js.Object {
  var `new`: `true`
  var upsert: `true`
}

object AnonNewTrue {
  @scala.inline
  def apply(`new`: `true`, upsert: `true`): AnonNewTrue = {
    val __obj = js.Dynamic.literal(upsert = upsert.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewTrue]
  }
}

