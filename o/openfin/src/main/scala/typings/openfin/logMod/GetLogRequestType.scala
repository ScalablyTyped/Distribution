package typings.openfin.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLogRequestType extends js.Object {
  var endFile: js.UndefOr[String] = js.undefined
  var name: String
  var sizeLimit: js.UndefOr[Double] = js.undefined
}

object GetLogRequestType {
  @scala.inline
  def apply(name: String, endFile: String = null, sizeLimit: js.UndefOr[Double] = js.undefined): GetLogRequestType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (endFile != null) __obj.updateDynamic("endFile")(endFile.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeLimit)) __obj.updateDynamic("sizeLimit")(sizeLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogRequestType]
  }
}

