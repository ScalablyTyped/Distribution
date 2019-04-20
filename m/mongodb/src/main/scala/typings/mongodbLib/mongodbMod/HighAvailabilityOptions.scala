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
  /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
  var readPreferenceTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object HighAvailabilityOptions {
  @scala.inline
  def apply(
    domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ha: js.UndefOr[scala.Boolean] = js.undefined,
    haInterval: scala.Int | scala.Double = null,
    readPreference: ReadPreference | java.lang.String = null,
    readPreferenceTags: js.Array[java.lang.String] = null
  ): HighAvailabilityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled)
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha)
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (readPreferenceTags != null) __obj.updateDynamic("readPreferenceTags")(readPreferenceTags)
    __obj.asInstanceOf[HighAvailabilityOptions]
  }
}

