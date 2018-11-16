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

