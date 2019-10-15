package typings.nodeDashEasyDashCert.nodeDashEasyDashCertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateConfig extends js.Object {
  /** The Common Name for the new certificate. */
  var commonName: String
  /**
    * Should overwrite any existing file.
    * @default false
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object GenerateConfig {
  @scala.inline
  def apply(commonName: String, overwrite: js.UndefOr[Boolean] = js.undefined): GenerateConfig = {
    val __obj = js.Dynamic.literal(commonName = commonName)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[GenerateConfig]
  }
}

