package typings
package nightmareLib.nightmareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstructorOptions extends js.Object {
  var cookiesFile: js.UndefOr[java.lang.String] = js.undefined
  var electronPath: js.UndefOr[java.lang.String] = js.undefined
  var executionTimeout: js.UndefOr[scala.Double] = js.undefined
  //in ms
  var gotoTimeout: js.UndefOr[scala.Double] = js.undefined
  var ignoreDownloads: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreSslErrors: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[js.Any] = js.undefined
  var loadImages: js.UndefOr[scala.Boolean] = js.undefined
  var maxDownloadRequestWait: js.UndefOr[scala.Double] = js.undefined
  var openDevTools: js.UndefOr[nightmareLib.Anon_Mode] = js.undefined
  var paths: js.UndefOr[nightmareLib.Anon_Downloads] = js.undefined
  var phantomPath: js.UndefOr[java.lang.String] = js.undefined
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
   // number | string;
  var port: js.UndefOr[scala.Double] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var proxyAuth: js.UndefOr[java.lang.String] = js.undefined
  var proxyType: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var sslProtocol: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[js.Any] = js.undefined
  var typeInterval: js.UndefOr[scala.Double] = js.undefined
    // number | string;
  var waitTimeout: js.UndefOr[scala.Double] = js.undefined
  var weak: js.UndefOr[scala.Boolean] = js.undefined
  var webSecurity: js.UndefOr[scala.Boolean] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object IConstructorOptions {
  @scala.inline
  def apply(
    cookiesFile: java.lang.String = null,
    electronPath: java.lang.String = null,
    executionTimeout: scala.Int | scala.Double = null,
    gotoTimeout: scala.Int | scala.Double = null,
    ignoreDownloads: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreSslErrors: js.UndefOr[scala.Boolean] = js.undefined,
    interval: js.Any = null,
    loadImages: js.UndefOr[scala.Boolean] = js.undefined,
    maxDownloadRequestWait: scala.Int | scala.Double = null,
    openDevTools: nightmareLib.Anon_Mode = null,
    paths: nightmareLib.Anon_Downloads = null,
    phantomPath: java.lang.String = null,
    pollInterval: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    proxy: java.lang.String = null,
    proxyAuth: java.lang.String = null,
    proxyType: java.lang.String = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    sslProtocol: java.lang.String = null,
    timeout: js.Any = null,
    typeInterval: scala.Int | scala.Double = null,
    waitTimeout: scala.Int | scala.Double = null,
    weak: js.UndefOr[scala.Boolean] = js.undefined,
    webSecurity: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): IConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (cookiesFile != null) __obj.updateDynamic("cookiesFile")(cookiesFile)
    if (electronPath != null) __obj.updateDynamic("electronPath")(electronPath)
    if (executionTimeout != null) __obj.updateDynamic("executionTimeout")(executionTimeout.asInstanceOf[js.Any])
    if (gotoTimeout != null) __obj.updateDynamic("gotoTimeout")(gotoTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDownloads)) __obj.updateDynamic("ignoreDownloads")(ignoreDownloads)
    if (!js.isUndefined(ignoreSslErrors)) __obj.updateDynamic("ignoreSslErrors")(ignoreSslErrors)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (!js.isUndefined(loadImages)) __obj.updateDynamic("loadImages")(loadImages)
    if (maxDownloadRequestWait != null) __obj.updateDynamic("maxDownloadRequestWait")(maxDownloadRequestWait.asInstanceOf[js.Any])
    if (openDevTools != null) __obj.updateDynamic("openDevTools")(openDevTools)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (phantomPath != null) __obj.updateDynamic("phantomPath")(phantomPath)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth)
    if (proxyType != null) __obj.updateDynamic("proxyType")(proxyType)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (sslProtocol != null) __obj.updateDynamic("sslProtocol")(sslProtocol)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (typeInterval != null) __obj.updateDynamic("typeInterval")(typeInterval.asInstanceOf[js.Any])
    if (waitTimeout != null) __obj.updateDynamic("waitTimeout")(waitTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak)
    if (!js.isUndefined(webSecurity)) __obj.updateDynamic("webSecurity")(webSecurity)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConstructorOptions]
  }
}

