package typings.node.http2Mod

import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlternativeServiceOptions extends js.Object {
  var origin: Double | String | URL_
}

object AlternativeServiceOptions {
  @scala.inline
  def apply(origin: Double | String | URL_): AlternativeServiceOptions = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlternativeServiceOptions]
  }
}

