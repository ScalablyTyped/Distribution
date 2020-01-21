package typings.nodeCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrayValueSize: js.UndefOr[Double] = js.undefined
  /**
  		 * time in seconds to check all data and delete expired keys
  		 *
  		 * @type {number}
  		 * @memberof Options
  		 */
  var checkperiod: js.UndefOr[Double] = js.undefined
  var deleteOnExpire: js.UndefOr[Boolean] = js.undefined
  /**
  		 * enable legacy callbacks.
  		 * legacy callback support will drop in v6.x!
  		 *
  		 * @type {boolean}
  		 * @memberof Options
  		 */
  var enableLegacyCallbacks: js.UndefOr[Boolean] = js.undefined
  var errorOnMissing: js.UndefOr[Boolean] = js.undefined
  /**
  		 * If enabled, all values will be stringified during the set operation
  		 *
  		 * @type {boolean}
  		 * @memberof Options
  		 */
  var forceString: js.UndefOr[Boolean] = js.undefined
  /**
  		 * max amount of keys that are being stored.
  		 * set operations will throw an error when the cache is full
  		 *
  		 * @type {number}
  		 * @memberof Options
  		 */
  var maxKeys: js.UndefOr[Double] = js.undefined
  var objectValueSize: js.UndefOr[Double] = js.undefined
  var promiseValueSize: js.UndefOr[Double] = js.undefined
  /**
  		 * standard time to live in seconds. 0 = infinity
  		 *
  		 * @type {number}
  		 * @memberof Options
  		 */
  var stdTTL: js.UndefOr[Double] = js.undefined
  /**
  		 * en/disable cloning of variables.
  		 * disabling this is strongly encouraged when aiming for performance!
  		 *
  		 * If `true`: set operations store a clone of the value and get operations will create a fresh clone of the cached value
  		 * If `false` you'll just store a reference to your value
  		 *
  		 * @type {boolean}
  		 * @memberof Options
  		 */
  var useClones: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrayValueSize: Int | Double = null,
    checkperiod: Int | Double = null,
    deleteOnExpire: js.UndefOr[Boolean] = js.undefined,
    enableLegacyCallbacks: js.UndefOr[Boolean] = js.undefined,
    errorOnMissing: js.UndefOr[Boolean] = js.undefined,
    forceString: js.UndefOr[Boolean] = js.undefined,
    maxKeys: Int | Double = null,
    objectValueSize: Int | Double = null,
    promiseValueSize: Int | Double = null,
    stdTTL: Int | Double = null,
    useClones: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrayValueSize != null) __obj.updateDynamic("arrayValueSize")(arrayValueSize.asInstanceOf[js.Any])
    if (checkperiod != null) __obj.updateDynamic("checkperiod")(checkperiod.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnExpire)) __obj.updateDynamic("deleteOnExpire")(deleteOnExpire.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLegacyCallbacks)) __obj.updateDynamic("enableLegacyCallbacks")(enableLegacyCallbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOnMissing)) __obj.updateDynamic("errorOnMissing")(errorOnMissing.asInstanceOf[js.Any])
    if (!js.isUndefined(forceString)) __obj.updateDynamic("forceString")(forceString.asInstanceOf[js.Any])
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    if (objectValueSize != null) __obj.updateDynamic("objectValueSize")(objectValueSize.asInstanceOf[js.Any])
    if (promiseValueSize != null) __obj.updateDynamic("promiseValueSize")(promiseValueSize.asInstanceOf[js.Any])
    if (stdTTL != null) __obj.updateDynamic("stdTTL")(stdTTL.asInstanceOf[js.Any])
    if (!js.isUndefined(useClones)) __obj.updateDynamic("useClones")(useClones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

