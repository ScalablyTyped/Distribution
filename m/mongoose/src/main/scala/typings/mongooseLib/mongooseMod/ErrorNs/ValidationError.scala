package typings
package mongooseLib.mongooseMod.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError
  extends nodeLib.ErrorConstructor {
  var errors: js.Any = js.native
  def addError(path: java.lang.String, error: js.Any): scala.Unit = js.native
  def inspect(): js.Object = js.native
  def toJSON(): js.Object = js.native
}

