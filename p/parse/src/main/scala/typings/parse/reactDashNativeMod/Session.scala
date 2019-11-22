package typings.parse.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/react-native", "Session")
@js.native
class Session[T /* <: js.Any */] ()
  extends typings.parse.nodeMod.Session[T]

/* static members */
@JSImport("parse/react-native", "Session")
@js.native
object Session extends js.Object {
  def current(): js.Promise[typings.parse.Parse.Session[_]] = js.native
}

