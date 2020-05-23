package typings.npmRegistryPackageInfo.mod

import typings.npmRegistryPackageInfo.anon.Failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Any
  var meta: Failure
}

object Data {
  @scala.inline
  def apply(data: js.Any, meta: Failure): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

