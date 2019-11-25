package typings.nightmare.nightmareMod

import typings.nightmare.Anon_Downloads
import typings.nightmare.Anon_Mode
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
  var openDevTools: js.UndefOr[Anon_Mode] = js.undefined
  var paths: js.UndefOr[Anon_Downloads] = js.undefined
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
    executionTimeout: Int | Double = null,
    gotoTimeout: Int | Double = null,
    ignoreDownloads: js.UndefOr[Boolean] = js.undefined,
    ignoreSslErrors: js.UndefOr[Boolean] = js.undefined,
    interval: js.Any = null,
    loadImages: js.UndefOr[Boolean] = js.undefined,
    maxDownloadRequestWait: Int | Double = null,
    openDevTools: Anon_Mode = null,
    paths: Anon_Downloads = null,
    phantomPath: String = null,
    pollInterval: Int | Double = null,
    port: Int | Double = null,
    proxy: String = null,
    proxyAuth: String = null,
    proxyType: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    sslProtocol: String = null,
    timeout: js.Any = null,
    typeInterval: Int | Double = null,
    waitTimeout: Int | Double = null,
    weak: js.UndefOr[Boolean] = js.undefined,
    webSecurity: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): IConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (cookiesFile != null) __obj.updateDynamic("cookiesFile")(cookiesFile.asInstanceOf[js.Any])
    if (electronPath != null) __obj.updateDynamic("electronPath")(electronPath.asInstanceOf[js.Any])
    if (executionTimeout != null) __obj.updateDynamic("executionTimeout")(executionTimeout.asInstanceOf[js.Any])
    if (gotoTimeout != null) __obj.updateDynamic("gotoTimeout")(gotoTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDownloads)) __obj.updateDynamic("ignoreDownloads")(ignoreDownloads.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSslErrors)) __obj.updateDynamic("ignoreSslErrors")(ignoreSslErrors.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(loadImages)) __obj.updateDynamic("loadImages")(loadImages.asInstanceOf[js.Any])
    if (maxDownloadRequestWait != null) __obj.updateDynamic("maxDownloadRequestWait")(maxDownloadRequestWait.asInstanceOf[js.Any])
    if (openDevTools != null) __obj.updateDynamic("openDevTools")(openDevTools.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (phantomPath != null) __obj.updateDynamic("phantomPath")(phantomPath.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth.asInstanceOf[js.Any])
    if (proxyType != null) __obj.updateDynamic("proxyType")(proxyType.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (sslProtocol != null) __obj.updateDynamic("sslProtocol")(sslProtocol.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (typeInterval != null) __obj.updateDynamic("typeInterval")(typeInterval.asInstanceOf[js.Any])
    if (waitTimeout != null) __obj.updateDynamic("waitTimeout")(waitTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak.asInstanceOf[js.Any])
    if (!js.isUndefined(webSecurity)) __obj.updateDynamic("webSecurity")(webSecurity.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConstructorOptions]
  }
}

