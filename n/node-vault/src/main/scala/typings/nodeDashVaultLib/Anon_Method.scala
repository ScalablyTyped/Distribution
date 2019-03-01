package typings
package nodeDashVaultLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: java.lang.String
  var path: java.lang.String
  var scheme: js.Any
}

object Anon_Method {
  @scala.inline
  def apply(method: java.lang.String, path: java.lang.String, scheme: js.Any): Anon_Method = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[Anon_Method]
  }
}

