package typings.ol.sourceBingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceSet extends js.Object {
  var resources: js.Array[Resource]
}

object ResourceSet {
  @scala.inline
  def apply(resources: js.Array[Resource]): ResourceSet = {
    val __obj = js.Dynamic.literal(resources = resources)
  
    __obj.asInstanceOf[ResourceSet]
  }
}

