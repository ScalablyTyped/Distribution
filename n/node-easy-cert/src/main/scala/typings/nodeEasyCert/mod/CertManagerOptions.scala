package typings.nodeEasyCert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertManagerOptions extends js.Object {
  /** The default attributes of a generated cert, you can change it here */
  var defaultCertAttrs: js.UndefOr[js.Array[CertificateAttribute]] = js.undefined
  /**
    * Path where certificates should be stored.
    * @default "/{USER_HOME}/{.node_easy_certs}/"
    */
  var rootDirPath: js.UndefOr[String] = js.undefined
}

object CertManagerOptions {
  @scala.inline
  def apply(defaultCertAttrs: js.Array[CertificateAttribute] = null, rootDirPath: String = null): CertManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultCertAttrs != null) __obj.updateDynamic("defaultCertAttrs")(defaultCertAttrs.asInstanceOf[js.Any])
    if (rootDirPath != null) __obj.updateDynamic("rootDirPath")(rootDirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertManagerOptions]
  }
}

