package typings.postmark.distClientModelsTriggersTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/triggers/Tag", "UpdateTagTriggerRequest")
@js.native
class UpdateTagTriggerRequest () extends js.Object {
  def this(MatchName: String) = this()
  def this(MatchName: String, TrackOpens: Boolean) = this()
  var MatchName: js.UndefOr[String] = js.native
  var TrackOpens: js.UndefOr[Boolean] = js.native
}

