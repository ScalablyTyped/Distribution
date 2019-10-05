package typings.parse.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Session")
@js.native
class Session ()
  extends typings.parse.Parse.Session

/* static members */
@JSImport("parse/node", "Session")
@js.native
object Session extends js.Object {
  def current(): js.Promise[typings.parse.Parse.Session] = js.native
}

