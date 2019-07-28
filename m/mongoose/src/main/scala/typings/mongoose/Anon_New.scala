package typings.mongoose

import typings.mongoose.mongooseNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_New extends js.Object {
  var `new`: `true`
  var rawResult: `true`
  var upsert: `true`
}

object Anon_New {
  @scala.inline
  def apply(`new`: `true`, rawResult: `true`, upsert: `true`): Anon_New = {
    val __obj = js.Dynamic.literal(rawResult = rawResult, upsert = upsert)
    __obj.updateDynamic("new")(`new`)
    __obj.asInstanceOf[Anon_New]
  }
}

