package typings.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browser extends js.Object {
  var browser: js.UndefOr[String] = js.undefined
  var driver: js.UndefOr[String] = js.undefined
  var server: js.UndefOr[String] = js.undefined
}

object Anon_Browser {
  @scala.inline
  def apply(browser: String = null, driver: String = null, server: String = null): Anon_Browser = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Anon_Browser]
  }
}

