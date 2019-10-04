package typings.pacote.pacoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Human extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var name: String
  var url: js.UndefOr[String] = js.undefined
}

object Human {
  @scala.inline
  def apply(name: String, email: String = null, url: String = null): Human = {
    val __obj = js.Dynamic.literal(name = name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Human]
  }
}

