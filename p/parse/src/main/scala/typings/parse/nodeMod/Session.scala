package typings.parse.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Session")
@js.native
class Session ()
  extends typings.parse.ParseNs.Session

/* static members */
@JSImport("parse/node", "Session")
@js.native
object Session extends js.Object {
  def current(): js.Promise[typings.parse.ParseNs.Session] = js.native
}

