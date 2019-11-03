package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthority extends js.Object {
  // Required. The base64 encoded string representing the public certificate.
  var certificate: js.UndefOr[Double] = js.undefined
  // The URL of the certificate revocation list.
  var certificateRevocationListUrl: js.UndefOr[String] = js.undefined
  /**
    * The URL contains the list of all revoked certificates since the last time a full certificate revocaton list was
    * created.
    */
  var deltaCertificateRevocationListUrl: js.UndefOr[String] = js.undefined
  /**
    * Required. true if the trusted certificate is a root authority, false if the trusted certificate is an intermediate
    * authority.
    */
  var isRootAuthority: js.UndefOr[Boolean] = js.undefined
  // The issuer of the certificate, calculated from the certificate value. Read-only.
  var issuer: js.UndefOr[String] = js.undefined
  // The subject key identifier of the certificate, calculated from the certificate value. Read-only.
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

