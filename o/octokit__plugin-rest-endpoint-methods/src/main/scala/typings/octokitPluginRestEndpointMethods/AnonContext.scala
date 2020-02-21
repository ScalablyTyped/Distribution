package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: AnonType
  var mode: AnonEnum
  var text: AnonRequired
}

object AnonContext {
  @scala.inline
  def apply(context: AnonType, mode: AnonEnum, text: AnonRequired): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContext]
  }
}

