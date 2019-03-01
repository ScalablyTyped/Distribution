package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateCreationOptions extends CSRCreationOptions {
  /**
    * extension config file - with '-extensions v3_req'
    */
  var config: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSR for the certificate, if not defined a new one is generated from the provided parameters
    */
  var csr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Certificate expire time in days, defaults to 365
    */
  var days: js.UndefOr[scala.Double] = js.undefined
  /**
    * extension config file - without '-extensions v3_req'
    */
  var extFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true and serviceKey is not defined, use clientKey for signing
    */
  var selfSigned: js.UndefOr[scala.Boolean] = js.undefined
  var serial: js.UndefOr[js.Any] = js.undefined
  var serviceCertificate: js.UndefOr[js.Any] = js.undefined
  /**
    * Private key for signing the certificate, if not defined a new one is generated
    */
  var serviceKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Password of the service key
    */
  var serviceKeyPassword: js.UndefOr[java.lang.String] = js.undefined
}

object CertificateCreationOptions {
  @scala.inline
  def apply(
    altNames: js.Array[java.lang.String] = null,
    clientKey: java.lang.String = null,
    clientKeyPassword: java.lang.String = null,
    commonName: java.lang.String = null,
    config: java.lang.String = null,
    country: java.lang.String = null,
    csr: java.lang.String = null,
    csrConfigFile: java.lang.String = null,
    days: scala.Int | scala.Double = null,
    emailAddress: java.lang.String = null,
    extFile: java.lang.String = null,
    hash: HashFunction = null,
    keyBitsize: scala.Int | scala.Double = null,
    locality: java.lang.String = null,
    organization: java.lang.String = null,
    organizationUnit: java.lang.String = null,
    selfSigned: js.UndefOr[scala.Boolean] = js.undefined,
    serial: js.Any = null,
    serviceCertificate: js.Any = null,
    serviceKey: java.lang.String = null,
    serviceKeyPassword: java.lang.String = null,
    state: java.lang.String = null
  ): CertificateCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (altNames != null) __obj.updateDynamic("altNames")(altNames)
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey)
    if (clientKeyPassword != null) __obj.updateDynamic("clientKeyPassword")(clientKeyPassword)
    if (commonName != null) __obj.updateDynamic("commonName")(commonName)
    if (config != null) __obj.updateDynamic("config")(config)
    if (country != null) __obj.updateDynamic("country")(country)
    if (csr != null) __obj.updateDynamic("csr")(csr)
    if (csrConfigFile != null) __obj.updateDynamic("csrConfigFile")(csrConfigFile)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (extFile != null) __obj.updateDynamic("extFile")(extFile)
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (keyBitsize != null) __obj.updateDynamic("keyBitsize")(keyBitsize.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (organizationUnit != null) __obj.updateDynamic("organizationUnit")(organizationUnit)
    if (!js.isUndefined(selfSigned)) __obj.updateDynamic("selfSigned")(selfSigned)
    if (serial != null) __obj.updateDynamic("serial")(serial)
    if (serviceCertificate != null) __obj.updateDynamic("serviceCertificate")(serviceCertificate)
    if (serviceKey != null) __obj.updateDynamic("serviceKey")(serviceKey)
    if (serviceKeyPassword != null) __obj.updateDynamic("serviceKeyPassword")(serviceKeyPassword)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[CertificateCreationOptions]
  }
}

