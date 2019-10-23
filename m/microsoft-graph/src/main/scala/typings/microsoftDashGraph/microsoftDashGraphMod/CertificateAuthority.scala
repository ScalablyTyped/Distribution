package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthority extends js.Object {
  var certificate: js.UndefOr[Double] = js.undefined
  var certificateRevocationListUrl: js.UndefOr[String] = js.undefined
  var deltaCertificateRevocationListUrl: js.UndefOr[String] = js.undefined
  var isRootAuthority: js.UndefOr[Boolean] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
  var issuerSki: js.UndefOr[String] = js.undefined
}

object CertificateAuthority {
  @scala.inline
  def apply(
    certificate: Int | Double = null,
    certificateRevocationListUrl: String = null,
    deltaCertificateRevocationListUrl: String = null,
    isRootAuthority: js.UndefOr[Boolean] = js.undefined,
    issuer: String = null,
    issuerSki: String = null
  ): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (certificateRevocationListUrl != null) __obj.updateDynamic("certificateRevocationListUrl")(certificateRevocationListUrl)
    if (deltaCertificateRevocationListUrl != null) __obj.updateDynamic("deltaCertificateRevocationListUrl")(deltaCertificateRevocationListUrl)
    if (!js.isUndefined(isRootAuthority)) __obj.updateDynamic("isRootAuthority")(isRootAuthority)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (issuerSki != null) __obj.updateDynamic("issuerSki")(issuerSki)
    __obj.asInstanceOf[CertificateAuthority]
  }
}

