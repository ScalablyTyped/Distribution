package typings.openapiDashFramework.distSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkPathObject extends js.Object {
  var module: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object OpenAPIFrameworkPathObject {
  @scala.inline
  def apply(module: js.Any = null, path: String = null): OpenAPIFrameworkPathObject = {
    val __obj = js.Dynamic.literal()
    if (module != null) __obj.updateDynamic("module")(module)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[OpenAPIFrameworkPathObject]
  }
}

