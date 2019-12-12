package typings.meteor

import typings.meteor.meteorStrings.date
import typings.meteor.meteorStrings.timestamp
import typings.meteor.mongoMod.Mongo.CurrentDateModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Date
  extends CurrentDateModifier
     with typings.meteor.Mongo.CurrentDateModifier {
  @JSName("$type")
  var $type: timestamp | date = js.native
}

