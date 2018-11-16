package typings
package nodeDashPushnotificationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Production extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var autoAdjustCache: js.UndefOr[scala.Boolean] = js.undefined
  var buffersNotifications: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * An array of trusted certificates. Each element should contain either a filename to load, or a
               * Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs
               * will be used. - You may need to use this as some environments don't include the CA used by
               * Apple (entrust_2048).
               */
  var ca: js.UndefOr[js.Array[nodeLib.Buffer | java.lang.String]] = js.undefined
  var cacheLength: js.UndefOr[scala.Double] = js.undefined
  /**
               * The filename of the connection certificate to load from disk, or a Buffer/String containing the
               * certificate data.
               */
  var cert: js.UndefOr[java.lang.String] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var connectionRetryLimit: js.UndefOr[scala.Double] = js.undefined
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  var disableEPIPEFix: js.UndefOr[scala.Boolean] = js.undefined
  var disableNagle: js.UndefOr[scala.Boolean] = js.undefined
  var fastMode: js.UndefOr[scala.Boolean] = js.undefined
  /** The filename of the connection key to load from disk, or a Buffer or String containing the key data. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  var minConnections: js.UndefOr[scala.Double] = js.undefined
  /** The passphrase for the connection key, if required */
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  /**
               * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing
               * the PFX data. If supplied will always be used instead of certificate and key above.
               */
  var pfx: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var production: js.UndefOr[scala.Boolean] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /** APN Token */
  var token: js.UndefOr[Anon_Key] = js.undefined
  var voip: js.UndefOr[scala.Boolean] = js.undefined
}

