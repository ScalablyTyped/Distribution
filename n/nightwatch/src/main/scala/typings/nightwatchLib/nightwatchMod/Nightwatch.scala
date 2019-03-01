package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nightwatch extends js.Object {
  var api: NightwatchAPI
  var client: NightwatchClient
}

object Nightwatch {
  @scala.inline
  def apply(api: NightwatchAPI, client: NightwatchClient): Nightwatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("api")(api)
    __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[Nightwatch]
  }
}

