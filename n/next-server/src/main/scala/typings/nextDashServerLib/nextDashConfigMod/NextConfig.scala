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

