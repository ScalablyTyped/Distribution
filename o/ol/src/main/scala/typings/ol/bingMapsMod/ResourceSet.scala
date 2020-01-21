package typings.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceSet extends js.Object {
  var resources: js.Array[Resource]
}

object ResourceSet {
  @scala.inline
  def apply(resources: js.Array[Resource]): ResourceSet = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceSet]
  }
}

