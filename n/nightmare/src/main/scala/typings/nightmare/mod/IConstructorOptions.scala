package typings.nightmare.mod

import typings.nightmare.anon.Downloads
import typings.nightmare.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstructorOptions extends js.Object {
  var cookiesFile: js.UndefOr[String] = js.undefined
  var electronPath: js.UndefOr[String] = js.undefined
  var executionTimeout: js.UndefOr[Double] = js.undefined
  //in ms
  var gotoTimeout: js.UndefOr[Double] = js.undefined
  var ignoreDownloads: js.UndefOr[Boolean] = js.undefined
  var ignoreSslErrors: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[js.Any] = js.undefined
  var loadImages: js.UndefOr[Boolean] = js.undefined
  var maxDownloadRequestWait: js.UndefOr[Double] = js.undefined
  var openDevTools: js.UndefOr[Mode] = js.undefined
  var paths: js.UndefOr[Downloads] = js.undefined
  var phantomPath: js.UndefOr[String] = js.undefined
  var pollInterval: js.UndefOr[Double] = js.undefined
   // number | string;
  var port: js.UndefOr[Double] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var proxyAuth: js.UndefOr[String] = js.undefined
  var proxyType: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var sslProtocol: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[js.Any] = js.undefined
  var typeInterval: js.UndefOr[Double] = js.undefined
    // number | string;
  var waitTimeout: js.UndefOr[Double] = js.undefined
  var weak: js.UndefOr[Boolean] = js.undefined
  var webSecurity: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object IConstructorOptions {
  @scala.inline
  def apply(
    cookiesFile: String = null,
    electronPath: String = null,
    executionTimeout: js.UndefOr[Double] = js.undefined,
    gotoTimeout: js.UndefOr[Double] = js.undefined,
    ignoreDownloads: js.UndefOr[Boolean] = js.undefined,
    ignoreSslErrors: js.UndefOr[Boolean] = js.undefined,
    interval: js.Any = null,
    loadImages: js.UndefOr[Boolean] = js.undefined,
    maxDownloadRequestWait: js.UndefOr[Double] = js.undefined,
    openDevTools: Mode = null,
    paths: Downloads = null,
    phantomPath: String = null,
    pollInterval: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    proxy: String = null,
    proxyAuth: String = null,
    proxyType: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    sslProtocol: String = null,
    timeout: js.Any = null,
    typeInterval: js.UndefOr[Double] = js.undefined,
    waitTimeout: js.UndefOr[Double] = js.undefined,
    weak: js.UndefOr[Boolean] = js.undefined,
    webSecurity: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): IConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (cookiesFile != null) __obj.updateDynamic("cookiesFile")(cookiesFile.asInstanceOf[js.Any])
    if (electronPath != null) __obj.updateDynamic("electronPath")(electronPath.asInstanceOf[js.Any])
    if (!js.isUndefined(executionTimeout)) __obj.updateDynamic("executionTimeout")(executionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gotoTimeout)) __obj.updateDynamic("gotoTimeout")(gotoTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDownloads)) __obj.updateDynamic("ignoreDownloads")(ignoreDownloads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSslErrors)) __obj.updateDynamic("ignoreSslErrors")(ignoreSslErrors.get.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(loadImages)) __obj.updateDynamic("loadImages")(loadImages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDownloadRequestWait)) __obj.updateDynamic("maxDownloadRequestWait")(maxDownloadRequestWait.get.asInstanceOf[js.Any])
    if (openDevTools != null) __obj.updateDynamic("openDevTools")(openDevTools.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (phantomPath != null) __obj.updateDynamic("phantomPath")(phantomPath.asInstanceOf[js.Any])
    if (!js.isUndefined(pollInterval)) __obj.updateDynamic("pollInterval")(pollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth.asInstanceOf[js.Any])
    if (proxyType != null) __obj.updateDynamic("proxyType")(proxyType.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (sslProtocol != null) __obj.updateDynamic("sslProtocol")(sslProtocol.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(typeInterval)) __obj.updateDynamic("typeInterval")(typeInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitTimeout)) __obj.updateDynamic("waitTimeout")(waitTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webSecurity)) __obj.updateDynamic("webSecurity")(webSecurity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConstructorOptions]
  }
}

