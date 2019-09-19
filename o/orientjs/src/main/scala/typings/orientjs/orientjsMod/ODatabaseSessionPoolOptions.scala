package typings.orientjs.orientjsMod

import typings.orientjs.Anon_Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODatabaseSessionPoolOptions extends js.Object {
  var name: String
  var password: String
  var pool: js.UndefOr[Anon_Max] = js.undefined
  var username: String
}

object ODatabaseSessionPoolOptions {
  @scala.inline
  def apply(name: String, password: String, username: String, pool: Anon_Max = null): ODatabaseSessionPoolOptions = {
    val __obj = js.Dynamic.literal(name = name, password = password, username = username)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    __obj.asInstanceOf[ODatabaseSessionPoolOptions]
  }
}

