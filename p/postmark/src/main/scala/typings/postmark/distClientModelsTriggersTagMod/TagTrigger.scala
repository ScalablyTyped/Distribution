package typings.postmark.distClientModelsTriggersTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagTrigger extends js.Object {
  var ID: Double
  var MatchName: String
  var TrackOpens: Boolean
}

object TagTrigger {
  @scala.inline
  def apply(ID: Double, MatchName: String, TrackOpens: Boolean): TagTrigger = {
    val __obj = js.Dynamic.literal(ID = ID, MatchName = MatchName, TrackOpens = TrackOpens)
  
    __obj.asInstanceOf[TagTrigger]
  }
}

