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
    arrayValueSize: js.UndefOr[Double] = js.undefined,
    checkperiod: js.UndefOr[Double] = js.undefined,
    deleteOnExpire: js.UndefOr[Boolean] = js.undefined,
    enableLegacyCallbacks: js.UndefOr[Boolean] = js.undefined,
    errorOnMissing: js.UndefOr[Boolean] = js.undefined,
    forceString: js.UndefOr[Boolean] = js.undefined,
    maxKeys: js.UndefOr[Double] = js.undefined,
    objectValueSize: js.UndefOr[Double] = js.undefined,
    promiseValueSize: js.UndefOr[Double] = js.undefined,
    stdTTL: js.UndefOr[Double] = js.undefined,
    useClones: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrayValueSize)) __obj.updateDynamic("arrayValueSize")(arrayValueSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkperiod)) __obj.updateDynamic("checkperiod")(checkperiod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnExpire)) __obj.updateDynamic("deleteOnExpire")(deleteOnExpire.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLegacyCallbacks)) __obj.updateDynamic("enableLegacyCallbacks")(enableLegacyCallbacks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOnMissing)) __obj.updateDynamic("errorOnMissing")(errorOnMissing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceString)) __obj.updateDynamic("forceString")(forceString.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxKeys)) __obj.updateDynamic("maxKeys")(maxKeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectValueSize)) __obj.updateDynamic("objectValueSize")(objectValueSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(promiseValueSize)) __obj.updateDynamic("promiseValueSize")(promiseValueSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdTTL)) __obj.updateDynamic("stdTTL")(stdTTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useClones)) __obj.updateDynamic("useClones")(useClones.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

