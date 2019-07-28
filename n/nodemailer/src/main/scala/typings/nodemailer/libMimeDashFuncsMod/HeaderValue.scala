package typings.nodemailer.libMimeDashFuncsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderValue extends js.Object {
  var params: js.UndefOr[StringDictionary[String]] = js.undefined
  var value: String
}

object HeaderValue {
  @scala.inline
  def apply(value: String, params: StringDictionary[String] = null): HeaderValue = {
    val __obj = js.Dynamic.literal(value = value)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[HeaderValue]
  }
}

