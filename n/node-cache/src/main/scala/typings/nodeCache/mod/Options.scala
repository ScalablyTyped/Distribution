package typings.nodeCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var arrayValueSize: js.UndefOr[Double] = js.native
  /**
  		 * time in seconds to check all data and delete expired keys
  		 *
  		 * @type {number}
  		 * @memberof Options
  		 */
  var checkperiod: js.UndefOr[Double] = js.native
  var deleteOnExpire: js.UndefOr[Boolean] = js.native
  /**
  		 * enable legacy callbacks.
  		 * legacy callback support will drop in v6.x!
  		 *
  		 * @type {boolean}
  		 * @memberof Options
  		 */
  var enableLegacyCallbacks: js.UndefOr[Boolean] = js.native
  var errorOnMissing: js.UndefOr[Boolean] = js.native
  /**
  		 * If enabled, all values will be stringified during the set operation
  		 *
  		 * @type {boolean}
  		 * @memberof Options
  		 */
  var forceString: js.UndefOr[Boolean] = js.native
  /**
  		 * max amount of keys that are being stored.
  		 * set operations will throw an error when the cache is full
  		 *
  		 * @type {number}
  		 * @memberof Options
  		 */
  var maxKeys: js.UndefOr[Double] = js.native
  var objectValueSize: js.UndefOr[Double] = js.native
  var promiseValueSize: js.UndefOr[Double] = js.native
  /**
  		 * standard time to live in seconds. 0 = infinity
  		 *
  		 * @type {number}
  		 * @memberof Options
  		 */
  var stdTTL: js.UndefOr[Double] = js.native
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
  var useClones: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrayValueSize(value: Double): Self = this.set("arrayValueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayValueSize: Self = this.set("arrayValueSize", js.undefined)
    @scala.inline
    def setCheckperiod(value: Double): Self = this.set("checkperiod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckperiod: Self = this.set("checkperiod", js.undefined)
    @scala.inline
    def setDeleteOnExpire(value: Boolean): Self = this.set("deleteOnExpire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnExpire: Self = this.set("deleteOnExpire", js.undefined)
    @scala.inline
    def setEnableLegacyCallbacks(value: Boolean): Self = this.set("enableLegacyCallbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLegacyCallbacks: Self = this.set("enableLegacyCallbacks", js.undefined)
    @scala.inline
    def setErrorOnMissing(value: Boolean): Self = this.set("errorOnMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorOnMissing: Self = this.set("errorOnMissing", js.undefined)
    @scala.inline
    def setForceString(value: Boolean): Self = this.set("forceString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceString: Self = this.set("forceString", js.undefined)
    @scala.inline
    def setMaxKeys(value: Double): Self = this.set("maxKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxKeys: Self = this.set("maxKeys", js.undefined)
    @scala.inline
    def setObjectValueSize(value: Double): Self = this.set("objectValueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectValueSize: Self = this.set("objectValueSize", js.undefined)
    @scala.inline
    def setPromiseValueSize(value: Double): Self = this.set("promiseValueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromiseValueSize: Self = this.set("promiseValueSize", js.undefined)
    @scala.inline
    def setStdTTL(value: Double): Self = this.set("stdTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdTTL: Self = this.set("stdTTL", js.undefined)
    @scala.inline
    def setUseClones(value: Boolean): Self = this.set("useClones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClones: Self = this.set("useClones", js.undefined)
  }
  
}

