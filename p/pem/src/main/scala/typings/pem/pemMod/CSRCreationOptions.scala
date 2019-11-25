package typings.pem.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSRCreationOptions extends js.Object {
  /**
    * A list of subjectAltNames in the subjectAltName field
    */
  var altNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    *  Optional client key to use
    */
  var clientKey: js.UndefOr[String] = js.undefined
  var clientKeyPassword: js.UndefOr[String] = js.undefined
  /**
    * CSR common name field, defaults to 'localhost'
    */
  var commonName: js.UndefOr[String] = js.undefined
  /**
    * CSR country field
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * CSR config file
    */
  var csrConfigFile: js.UndefOr[String] = js.undefined
  /**
    * CSR email address field
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  /**
    * Hash function to use, defaults to sha256
    */
  var hash: js.UndefOr[HashFunction] = js.undefined
  /**
    * If clientKey is undefined, bit size to use for generating a new key (defaults to 2048)
    */
  var keyBitsize: js.UndefOr[Double] = js.undefined
  /**
    * CSR locality field
    */
  var locality: js.UndefOr[String] = js.undefined
  /**
    * CSR organization field
    */
  var organization: js.UndefOr[String] = js.undefined
  /**
    * CSR organizational unit field
    */
  var organizationUnit: js.UndefOr[String] = js.undefined
  /**
    * CSR state field
    */
  var state: js.UndefOr[String] = js.undefined
}

object CSRCreationOptions {
  @scala.inline
  def apply(
    altNames: js.Array[String] = null,
    clientKey: String = null,
    clientKeyPassword: String = null,
    commonName: String = null,
    country: String = null,
    csrConfigFile: String = null,
    emailAddress: String = null,
    hash: HashFunction = null,
    keyBitsize: Int | Double = null,
    locality: String = null,
    organization: String = null,
    organizationUnit: String = null,
    state: String = null
  ): CSRCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (altNames != null) __obj.updateDynamic("altNames")(altNames.asInstanceOf[js.Any])
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey.asInstanceOf[js.Any])
    if (clientKeyPassword != null) __obj.updateDynamic("clientKeyPassword")(clientKeyPassword.asInstanceOf[js.Any])
    if (commonName != null) __obj.updateDynamic("commonName")(commonName.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (csrConfigFile != null) __obj.updateDynamic("csrConfigFile")(csrConfigFile.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (keyBitsize != null) __obj.updateDynamic("keyBitsize")(keyBitsize.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (organizationUnit != null) __obj.updateDynamic("organizationUnit")(organizationUnit.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSRCreationOptions]
  }
}

