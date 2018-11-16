package typings
package permitLib.permitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("permit", "Permit")
@js.native
class Permit protected () extends js.Object {
  def this(options: PermitOptions) = this()
  def check(req: nodeLib.httpMod.IncomingMessage): scala.Unit = js.native
  def fail(res: nodeLib.httpMod.ServerResponse): scala.Unit = js.native
}

