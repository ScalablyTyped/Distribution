package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderConfig extends js.Object {
  /**
    * Should the XHR request use async or not?
    */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
    */
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 'anonymous', 'use-credentials', or `undefined`. If you're not making cross-origin requests, leave this as `undefined`. See {@link https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes}.
    */
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of resources the loader will start loading at once.
    */
  var maxParallelDownloads: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Optional password for all XHR requests.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The response type of the XHR request, e.g. `blob`, `text`, etc.
    */
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional XHR timeout value, in ms.
    */
  var timeout: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Optional username for all XHR requests.
    */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object LoaderConfig {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    baseURL: java.lang.String = null,
    crossOrigin: java.lang.String = null,
    maxParallelDownloads: js.UndefOr[phaserLib.integer] = js.undefined,
    password: java.lang.String = null,
    path: java.lang.String = null,
    responseType: java.lang.String = null,
    timeout: js.UndefOr[phaserLib.integer] = js.undefined,
    user: java.lang.String = null
  ): LoaderConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(maxParallelDownloads)) __obj.updateDynamic("maxParallelDownloads")(maxParallelDownloads)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[LoaderConfig]
  }
}

