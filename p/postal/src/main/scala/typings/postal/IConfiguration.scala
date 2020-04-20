package typings.postal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfiguration extends js.Object {
  var DEFAULT_CHANNEL: String
  var SYSTEM_CHANNEL: String
  var resolver: IResolver
}

object IConfiguration {
  @scala.inline
  def apply(DEFAULT_CHANNEL: String, SYSTEM_CHANNEL: String, resolver: IResolver): IConfiguration = {
    val __obj = js.Dynamic.literal(DEFAULT_CHANNEL = DEFAULT_CHANNEL.asInstanceOf[js.Any], SYSTEM_CHANNEL = SYSTEM_CHANNEL.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguration]
  }
}

