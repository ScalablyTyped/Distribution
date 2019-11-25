package typings.mongoose

import typings.mongoose.mongooseNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewTrue extends js.Object {
  var `new`: `true`
  var upsert: `true`
}

object Anon_NewTrue {
  @scala.inline
  def apply(`new`: `true`, upsert: `true`): Anon_NewTrue = {
    val __obj = js.Dynamic.literal(upsert = upsert.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NewTrue]
  }
}

