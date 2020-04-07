package typings.meteor

import typings.meteor.Mongo.CurrentDateModifier
import typings.meteor.meteorStrings.date
import typings.meteor.meteorStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType
  extends CurrentDateModifier
     with typings.meteor.mongoMod.Mongo.CurrentDateModifier {
  @JSName("$type")
  var $type: timestamp | date
}

object AnonType {
  @scala.inline
  def apply($type: timestamp | date): AnonType = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonType]
  }
}

