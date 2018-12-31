package typings
package multipartyLib.multipartyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multiparty", "Form")
@js.native
class Form ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: FormOptions) = this()
  /**
    * Parses an incoming node.js request containing form data.
    * This will cause form to emit events based off the incoming request
    * @param request
    * @param callback
    */
  def parse(request: nodeLib.httpMod.IncomingMessage): scala.Unit = js.native
  def parse(
    request: nodeLib.httpMod.IncomingMessage,
    callback: js.Function3[/* error */ nodeLib.Error, /* fields */ js.Any, /* files */ js.Any, _]
  ): scala.Unit = js.native
}

