package typings.meteorDashTypings.Meteor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var details: js.UndefOr[String] = js.undefined
  var error: String | Double
  var reason: js.UndefOr[String] = js.undefined
}

/** User **/
/** Error **/
@JSGlobal("Meteor.Error")
@js.native
object Error extends TopLevel[ErrorStatic]

