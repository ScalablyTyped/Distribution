package typings
package openidDashClientLib.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuerMetadata extends js.Object {
  val issuer: js.UndefOr[java.lang.String] = js.undefined
}

object IssuerMetadata {
  @scala.inline
  def apply(issuer: java.lang.String = null): IssuerMetadata = {
    val __obj = js.Dynamic.literal()
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    __obj.asInstanceOf[IssuerMetadata]
  }
}

