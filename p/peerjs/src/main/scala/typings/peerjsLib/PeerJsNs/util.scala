package typings
package peerjsLib.PeerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait util extends js.Object {
  var browser: java.lang.String
  var supports: utilSupportsObj
}

object util {
  @scala.inline
  def apply(browser: java.lang.String, supports: utilSupportsObj): util = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browser")(browser)
    __obj.updateDynamic("supports")(supports)
    __obj.asInstanceOf[util]
  }
}

