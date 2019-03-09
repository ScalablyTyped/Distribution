package typings
package pendoDashIoDashBrowserLib.pendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideStep extends js.Object {
  var advanceMethod: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.button | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.programatic | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.element
  var attributes: pendoDashIoDashBrowserLib.Anon_AutoHeight
  var contentType: java.lang.String
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  var contentUrlCss: js.UndefOr[java.lang.String] = js.undefined
  var contentUrlJs: js.UndefOr[java.lang.String] = js.undefined
  var elementPathRule: java.lang.String
  var guideId: java.lang.String
  var id: java.lang.String
  var lastUpdatedAt: scala.Double
  var rank: scala.Double
  var resetAt: scala.Double
  var thumbnailUrls: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object GuideStep {
  @scala.inline
  def apply(
    advanceMethod: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.button | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.programatic | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.element,
    attributes: pendoDashIoDashBrowserLib.Anon_AutoHeight,
    contentType: java.lang.String,
    elementPathRule: java.lang.String,
    guideId: java.lang.String,
    id: java.lang.String,
    lastUpdatedAt: scala.Double,
    rank: scala.Double,
    resetAt: scala.Double,
    `type`: java.lang.String,
    contentUrl: java.lang.String = null,
    contentUrlCss: java.lang.String = null,
    contentUrlJs: java.lang.String = null,
    thumbnailUrls: java.lang.String = null
  ): GuideStep = {
    val __obj = js.Dynamic.literal(advanceMethod = advanceMethod.asInstanceOf[js.Any], attributes = attributes, contentType = contentType, elementPathRule = elementPathRule, guideId = guideId, id = id, lastUpdatedAt = lastUpdatedAt, rank = rank, resetAt = resetAt)
    __obj.updateDynamic("type")(`type`)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (contentUrlCss != null) __obj.updateDynamic("contentUrlCss")(contentUrlCss)
    if (contentUrlJs != null) __obj.updateDynamic("contentUrlJs")(contentUrlJs)
    if (thumbnailUrls != null) __obj.updateDynamic("thumbnailUrls")(thumbnailUrls)
    __obj.asInstanceOf[GuideStep]
  }
}

