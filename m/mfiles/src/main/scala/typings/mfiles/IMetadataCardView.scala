package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardView extends js.Object {
  var DashboardID: String
  val Events: IEvents
  var Name: String
}

object IMetadataCardView {
  @scala.inline
  def apply(DashboardID: String, Events: IEvents, Name: String): IMetadataCardView = {
    val __obj = js.Dynamic.literal(DashboardID = DashboardID.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMetadataCardView]
  }
}

