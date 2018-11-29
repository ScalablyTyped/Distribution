package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HighAvailabilityOptions extends js.Object {
  /**
       * Default: false;
       */
  var domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Default: true; Turn on high availability monitoring.
       */
  var ha: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Default: 10000; The High availability period for replicaset inquiry
       */
  var haInterval: js.UndefOr[scala.Double] = js.undefined
}

