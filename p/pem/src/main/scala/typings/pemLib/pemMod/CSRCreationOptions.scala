package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSRCreationOptions extends js.Object {
  /**
    * A list of subjectAltNames in the subjectAltName field
    */
  var altNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    *  Optional client key to use
    */
  var clientKey: js.UndefOr[java.lang.String] = js.undefined
  var clientKeyPassword: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSR common name field, defaults to 'localhost'
    */
  var commonName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSR country field
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSR config file
    */
  var csrConfigFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSR email address field
    */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Hash function to use, defaults to sha256
    */
  var hash: js.UndefOr[HashFunction] = js.undefined
  /**
    * If clientKey is undefined, bit size to use for generating a new key (defaults to 2048)
    */
  var keyBitsize: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSR locality field
    */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSR organization field
    */
  var organization: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSR organizational unit field
    */
  var organizationUnit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSR state field
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object CSRCreationOptions {
  @scala.inline
  def apply(
    altNames: js.Array[java.lang.String] = null,
    clientKey: java.lang.String = null,
    clientKeyPassword: java.lang.String = null,
    commonName: java.lang.String = null,
    country: java.lang.String = null,
    csrConfigFile: java.lang.String = null,
    emailAddress: java.lang.String = null,
    hash: HashFunction = null,
    keyBitsize: scala.Int | scala.Double = null,
    locality: java.lang.String = null,
    organization: java.lang.String = null,
    organizationUnit: java.lang.String = null,
    state: java.lang.String = null
  ): CSRCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (altNames != null) __obj.updateDynamic("altNames")(altNames)
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey)
    if (clientKeyPassword != null) __obj.updateDynamic("clientKeyPassword")(clientKeyPassword)
    if (commonName != null) __obj.updateDynamic("commonName")(commonName)
    if (country != null) __obj.updateDynamic("country")(country)
    if (csrConfigFile != null) __obj.updateDynamic("csrConfigFile")(csrConfigFile)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (keyBitsize != null) __obj.updateDynamic("keyBitsize")(keyBitsize.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (organizationUnit != null) __obj.updateDynamic("organizationUnit")(organizationUnit)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[CSRCreationOptions]
  }
}

