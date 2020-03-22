package typings.next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssetPrefix extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.undefined
  var buildId: String
  var canonicalBase: String
  var dev: js.UndefOr[Boolean] = js.undefined
  var documentMiddlewareEnabled: Boolean
  var generateEtags: Boolean
  var hasCssMode: Boolean
  var pages404: js.UndefOr[Boolean] = js.undefined
  var poweredByHeader: Boolean
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var staticMarkup: Boolean
}

object AnonAssetPrefix {
  @scala.inline
  def apply(
    buildId: String,
    canonicalBase: String,
    documentMiddlewareEnabled: Boolean,
    generateEtags: Boolean,
    hasCssMode: Boolean,
    poweredByHeader: Boolean,
    staticMarkup: Boolean,
    assetPrefix: String = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    pages404: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: StringDictionary[js.Any] = null
  ): AnonAssetPrefix = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], documentMiddlewareEnabled = documentMiddlewareEnabled.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], hasCssMode = hasCssMode.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (!js.isUndefined(pages404)) __obj.updateDynamic("pages404")(pages404.asInstanceOf[js.Any])
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssetPrefix]
  }
}

