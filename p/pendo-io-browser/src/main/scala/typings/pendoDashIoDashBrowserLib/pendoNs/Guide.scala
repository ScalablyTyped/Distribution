package typings
package pendoDashIoDashBrowserLib.pendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guide extends js.Object {
  var attributes: pendoDashIoDashBrowserLib.Anon_Badge
  var audience: js.Array[_]
   // TODO
  var audienceUiHint: pendoDashIoDashBrowserLib.Anon_Filters
  var createdAt: scala.Double
  var createdByUser: User
  var id: java.lang.String
  var isMultiStep: scala.Boolean
  var kind: java.lang.String
  var lastUpdatedAt: scala.Double
  var lastUpdatedByUser: User
  var launchMethod: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.api | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.automatic | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.badge | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.dom | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.launcher
  var name: java.lang.String
  var publishedAt: scala.Double
   // TODO
  var resetAt: scala.Double
  var rootVersionId: java.lang.String
  var stableVersionId: java.lang.String
  var state: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.published | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.staged | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.draft | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.disabled
  var steps: js.Array[GuideStep]
}

object Guide {
  @scala.inline
  def apply(
    attributes: pendoDashIoDashBrowserLib.Anon_Badge,
    audience: js.Array[_],
    audienceUiHint: pendoDashIoDashBrowserLib.Anon_Filters,
    createdAt: scala.Double,
    createdByUser: User,
    id: java.lang.String,
    isMultiStep: scala.Boolean,
    kind: java.lang.String,
    lastUpdatedAt: scala.Double,
    lastUpdatedByUser: User,
    launchMethod: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.api | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.automatic | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.badge | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.dom | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.launcher,
    name: java.lang.String,
    publishedAt: scala.Double,
    resetAt: scala.Double,
    rootVersionId: java.lang.String,
    stableVersionId: java.lang.String,
    state: pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.published | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.staged | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.draft | pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.disabled,
    steps: js.Array[GuideStep]
  ): Guide = {
    val __obj = js.Dynamic.literal(attributes = attributes, audience = audience, audienceUiHint = audienceUiHint, createdAt = createdAt, createdByUser = createdByUser, id = id, isMultiStep = isMultiStep, kind = kind, lastUpdatedAt = lastUpdatedAt, lastUpdatedByUser = lastUpdatedByUser, launchMethod = launchMethod.asInstanceOf[js.Any], name = name, publishedAt = publishedAt, resetAt = resetAt, rootVersionId = rootVersionId, stableVersionId = stableVersionId, state = state.asInstanceOf[js.Any], steps = steps)
  
    __obj.asInstanceOf[Guide]
  }
}

