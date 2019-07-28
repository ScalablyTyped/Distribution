package typings.peerjs.PeerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait util extends js.Object {
  var browser: String
  var supports: utilSupportsObj
}

object util {
  @scala.inline
  def apply(browser: String, supports: utilSupportsObj): util = {
    val __obj = js.Dynamic.literal(browser = browser, supports = supports)
  
    __obj.asInstanceOf[util]
  }
}

