package typings.peerjs.peerjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait util extends js.Object {
  var browser: String
  var supports: UtilSupportsObj
}

object util {
  @scala.inline
  def apply(browser: String, supports: UtilSupportsObj): util = {
    val __obj = js.Dynamic.literal(browser = browser, supports = supports)
  
    __obj.asInstanceOf[util]
  }
}

