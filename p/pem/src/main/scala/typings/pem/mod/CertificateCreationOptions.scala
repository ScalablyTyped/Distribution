package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateCreationOptions extends CSRCreationOptions {
  /**
    * extension config file - with '-extensions v3_req'
    */
  var config: js.UndefOr[String] = js.undefined
  /**
    * CSR for the certificate, if not defined a new one is generated from the provided parameters
    */
  var csr: js.UndefOr[String] = js.undefined
  /**
    * Certificate expire time in days, defaults to 365
    */
  var days: js.UndefOr[Double] = js.undefined
  /**
    * extension config file - without '-extensions v3_req'
    */
  var extFile: js.UndefOr[String] = js.undefined
  /**
    * If set to true and serviceKey is not defined, use clientKey for signing
    */
  var selfSigned: js.UndefOr[Boolean] = js.undefined
  var serial: js.UndefOr[js.Any] = js.undefined
  var serviceCertificate: js.UndefOr[js.Any] = js.undefined
  /**
    * Private key for signing the certificate, if not defined a new one is generated
    */
  var serviceKey: js.UndefOr[String] = js.undefined
  /**
    * Password of the service key
    */
  var serviceKeyPassword: js.UndefOr[String] = js.undefined
}

object CertificateCreationOptions {
  @scala.inline
  def apply(
    altNames: js.Array[String] = null,
    clientKey: String = null,
    clientKeyPassword: String = null,
    commonName: String = null,
    config: String = null,
    country: String = null,
    csr: String = null,
    csrConfigFile: String = null,
    days: js.UndefOr[Double] = js.undefined,
    emailAddress: String = null,
    extFile: String = null,
    hash: HashFunction = null,
    keyBitsize: js.UndefOr[Double] = js.undefined,
    locality: String = null,
    organization: String = null,
    organizationUnit: String = null,
    selfSigned: js.UndefOr[Boolean] = js.undefined,
    serial: js.Any = null,
    serviceCertificate: js.Any = null,
    serviceKey: String = null,
    serviceKeyPassword: String = null,
    state: String = null
  ): CertificateCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (altNames != null) __obj.updateDynamic("altNames")(altNames.asInstanceOf[js.Any])
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey.asInstanceOf[js.Any])
    if (clientKeyPassword != null) __obj.updateDynamic("clientKeyPassword")(clientKeyPassword.asInstanceOf[js.Any])
    if (commonName != null) __obj.updateDynamic("commonName")(commonName.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (csr != null) __obj.updateDynamic("csr")(csr.asInstanceOf[js.Any])
    if (csrConfigFile != null) __obj.updateDynamic("csrConfigFile")(csrConfigFile.asInstanceOf[js.Any])
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (extFile != null) __obj.updateDynamic("extFile")(extFile.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(keyBitsize)) __obj.updateDynamic("keyBitsize")(keyBitsize.get.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (organizationUnit != null) __obj.updateDynamic("organizationUnit")(organizationUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(selfSigned)) __obj.updateDynamic("selfSigned")(selfSigned.get.asInstanceOf[js.Any])
    if (serial != null) __obj.updateDynamic("serial")(serial.asInstanceOf[js.Any])
    if (serviceCertificate != null) __obj.updateDynamic("serviceCertificate")(serviceCertificate.asInstanceOf[js.Any])
    if (serviceKey != null) __obj.updateDynamic("serviceKey")(serviceKey.asInstanceOf[js.Any])
    if (serviceKeyPassword != null) __obj.updateDynamic("serviceKeyPassword")(serviceKeyPassword.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateCreationOptions]
  }
}

