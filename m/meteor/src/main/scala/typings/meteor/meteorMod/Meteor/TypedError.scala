package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedError
  extends typings.std.Error {
  var errorType: String = js.native
}

@JSImport("meteor/meteor", "Meteor.TypedError")
@js.native
object TypedError extends TopLevel[TypedErrorStatic]

