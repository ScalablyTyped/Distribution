package typings
package pkijsLib.srcSingleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleResponse extends js.Object {
  var certID: pkijsLib.srcCertIDMod.default
  var certStatus: js.Any
  var nextUpdate: js.UndefOr[stdLib.Date] = js.undefined
  var singleExtensions: js.Array[pkijsLib.srcExtensionMod.default]
  var thisUpdate: stdLib.Date
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SingleResponse {
  @scala.inline
  def apply(
    certID: pkijsLib.srcCertIDMod.default,
    certStatus: js.Any,
    fromSchema: js.Any => scala.Unit,
    singleExtensions: js.Array[pkijsLib.srcExtensionMod.default],
    thisUpdate: stdLib.Date,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    nextUpdate: stdLib.Date = null
  ): SingleResponse = {
    val __obj = js.Dynamic.literal(certID = certID, certStatus = certStatus, fromSchema = js.Any.fromFunction1(fromSchema), singleExtensions = singleExtensions, thisUpdate = thisUpdate, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (nextUpdate != null) __obj.updateDynamic("nextUpdate")(nextUpdate)
    __obj.asInstanceOf[SingleResponse]
  }
}

