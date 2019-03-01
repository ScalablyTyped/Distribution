package typings
package nextDashServerLib.nextDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextConfig
  extends // Plugin can define their own keys.
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var assetPrefix: js.UndefOr[java.lang.String] = js.undefined
  var configOrigin: js.UndefOr[java.lang.String] = js.undefined
  var distDir: js.UndefOr[java.lang.String] = js.undefined
  var generateBuildId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var generateEtags: js.UndefOr[scala.Boolean] = js.undefined
  var pageExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var poweredByHeader: js.UndefOr[scala.Boolean] = js.undefined
  var publicRuntimeConfig: js.UndefOr[js.Object] = js.undefined
  var serverRuntimeConfig: js.UndefOr[js.Object] = js.undefined
  var useFileSystemPublicRoutes: js.UndefOr[scala.Boolean] = js.undefined
  var webpack: js.UndefOr[js.Any] = js.undefined
  var webpackDevMiddleware: js.UndefOr[js.Any] = js.undefined
}

object NextConfig {
  @scala.inline
  def apply(
    StringDictionary: // Plugin can define their own keys.
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    assetPrefix: java.lang.String = null,
    configOrigin: java.lang.String = null,
    distDir: java.lang.String = null,
    generateBuildId: js.Function0[java.lang.String] = null,
    generateEtags: js.UndefOr[scala.Boolean] = js.undefined,
    pageExtensions: js.Array[java.lang.String] = null,
    poweredByHeader: js.UndefOr[scala.Boolean] = js.undefined,
    publicRuntimeConfig: js.Object = null,
    serverRuntimeConfig: js.Object = null,
    useFileSystemPublicRoutes: js.UndefOr[scala.Boolean] = js.undefined,
    webpack: js.Any = null,
    webpackDevMiddleware: js.Any = null
  ): NextConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix)
    if (configOrigin != null) __obj.updateDynamic("configOrigin")(configOrigin)
    if (distDir != null) __obj.updateDynamic("distDir")(distDir)
    if (generateBuildId != null) __obj.updateDynamic("generateBuildId")(generateBuildId)
    if (!js.isUndefined(generateEtags)) __obj.updateDynamic("generateEtags")(generateEtags)
    if (pageExtensions != null) __obj.updateDynamic("pageExtensions")(pageExtensions)
    if (!js.isUndefined(poweredByHeader)) __obj.updateDynamic("poweredByHeader")(poweredByHeader)
    if (publicRuntimeConfig != null) __obj.updateDynamic("publicRuntimeConfig")(publicRuntimeConfig)
    if (serverRuntimeConfig != null) __obj.updateDynamic("serverRuntimeConfig")(serverRuntimeConfig)
    if (!js.isUndefined(useFileSystemPublicRoutes)) __obj.updateDynamic("useFileSystemPublicRoutes")(useFileSystemPublicRoutes)
    if (webpack != null) __obj.updateDynamic("webpack")(webpack)
    if (webpackDevMiddleware != null) __obj.updateDynamic("webpackDevMiddleware")(webpackDevMiddleware)
    __obj.asInstanceOf[NextConfig]
  }
}

