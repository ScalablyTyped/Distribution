package typings.parcelBundler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsOptions extends js.Object {
  /**
    * Path to custom certificate
    *
    * @default "./ssl/c.crt"
    */
  var cert: js.UndefOr[String] = js.undefined
  /**
    * Path to custom key
    *
    * @default "./ssl/k.key"
    */
  var key: js.UndefOr[String] = js.undefined
}

object HttpsOptions {
  @scala.inline
  def apply(cert: String = null, key: String = null): HttpsOptions = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsOptions]
  }
}

