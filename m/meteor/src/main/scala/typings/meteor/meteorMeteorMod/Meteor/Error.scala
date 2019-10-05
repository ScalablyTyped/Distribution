package typings.meteor.meteorMeteorMod.Meteor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error
  extends typings.std.Error {
  var details: js.UndefOr[String] = js.undefined
  var error: String | Double
  var reason: js.UndefOr[String] = js.undefined
}

/** User **/
/** Error **/
@JSImport("meteor/meteor", "Meteor.Error")
@js.native
object Error extends TopLevel[ErrorStatic]

