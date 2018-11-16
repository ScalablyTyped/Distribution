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

