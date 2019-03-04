package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardView extends js.Object {
  var DashboardID: java.lang.String
  val Events: IEvents
  var Name: java.lang.String
}

object IMetadataCardView {
  @scala.inline
  def apply(DashboardID: java.lang.String, Events: IEvents, Name: java.lang.String): IMetadataCardView = {
    val __obj = js.Dynamic.literal(DashboardID = DashboardID, Events = Events, Name = Name)
  
    __obj.asInstanceOf[IMetadataCardView]
  }
}

