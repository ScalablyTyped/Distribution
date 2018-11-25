package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "Events")
@js.native
class Events ()
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("on")
  def on_error(
    event: pgLib.pgLibStrings.error,
    listener: js.Function2[/* err */ nodeLib.Error, /* client */ Client, scala.Unit]
  ): this.type = js.native
}

