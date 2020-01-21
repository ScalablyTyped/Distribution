package typings.pkijs.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var reqCert: typings.pkijs.certIDMod.default
  var singleRequestExtensions: js.UndefOr[js.Array[typings.pkijs.extensionMod.default]] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Request {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    reqCert: typings.pkijs.certIDMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    singleRequestExtensions: js.Array[typings.pkijs.extensionMod.default] = null
  ): Request = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), reqCert = reqCert.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (singleRequestExtensions != null) __obj.updateDynamic("singleRequestExtensions")(singleRequestExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

