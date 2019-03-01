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
    fromSchema: js.Function1[js.Any, scala.Unit],
    singleExtensions: js.Array[pkijsLib.srcExtensionMod.default],
    thisUpdate: stdLib.Date,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    nextUpdate: stdLib.Date = null
  ): SingleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("certID")(certID)
    __obj.updateDynamic("certStatus")(certStatus)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("singleExtensions")(singleExtensions)
    __obj.updateDynamic("thisUpdate")(thisUpdate)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    if (nextUpdate != null) __obj.updateDynamic("nextUpdate")(nextUpdate)
    __obj.asInstanceOf[SingleResponse]
  }
}

