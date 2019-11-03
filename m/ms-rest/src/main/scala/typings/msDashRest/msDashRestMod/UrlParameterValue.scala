package typings.msDashRest.msDashRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlParameterValue extends js.Object {
  var skipUrlEncoding: Boolean
  var value: js.Any
}

object UrlParameterValue {
  @scala.inline
  def apply(skipUrlEncoding: Boolean, value: js.Any): UrlParameterValue = {
    val __obj = js.Dynamic.literal(skipUrlEncoding = skipUrlEncoding, value = value)
  
    __obj.asInstanceOf[UrlParameterValue]
  }
}

