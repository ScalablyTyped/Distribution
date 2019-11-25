package typings.next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmpBindInitData extends js.Object {
  var ampBindInitData: Boolean
  var assetPrefix: js.UndefOr[String] = js.undefined
  var buildId: String
  var canonicalBase: String
  var dev: js.UndefOr[Boolean] = js.undefined
  var documentMiddlewareEnabled: Boolean
  var generateEtags: Boolean
  var hasCssMode: Boolean
  var poweredByHeader: Boolean
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var staticMarkup: Boolean
}

object Anon_AmpBindInitData {
  @scala.inline
  def apply(
    ampBindInitData: Boolean,
    buildId: String,
    canonicalBase: String,
    documentMiddlewareEnabled: Boolean,
    generateEtags: Boolean,
    hasCssMode: Boolean,
    poweredByHeader: Boolean,
    staticMarkup: Boolean,
    assetPrefix: String = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: StringDictionary[js.Any] = null
  ): Anon_AmpBindInitData = {
    val __obj = js.Dynamic.literal(ampBindInitData = ampBindInitData.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], documentMiddlewareEnabled = documentMiddlewareEnabled.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], hasCssMode = hasCssMode.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AmpBindInitData]
  }
}

