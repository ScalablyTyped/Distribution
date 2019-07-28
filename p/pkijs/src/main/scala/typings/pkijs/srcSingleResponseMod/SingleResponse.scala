package typings.pkijs.srcSingleResponseMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleResponse extends js.Object {
  var certID: typings.pkijs.srcCertIDMod.default
  var certStatus: js.Any
  var nextUpdate: js.UndefOr[Date] = js.undefined
  var singleExtensions: js.Array[typings.pkijs.srcExtensionMod.default]
  var thisUpdate: Date
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SingleResponse {
  @scala.inline
  def apply(
    certID: typings.pkijs.srcCertIDMod.default,
    certStatus: js.Any,
    fromSchema: js.Any => Unit,
    singleExtensions: js.Array[typings.pkijs.srcExtensionMod.default],
    thisUpdate: Date,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    nextUpdate: Date = null
  ): SingleResponse = {
    val __obj = js.Dynamic.literal(certID = certID, certStatus = certStatus, fromSchema = js.Any.fromFunction1(fromSchema), singleExtensions = singleExtensions, thisUpdate = thisUpdate, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (nextUpdate != null) __obj.updateDynamic("nextUpdate")(nextUpdate)
    __obj.asInstanceOf[SingleResponse]
  }
}

