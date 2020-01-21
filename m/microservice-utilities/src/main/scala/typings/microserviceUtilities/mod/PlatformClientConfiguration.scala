package typings.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformClientConfiguration extends js.Object {
  var client: js.Object
}

object PlatformClientConfiguration {
  @scala.inline
  def apply(client: js.Object): PlatformClientConfiguration = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlatformClientConfiguration]
  }
}

