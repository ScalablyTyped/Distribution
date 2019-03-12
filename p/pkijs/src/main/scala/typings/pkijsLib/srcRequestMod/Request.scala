package typings
package pkijsLib.srcRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var reqCert: pkijsLib.srcCertIDMod.default
  var singleRequestExtensions: js.UndefOr[js.Array[pkijsLib.srcExtensionMod.default]] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Request {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    reqCert: pkijsLib.srcCertIDMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    singleRequestExtensions: js.Array[pkijsLib.srcExtensionMod.default] = null
  ): Request = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), reqCert = reqCert, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (singleRequestExtensions != null) __obj.updateDynamic("singleRequestExtensions")(singleRequestExtensions)
    __obj.asInstanceOf[Request]
  }
}

