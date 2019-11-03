package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighAvailabilityOptions extends js.Object {
  /**
    * Default: false;
    */
  var domainsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true; Turn on high availability monitoring.
    */
  var ha: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: 10000; The High availability period for replicaset inquiry
    */
  var haInterval: js.UndefOr[scala.Double] = js.undefined
  /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
  var readPreferenceTags: js.UndefOr[js.Array[String]] = js.undefined
}

object HighAvailabilityOptions {
  @scala.inline
  def apply(
    domainsEnabled: js.UndefOr[Boolean] = js.undefined,
    ha: js.UndefOr[Boolean] = js.undefined,
    haInterval: Int | scala.Double = null,
    readPreference: ReadPreferenceOrMode = null,
    readPreferenceTags: js.Array[String] = null
  ): HighAvailabilityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled)
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha)
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (readPreferenceTags != null) __obj.updateDynamic("readPreferenceTags")(readPreferenceTags)
    __obj.asInstanceOf[HighAvailabilityOptions]
  }
}

