package typings.naverWhale.whale.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeSet extends js.Object {
  /** Optional. Websites' appcaches.  */
  var appcache: js.UndefOr[Boolean] = js.undefined
  /** Optional. The browser's cache. Note: when removing data, this clears the entire cache: it is not limited to the range you specify.  */
  var cache: js.UndefOr[Boolean] = js.undefined
  /** Optional. The browser's cookies.  */
  var cookies: js.UndefOr[Boolean] = js.undefined
  /** Optional. The browser's download list.  */
  var downloads: js.UndefOr[Boolean] = js.undefined
  /** Optional. Websites' file systems.  */
  var fileSystems: js.UndefOr[Boolean] = js.undefined
  /** Optional. The browser's stored form data.  */
  var formData: js.UndefOr[Boolean] = js.undefined
  /** Optional. The browser's history.  */
  var history: js.UndefOr[Boolean] = js.undefined
  /** Optional. Websites' IndexedDB data.  */
  var indexedDB: js.UndefOr[Boolean] = js.undefined
  /** Optional. Websites' local storage data.  */
  var localStorage: js.UndefOr[Boolean] = js.undefined
  /** Optional. Stored passwords.  */
  var passwords: js.UndefOr[Boolean] = js.undefined
  /** Optional. Plugins' data.  */
  var pluginData: js.UndefOr[Boolean] = js.undefined
  /** Optional. Server-bound certificates.  */
  var serverBoundCertificates: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Since Chrome 39.
    * Service Workers.
    */
  var serviceWorkers: js.UndefOr[Boolean] = js.undefined
  /** Optional. Websites' WebSQL data.  */
  var webSQL: js.UndefOr[Boolean] = js.undefined
}

object DataTypeSet {
  @scala.inline
  def apply(
    appcache: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    cookies: js.UndefOr[Boolean] = js.undefined,
    downloads: js.UndefOr[Boolean] = js.undefined,
    fileSystems: js.UndefOr[Boolean] = js.undefined,
    formData: js.UndefOr[Boolean] = js.undefined,
    history: js.UndefOr[Boolean] = js.undefined,
    indexedDB: js.UndefOr[Boolean] = js.undefined,
    localStorage: js.UndefOr[Boolean] = js.undefined,
    passwords: js.UndefOr[Boolean] = js.undefined,
    pluginData: js.UndefOr[Boolean] = js.undefined,
    serverBoundCertificates: js.UndefOr[Boolean] = js.undefined,
    serviceWorkers: js.UndefOr[Boolean] = js.undefined,
    webSQL: js.UndefOr[Boolean] = js.undefined
  ): DataTypeSet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appcache)) __obj.updateDynamic("appcache")(appcache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(downloads)) __obj.updateDynamic("downloads")(downloads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fileSystems)) __obj.updateDynamic("fileSystems")(fileSystems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formData)) __obj.updateDynamic("formData")(formData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indexedDB)) __obj.updateDynamic("indexedDB")(indexedDB.get.asInstanceOf[js.Any])
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwords)) __obj.updateDynamic("passwords")(passwords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pluginData)) __obj.updateDynamic("pluginData")(pluginData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverBoundCertificates)) __obj.updateDynamic("serverBoundCertificates")(serverBoundCertificates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceWorkers)) __obj.updateDynamic("serviceWorkers")(serviceWorkers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webSQL)) __obj.updateDynamic("webSQL")(webSQL.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeSet]
  }
}

