package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndpoints extends js.Object {
  def registerEndpoints(endpoints: js.Any): Unit
}

object AnonEndpoints {
  @scala.inline
  def apply(registerEndpoints: js.Any => Unit): AnonEndpoints = {
    val __obj = js.Dynamic.literal(registerEndpoints = js.Any.fromFunction1(registerEndpoints))
  
    __obj.asInstanceOf[AnonEndpoints]
  }
}

