package typings.postmanCollection

import typings.postmanCollection.mod.PropertyBaseDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfo extends js.Object {
  var info: PropertyBaseDefinition
}

object AnonInfo {
  @scala.inline
  def apply(info: PropertyBaseDefinition): AnonInfo = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInfo]
  }
}

