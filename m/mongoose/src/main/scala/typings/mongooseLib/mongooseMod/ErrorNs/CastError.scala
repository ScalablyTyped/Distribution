package typings
package mongooseLib.mongooseMod.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CastError
  extends nodeLib.ErrorConstructor {
  var kind: java.lang.String = js.native
  var model: js.UndefOr[js.Any] = js.native
  var path: java.lang.String = js.native
  var reason: js.UndefOr[js.Any] = js.native
  var stringValue: java.lang.String = js.native
  var value: js.Any = js.native
  def setModel(model: js.Any): scala.Unit = js.native
}

