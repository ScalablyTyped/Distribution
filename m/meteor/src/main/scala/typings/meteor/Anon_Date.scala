package typings.meteor

import typings.meteor.Mongo.CurrentDateModifier
import typings.meteor.meteorStrings.date
import typings.meteor.meteorStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends CurrentDateModifier {
  @JSName("$type")
  var $type: timestamp | date
}

object Anon_Date {
  @scala.inline
  def apply($type: timestamp | date): Anon_Date = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Date]
  }
}

