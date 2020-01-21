package typings.mongoose

import typings.mongoose.mongooseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNew extends js.Object {
  var `new`: `true`
  var rawResult: `true`
  var upsert: `true`
}

object AnonNew {
  @scala.inline
  def apply(`new`: `true`, rawResult: `true`, upsert: `true`): AnonNew = {
    val __obj = js.Dynamic.literal(rawResult = rawResult.asInstanceOf[js.Any], upsert = upsert.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNew]
  }
}

