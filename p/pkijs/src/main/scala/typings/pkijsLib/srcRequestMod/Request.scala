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
    fromSchema: js.Function1[js.Any, scala.Unit],
    reqCert: pkijsLib.srcCertIDMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    singleRequestExtensions: js.Array[pkijsLib.srcExtensionMod.default] = null
  ): Request = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, reqCert = reqCert, toJSON = toJSON, toSchema = toSchema)
    if (singleRequestExtensions != null) __obj.updateDynamic("singleRequestExtensions")(singleRequestExtensions)
    __obj.asInstanceOf[Request]
  }
}

