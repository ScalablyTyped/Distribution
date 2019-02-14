package typings
package mongooseLib.mongooseMod.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CastError
  extends mongooseLib.mongooseMod.Error {
  var kind: java.lang.String = js.native
  var model: js.UndefOr[js.Any] = js.native
  @JSName("name")
  var name_CastError: mongooseLib.mongooseLibStrings.CastError = js.native
  var path: java.lang.String = js.native
  var reason: js.UndefOr[js.Any] = js.native
  var stringValue: java.lang.String = js.native
  var value: js.Any = js.native
  def setModel(model: js.Any): scala.Unit = js.native
}

