package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyName extends js.Object {
  var body: AnonType
  var name: AnonRequired
}

object AnonBodyName {
  @scala.inline
  def apply(body: AnonType, name: AnonRequired): AnonBodyName = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyName]
  }
}

