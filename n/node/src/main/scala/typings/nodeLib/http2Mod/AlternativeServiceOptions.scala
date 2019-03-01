package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlternativeServiceOptions extends js.Object {
  var origin: scala.Double | java.lang.String | nodeLib.urlMod.URL
}

object AlternativeServiceOptions {
  @scala.inline
  def apply(origin: scala.Double | java.lang.String | nodeLib.urlMod.URL): AlternativeServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternativeServiceOptions]
  }
}

