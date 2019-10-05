package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderConfig extends js.Object {
  /**
    * Should the XHR request use async or not?
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
    */
  var baseURL: js.UndefOr[String] = js.undefined
  /**
    * 'anonymous', 'use-credentials', or `undefined`. If you're not making cross-origin requests, leave this as `undefined`. See {@link https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes}.
    */
  var crossOrigin: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of resources the loader will start loading at once.
    */
  var maxParallelDownloads: js.UndefOr[integer] = js.undefined
  /**
    * Optional password for all XHR requests.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The response type of the XHR request, e.g. `blob`, `text`, etc.
    */
  var responseType: js.UndefOr[String] = js.undefined
  /**
    * Optional XHR timeout value, in ms.
    */
  var timeout: js.UndefOr[integer] = js.undefined
  /**
    * Optional username for all XHR requests.
    */
  var user: js.UndefOr[String] = js.undefined
}

object LoaderConfig {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    baseURL: String = null,
    crossOrigin: String = null,
    maxParallelDownloads: Int | Double = null,
    password: String = null,
    path: String = null,
    responseType: String = null,
    timeout: Int | Double = null,
    user: String = null
  ): LoaderConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (maxParallelDownloads != null) __obj.updateDynamic("maxParallelDownloads")(maxParallelDownloads.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[LoaderConfig]
  }
}

