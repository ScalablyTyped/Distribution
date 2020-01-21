package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

