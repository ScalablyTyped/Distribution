package typings
package nodemailerLib.libMimeDashFuncsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderValue extends js.Object {
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var value: java.lang.String
}

object HeaderValue {
  @scala.inline
  def apply(
    value: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): HeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[HeaderValue]
  }
}

