package typings.orientjs.orientjsMod

import typings.orientjs.Anon_Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODatabaseSessionPoolOptions extends js.Object {
  var name: String
  var password: js.UndefOr[String] = js.undefined
  var pool: js.UndefOr[Anon_Max] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ODatabaseSessionPoolOptions {
  @scala.inline
  def apply(name: String, password: String = null, pool: Anon_Max = null, username: String = null): ODatabaseSessionPoolOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (password != null) __obj.updateDynamic("password")(password)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ODatabaseSessionPoolOptions]
  }
}

