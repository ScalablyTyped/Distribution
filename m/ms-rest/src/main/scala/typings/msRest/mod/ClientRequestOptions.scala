package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestOptions extends RequestOptions {
  var jar: js.UndefOr[Boolean] = js.undefined
}

object ClientRequestOptions {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, jar: js.UndefOr[Boolean] = js.undefined): ClientRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(jar)) __obj.updateDynamic("jar")(jar.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequestOptions]
  }
}

