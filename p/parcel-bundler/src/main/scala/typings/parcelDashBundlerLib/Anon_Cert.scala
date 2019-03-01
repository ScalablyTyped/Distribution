package typings
package parcelDashBundlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cert extends js.Object {
  /**
    * Path to custom certificate
    *
    * @default "./ssl/c.crt"
    */
  var cert: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path to custom key
    *
    * @default "./ssl/k.key"
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Cert {
  @scala.inline
  def apply(cert: java.lang.String = null, key: java.lang.String = null): Anon_Cert = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_Cert]
  }
}

