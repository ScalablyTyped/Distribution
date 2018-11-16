package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerOptions extends SSLOptions {
  // Default: false;
  var domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Default: 10000; The High availability period for replicaset inquiry
  var haInterval: js.UndefOr[scala.Double] = js.undefined
  // Default: true;
  var monitoring: js.UndefOr[scala.Boolean] = js.undefined
  // Default: 1000;
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  // Default: 30;
  var reconnectTries: js.UndefOr[scala.Double] = js.undefined
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
}

