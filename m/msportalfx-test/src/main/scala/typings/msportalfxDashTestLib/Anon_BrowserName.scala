package typings
package msportalfxDashTestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BrowserName extends js.Object {
  var browserName: java.lang.String
  var chromeOptions: Anon_Args
}

object Anon_BrowserName {
  @scala.inline
  def apply(browserName: java.lang.String, chromeOptions: Anon_Args): Anon_BrowserName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browserName")(browserName)
    __obj.updateDynamic("chromeOptions")(chromeOptions)
    __obj.asInstanceOf[Anon_BrowserName]
  }
}

