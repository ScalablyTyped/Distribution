package typings.natsDashHemera.natsDashHemeraMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriOptions extends js.Object {
  /**
    * Specifies one or more acceptable Schemes, should only include the scheme name.
    * Can be an Array or String (strings are automatically escaped for use in a Regular Expression).
    */
  var scheme: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
}

object UriOptions {
  @scala.inline
  def apply(scheme: String | RegExp | (js.Array[String | RegExp]) = null): UriOptions = {
    val __obj = js.Dynamic.literal()
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriOptions]
  }
}

