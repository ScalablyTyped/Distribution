package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDefinitionGeneric[T] extends js.Object {
  var name: T
  var scaling: js.UndefOr[T] = js.undefined
  var url: T
}

object ImageDefinitionGeneric {
  @scala.inline
  def apply[T](name: T, url: T, scaling: T = null): ImageDefinitionGeneric[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDefinitionGeneric[T]]
  }
}

