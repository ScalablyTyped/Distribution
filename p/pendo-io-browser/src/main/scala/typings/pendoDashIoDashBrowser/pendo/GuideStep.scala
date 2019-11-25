package typings.pendoDashIoDashBrowser.pendo

import typings.pendoDashIoDashBrowser.Anon_AutoHeight
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.button
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.element
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.programatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideStep extends js.Object {
  var advanceMethod: button | programatic | element
  var attributes: Anon_AutoHeight
  var contentType: String
  var contentUrl: js.UndefOr[String] = js.undefined
  var contentUrlCss: js.UndefOr[String] = js.undefined
  var contentUrlJs: js.UndefOr[String] = js.undefined
  var elementPathRule: String
  var guideId: String
  var id: String
  var lastUpdatedAt: Double
  var rank: Double
  var resetAt: Double
  var thumbnailUrls: js.UndefOr[String] = js.undefined
  var `type`: String
}

object GuideStep {
  @scala.inline
  def apply(
    advanceMethod: button | programatic | element,
    attributes: Anon_AutoHeight,
    contentType: String,
    elementPathRule: String,
    guideId: String,
    id: String,
    lastUpdatedAt: Double,
    rank: Double,
    resetAt: Double,
    `type`: String,
    contentUrl: String = null,
    contentUrlCss: String = null,
    contentUrlJs: String = null,
    thumbnailUrls: String = null
  ): GuideStep = {
    val __obj = js.Dynamic.literal(advanceMethod = advanceMethod.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], elementPathRule = elementPathRule.asInstanceOf[js.Any], guideId = guideId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (contentUrlCss != null) __obj.updateDynamic("contentUrlCss")(contentUrlCss.asInstanceOf[js.Any])
    if (contentUrlJs != null) __obj.updateDynamic("contentUrlJs")(contentUrlJs.asInstanceOf[js.Any])
    if (thumbnailUrls != null) __obj.updateDynamic("thumbnailUrls")(thumbnailUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuideStep]
  }
}

