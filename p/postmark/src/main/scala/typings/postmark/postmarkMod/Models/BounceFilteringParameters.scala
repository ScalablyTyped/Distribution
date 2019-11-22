package typings.postmark.postmarkMod.Models

import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.BounceFilteringParameters")
@js.native
class BounceFilteringParameters protected ()
  extends typings.postmark.distClientModelsMod.BounceFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    `type`: js.UndefOr[BounceType],
    inactive: js.UndefOr[Boolean],
    emailFilter: js.UndefOr[String],
    tag: js.UndefOr[String],
    messageID: js.UndefOr[String],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    messageStream: js.UndefOr[String]
  ) = this()
}

