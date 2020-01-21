package typings.postmark.mod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.BounceFilteringParameters")
@js.native
class BounceFilteringParameters protected ()
  extends typings.postmark.modelsMod.BounceFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    `type`: js.UndefOr[typings.postmark.bounceFilteringParametersMod.BounceType],
    inactive: js.UndefOr[Boolean],
    emailFilter: js.UndefOr[String],
    tag: js.UndefOr[String],
    messageID: js.UndefOr[String],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    messageStream: js.UndefOr[String]
  ) = this()
}

