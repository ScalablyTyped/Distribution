package typings
package mongooseLib.mongooseMod.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorError
  extends nodeLib.ErrorConstructor {
  var kind: java.lang.String = js.native
  var path: java.lang.String = js.native
  var properties: js.Any = js.native
  var reason: js.Any = js.native
  var value: js.Any = js.native
  def formatMessage(msg: java.lang.String, properties: js.Any): java.lang.String = js.native
  def formatMessage(msg: js.Function, properties: js.Any): java.lang.String = js.native
}

