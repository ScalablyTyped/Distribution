package typings
package nodemailerLib.libSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveHostnameOptions extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var servername: js.UndefOr[java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`] = js.undefined
}

object ResolveHostnameOptions {
  @scala.inline
  def apply(
    host: java.lang.String = null,
    servername: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = null
  ): ResolveHostnameOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveHostnameOptions]
  }
}

