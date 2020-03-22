package typings.meteor

import typings.meteor.Mongo.CurrentDateModifier
import typings.meteor.meteorStrings.date
import typings.meteor.meteorStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonType
  extends CurrentDateModifier
     with typings.meteor.mongoMod.Mongo.CurrentDateModifier {
  @JSName("$type")
  var $type: timestamp | date = js.native
}

