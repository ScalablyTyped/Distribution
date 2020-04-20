package typings.npmRegistryPackageInfo.mod

import typings.npmRegistryPackageInfo.AnonFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Any
  var meta: AnonFailure
}

object Data {
  @scala.inline
  def apply(data: js.Any, meta: AnonFailure): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

