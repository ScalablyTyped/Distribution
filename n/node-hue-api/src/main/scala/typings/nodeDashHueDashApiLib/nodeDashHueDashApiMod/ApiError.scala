package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-hue-api", "ApiError")
@js.native
class ApiError protected ()
  extends nodeLib.Error {
  def this(error: js.Object) = this()
  var address: java.lang.String = js.native
  var message: java.lang.String = js.native
  var name: java.lang.String = js.native
  var `type`: js.Any = js.native
}

